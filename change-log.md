# Different branches
Everything is merged into the 'all-feature' branch (aside from the draft-branches).

## Branch: Improve README.md by changing a misleading statement
Improve README.md by changing a misleading statement, because the release-scripts should actually be used.
In that way there is no need for the related entry in the .gitignore.

## Branch: Ableton Push One: Touching Knob 9 (Master Volume) should not switch automatically to Master Mode View
Push One only: Touching Knob 9 (Master Volume) should not switch automatically to Master Mode View. This has the advantage that accidentally touching the button does not change the view, and that the Master Volume and, for example, the volume of a track can be adjusted at the same time.

Notice, Master View Mode will be still accessible via the Master button.

## Branch: Ableton Push One: SHIFT + DELETE toggles track de-activation
- SHIFT + DELETE toggles track de-activation, but only in Track or Volume mode. In every other mode, SHIFT + DELETE does nothing.
- Normal DELETE continues to perform its existing deletion operation.
- If no track is selected, nothing happens.
- The modification applies to Push 1 only, leaving Push 2 and Push 3 unchanged.

## Branch: Ableton Push One: feat-pan-send-button-switches-fx-track
- Pressing 'Pan-Send'-button switches to effect send volumes overview.
- Pressing the button again has no effect.
- Pressing 'Pan-Send'-button and SHIFT switches to the original pan and send settings of the the tracks.
- The feature has to be enabled via global settings.
- The modification applies to Push 1 only, leaving Push 2 and Push 3 unchanged.

## Branch: Ableton Push One: feat-blicking-solo-mute-buttons
Persistent Mute/Solo LED indication
Goal: Make the Mute and Solo buttons communicate the actual state of the project, even when their respective operating modes are not active.

The feature should behave as follows:
Situation	Mute button	Solo button
Mute/Solo mode active	Steady light	Steady light
Outside the modes, one or more tracks muted	Slow blinking	Unchanged
Outside the modes, one or more tracks soloed	Unchanged	Slow blinking
No tracks muted or soloed	Off	Off
All mutes/solos removed	Corresponding blinking stops	Corresponding blinking stops

Important details:
1. The mode-active state takes priority. When Mute mode is active, Mute must remain steadily illuminated, regardless of whether any tracks are muted. The same applies to Solo.
2. When leaving a mode, its button should immediately reflect the project's actual state.
3. Blinking should be handled by the hardware wherever supported, rather than by a software timer.
4. Mute and Solo must be evaluated independently. Both buttons can blink simultaneously.
5. The indication should cover the tracks in the project, not just the currently selected track.

OR THIS???
Persistent Mute/Solo LED indication
Behaviour
- When Mute mode is active, the Mute button is steadily illuminated regardless of whether any track is muted.
- When Mute mode is inactive, the Mute button slowly blinks if any track in the project is muted; otherwise it is off.
- When Solo mode is active, the Solo button is steadily illuminated regardless of whether any track is soloed.
- When Solo mode is inactive, the Solo button slowly blinks if any track in the project is soloed; otherwise it is off.
- Mute and Solo are independent and may blink at the same time.
- Removing all mutes or all solos stops the corresponding blinking automatically.
  Implementation notes
  The status uses IProject.hasMute() and IProject.hasSolo(), which are project-wide Bitwig state queries rather than checks of only the selected or currently visible track. The active LockState takes priority over project status.

Push 1 uses its CC-value slow-blink encoding. Push 2 uses the documented channel-based LED animation mechanism, with channel 15 for the slowest blink. The patch applies that same modern message path to Push 3; Push 3 animation behaviour still needs confirmation on hardware because Ableton does not publish a Push 3 LED-animation protocol specification.