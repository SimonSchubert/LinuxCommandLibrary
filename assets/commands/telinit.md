# TLDR

**Power off**

```telinit 0```

**Reboot**

```telinit 6```

Change **runlevel**

```telinit [2|3|4|5]```

Enter **rescue** mode

```telinit 1```

**Reload** daemon configuration

```telinit q```

Reboot/poweroff without **wall** message

```telinit --no-wall [0|6]```

# SYNOPSIS

**telinit** [_OPTIONS_] _COMMAND_

# RUNLEVELS

**0** - Power off

**1** - Single-user/rescue mode

**2, 3, 4** - Multi-user modes

**5** - Multi-user with GUI

**6** - Reboot

**q, Q** - Reload configuration

# PARAMETERS

**--no-wall**
> Don't send wall message before reboot/poweroff

# DESCRIPTION

**telinit** changes the SysV init runlevel. On systemd systems, runlevel requests are transparently translated to systemd target activations:

- 0 → poweroff.target
- 1 → rescue.target
- 2-4 → multi-user.target
- 5 → graphical.target
- 6 → reboot.target

# CAVEATS

The SysV runlevel concept is obsolete on systemd systems. Use `systemctl` commands instead for native systemd operation. Provided for backwards compatibility.

# HISTORY

**telinit** originates from SysV init, predating systemd. On systemd systems, it's a compatibility wrapper that translates runlevels to systemd targets.

# SEE ALSO

[systemctl](/man/systemctl)(1), [init](/man/init)(1), [runlevel](/man/runlevel)(8)
