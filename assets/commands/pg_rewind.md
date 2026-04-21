# TAGLINE

synchronize a PostgreSQL data directory with another copy

# TLDR

**Rewind target against a running source server**

```pg_rewind -D [target_dir] --source-server="host=[host] user=[rewind_user] dbname=[postgres]"```

**Rewind against a locally shut-down source**

```pg_rewind -D [target_dir] --source-pgdata=[source_dir]```

**Dry run** (no changes written)

```pg_rewind -n -D [target_dir] --source-server="[conninfo]"```

**Rewind and write recovery configuration** for standby mode

```pg_rewind -R -D [target_dir] --source-server="[conninfo]"```

**Show progress** while copying data

```pg_rewind -P -D [target_dir] --source-pgdata=[source_dir]```

**Restore missing WAL files** from the archive

```pg_rewind -c -D [target_dir] --source-server="[conninfo]"```

# SYNOPSIS

**pg_rewind** [_option_...] **{-D** | **--target-pgdata}** _directory_ **{--source-pgdata**=_directory_ | **--source-server**=_connstr_**}**

# PARAMETERS

**-D**, **--target-pgdata** _dir_
> Target data directory to be modified. Must have been cleanly shut down.

**--source-pgdata** _dir_
> File-system path of a cleanly shut-down source cluster.

**--source-server** _connstr_
> libpq connection string for a running source server.

**-n**, **--dry-run**
> Perform all work without modifying the target directory.

**-N**, **--no-sync**
> Return without waiting for changes to be flushed to disk.

**-P**, **--progress**
> Show progress while copying files.

**-R**, **--write-recovery-conf**
> Create `standby.signal` and append connection settings to `postgresql.auto.conf`.

**-c**, **--restore-target-wal**
> Use `restore_command` to fetch WAL files missing from `pg_wal`.

**--config-file** _file_
> Main server configuration file for the target cluster.

**--no-ensure-shutdown**
> Do not run single-user recovery; fail if the target is not cleanly shut down.

**--sync-method** _method_
> Method used to flush changes: `fsync` (default) or `syncfs`.

**--debug**
> Print verbose debugging output.

**-V**, **--version**
> Print version information.

**-?**, **--help**
> Show help.

# DESCRIPTION

**pg_rewind** resynchronizes a PostgreSQL data directory with another copy of the same cluster after their timelines have diverged. Typical use is to re-attach a former primary as a standby after a failover without taking a full base backup.

It identifies the point where the timelines diverged, then copies from the source only the blocks that changed in the target after that point, along with all current configuration, WAL, and other required files. The source must have `wal_log_hints` enabled or be initialized with data checksums, and `full_page_writes` must be on.

# CAVEATS

The target cluster must be cleanly shut down. The source must be on the same major version and share the same system identifier. Replication slots, statistics, and contents of `pg_dynshmem` are not copied. Always take a backup of the target before running pg_rewind on production data.

# HISTORY

Introduced in PostgreSQL **9.5** (2016) by Heikki Linnakangas, and moved into the core distribution from a contrib module. In PostgreSQL **13** pg_rewind gained the ability to write recovery configuration (`-R`) and restore missing WAL from the archive (`-c`).

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_resetwal](/man/pg_resetwal)(1)
