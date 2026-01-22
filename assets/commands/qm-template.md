# TLDR

Create a **template** from a virtual machine

```qm template 100```

# SYNOPSIS

**qm template** _vmid_

# DESCRIPTION

**qm template** converts a virtual machine into a template in Proxmox VE. Templates are read-only base images that can be used to quickly clone new VMs.

Once converted to a template, the VM cannot be started directly and must be cloned to create new runnable instances.

# CAVEATS

Template conversion is permanent. The original VM becomes read-only and cannot be reverted to a regular VM. Ensure the VM is properly configured before converting.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools. Templates enable efficient VM deployment workflows.

# SEE ALSO

[qm](/man/qm)(1), [qm-clone](/man/qm-clone)(1)
