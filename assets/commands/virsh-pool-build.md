# TAGLINE

Initialize libvirt storage pool

# TLDR

**Build storage pool**

```virsh pool-build [pool]```

**Build with overwrite** (reformat the target, destroying existing data)

```virsh pool-build [pool] --overwrite```

**Format an fs pool's device** only if it has no existing filesystem

```virsh pool-build [pool] --no-overwrite```

# SYNOPSIS

**virsh** **pool-build** _pool_ [_options_]

# PARAMETERS

**--overwrite**
> Overwrite existing data on the target (fs, disk and logical pools only).

**--no-overwrite**
> Probe the target and fail if it already contains a filesystem, partition table or volume group (fs, disk and logical pools only). Mutually exclusive with **--overwrite**.

# DESCRIPTION

**virsh pool-build** initializes a previously-defined libvirt storage pool. The exact action depends on the pool type: for **dir** pools it creates the target directory; for **fs** pools it creates the target directory and, with **--no-overwrite** or **--overwrite**, runs **mkfs** on the device; for **disk** pools it writes a partition table; for **logical** (LVM) pools it creates the volume group; for **netfs** pools it creates the mount point directory. After building, the pool can be started with **virsh pool-start**.

For some pool types (e.g. **dir** with an existing directory) the build step is a no-op or unnecessary, but is harmless. The **--overwrite** option allows reinitialization that destroys existing data on the target, so use it with care.

# CAVEATS

The **--overwrite** flag will erase existing data on the target storage. The pool must already be defined (via **virsh pool-define** or **pool-define-as**) before building. Not all pool types require or support building.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-define-as](/man/virsh-pool-define-as)(1), [virsh-pool-start](/man/virsh-pool-start)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://www.libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-23 -->
