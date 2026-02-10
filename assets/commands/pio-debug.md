# TAGLINE

starts a debugging session for embedded projects

# TLDR

**Start debugging session**

```pio debug```

**Debug specific environment**

```pio debug -e [uno]```

**Debug with GDB interface**

```pio debug --interface=gdb```

# SYNOPSIS

**pio debug** [_options_]

# PARAMETERS

**-e**, **--environment** _name_
> Debug environment.

**--interface** _type_
> Debugger interface (gdb).

**-d**, **--project-dir** _dir_
> Project directory.

**--upload-port** _port_
> Upload port.

# DESCRIPTION

**pio debug** starts a debugging session for embedded projects. Connects to on-chip debuggers, sets breakpoints, and inspects variables. Integrates with GDB and IDE debug interfaces.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-test](/man/pio-test)(1), [gdb](/man/gdb)(1)

