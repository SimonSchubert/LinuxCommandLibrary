# TAGLINE

Delete storage pool data

# TLDR

**Delete pool storage**

```virsh pool-delete [pool]```

**Stop a pool and delete its storage**

```virsh pool-destroy [pool] && virsh pool-delete [pool]```

# SYNOPSIS

**virsh** **pool-delete** _pool-or-uuid_

# DESCRIPTION

**virsh pool-delete** destroys the resources used by a storage pool. Pool must be stopped first. The pool object still exists afterwards, ready for the creation of new storage volumes, until pool-undefine is run.

What is removed depends on the backend. Directory-style pools (**dir**, **fs**, **netfs**) only remove the empty target directory, so the command fails if volumes remain inside it.

# CAVEATS

This operation is non-recoverable.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-destroy](/man/virsh-pool-destroy)(1), [virsh-pool-undefine](/man/virsh-pool-undefine)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-09 -->
