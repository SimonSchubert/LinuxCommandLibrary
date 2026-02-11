# TAGLINE

Shut down and power off the system

# TLDR

**Power off** the system

```poweroff```

**Halt** the system

```poweroff --halt```

**Reboot** the system

```poweroff --reboot```

Power off **immediately** (force)

```poweroff -f```

Write wtmp entry **only**

```poweroff -w```

# SYNOPSIS

**poweroff** [**-f**|**--force**] [**-w**|**--wtmp-only**] [**--halt**] [**--reboot**]

# PARAMETERS

**-f, --force**
> Force immediate shutdown without system manager

**-w, --wtmp-only**
> Write wtmp record without actual shutdown

**--halt**
> Halt instead of power off

**--reboot**
> Reboot instead of power off

**-n, --no-wtmp**
> Don't write wtmp record

# DESCRIPTION

**poweroff** shuts down the system and turns off power. On systems with ACPI or APM support, it signals hardware to cut power after shutdown completes.

The command is typically a symlink to systemctl or the init system's shutdown mechanism. It ensures clean system shutdown with proper service termination.

# CAVEATS

Force option may cause data loss. Requires root privileges. Behavior varies by init system. Virtual machines may not honor power-off signal.

# HISTORY

**poweroff** has been a standard Unix command for system shutdown. Modern implementations integrate with systemd or other init systems while maintaining the traditional interface.

# SEE ALSO

[shutdown](/man/shutdown)(8), [halt](/man/halt)(8), [reboot](/man/reboot)(8), [systemctl](/man/systemctl)(1)
