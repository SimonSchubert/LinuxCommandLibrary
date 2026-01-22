# TLDR

Print **current** terminal number

```fgconsole```

Print **next** unallocated virtual terminal

```fgconsole [-n|--next-available]```

# SYNOPSIS

**fgconsole** [_options_]

# DESCRIPTION

**fgconsole** prints the number of the foreground virtual terminal. If the terminal is serial, it prints "serial" instead of a number.

Part of kbd package for console management utilities.

# PARAMETERS

**-n, --next-available**
> Print next unallocated VT number

# CAVEATS

Only works on Linux console. Returns error if not on a virtual terminal. Part of kbd package.

# SEE ALSO

[chvt](/man/chvt)(1), [openvt](/man/openvt)(1), [deallocvt](/man/deallocvt)(1)
