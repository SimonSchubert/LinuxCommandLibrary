# TAGLINE

print foreground virtual terminal number

# TLDR

Print **current** terminal number

```fgconsole```

Print **next** unallocated virtual terminal number

```fgconsole --next-available```

# SYNOPSIS

**fgconsole** [_options_]

# DESCRIPTION

**fgconsole** prints the number of the foreground virtual terminal. If the terminal is serial, it prints "serial" instead of a number.

Part of kbd package for console management utilities.

# PARAMETERS

**-n**, **--next-available**
> Print next unallocated VT number

**-V**, **--version**
> Print version number and exit

**-h**, **--help**
> Display help and exit

# CAVEATS

Only works on Linux console. Returns error if not on a virtual terminal. Part of kbd package.

# SEE ALSO

[chvt](/man/chvt)(1), [deallocvt](/man/deallocvt)(1), [dumpkeys](/man/dumpkeys)(1)
