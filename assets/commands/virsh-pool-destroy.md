# TAGLINE

Stop running storage pool

# TLDR

**Stop storage pool**

```virsh pool-destroy [pool]```

# SYNOPSIS

**virsh** **pool-destroy** _pool_

# DESCRIPTION

**virsh pool-destroy** stops a running storage pool. Does not delete pool contents or configuration. Pool can be restarted with pool-start. Use pool-undefine to remove configuration.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-start](/man/virsh-pool-start)(1), [virsh-pool-delete](/man/virsh-pool-delete)(1)

