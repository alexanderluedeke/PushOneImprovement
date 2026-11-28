// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2026
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.controller.ableton.push.command.trigger;

import de.mossgrabers.controller.ableton.push.PushConfiguration;
import de.mossgrabers.controller.ableton.push.controller.PushControlSurface;
import de.mossgrabers.framework.command.core.AbstractTriggerCommand;
import de.mossgrabers.framework.daw.IModel;
import de.mossgrabers.framework.daw.constants.Capability;
import de.mossgrabers.framework.featuregroup.ModeManager;
import de.mossgrabers.framework.mode.Modes;
import de.mossgrabers.framework.utils.ButtonEvent;


/**
 * Command to edit the Volume of tracks.
 *
 * @author Jürgen Moßgraber
 */
public class VolumeCommand extends AbstractTriggerCommand<PushControlSurface, PushConfiguration>
{
    /**
     * Constructor.
     *
     * @param model The model
     * @param surface The surface
     */
    public VolumeCommand (final IModel model, final PushControlSurface surface)
    {
        super (model, surface);
    }


    /** {@inheritDoc} */
    @Override
    public void execute (final ButtonEvent event, final int velocity)
    {
        if (event != ButtonEvent.DOWN)
            return;

        final ModeManager modeManager = this.surface.getModeManager ();
        final Modes currentMode = modeManager.getActiveID ();

        // Layer mode selection for Push 1
        final PushConfiguration config = this.surface.getConfiguration ();
        if (!config.isPushModern () && this.surface.isSelectPressed () && Modes.isLayerMode (currentMode))
        {
            modeManager.setActive (Modes.DEVICE_LAYER_VOLUME);
            return;
        }

        // When Pan/Send has switched Push 1 to the FX-track volume bank,
        // an unshifted Volume press switches back to the normal track bank.
        if (!config.isPushModern ()
                && config.isPanSendButtonFxVolumeEnabled ()
                && !this.surface.isShiftPressed ()
                && this.model.isEffectTrackBankActive ())
        {
            this.model.toggleCurrentTrackBank ();
            modeManager.setActive (Modes.VOLUME);
            return;
        }

        // Optional Push 1 behaviour: keep Volume as a one-way mode button.
        // Shift + Volume explicitly selects the original second-press view.
        if (!config.isPushModern () && config.isVolumeButtonIgnoreDoublePressEnabled ())
        {
            if (this.surface.isShiftPressed ())
            {
                if (this.model.getHost ().supports (Capability.HAS_CROSSFADER))
                    modeManager.setActive (Modes.CROSSFADER);
            }
            else
                modeManager.setActive (Modes.VOLUME);

            return;
        }

        if (Modes.VOLUME.equals (currentMode))
        {
            if (this.model.getHost ().supports (Capability.HAS_CROSSFADER))
                modeManager.setActive (Modes.CROSSFADER);
        }
        else
            modeManager.setActive (Modes.VOLUME);
    }
}
