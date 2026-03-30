# TAGLINE

Simple and handy BTRFS snapshotting tool

# TLDR

**Create a read-only snapshot** using a configuration file

```sudo rusnapshot -c [path/to/config.toml] --create```

**Create a read-write snapshot**

```sudo rusnapshot -c [path/to/config.toml] --create -w```

**List tracked snapshots**

```sudo rusnapshot -c [path/to/config.toml] -l```

**Delete a snapshot by ID**

```sudo rusnapshot -c [path/to/config.toml] --del --id [snapshot_id]```

**Clean old snapshots, keeping only the last 3**

```sudo rusnapshot -c [path/to/config.toml] --clean -k 3 --kind [hourly]```

**Restore a snapshot by ID**

```sudo rusnapshot -c [path/to/config.toml] -r --id [snapshot_id]```

# SYNOPSIS

**rusnapshot** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Path to TOML configuration file.

**--create**
> Create a read-only snapshot.

**-w**, **--rw**
> Create read-write snapshots instead of read-only.

**-l**, **--list**
> List snapshots tracked in the database.

**--del**
> Delete a snapshot. Requires **--id**.

**-r**, **--restore**
> Restore a specific snapshot. Requires **--id**.

**--id** _id_
> Snapshot ID or name to work with.

**--clean**
> Enable snapshot cleaning, keeping only the last X snapshots specified with **-k**.

**-k**, **--keep** _count_
> Number of snapshots to keep (default 3).

**--kind** _type_
> Differentiator between snapshots with the same prefix (e.g., hourly, daily).

**-p**, **--prefix** _name_
> Prefix for the snapshot name (default "rusnapshot").

**-d**, **--dfile** _path_
> Path to the SQLite database file.

**--from** _dir_
> Source directory for snapshot creation.

**--to** _dir_
> Destination directory for snapshots.

**--timeout** _ms_
> SQLite busy timeout in milliseconds (default 10000).

# DESCRIPTION

**rusnapshot** is a simple and handy BTRFS snapshotting tool written in Rust. It provides snapshot creation, management, restoration, and automatic cleanup for BTRFS filesystems, using SQLite to track snapshots.

Configuration is done via TOML files specifying snapshot source and destination paths, prefixes, and kinds. Snapshots can also be fully specified via command-line flags using **--from** and **--to**.

# CONFIGURATION

**config.toml**
> TOML configuration file specifying snapshot source paths, destination subvolume, retention policies, and snapshot kinds (hourly, daily, weekly, monthly).

# CAVEATS

Requires BTRFS filesystem. Configuration file must be properly set up before use.

# HISTORY

Written in **Rust** by **Eduard Tolosa** (Edu4rdSHL) as a simple alternative to traditional BTRFS snapshot management tools.

# SEE ALSO

[btrfs](/man/btrfs)(8), [snapper](/man/snapper)(8)
