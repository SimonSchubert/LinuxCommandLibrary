# TAGLINE

Wayland touchpad edge gestures, driven by a user daemon

# TLDR

**List** touchpad devices

```edgepad devices```

**Show** whether the daemon has the pad

```edgepad status```

**Check** the setup

```edgepad doctor```

**Run** the daemon in the foreground

```edgepad daemon```

**Reload** the user service after a config edit

```systemctl --user reload edgepad.service```

**Follow** this boot's logs

```journalctl --user -u edgepad.service -b```

# SYNOPSIS

**edgepad** _command_ [_options_]

# COMMANDS

**devices** [**--all**] [**--input-root** _DIR_]
> List touchpad candidates under the input root (default **/dev/input**). **--root** is the same option. **--all** lists every readable event device.

**status** [**--config** _FILE_] [**--device** _NODE_] [**--service** _UNIT_]
> Print whether the configured device is grabbed and whether the user service is active. **--device** is **auto** or an event node. **--service** defaults to **edgepad.service**. **--input-root** defaults to **/dev/input**.

**doctor** [**--uinput** _PATH_]
> Run the same checks as **status**, and also check that uinput exists. **--uinput** defaults to **/dev/uinput**.

**daemon** [**--config** _FILE_] [**--input-root** _DIR_]
> Grab the touchpad and emit gestures. SIGHUP reloads the config after active contacts lift. The user service runs this command.

**dump** **--device** _NODE_ **--out** _FILE_
> Record a capture. **--device** and **--out** are required. **--frames** _N_ stops after at least N frame boundaries, once the pad is idle. **--raw** keeps the raw stream. Stop **edgepad.service** first when the daemon already owns the pad. The physical device must not be grabbed during the capture.

**proxy** **--frames** _N_ (**--dry-run** | **--uinput**)
> Replay recognition for N frames (N is a positive integer). Choose **--dry-run** (no output devices) or **--uinput** (creates a virtual device). **--uinput** requires **--grab**. **--grab** requires **--uinput**. **--dry-run** cannot be combined with **--grab**. Optional: **--device**, **--input-root**, **--edge-width** _WIDTH_, and the recognition options printed by **edgepad proxy --help**.

**replay** _FILE_
> Replay a capture file through the recognizer.

**replay-raw** _FILE_
> Replay a raw capture. Both replay commands accept the same recognition options as **proxy**.

# DESCRIPTION

**edgepad** turns the edges of a laptop touchpad into gesture zones on Linux with Wayland. Swipes that start in a left, right, top, or bottom zone fire a command when the finger lifts. Sliders repeat a command while the finger moves. The daemon grabs the pad, so the edges you bind are no longer normal pointer input, and unbound edges still move the pointer.

A normal install runs **edgepad daemon** as the user unit **edgepad.service**. **systemctl --user stop edgepad.service** releases the pad. **systemctl --user reload edgepad.service** reloads config after fingers lift.

# CONFIGURATION

**~/.config/edgepad/edgepad.toml**

> Default config file. If the XDG config home variable is set, the file is **edgepad/edgepad.toml** under that directory. **--config** selects another file for one run. The release installer records the resolved path in the user unit. Change that variable and run the installer again so the unit follows the new path.

Zones are **left**, **right**, **top**, and **bottom**. Directions are **up**, **down**, **left**, **right**, **tap**, and **double-tap**. Each zone and direction pair has one binding. A gesture runs its command when the finger lifts. Sliders on the left and right edges use **up** and **down**; top and bottom edges use **left** and **right**.

# CAVEATS

Linux and Wayland only. A command is required; there is no default subcommand. **dump** fails to see the real events while the daemon holds the device. **proxy --dry-run** does not grab and does not create a virtual device. **proxy --uinput** grabs the pad for the length of the run.

# HISTORY

**edgepad** is published by assembledev. It is written in Rust and licensed under MIT or Apache-2.0, at your option.

# SEE ALSO

[libinput](/man/libinput)(1), [evtest](/man/evtest)(1), [wev](/man/wev)(1)

# RESOURCES

```[Source code](https://github.com/assembledev/edgepad)```

```[Documentation](https://github.com/assembledev/edgepad/blob/main/docs/configuration.md)```

<!-- verified: 2026-10-27 -->
