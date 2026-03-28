# TAGLINE

Resume a suspended Proxmox VM

# TLDR

**Resume** a suspended virtual machine

```qm resume 100```

Resume **ignoring locks** (root only)

```sudo qm resume 100 --skiplock true```

# SYNOPSIS

**qm resume** _vmid_ [_options_]

# PARAMETERS

_vmid_
> The numeric ID of the virtual machine (100 - 999999999).

**--nocheck** _boolean_
> Skip any state checks when resuming (default: 0).

**--skiplock** _boolean_
> Ignore locks and force resume. Only root is allowed to use this option.

# DESCRIPTION

**qm resume** resumes a suspended (paused) virtual machine, restoring it to a running state. The VM continues execution from exactly where it was paused.

This command is used after a VM has been paused with **qm suspend**. It has no effect on VMs that are already running or stopped.

# CAVEATS

Requires the VM to be in suspended (paused) state. The **--skiplock** option requires root privileges. The VM ID must be a valid integer in the Proxmox range (100 and above).

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-suspend](/man/qm-suspend)(1), [qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1), [qm-shutdown](/man/qm-shutdown)(1)
