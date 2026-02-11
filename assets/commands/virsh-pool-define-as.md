# TAGLINE

Define new libvirt storage pool

# TLDR

**Define directory pool**

```virsh pool-define-as [name] dir --target [/path/to/pool]```

**Define LVM pool**

```virsh pool-define-as [name] logical --source-name [vgname] --target [/dev/vgname]```

**Define NFS pool**

```virsh pool-define-as [name] netfs --source-host [server] --source-path [/export] --target [/mnt]```

# SYNOPSIS

**virsh** **pool-define-as** _name_ _type_ [_options_]

# PARAMETERS

**dir**
> Directory pool type.

**logical**
> LVM volume group.

**netfs**
> Network filesystem.

**--target** _path_
> Mount/target path.

**--source-path** _path_
> Source path.

**--source-host** _host_
> Source hostname.

**--source-name** _name_
> Source name (VG name).

# DESCRIPTION

**virsh pool-define-as** defines a new storage pool from parameters. Creates pool configuration without starting it. Supports directory, LVM, NFS, iSCSI, and other pool types.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-build](/man/virsh-pool-build)(1), [virsh-pool-start](/man/virsh-pool-start)(1)

