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

**libinput** [_--help_|_--version_] _command_ [_args_]

# SUBCOMMANDS

**list-devices**
> List all devices recognized by libinput, including their capabilities.

**debug-events** [_--verbose_] [_--device_ _DEV_]
> Print all input events from devices to stdout.

**debug-gui**
> Show a graphical visualization of input events for connected devices.

**debug-tablet**
> Print tablet axis and stylus state for connected tablets.

**measure** _feature_
> Measure device-specific properties such as touchpad pressure or tablet pressure curve.

**analyze** _subcommand_
> Analyze recorded events from a libinput record file.

**record** [_options_] [_device_]
> Record input events to a YAML file for later replay or analysis.

**replay** _file_
> Replay events from a previously recorded file.

# PARAMETERS

**-h**, **--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**libinput** is a library and command-line tool for handling input devices on Linux. It provides a unified interface for mice, keyboards, touchpads, and tablets on both X11 and Wayland systems.

The CLI uses a verb-based interface, with subcommands such as **list-devices** to enumerate devices, **debug-events** to monitor input, and **record**/**replay** to capture and reproduce input traces for debugging.

# CAVEATS

Most commands require root privileges (or membership in the **input** group) to access input devices. The **debug-gui** subcommand requires a graphical environment.

# SEE ALSO

[xinput](/man/xinput)(1), [evtest](/man/evtest)(1)
