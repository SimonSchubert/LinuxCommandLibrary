# TLDR

Get **status** for all datastores

```pvesm status```

**List** storage contents

```pvesm list [storage_name]```

**Add** a directory storage

```pvesm add dir [storage_name] --path [path/to/directory]```

**Set** storage to contain specific content

```pvesm set [storage_name] --content [iso,images,backup,vztmpl]```

**Delete** a file from storage

```pvesm free local:iso/[filename.iso]```

**Remove** a storage

```pvesm remove [storage_name]```

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
