# TAGLINE

Remove storage pool definition

# TLDR

**Undefine** an inactive storage pool

```virsh pool-undefine [pool]```

**Stop** a running pool, then undefine it

```virsh pool-destroy [pool] && virsh pool-undefine [pool]```

**Delete the pool's storage**, then remove its definition

```virsh pool-destroy [pool] && virsh pool-delete [pool] && virsh pool-undefine [pool]```

# SYNOPSIS

**virsh** **pool-undefine** _pool-or-uuid_

# DESCRIPTION

**virsh pool-undefine** removes the persistent libvirt configuration of an inactive storage pool, along with its autostart link. The pool must be stopped first with `virsh pool-destroy`; undefining an active pool fails with "storage pool is still active". Pool contents on disk are untouched; use `virsh pool-delete` before undefining to remove the underlying storage.

# PARAMETERS

_pool-or-uuid_
> Pool name or UUID.

# CAVEATS

Does not delete files or volumes on the backing storage. Once undefined, the pool's XML is gone; save it first with `virsh pool-dumpxml [pool] > pool.xml` if you may need to recreate it.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-destroy](/man/virsh-pool-destroy)(1), [virsh-pool-delete](/man/virsh-pool-delete)(1), [virsh-pool-list](/man/virsh-pool-list)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-23 -->
