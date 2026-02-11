# TAGLINE

Delete storage pool data

# TLDR

**Delete pool storage**

```virsh pool-delete [pool]```

# SYNOPSIS

**virsh** **pool-delete** _pool_

# DESCRIPTION

**virsh pool-delete** destroys the underlying storage for a pool. Removes all data from the storage pool. Pool must be stopped first. Configuration remains until pool-undefine is run.

# CAVEATS

This permanently destroys all data in the pool. Cannot be undone.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-undefine](/man/virsh-pool-undefine)(1)

