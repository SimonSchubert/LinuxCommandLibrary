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
> Output directory.

**-n**, **--dry-run**
> Show what would be done.

# DESCRIPTION

**pg_combinebackup** merges incremental backups with a full backup. Creates a complete backup from incremental chain. Part of PostgreSQL 17+ incremental backup feature.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1)

