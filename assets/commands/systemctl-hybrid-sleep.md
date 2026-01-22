# TLDR

Enter **hybrid sleep**

```systemctl hybrid-sleep```

**Force** hybrid sleep

```systemctl hybrid-sleep -f```

Sleep without **wall** message

```systemctl hybrid-sleep --no-wall```

# SYNOPSIS

**systemctl hybrid-sleep** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Force sleep even if inhibitors are present

**--no-wall**
> Don't send wall message to logged-in users

# DESCRIPTION

**systemctl hybrid-sleep** puts the system into hybrid sleep, which combines suspend-to-RAM and hibernate. The system state is saved to both RAM and disk, then the system enters low-power suspend mode.

If power is maintained, the system wakes quickly from RAM. If power is lost, the system can still recover from the hibernation image on disk. This provides the best of both worlds at the cost of longer sleep time.

# CAVEATS

Requires both suspend and hibernate to be supported by hardware. Takes longer than regular suspend due to writing hibernation image. Requires sufficient swap space for hibernation. May not work with secure boot enabled.

# HISTORY

Hybrid sleep was added to address the risk of data loss during suspend when laptop batteries drain completely, combining fast resume with the safety of hibernation.

# SEE ALSO

[systemctl-suspend](/man/systemctl-suspend)(1), [systemctl-hibernate](/man/systemctl-hibernate)(1), [systemctl](/man/systemctl)(1)
