# TLDR

Check **AC power** status

```systemd-ac-power```

Check with **verbose** output

```systemd-ac-power -v```

# SYNOPSIS

**systemd-ac-power** [_OPTIONS_]

# PARAMETERS

**-v, --verbose**
> Print "yes" or "no" to stdout in addition to exit code

**-h, --help**
> Display help

# DESCRIPTION

**systemd-ac-power** reports whether the computer is connected to an external power source (AC mains). It returns exit code 0 when on AC power and non-zero when on battery.

This is useful in scripts and systemd unit conditions to change behavior based on power state.

# EXIT STATUS

**0** - Running on AC power

**non-zero** - Running on battery or unable to determine

# CAVEATS

Requires proper power supply detection by the kernel. Some desktop systems without batteries always report AC power. Virtual machines may report power state incorrectly.

# HISTORY

**systemd-ac-power** provides a simple, scriptable interface to power supply status, enabling power-aware behavior in systemd units and shell scripts.

# SEE ALSO

[systemctl](/man/systemctl)(1), [upower](/man/upower)(1)
