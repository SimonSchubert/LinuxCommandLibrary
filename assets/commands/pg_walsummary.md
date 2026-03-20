# TAGLINE

displays WAL summary file contents

# TLDR

**Show WAL summary**

```pg_walsummary [summary_file]```

**Show with individual block detail**

```pg_walsummary -i [summary_file]```

**Validate a WAL summary file without printing contents**

```pg_walsummary -q [summary_file]```

# SYNOPSIS

**pg_walsummary** [_options_] [_file_...]

# PARAMETERS

**-i**, **--individual**
> Print a separate line for every modified block instead of consolidating consecutive blocks into ranges.

**-q**, **--quiet**
> Do not print any output, except for errors. Useful for validating that a file can be parsed.

**-V**, **--version**
> Display version information, then exit.

# DESCRIPTION

**pg_walsummary** prints the contents of WAL summary files. These binary files are found in the pg_wal/summaries subdirectory of the data directory and track which blocks were modified, supporting the incremental backup feature introduced in PostgreSQL 17.

# SEE ALSO

[pg_waldump](/man/pg_waldump)(1), [pg_combinebackup](/man/pg_combinebackup)(1), [pg_basebackup](/man/pg_basebackup)(1)

