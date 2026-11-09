# TAGLINE

Define new libvirt storage pool

# TLDR

**Define directory pool**

```virsh pool-define-as [name] dir --target [/path/to/pool]```

**Define LVM pool**

```virsh pool-define-as [name] logical --source-name [vgname] --target [/dev/vgname]```

**Define NFS pool**

```virsh pool-define-as [name] netfs --source-host [server] --source-path [/export] --target [/mnt]```

**Print the pool XML without defining it**

```virsh pool-define-as [name] dir --target [/path/to/pool] --print-xml```

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
> Mapping of the pool into the host file system.

**--source-path** _path_
> Source directory path.

**--source-host** _host_
> Source hostname (netfs, iscsi, rbd, sheepdog, gluster).

**--source-dev** _path_
> Source device (fs, logical, disk, iscsi, zfs).

**--source-name** _name_
> Source name, such as the VG name (logical, rbd, sheepdog, gluster).

**--source-format** _format_
> Pool format (fs, netfs, disk, logical).

**--source-initiator** _iqn_
> Initiator IQN (iscsi-direct).

**--auth-type** _type_ **--auth-username** _user_
> Authentication: **chap** for iSCSI, **ceph** for RBD. Add **--secret-usage** _usage_ or **--secret-uuid** _uuid_.

**--source-protocol-ver** _ver_
> NFS protocol version.

**--adapter-name** _name_
> scsi_hostN adapter for scsi pools. Alternatively use **--adapter-wwnn** and **--adapter-wwpn**, optionally with **--adapter-parent**.

**--print-xml**
> Print the pool XML without defining the pool.

# DESCRIPTION

**virsh pool-define-as** defines a new storage pool from parameters. Creates pool configuration without starting it. Supports directory, LVM, NFS, iSCSI, and other pool types.

It takes the same arguments as **pool-create-as**, except for **--build**, **--overwrite** and **--no-overwrite**.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-build](/man/virsh-pool-build)(1), [virsh-pool-start](/man/virsh-pool-start)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-09 -->
