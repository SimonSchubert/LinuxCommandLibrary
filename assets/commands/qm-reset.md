# TLDR

**Reset** a virtual machine

```qm reset 100```

Reset and **skip lock** (root only)

```qm reset --skiplock true 100```

# SYNOPSIS

**qm reset** [_options_] _vmid_

# PARAMETERS

**--skiplock** _true|false_
> Ignore locks and force reset (root only)

# DESCRIPTION

**qm reset** performs a hard reset on a virtual machine, equivalent to pressing the reset button on physical hardware. This immediately restarts the VM without graceful shutdown.

Use this when the guest OS is unresponsive and a graceful reboot is not possible.

# CAVEATS

Hard reset may cause data loss in the guest if filesystems are not properly synchronized. The skiplock option requires root privileges.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-reboot](/man/qm-reboot)(1), [qm-shutdown](/man/qm-shutdown)(1)
