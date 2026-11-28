# Feature Documentation


---

### Touching Knob 9 (Master Volume) should not switch automatically to Master Mode View
Ableton Push One:

Touching Knob 9 (Master Volume) should not switch automatically to Master Mode View. This has the advantage that accidentally touching the button does not change the view, and that the Master Volume and, for example, the volume of a track can be adjusted at the same time.


---

### Ignore volume button double press

Ableton Push One: 
1. Volume button: A normal press activates Volume View Mode. Further presses do nothing; they must not switch to the CUE settings view.
2. SHIFT + VOLUME: Opens the CUE settings view, preserving the existing functionality of the second press through this alternative shortcut.
3. Push 1 only: Push 2 and other controllers remain unchanged.
4. Global feature toggle: Add an ON/OFF setting under SHIFT + USER, defaulting to OFF. When disabled, the original Volume button behavior remains unchanged.
   The setting should use the existing global settings mechanism, so it persists across projects and Bitwig restarts. The default setting is off.

---

### SHIFT + DELETE toggles track de-activation

Ableton Push One: 

- SHIFT + DELETE toggles track de-activation, but only in Track or Volume mode. In every other mode, SHIFT + DELETE does nothing.
- Normal DELETE continues to perform its existing deletion operation.
- If no track is selected, nothing happens.
- The modification applies to Push 1 only, leaving Push 2 and Push 3 unchanged.

---

### Pan/Send button switches to the FX-track bank and activates Volume mode

Ableton Push One: 

- Repeated presses: stays in FX Volume mode; it does not switch back.
- SHIFT + Pan/Send: retains the original Pan/Send functionality.

Feature toggle: available in the Push 1 configuration screen (SHIFT + USER), using the fifth button in the second row. It is not enabled by default and can be switched On/Off.

---

### Indicate selected deactivated track

Ableton Push: If the selected track is deactivated the track is indicated by a green glowing button.

---

### Direct switch to the track remote parameter of the current active track

Ableton Push One: 
SCALE button: Directly open Track Remote parameters
SCALE button again: Stay in Track Remote view
SHIFT + SCALE: Open the original Scales View
SHIFT while in Scales View: Preserve the existing Scale Layout behaviour

---

### Persistent Mute/Solo LED indication

Ableton Push:

Project-wide mute and solo state are checked independently; the corresponding button blinks outside its mode, 
while an active Mute or Solo mode takes priority and stays steadily lit.

Behaviour
- When Mute mode is active, the Mute button is steadily illuminated regardless of whether any track is muted.
- When Mute mode is inactive, the Mute button slowly blinks if any track in the project is muted; otherwise it is off.
- When Solo mode is active, the Solo button is steadily illuminated regardless of whether any track is soloed.
- When Solo mode is inactive, the Solo button slowly blinks if any track in the project is soloed; otherwise it is off.
- Mute and Solo are independent and may blink at the same time.
- Removing all mutes or all solos stops the corresponding blinking automatically.


---

### Pressing clip button twice controller stays in clip mode

Ableton Push One:
Press Clip from Track mode: Switch to Clip
Press Clip again: Stay in Clip
Press Volume: Switch to Volume
Press Track: Switch to Track

