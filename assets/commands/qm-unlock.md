# TAGLINE

Remove lock from a Proxmox VM

# TLDR

**Unlock** a virtual machine

```qm unlock 100```

# SYNOPSIS

**qm unlock** _vmid_

# DESCRIPTION

**qm unlock** removes the lock from a virtual machine in Proxmox VE. Locks prevent certain operations during critical tasks like migration or backup.

Use this to manually clear locks when operations have failed or been interrupted.

# CAVEATS

Only unlock VMs when you are certain no operation is in progress. Unlocking during active operations may cause corruption or data loss.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1)
