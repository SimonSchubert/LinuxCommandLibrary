# TAGLINE

merges incremental backups with a full backup

# TLDR

**Combine incremental backups**

```pg_combinebackup [full_backup] [incr_backup] -o [output_dir]```

**Combine multiple incrementals**

```pg_combinebackup [full] [incr1] [incr2] -o [output]```

# SYNOPSIS

**pg_combinebackup** [_options_] _backup_dir_... **-o** _output_dir_

# PARAMETERS

**-o**, **--output** _dir_
> Output directory for the combined backup. Must not already exist.

**-n**, **--dry-run**
> Show what would be done without actually writing output.

**-T** _olddir=newdir_
> Relocate a tablespace directory during combination.

**--no-sync**
> Skip fsync of the output directory (faster but less safe).

**--sync-method** _method_
> Method for syncing: **fsync** (default) or **syncfs**.

**--manifest-checksums** _algorithm_
> Checksum algorithm for the backup manifest: **CRC32C** (default), **SHA224**, **SHA256**, **SHA384**, **SHA512**, or **NONE**.

**--no-manifest**
> Do not generate a backup manifest in the output.

**-d**, **--debug**
> Print debug output.

**-V**, **--version**
> Print version and exit.

# DESCRIPTION

**pg_combinebackup** reconstructs a full backup by merging a base (full) backup with one or more incremental backups taken by **pg_basebackup --incremental**. The backup directories must be listed in chronological order: the full backup first, followed by each incremental in the order they were taken.

The output is a synthetic full backup that can be used directly with **pg_restore** or as a new base for future incremental backups. Introduced in PostgreSQL 17.

# CAVEATS

The output directory must not already exist. All backups in the chain must be present and listed in order. The full backup must have been taken with **--manifest** (the default). Incremental backup support requires PostgreSQL 17 or later.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1)

