# TAGLINE

Filesystem snapshot management for Btrfs

# TLDR

List snapshot **configurations**

```snapper list-configs```

**Create** a configuration

```snapper -c [config] create-config [path/to/directory]```

Create a **snapshot** with description

```snapper -c [config] create -d "[description]"```

**List** snapshots for a config

```snapper -c [config] list```

**Delete** a snapshot

```snapper -c [config] delete [snapshot_number]```

Delete a **range** of snapshots

```snapper -c [config] delete [snapshot1]-[snapshot2]```

Show **differences** between snapshots

```snapper -c [config] status [snapshot1]..[snapshot2]```

**Rollback** to a snapshot

```snapper -c [config] rollback [snapshot_number]```

# SYNOPSIS

**snapper** [**-c** _config_] _command_ [_OPTIONS_]

# PARAMETERS

**-c, --config** _name_
> Use specified configuration

**list-configs**
> List all configurations

**create-config** _path_
> Create new configuration for subvolume

**delete-config**
> Delete a configuration

**create**
> Create a new snapshot

**delete** _number_
> Delete snapshot(s)

**list**
> List snapshots

**status** _num1..num2_
> Show changes between snapshots

**diff** _num1..num2_
> Show file differences

**undochange** _num1..num2_ _files_
> Undo changes between snapshots

**rollback** [_number_]
> Rollback system to snapshot

**cleanup** _algorithm_
> Run cleanup algorithm (number, timeline, empty-pre-post)

**setup-quota**
> Set up quota (btrfs only)

**-d, --description** _text_
> Snapshot description

**-t, --type** _type_
> Snapshot type (single, pre, post)

**-u, --userdata** _key=value_
> Set snapshot metadata

**-s, --sync**
> Sync filesystem after delete

# DESCRIPTION

**snapper** is a filesystem snapshot management tool primarily used with Btrfs. It creates, compares, and manages snapshots, enabling system rollback and file recovery. Snapper supports automatic snapshot timelines with configurable retention policies.

Each configuration manages snapshots for a specific subvolume or logical volume. Snapshots can be created manually or automatically before/after system changes. The cleanup algorithms automatically remove old snapshots based on age or count limits.

# CONFIGURATION

**/etc/snapper/configs/**
> Per-subvolume configuration files defining snapshot types, cleanup algorithms, and retention policies (timeline and number limits).

**/etc/sysconfig/snapper**
> Global snapper settings including the list of active configurations (SNAPPER_CONFIGS).

# CAVEATS

Rollback is only supported on Btrfs with proper system configuration. Snapshots consume disk space; monitor usage with **btrfs filesystem df**. Non-root users need configuration permissions set via ALLOW_USERS. The /.snapshots directory must have correct permissions.

# HISTORY

**snapper** was created by **Arvin Schnell** at **openSUSE/SUSE** and first released around **2011**. It was designed to leverage Btrfs snapshot capabilities for system recovery and became a key component of openSUSE and SUSE Linux Enterprise. Support for thin-provisioned LVM was added later.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-subvolume](/man/btrfs-subvolume)(8), [timeshift](/man/timeshift)(1), [lvcreate](/man/lvcreate)(8)
