# TAGLINE

Resume a suspended Proxmox VM

# TLDR

**Resume** a suspended virtual machine

```qm resume 100```

Resume **ignoring locks** (root only)

```sudo qm resume 100 --skiplock true```

# SYNOPSIS

**qm resume** [_options_] _vmid_

# PARAMETERS

**--skiplock** _true|false_
> Ignore locks and force resume (root only)

# DESCRIPTION

**qm resume** resumes a suspended virtual machine, restoring it to running state. The VM continues execution from where it was suspended.

This is used after a VM has been paused with qm suspend.

# CAVEATS

Requires the VM to be in suspended state. The skiplock option requires root privileges.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-suspend](/man/qm-suspend)(1), [qm-start](/man/qm-start)(1)
