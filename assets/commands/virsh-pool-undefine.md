# TAGLINE

Remove storage pool definition

# TLDR

**Undefine storage pool**

```virsh pool-undefine [pool]```

# SYNOPSIS

**virsh** **pool-undefine** _pool_

# DESCRIPTION

**virsh pool-undefine** removes the libvirt configuration for a storage pool, making it transient. If the pool is currently running, the runtime instance continues until stopped, but no longer persists across libvirtd restarts. Pool contents on disk are untouched; use `virsh pool-delete` to destroy the underlying storage.

# PARAMETERS

_pool_
> Pool name or UUID.

# CAVEATS

Does not delete files on the backing storage. Running pools become transient and disappear on the next daemon restart.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-destroy](/man/virsh-pool-destroy)(1), [virsh-pool-delete](/man/virsh-pool-delete)(1)

