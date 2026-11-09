# TAGLINE

Suspend to both RAM and disk

# TLDR

Enter **hybrid sleep**

```systemctl hybrid-sleep```

**Force** hybrid sleep if logind returns an error

```systemctl hybrid-sleep -f```

Sleep, **ignoring inhibitor locks**

```systemctl hybrid-sleep -i```

Sleep without **wall** message

```systemctl hybrid-sleep --no-wall```

# SYNOPSIS

**systemctl hybrid-sleep** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Ignore an error returned by systemd-logind and start the hybrid-sleep target directly

**--no-wall**
> Don't send wall message to logged-in users

**--check-inhibitors=** _auto|yes|no_
> Control the checking of inhibitor locks (default: auto)

**-i**
> Ignore inhibitor locks; shortcut for **--check-inhibitors=no**

**--dry-run**
> Just print what would be done

# DESCRIPTION

**systemctl hybrid-sleep** puts the system into hybrid sleep, which combines suspend-to-RAM and hibernate. The system state is saved to both RAM and disk, then the system enters low-power suspend mode.

If power is maintained, the system wakes quickly from RAM. If power is lost, the system can still recover from the hibernation image on disk. This provides the best of both worlds at the cost of longer sleep time.

The command triggers **hybrid-sleep.target** and is asynchronous: it returns once the operation is enqueued and does not wait for the sleep and wake-up cycle to complete.

# CONFIGURATION

**/etc/systemd/sleep.conf**
> **AllowHybridSleep=** enables or disables this mode. It is implied to be off when **AllowSuspend=no** or **AllowHibernation=no** is set, unless explicitly set to yes.

# CAVEATS

Requires both suspend and hibernate to be supported by hardware. Takes longer than regular suspend due to writing the hibernation image to disk. Requires sufficient swap space for hibernation. May not work with secure boot enabled on some systems.

# HISTORY

Hybrid sleep was added to address the risk of data loss during suspend when laptop batteries drain completely, combining fast resume with the safety of hibernation. The **hybrid-sleep** command has been available since **systemd 196**.

# SEE ALSO

[systemctl-suspend](/man/systemctl-suspend)(1), [systemctl-hibernate](/man/systemctl-hibernate)(1), [systemctl-suspend-then-hibernate](/man/systemctl-suspend-then-hibernate)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
