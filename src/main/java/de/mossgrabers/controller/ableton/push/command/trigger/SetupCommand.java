// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2026
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.controller.ableton.push.command.trigger;

import de.mossgrabers.controller.ableton.push.PushConfiguration;
import de.mossgrabers.controller.ableton.push.PushVersion;
import de.mossgrabers.controller.ableton.push.controller.PushControlSurface;
import de.mossgrabers.controller.ableton.push.mode.device.UserMode;
import de.mossgrabers.framework.command.core.AbstractTriggerCommand;
import de.mossgrabers.framework.daw.IModel;
import de.mossgrabers.framework.featuregroup.ModeManager;
import de.mossgrabers.framework.mode.Modes;
import de.mossgrabers.framework.utils.ButtonEvent;


/**
 * Command to Setup the hardware of Push 2/3.
 *
 * @author Jürgen Moßgraber
 */
public class SetupCommand extends AbstractTriggerCommand<PushControlSurface, PushConfiguration>
{
    private final PushVersion pushVersion;


    /**
     * Constructor.
     *
     * @param pushVersion The version of Push
     * @param model The model
     * @param surface The surface
     */
    public SetupCommand (final PushVersion pushVersion, final IModel model, final PushControlSurface surface)
    {
        super (model, surface);

        this.pushVersion = pushVersion;
    }


    /** {@inheritDoc} */
    @Override
    public void execute (final ButtonEvent event, final int velocity)
    {
        if (event != ButtonEvent.DOWN)
            return;
        final ModeManager modeManager = this.surface.getModeManager ();

        final Modes mode = this.getMode ();

        // With the Scale button remapped, the User button always selects Project Remote.
        // It must not toggle out of User mode and restore the previously active mixer mode.
        if (this.pushVersion == PushVersion.VERSION_1 && mode == Modes.USER && this.surface.getConfiguration ().isScaleButtonTrackRemoteEnabled ())
        {
            if (!modeManager.isActive (Modes.USER))
                modeManager.setTemporary (Modes.USER);
            ((UserMode) modeManager.get (Modes.USER)).selectProjectMode ();
            return;
        }

        if (modeManager.isActive (mode))
            modeManager.restore ();
        else
            modeManager.setTemporary (mode);
    }


    private Modes getMode ()
    {
        if (this.pushVersion != PushVersion.VERSION_1)
            return Modes.SETUP;

        if (this.surface.isShiftPressed ())
            return Modes.CONFIGURATION;

        return Modes.USER;
    }
}
