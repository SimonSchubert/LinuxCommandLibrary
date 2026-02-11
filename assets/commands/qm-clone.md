# TAGLINE

Clone a Proxmox virtual machine

# TLDR

**Copy** a virtual machine

```qm clone 100 101```

Copy using a **specific name**

```qm clone 100 101 --name new_vm```

Copy with a specific **description**

```qm clone 100 101 --description "Clone of VM 100"```

Create a **full copy** of all disks

```qm clone 100 101 --full```

Full copy with specific **format** (qcow2, raw, vmdk)

```qm clone 100 101 --full --format qcow2```

Copy and add to a specific **pool**

```qm clone 100 101 --pool pool_name```

# SYNOPSIS

**qm clone** _vmid_ _newid_ [_options_]

# PARAMETERS

**--name** _name_
> Set name for the cloned VM

**--description** _text_
> Set description for the cloned VM

**--full**
> Create full copy of all disks instead of linked clones

**--format** _format_
> Target format for disk images (qcow2, raw, vmdk)

**--pool** _name_
> Add cloned VM to specified pool

# DESCRIPTION

**qm clone** creates a copy of a virtual machine on QEMU/KVM in Proxmox VE. By default, it creates linked clones that share base images with the original. The --full option creates independent copies.

Cloning is useful for creating VM templates and quickly deploying multiple similar machines.

# CAVEATS

Linked clones depend on the original VM's disks. Full clones require more storage but are independent. The original VM should be stopped or have snapshots for consistent cloning.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-create](/man/qm-create)(1), [qm-destroy](/man/qm-destroy)(1)
