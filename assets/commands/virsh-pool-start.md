# TAGLINE

Activate defined storage pool

# TLDR

**Start storage pool**

```virsh pool-start [pool]```

**Build the pool, then start it**

```virsh pool-start [pool] --build```

**Build without overwriting existing data, then start**

```virsh pool-start [pool] --build --no-overwrite```

# SYNOPSIS

**virsh** **pool-start** _pool-or-uuid_ [**--build**] [**--overwrite**|**--no-overwrite**]

# PARAMETERS

**--build**
> Perform a **pool-build** before starting.

**--overwrite**, **--no-overwrite**
> Passed to the build step, with the same rules as **pool-build**.

# DESCRIPTION

**virsh pool-start** activates a defined storage pool. Makes pool available for creating and using volumes. Pool must be defined before starting.

# CAVEATS

Pools that rely on remote resources, such as iSCSI or (v)HBA backed SCSI pools, may need **pool-refresh** several times before all volumes are detected.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-define-as](/man/virsh-pool-define-as)(1), [virsh-pool-build](/man/virsh-pool-build)(1), [virsh-pool-destroy](/man/virsh-pool-destroy)(1), [virsh-pool-autostart](/man/virsh-pool-autostart)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-09 -->
