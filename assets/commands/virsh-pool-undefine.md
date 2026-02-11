# TAGLINE

Remove storage pool definition

# TLDR

**Undefine storage pool**

```virsh pool-undefine [pool]```

# SYNOPSIS

**virsh** **pool-undefine** _pool_

# DESCRIPTION

**virsh pool-undefine** removes a storage pool definition. Pool must be stopped first. Does not delete pool contents; use pool-delete for that. Removes pool from libvirt configuration.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-delete](/man/virsh-pool-delete)(1), [virsh-pool-destroy](/man/virsh-pool-destroy)(1)

