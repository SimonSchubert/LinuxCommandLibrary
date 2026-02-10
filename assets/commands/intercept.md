# TAGLINE

reads raw input events from a Linux input device and outputs them to stdout

# TLDR

Read raw input events **exclusively** (system won't see them)

```sudo intercept -g [/dev/input/eventX]```

Read raw input events **non-exclusively** (system also sees them)

```sudo intercept [/dev/input/eventX]```

# SYNOPSIS

**intercept** [_options_] _device_

# PARAMETERS

**-g**
> Grab the device exclusively, preventing other programs from reading events

_device_
> Input device file (e.g., /dev/input/event0)

# DESCRIPTION

**intercept** reads raw input events from a Linux input device and outputs them to stdout. It is part of the Interception Tools project, designed for creating input device manipulation pipelines.

The output can be piped to transformation tools and then back to a virtual input device using uinput, enabling key remapping, macro creation, and other input modifications at a low level.

# CAVEATS

Requires root privileges to access input devices. Using -g flag captures input exclusively, which can lock you out if intercepting keyboard input without proper output handling. Part of the interception-tools package.

# HISTORY

intercept is part of the Interception Tools project, designed as a composable set of utilities for intercepting and manipulating input events on Linux using the evdev and uinput interfaces.

# SEE ALSO

[evtest](/man/evtest)(1), [uinput](/man/uinput)(4), [libinput](/man/libinput)(1)
