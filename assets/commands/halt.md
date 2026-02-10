# TAGLINE

instructs the system to stop all processes and halt the CPU

# TLDR

**Halt** the system

```halt```

**Power off** the system (same as poweroff)

```halt -p```

**Reboot** the system (same as reboot)

```halt --reboot```

Halt **immediately** without contacting the system manager

```halt -f```

Write the wtmp shutdown entry **without halting**

```halt -w```

# SYNOPSIS

**halt** [_options_]

# PARAMETERS

**-p**, **--poweroff**
> Power off the machine (equivalent to poweroff)

**--reboot**
> Reboot the machine (equivalent to reboot)

**-f**, **--force**
> Halt immediately without init/systemd

**-w**, **--wtmp-only**
> Only write wtmp record, don't actually halt

**-d**, **--no-wtmp**
> Don't write wtmp record

**--no-wall**
> Don't send wall message before halt

# DESCRIPTION

**halt** instructs the system to stop all processes and halt the CPU. On modern systems with systemd, halt is a symlink to systemctl and triggers a proper shutdown sequence.

The difference between halt, poweroff, and reboot:
- **halt** - Stops the CPU but may leave power on
- **poweroff** - Stops the CPU and powers off the machine
- **reboot** - Restarts the machine

In practice, most systems treat halt and poweroff similarly, powering off the machine.

# CAVEATS

Using **-f** bypasses the normal shutdown sequence, which may cause data loss. On systemd systems, these commands are wrappers around systemctl. Running halt typically requires root privileges.

# HISTORY

halt is a traditional Unix command dating back to early Unix systems. On modern Linux distributions using systemd, halt, poweroff, and reboot are symlinks to systemctl, providing backwards compatibility while using systemd's shutdown mechanisms.

# SEE ALSO

[poweroff](/man/poweroff)(8), [reboot](/man/reboot)(8), [shutdown](/man/shutdown)(8), [systemctl](/man/systemctl)(1)
