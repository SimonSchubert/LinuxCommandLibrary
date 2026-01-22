# TLDR

**Create** a snapshot using configuration file

```sudo rusnapshot -c path/to/config.toml --cr```

**List** created snapshots

```sudo rusnapshot -c path/to/config.toml -l```

**Delete** a snapshot by ID

```sudo rusnapshot -c path/to/config.toml --del --id snapshot_id```

Delete all **hourly** snapshots

```sudo rusnapshot -c path/to/config.toml -l -k 0 --clean --kind hourly```

Create a **read-write** snapshot

```sudo rusnapshot -c path/to/config.toml --cr -r```

**Restore** a snapshot

```sudo rusnapshot -c path/to/config.toml --id snapshot_id -r```

# SYNOPSIS

**rusnapshot** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Configuration file path

**--cr**
> Create snapshot

**-l**, **--list**
> List snapshots

**--del**
> Delete snapshot

**--id** _id_
> Specify snapshot ID

**-r**, **--rw**
> Create read-write snapshot (or restore)

**-k**, **--keep** _count_
> Number of snapshots to keep

**--kind** _type_
> Snapshot kind (hourly, daily, etc.)

# DESCRIPTION

**rusnapshot** is a BTRFS snapshotting utility written in Rust. It provides automated snapshot creation, management, and restoration for BTRFS filesystems.

Configuration is done via TOML files specifying snapshot locations, retention policies, and schedules.

# CAVEATS

Requires BTRFS filesystem. Configuration file must be properly set up before use.

# HISTORY

Written in **Rust** as a modern alternative to traditional BTRFS snapshot management tools like snapper.

# SEE ALSO

[btrfs](/man/btrfs)(8), [snapper](/man/snapper)(8)
