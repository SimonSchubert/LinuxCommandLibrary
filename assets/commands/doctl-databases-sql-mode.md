# TAGLINE

manage MySQL SQL mode settings

# TLDR

**Get current SQL mode** for a database cluster

```doctl databases sql-mode get [cluster_id]```

**Set SQL mode** for a database cluster

```doctl databases sql-mode set [cluster_id] [ANSI_QUOTES] [STRICT_TRANS_TABLES]```

**Set SQL mode with output format**

```doctl databases sql-mode get [cluster_id] --format [SQLMode]```

# SYNOPSIS

**doctl** **databases** **sql-mode** _command_ [_options_]

# SUBCOMMANDS

**get**
> Get current SQL mode for a MySQL database cluster.

**set**
> Set SQL mode for a MySQL database cluster. Provide one or more modes as space-separated arguments.

# PARAMETERS

**--format** _columns_
> Columns for output in a comma-separated list.

**--no-header**
> Return raw data with no headers.

# DESCRIPTION

**doctl databases sql-mode** manages SQL mode settings for MySQL managed database clusters on DigitalOcean. SQL modes control how MySQL handles query syntax validation, data type conversions, and error conditions.

Common SQL modes include STRICT_TRANS_TABLES (reject invalid data), ANSI_QUOTES (treat double quotes as identifier quotes), NO_ZERO_DATE (disallow '0000-00-00' dates), and ONLY_FULL_GROUP_BY (require GROUP BY to include all non-aggregated columns).

Setting SQL modes replaces the existing configuration entirely rather than appending to it. To add a mode, first retrieve the current modes with **get**, then include them all in the **set** command.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl](/man/doctl)(1), [mysql](/man/mysql)(1)
