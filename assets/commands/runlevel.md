# TAGLINE

Display current and previous SysV runlevel

# TLDR

**Display** previous and current SysV runlevel

```runlevel```

**Display** help information

```runlevel --help```

# SYNOPSIS

**runlevel** [_options_]

# PARAMETERS

**--help**
> Show help message

# ENVIRONMENT

**$RUNLEVEL**
> Overrides the current runlevel reported by the command.

**$PREVLEVEL**
> Overrides the previous runlevel reported by the command.

# DESCRIPTION

**runlevel** prints the previous and current SysV runlevel from the utmp file (**/run/utmp**). A runlevel is a mode of operation in Unix System V-style init systems that defines what services are running.

The output consists of two values: the previous runlevel (or **N** if unavailable) and the current runlevel. If neither can be determined, **unknown** is printed.

# CAVEATS

Mostly relevant for legacy SysV init systems. On systemd-based systems, the concept of runlevels is replaced by targets, though runlevel still works for compatibility. Use **systemctl get-default** for the systemd equivalent.

# HISTORY

**runlevel** originated with **System V init**. On systemd systems it reads from utmp for backward compatibility. The equivalent systemd command is **systemctl get-default**.

# SEE ALSO

[init](/man/init)(8), [systemctl](/man/systemctl)(1)
