# TAGLINE

library and command-line tool for handling input devices on Linux

# TLDR

**List** all input devices

```sudo libinput list-devices```

**Debug** input events

```sudo libinput debug-events```

Launch **debug GUI**

```sudo libinput debug-gui```

Debug **tablet** devices

```sudo libinput debug-tablet```

Display **help**

```libinput --help```

# SYNOPSIS

**libinput** _command_ [_options_]

# DESCRIPTION

**libinput** is a library and command-line tool for handling input devices on Linux. It provides a unified interface for mice, keyboards, touchpads, and tablets on both X11 and Wayland systems.

# PARAMETERS

**list-devices**
> List all devices recognized by libinput

**debug-events**
> Print all input events to stdout

**debug-gui**
> Show graphical visualization of input events

**debug-tablet**
> Debug tablet and stylus axis values

**measure**
> Measure device-specific properties

**analyze**
> Analyze recorded events

**-h, --help**
> Display help information

# CAVEATS

Most commands require root privileges to access input devices. The debug-gui requires a graphical environment.

# SEE ALSO

[xinput](/man/xinput)(1), [evtest](/man/evtest)(1)
