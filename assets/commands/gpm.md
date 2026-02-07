# TAGLINE

Console mouse support daemon

# TLDR

Start gpm with a **PS/2 mouse**

```sudo gpm -m /dev/input/mice -t ps2```

Start gpm with a **Microsoft serial mouse**

```sudo gpm -m /dev/ttyS0 -t ms```

Start gpm in the foreground for **debugging**

```sudo gpm -m [path/to/mouse_device] -t [mouse_type] -D```

**Kill** the running gpm

```sudo gpm -k```

Start gpm in **repeater mode** for X server compatibility

```sudo gpm -m [path/to/mouse_device] -t [mouse_type] -R```

List the available **mouse types**

```gpm -t help```

# SYNOPSIS

**gpm** [_options_]

# PARAMETERS

**-m** _DEVICE_
> Mouse device (e.g., /dev/input/mice, /dev/ttyS0)

**-t** _TYPE_
> Mouse type (ps2, ms, imps2, etc.)

**-R** [_TYPE_]
> Repeater mode for X server; optionally specify output type

**-D**
> Debug mode; run in foreground

**-k**
> Kill running gpm daemon

**-B** _SEQUENCE_
> Button sequence (1, 2, 3 or permutation)

**-2**
> Force two-button mouse emulation

**-3**
> Force three-button mouse emulation

# DESCRIPTION

**gpm** (General Purpose Mouse) provides mouse support for the Linux virtual console (text mode). It enables copy/paste functionality, mouse cursor movement, and mouse button events in console applications.

Text selection is done by holding the left button and dragging. Middle button pastes selected text. Right button extends selection. This provides clipboard functionality similar to X11 in pure text mode.

In repeater mode (**-R**), gpm can pass mouse events to X server, allowing both console and X applications to share the mouse device.

# CONFIGURATION

**/etc/gpm.conf**
> Daemon configuration including mouse device, type, and options.

# CAVEATS

Only works in Linux virtual consoles, not terminal emulators or SSH sessions. Requires root privileges. May conflict with X server mouse handling if not configured for repeater mode. Modern systems often use systemd to manage gpm.

# HISTORY

gpm was created by Alessandro Rubini in **1994** to bring mouse support to the Linux console. It became essential for text-mode applications and system administration before graphical desktops became prevalent. The project remains maintained for console-based systems.

# SEE ALSO

[Xorg](/man/Xorg)(1), [console](/man/console)(4)
