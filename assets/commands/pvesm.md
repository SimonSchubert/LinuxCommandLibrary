# TAGLINE

Configure Proxmox storage backends

# TLDR

Show every storage and **whether it is online**

```pvesm status```

**List the contents** of one storage

```pvesm list [storage_name]```

Resolve a stored file to its **path on disk**

```pvesm path [local]:iso/[filename.iso]```

**Add** a directory-backed storage

```pvesm add dir [storage_name] --path [path/to/directory]```

**Restrict what a storage may hold**

```pvesm set [storage_name] --content [iso,backup,vztmpl]```

**Disable** a storage without deleting its definition

```pvesm set [storage_name] --disable 1```

**Delete a file** from a storage

```pvesm free [local]:iso/[filename.iso]```

**Remove** the storage definition

```pvesm remove [storage_name]```

**Scan a server for NFS exports** worth adding

```pvesm scan nfs [server_address]```

# SYNOPSIS

**pvesm** _command_ [_storage_] [_options_]

# PARAMETERS

**status**, **st**
> Show status of all storage

**list**, **l** _storage_
> List contents of specified storage

**add** _type_ _storage_ _options_
> Add new storage definition

**set** _storage_ _options_
> Modify storage configuration

**remove**, **r** _storage_
> Remove storage definition

**free** _volume_
> Delete a volume/file from storage

**--content** _types_
> Allowed content types (iso, images, rootdir, vztmpl, backup)

**--path** _path_
> Directory path (for dir type)

# DESCRIPTION

**pvesm** manages Proxmox VE storage definitions. It configures storage backends for VM disk images, ISO files, container templates, and backups. Supported storage types include local directories, NFS, CIFS, LVM, ZFS, Ceph, and iSCSI.

Storage configuration is cluster-wide; changes propagate to all nodes. Each storage can be limited to specific content types and made available on selected nodes.

# CAVEATS

Removing storage definition does not delete data. Storage must be accessible from all nodes where it's enabled. Some storage types require additional packages or configuration.

# HISTORY

Part of **Proxmox VE**, providing unified storage management for virtualization. Abstracts different storage backends behind a consistent interface used by qm and pct for VM and container storage.

# SEE ALSO

[qm](/man/qm)(1), [pct](/man/pct)(1), [pvesh](/man/pvesh)(1)
