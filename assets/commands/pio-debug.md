# TAGLINE

Start a debugging session for PlatformIO embedded projects

# TLDR

**Start debugging session**

```pio debug```

**Debug specific environment**

```pio debug -e [uno]```

**Debug with GDB interface**

```pio debug --interface=gdb```

**Debug with specific project directory**

```pio debug -d [path/to/project]```

# SYNOPSIS

**pio debug** [_options_]

# PARAMETERS

**-e**, **--environment** _name_
> Target environment from platformio.ini.

**--interface** _type_
> Debugger interface (gdb).

**-d**, **--project-dir** _dir_
> Path to PlatformIO project directory (default: current).

**--upload-port** _port_
> Upload port for the target board.

**-v**, **--verbose**
> Verbose output for troubleshooting.

**--project-conf** _path_
> Path to a specific platformio.ini file.

# DESCRIPTION

**pio debug** prepares a PlatformIO project for debugging or launches a debug server. It connects to on-chip debuggers (JTAG/SWD), enables setting breakpoints, stepping through code, and inspecting variables on embedded hardware.

The binary shortcut **piodebuggdb** is equivalent to `pio debug --interface=gdb`. Debug builds use the `debug_build_flags` from platformio.ini (typically `-O0 -g3 -ggdb3` for full symbol information).

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-test](/man/pio-test)(1), [gdb](/man/gdb)(1)

