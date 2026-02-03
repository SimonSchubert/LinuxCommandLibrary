# TLDR

**Show WAL summary**

```pg_walsummary [summary_file]```

**Show from directory**

```pg_walsummary -p [wal_dir]```

# SYNOPSIS

**pg_walsummary** [_options_] [_file_...]

# PARAMETERS

**-p**, **--path** _dir_
> WAL summary directory.

**-q**, **--quiet**
> Quiet output.

# DESCRIPTION

**pg_walsummary** displays WAL summary file contents. WAL summaries track modified blocks for incremental backups. Part of PostgreSQL 17+ incremental backup feature.

# SEE ALSO

[pg_waldump](/man/pg_waldump)(1), [pg_combinebackup](/man/pg_combinebackup)(1)

