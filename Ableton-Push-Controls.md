# Ableton Push 1 / 2 / 3 — Controls Reference

> **Scope:** This document extracts and reorganises the Push-specific control information from the DrivenByMoss manual. The mappings described here are the mappings implemented by the **DrivenByMoss controller script for Bitwig Studio**. They are not a promise that the same button combinations behave identically in Ableton Live, in other control scripts, or in every firmware mode.
>
> **Source verification:** The PDF in `alexanderluedeke/PushOneImprovement` and the PDF in the official `git-moss/DrivenByMoss-Documentation` repository have the same Git blob SHA: `ab5ab0c453b029dbd86ea51ee23671ea2f8ccdea`. The documentation repository's `Build.cmd` generates that PDF from Markdown and explicitly includes `Ableton/Ableton-Push.md`.
>
> **Primary sources:**
> - [Original PDF in PushOneImprovement](https://github.com/alexanderluedeke/PushOneImprovement/blob/master/DrivenByMoss-Manual.pdf)
> - [Source Markdown: Ableton/Ableton-Push.md](https://github.com/git-moss/DrivenByMoss-Documentation/blob/master/Ableton/Ableton-Push.md)
> - [Manual build script](https://github.com/git-moss/DrivenByMoss-Documentation/blob/master/Build.cmd)

## 1. Model overview

| Model | Main physical differences relevant to controls |
|---|---|
| **Push 1** | Has dedicated `Volume`, `Pan & Send` and `Track` buttons, two small navigation knobs, and a ninth knob for master volume. Its second button row is used for track mute/solo/stop states. |
| **Push 2** | Does not have the dedicated `Volume` and `Pan & Send` buttons. Use the corresponding mode selectors/controls above the display after pressing `Mix`. It retains two small navigation knobs and a ninth knob for master volume. |
| **Push 3** | Uses small, medium and large encoders instead of Push 1/2's two small encoders plus knob 9. It adds hardware-specific buttons such as `File`, `Save`, `Help`, `Capture MIDI` and `Show Clip Grid`. |

The common mappings below apply across the supported Push models unless a model-specific note says otherwise.

## 2. Shared / global button mappings

### Transport and recording

| Control | Function |
|---|---|
| `Play` | Starts or stops playback. Double-click moves the play cursor to the start of the song. The stop behaviour can be configured in the preferences. |
| `Shift + Play` | Toggles repeat/loop. |
| `Select + Play` | Toggles Punch In. |
| `Select + Shift + Play` | Toggles Punch Out. |
| `Record` | Starts or stops recording. |
| `Shift + Record` | Toggles launcher overdub. If the selected slot on the selected track is currently recording, this stops that recording instead. |
| `New` | Creates a new clip in the selected track/slot, starts playback and enables overdub. |
| `Shift + New` | Creates the clip in the same way, but does not activate launcher overdub. |
| `Automation` | Toggles Automation Write. Long-press to open the Automation dialog and change the automation mode. |
| `Shift + Automation` | Toggles the transport's clip-launcher automation-write state. |
| `Delete + Automation` | Resets automation overrides. |
| `Fixed Length` | Selects the MIDI clip length used by `New`. The upper row lets you create a clip of the selected length without storing that length as the persistent selection. |

### Editing and clip operations

| Control | Function |
|---|---|
| `Duplicate + Scene pad` | Duplicates a scene. |
| `Duplicate + Track Select` | Duplicates a track. |
| Hold `Duplicate` and select source clip, then destination clip | Copies a clip in Session mode. The source must contain content and the destination must be empty. Release `Duplicate` to complete the operation. |
| `Shift + Duplicate` | Creates a scene from the currently playing clips. |
| `Select + Duplicate` | Creates a new scene at the end of the scene list. |
| `Quantize` | Quantizes the currently selected clip. |
| `Shift + Quantize` or long-press `Quantize` | Opens the Quantize and Groove configuration modes. |
| `Double (Loop)` | Duplicates the content inside the selected clip; it does not duplicate the clip itself. |
| `Undo` | Undoes the last action. `Shift + Undo` performs Redo. |
| `Delete` | Performs the normal delete action. Holding it while touching an encoder resets that value to its default in all modes. Other Delete combinations are mode-dependent. |

### Metronome, note repeat and performance controls

| Control | Function |
|---|---|
| `Metronome` | Toggles the metronome. Long-press to open metronome settings, including volume and pre-roll. |
| `Shift + Metronome` | Toggles metronome ticks. |
| `Tap Tempo` | Sets tempo by tapping. |
| `Repeat` | Toggles note repeat. Long-press to enter Note Repeat Mode and configure its settings. |
| `Repeat + Scene button` | Changes the note-repeat period. |
| `Shift + Note Repeat + Scene button` | Changes the note-repeat note length. |
| `Select + Note Repeat` | Toggles Fill Mode. |
| `Accent` | Enables the accent/fixed-velocity behaviour in Play and Sequencer modes. Long-press to change the fixed accent value. |
| `Scale` | Activates or deactivates Scale mode. |
| `Shift + Touchstrip` | Opens the touch-strip configuration. The strip can send pitch bend, a MIDI CC, or a mixed mode. In mixed mode, upward movement sends pitch bend and downward movement sends the selected MIDI CC. |
| `Shift + Track` | Toggles VU meters on/off. |
| Hold `Master` | Opens a screen for toggling perspectives and panels. |
| `Footswitch 1` | Sends sustain. |
| `Footswitch 2` | Executes the function selected in the controller preferences. |

### Navigation and general encoders

| Control | Function |
|---|---|
| `Knobs 1–8` | Value encoders. Hold `Shift` while turning an encoder for finer value changes. The parameter being controlled depends on the current mode. |
| `Arrow keys` | Navigate track/device/layer pages and scene banks. In the browser, left/right changes browser tabs. Exact navigation actions can be configured in the preferences. |
| Push 3 `Center` button | Starts the selected scene with its alternative launch action (Bitwig only). |
| `Browse` | Enters preset-selection mode for the selected device. If no device is selected, opens the browser to add a device. |
| `Add Track` | Opens the menu for inserting tracks. Favourite/preconfigured devices for this menu can be set in the preferences. |

## 3. Push 1-specific controls

| Control | Function |
|---|---|
| `Add Effect` | Adds a device after the currently selected device. |
| `Shift + Add Effect` | Adds a device before the currently selected device. |
| `Select + Add Effect` | Opens the device favourites menu on the Device page. |
| `Shift + User` | Opens hardware settings such as pad sensitivity. These settings are also available in the script preferences. |
| `Mute` | Selects the mute state for the second row of buttons. The second row then toggles mute for the corresponding tracks. |
| `Solo` | Selects the solo state for the second row of buttons. |
| `Stop Clip` | Selects stop-clip state for the second row of buttons. In Stop mode, `Shift` with a second-row button triggers the alternative stop function (Bitwig only). |
| `Select + Stop Clip` | Stops all playing clips. |
| `Shift + Select + Stop Clip` | Executes the alternative stop-all-clips function (Bitwig only). |
| `Select + Mute` | Deactivates all mutes. |
| `Select + Solo` | Deactivates all solos. |

### Push 1 navigation knobs

| Control | Normal function | Modified function |
|---|---|---|
| **Small Knob 1** | Changes tempo. | `Shift` = fine tempo adjustment. `Select` = arrange loop start; add `Shift` for small adjustments. |
| **Small Knob 2** | Moves the play cursor. | `Shift` = fine adjustment. `Select` = arrange loop length; add `Shift` for small adjustments. |
| **Knob 9** | Changes Master Volume. | `Select + Knob 9` changes arranger zoom. |

## 4. Push 2-specific controls

| Control | Function |
|---|---|
| `Convert` | Opens the Slice to Drum Machine dialog. |
| `Shift + Convert` | Opens the Slice to Multi-sample dialog. |
| `Add Device` | Adds a device after the currently selected device. |
| `Shift + Add Device` | Adds a device before the currently selected device. |
| `Select + Add Device` | Opens the device favourites menu on the Device page. |
| `Setup` | Opens hardware settings such as pad sensitivity. These settings are also available in the script preferences. |
| `Layout` | Steps through Play or Sequencer layouts, depending on which type is active. |
| `Shift + Layout` | Toggles between Play and Sequencer modes. |
| `Mute` | Mutes the selected track. Long-press to choose mute states with the second row of buttons. `Shift + Mute` locks this mode. |
| `Solo` | Solos the selected track. Long-press to choose solo states with the second row. `Shift + Solo` locks this mode. |
| `Stop Clip` | Stops the selected track's clip. Long-press to choose stop states with the second row. `Shift + Stop Clip` locks this mode. A second-row button with `Shift` invokes the alternative stop action (Bitwig only). |
| `Select + Stop Clip` | Stops all playing clips. |
| `Shift + Select + Stop Clip` | Executes the alternative stop-all-clips function (Bitwig only). |
| `Select + Mute` | Deactivates all mutes. |
| `Select + Solo` | Deactivates all solos. |

### Push 2 navigation knobs

| Control | Normal function | Modified function |
|---|---|---|
| **Small Knob 1** | Changes tempo. | `Shift` = fine tempo adjustment. `Select` = arrange loop start; add `Shift` for small adjustments. |
| **Small Knob 2** | Moves the play cursor. | `Shift` = fine adjustment. `Select` = arrange loop length; add `Shift` for small adjustments. |
| **Knob 9** | Changes Master Volume. | `Select + Knob 9` changes arranger zoom. |

**Important Push 2 difference:** Push 2 has no dedicated `Volume` or `Pan & Send` buttons. Enter these modes using `Mix` and the corresponding on-screen button above the display.

## 5. Push 3-specific controls

| Control | Function |
|---|---|
| `File` | Opens the file dialog. |
| `Save` | Saves the project. |
| `Help` | Shows learning resources. |
| `Convert` | Opens the Slice to Drum Machine dialog. |
| `Shift + Convert` | Opens the Slice to Multi-sample dialog. |
| `Add Track/Device` | Opens the Add Track/Device menu. |
| `Setup` | Opens hardware settings such as pad sensitivity. These settings are also available in the script preferences. |
| `Layout` | Steps through Play or Sequencer layouts, depending on which type is active. |
| `Shift + Layout` | Toggles between Play and Sequencer modes. |
| `Mute` / `Solo` / `Stop Clip` | Mutes, solos or stops the selected track. Long-press each button to choose states with the second row. The corresponding `Lock + ...` combination locks that mode. |
| `Select + Stop Clip` | Stops all playing clips. |
| `Shift + Select + Stop Clip` | Executes the alternative stop-all-clips function (Bitwig only). |
| `Select + Mute` / `Select + Solo` | Deactivates all mutes / all solos. |
| `Capture MIDI` | Creates a new scene. |
| `Shift + Capture MIDI` | Creates a new scene from the currently playing launcher clips. |
| `Show Clip Grid` | Toggles between showing scenes/clips and the mixer in Session mode. |

### Push 3 encoders

| Encoder | Normal function | Press / modified function |
|---|---|---|
| **Small Knob** | Changes tempo. | `Shift` = fine tempo adjustment. Press the knob to toggle between tempo and shuffle amount. `Select` changes arrange loop start; add `Shift` for small adjustments. |
| **Medium Knob** | Changes Master/Cue Volume. | Press to toggle between Master Volume and Cue Mix Volume. `Select + Medium Knob` changes arranger zoom. |
| **Large Knob** | Moves the play cursor. | `Shift` = fine adjustment. `Select` changes arrange loop length; add `Shift` for small adjustments. Press to start/stop playback. Turning it moves the play cursor among the start of the song, start of loop, end of loop and end of project. |

## 6. Track and mixer modes

The following modes describe what the eight main encoders and button rows do. On Push 1, use the dedicated mode buttons. On Push 2/3, use `Mix` and the relevant buttons above the display.

### Volume

- **Enter:** Push 1: press `Volume`. Push 2/3: press `Mix`, then `Volume` above the display.
- **Eight encoders:** Set the volume of the eight tracks in the current track bank. Hold `Shift` for fine adjustment.
- **First button row:** Selects tracks. With hierarchical track navigation enabled, press the selected group track again to enter the group. Long-press a track button to leave a group.
- **Record + first-row button:** Arms the corresponding track for recording.
- **Delete + first-row button:** Deletes the corresponding track.
- **Select + first-row button:** Selects multiple tracks (Reaper only).
- **Second button row on Push 1:** Toggles mute, solo or stop-clip state, depending on whether `Mute`, `Solo` or `Stop Clip` is selected.
- **Navigation:** Left/right changes track bank. `Shift + Left/Right` moves the selected track.

### Crossfader

- **Enter:** Push 1: press `Volume` twice. Push 2/3: press `Mix`, then `Crossfader` above the display.
- **Eight encoders:** Set the crossfader assignment for the eight tracks in the current track bank.
- Track-selection and button-row behaviour is the same as in Volume mode.

### Pan & Send

- **Enter:** Push 1: press `Pan & Send` (press repeatedly to cycle modes). Push 2/3: press `Mix`, then `Send X` above the display.
- **Eight encoders:** Control pan or Sends 1–6 for the eight tracks in the current track bank. Hold `Shift` for fine adjustment.
- **Enable/disable a send:** Hold `Shift`, also hold `Select`, then touch the encoder for the send.
- **Send pages on Push 2/3:** The fourth button above the display moves to the next send page. Combine with `Shift` to move backwards.
- **Fourth send mode:** On Push 2/3, hold `Shift` to access the fourth Send mode.

### Track

- **Enter:** Push 1: press `Track`. Push 2/3: press `Mix`.
- Press the mode button twice to toggle between normal tracks and effect tracks.
- **Eight encoders:** Control volume, pan, crossfader and Sends 1–5 for the selected track. Hold `Shift` for fine adjustment.

### Clip

Press `Clip` to edit clip properties, including:

- Loop
- Play range
- Shuffle
- Accent

### Track details

In track modes, press and release `Select` to open Track Details. This view can edit track states such as enable, solo, mute, record arm and monitor, and can change the track colour. If a layer is selected, a similar view edits the layer. The note insert/edit MIDI channel can also be selected here. With `Shift` held, selecting an already selected group track toggles its expanded/collapsed state.

## 7. Device, Browser, Master and User modes

### Device mode

- **Enter:** Press `Device`.
- **First button row:** Selects devices or parameter banks. Combine a button with `Delete` to delete the device/bank item.
- **Eight encoders:** Control the selected device's eight parameters. Hold `Shift` for fine adjustment. Hold `Delete` and touch an encoder to reset its parameter.
- **Left/right buttons:** Select the previous/next device or parameter bank.
- **Left/right arrows:** Select the previous/next device or parameter page. `Shift + Left/Right` moves the selected device.
- **Push 2/3 second row (buttons above the display):**
  1. Enable/disable the device.
  2. Show/hide the plug-in Remote Controls section.
  3. Toggle extended/small device view.
  4. Enter Chains sub-devices for Bitwig devices with slots.
  5. Toggle between device navigation and parameter-bank navigation.
  6. Pin the device to the controller so DAW selection changes do not switch the controller to another device.
  7. Open/close the plug-in window or a Bitwig device pop-out window.
  8. Navigate up to Track mode.
- Select a group, layer or device with its first-row button. Long-press a first-row button to move up the hierarchy.
- `Mute + Device` toggles the selected device's enabled state.
- Press `Browse` to select another device patch. Hold `Shift` in Preset mode to scroll quickly.
- **Push 1 layer modes:** Use `Select + Volume`, `Select + Pan` or `Select + Track` to activate layer modes. Press `Pan` repeatedly for the Send modes.

### Browser mode

- **Enter:** Press `Browse` (Push 3 labels this control `Hot Swap`).
- **Encoders 1–7:** Change browser filters.
- **Encoder 8:** Changes the selected patch/result.
- **Tempo encoder:** Changes the value of the last selected browser column.
- **First button row:** Selects the previous patch/filter item.
- **Second button row:** Selects the next patch/filter item.
- `Shift +` the eighth button in the first row toggles preview.
- Left/right arrows switch browser tabs.
- `Delete + touch encoder` resets that filter to its default.
- Press `Browse` again to confirm. Use `Shift + Browse` to cancel.
- **Push 3 Large Knob:** Selects the previous/next item in the selected result/filter column. Pressing it performs the Browse action. Turning it left/right changes the selected filter/result column.
- **Push 3 Center Arrow button:** Toggles whether a device is inserted before or after the currently selected device.

### Master mode

- **Enter:** Press `Master`.
- **Eight encoders:** Control master-track volume and pan, plus Cue Volume and Cue Mix. Hold `Shift` for fine adjustment.
- The mode provides a control to enable/disable the audio engine.
- Buttons 7 and 8 switch to the previous/next open project.

### User mode

- **Enter:** Press `User`.
- Provides access to project and track parameters.
- **Eight encoders:** Change the value of a mapped parameter. Hold `Shift` for fine adjustment.
- Left/right buttons select the previous/next parameter page.
- First button row selects the parameter page.
- First two buttons in the second row toggle between Project and selected Track parameters.

## 8. Session, pad and sequencer button combinations

These are context-specific actions that are useful to keep alongside the general button reference.

### Session mode

- Press `Session` to enter Session mode. Keep the button held to switch back to Note mode when it is released.
- The grid pads launch or record clips, depending on the clip-launch settings.
- The `1/4` to `1/32t` buttons launch scenes.
- `Shift + Pad` triggers the alternative clip/scene action (Bitwig only).
- `Select + Pad` selects a clip or scene without launching it.
- `Shift + Select` opens the bird's-eye view; each pad represents an 8×8 block of clips.
- Up/down arrows scroll scenes. Hold `Shift` to scroll in blocks of eight.
- In locked Stop mode, `Shift +` a first-row button returns that track to the arrangement.
- Press `Fixed Length` to choose the length for new clips.
- Press `Clip` to show the current clip in the editor.
- The ribbon controls the crossfader. Hold `Shift` and touch the ribbon to centre the crossfader.
- `Delete + Pad` deletes a clip. `Delete + Scene pad` deletes a scene.
- On Push 2/3, `Layout` steps through Session layouts/views.
- **Push 3 Large Knob:** In clip/scene mode, turn to select the previous/next clip or scene; press to launch it; turn left/right to switch tracks or select the previous/next scene.

### Sequencer functions common to most sequencers

- Page left/right moves through the clip. On Push 1, use the Device In/Out buttons for this navigation.
- Press a pad to enter or delete a note; the pad's velocity is set as well.
- To extend a note, hold its pad briefly and press the pad to its right.
- Hold `Duplicate`, select a source note and then press destination pad(s) to copy the note with its settings.
- Scene buttons change the grid resolution.
- `Shift + Pad` enables/increases note repeat by one step.
- `Shift + Select + Pad` enables/decreases note repeat by one step.
- `Select + Pad` selects a note for editing.
- `Mute + Pad` toggles a note's mute state in the step sequencer.
- Long-press a pad containing a note to enter note-edit mode. Select additional notes by pressing their pads; use `Select` with a note pad to add/remove notes from the edit selection. Pressing an empty pad exits note-edit mode.

### Drum-specific controls

- In Drum Sequencer mode, hold `Delete` and press a drum pad to delete the current clip's MIDI notes for that pad.
- Hold `Mute` or `Solo` and press a drum pad to mute/solo that drum pad.
- Hold `Select` while pressing a drum pad to select it without sounding it.
- `Browse + Drum Pad` opens the browser in Drum and Drum 64 views.
- The Push documentation also describes additional Drum 4, Drum 8, Drum 64 and XoX sequencer layouts; their pad-grid behaviour depends on the selected sequencer mode.

## 9. Preferences that affect controls

| Preference | Effect |
|---|---|
| **Knob Sensitivity Default** | Adjusts normal encoder speed/sensitivity. |
| **Knob Sensitivity Slow** | Adjusts encoder speed when `Shift` is held for fine adjustment. |
| **Stop automation recording on knob release** | Automatically switches automation recording off when an encoder is released after writing an automation value. |
| **Footswitch 2** | Selects the action executed by the second footswitch. Footswitch 1 remains sustain. |
| **Ribbon Mode / CC** | Selects what the touch-strip sends and, for CC mode, which MIDI CC it uses. |
| **Function if Note Repeat is active** | Determines whether the ribbon is used for note repeat while Note Repeat is active, or continues to use its selected mode. |
| **Cursor Keys Track/Scene Options** | Configures what the arrow keys do, including their `Shift` combinations. |
| **VU meters** | Enables/disables meter display; `Shift + Track` also toggles VU meters. |
| **Track navigation** | Flat mode displays all tracks; hierarchical mode shows groups/folders and lets you enter/leave them with the track-select buttons. |
| **Flip arranger and clip record/automation** | Swaps the normal and `Shift` functions of Record and Automation. |

## 10. Important qualifications

- Several combinations are explicitly marked **Bitwig only** in the source manual. They should not be assumed to work in another DAW.
- Push 1, Push 2 and Push 3 do not have identical physical controls. Use the model-specific sections above rather than assuming that a button or encoder exists on every model.
- Push 2/3 use on-screen buttons above the display for functions that Push 1 exposes through dedicated buttons, especially in the mixer modes.
- The manual describes a DrivenByMoss control surface script. A control's behaviour can depend on the active mode, selected track/device, Bitwig preferences and project settings.
- For Push 3 hardware-specific differences beyond the DrivenByMoss mapping, the source chapter points to the [Push 3 protocol documentation](https://github.com/danielknng/push3-protocol-docs).

---

## Source section map

Use these headings in the [original source chapter](https://github.com/git-moss/DrivenByMoss-Documentation/blob/master/Ableton/Ableton-Push.md) to compare or extend this reference:

| This reference | Source chapter section |
|---|---|
| Shared/global button mappings | `Global Features` |
| Model-specific controls | `Push 1 specifics`, `Push 2 specifics`, `Push 3 specifics` |
| Mixer and track modes | `Edit Modes` |
| Device, Browser, Master and User | `Edit Modes` |
| Session and pad gestures | `Session Mode` |
| Sequencer gestures | `Sequencers` |
| Preferences | `Preferences Settings` |
