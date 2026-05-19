# TAGLINE

Initialize libvirt storage pool

# TLDR

**Build storage pool**

```virsh pool-build [pool]```

**Build with overwrite**

```virsh pool-build [pool] --overwrite```

# SYNOPSIS

**virsh** **pool-build** _pool_ [_options_]

# PARAMETERS

**--overwrite**
> Overwrite existing data.

**--no-overwrite**
> Fail if data exists.

# DESCRIPTION

**virsh pool-build** initializes a previously-defined libvirt storage pool. The exact action depends on the pool type: for directory-based pools it creates the directory; for disk, LVM, or logical pools it formats the underlying device; for NFS pools it may set up the mount point. After building, the pool can be started with **virsh pool-start**.

For some pool types (e.g. **dir** with an existing directory) the build step is a no-op or unnecessary, but is harmless. The **--overwrite** option allows reinitialization that destroys existing data on the target, so use it with care.

# CAVEATS

The **--overwrite** flag will erase existing data on the target storage. The pool must already be defined (via **virsh pool-define** or **pool-define-as**) before building. Not all pool types require or support building.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-define-as](/man/virsh-pool-define-as)(1), [virsh-pool-start](/man/virsh-pool-start)(1)

