# TAGLINE

Stop a running storage pool

# TLDR

**Stop a running storage pool by name**

```virsh pool-destroy [pool]```

# SYNOPSIS

**virsh** **pool-destroy** _pool_

# DESCRIPTION

**virsh pool-destroy** stops (deactivates) a running storage pool. Despite the name, it does not delete the pool's data or its persistent configuration. The pool must be active for this command to succeed. After destroying a pool, it can be restarted with **pool-start**. To remove the configuration, use **pool-undefine**. To delete the underlying storage data, use **pool-delete** (the pool must be stopped first).

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-start](/man/virsh-pool-start)(1), [virsh-pool-delete](/man/virsh-pool-delete)(1), [virsh-pool-undefine](/man/virsh-pool-undefine)(1)

