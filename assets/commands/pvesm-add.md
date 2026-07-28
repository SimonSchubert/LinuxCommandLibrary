# TAGLINE

Add a storage backend definition in Proxmox VE

# TLDR

Add a **directory** storage

```pvesm add dir [storage_name] --path [path/to/directory]```

Add an **LVM** storage

```pvesm add lvm [storage_name] --vgname [volume_group_name]```

Add an **LVM-Thin** storage

```pvesm add lvmthin [storage_name] --vgname [volume_group_name] --thinpool [logical_volume_name]```

# SYNOPSIS

**pvesm add** _type_ _storage_ [_OPTIONS_]

# PARAMETERS

**type**
> Storage type (e.g. `dir`, `lvm`, `lvmthin`, `nfs`, `cifs`, `zfspool`, `rbd`, `iscsi`)

**storage**
> Unique storage identifier (cluster-wide name)

**--path** _path_
> Directory path (for `dir` type)

**--vgname** _name_
> Volume group name (for LVM types)

**--thinpool** _name_
> Thin pool logical volume name (for `lvmthin`)

**--content** _types_
> Allowed content types (e.g. `images`, `iso`, `backup`, `vztmpl`, `rootdir`)

**--nodes** _list_
> Restrict storage to listed cluster nodes

# DESCRIPTION

**pvesm add** registers a new storage definition in the Proxmox VE cluster. Storage backends hold VM disks, container volumes, ISOs, templates, and backups. Definitions are stored cluster-wide and become available to `qm` and `pct` once reachable from a node.

Supported types include local directories, NFS, CIFS, LVM, LVM-thin, ZFS pools, Ceph RBD, and iSCSI, among others. Options vary by type; see `man pvesm` for the full matrix.

# CAVEATS

Adding a definition does not create the underlying storage if it does not exist (e.g. LVM volume groups must already exist). Paths and network shares must be reachable from every node where the storage is enabled. Duplicate storage IDs are rejected.

# HISTORY

Part of **Proxmox VE** storage management (`pvesm`).

# SEE ALSO

[pvesm](/man/pvesm)(1), [qm](/man/qm)(1), [pct](/man/pct)(1)

# RESOURCES

```[Homepage](https://www.proxmox.com)```

```[Documentation](https://pve.proxmox.com/pve-docs/pvesm.1.html)```

<!-- verified: 2026-07-28 -->
