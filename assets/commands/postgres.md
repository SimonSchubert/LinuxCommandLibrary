# TLDR

**Start PostgreSQL server**

```postgres -D [/var/lib/postgresql/data]```

**Start in foreground with logging**

```postgres -D [/var/lib/postgresql/data] -c log_statement=all```

**Start on specific port**

```postgres -D [/var/lib/postgresql/data] -p [5433]```

**Start single-user mode**

```postgres --single -D [/var/lib/postgresql/data] [database]```

**Show version**

```postgres --version```

# SYNOPSIS

**postgres** [_-D datadir_] [_-p port_] [_-c name=value_] [_options_]

# PARAMETERS

**-D** _DIR_
> Data directory.

**-p** _PORT_
> Port number.

**-c** _NAME=VALUE_
> Set runtime parameter.

**-h** _HOST_
> Listen addresses.

**-k** _DIR_
> Unix socket directory.

**-B** _BUFFERS_
> Shared buffers.

**-N** _N_
> Max connections.

**--single**
> Single-user mode.

**-F**
> Disable fsync.

**--describe-config**
> Describe configuration.

**--version**
> Show version.

# DESCRIPTION

**postgres** is the PostgreSQL database server process. It manages database files, handles connections, and executes SQL queries.

The server is typically started through pg_ctl or system service managers rather than directly. Direct invocation is useful for debugging or non-standard configurations.

Configuration parameters can be set on command line or in postgresql.conf. Runtime parameters control memory, connections, logging, and behavior.

Single-user mode bypasses normal startup for maintenance. It's used for recovery operations when the database won't start normally.

The data directory contains all database files. It must be initialized with initdb before first use and is not portable between major versions.

Logging options help diagnose problems. Statement logging shows all SQL. Connection logging tracks client access.

# CAVEATS

Running directly bypasses service management. Data directory must be secure. Configuration affects performance significantly. Major version upgrades need pg_upgrade.

# HISTORY

**PostgreSQL** development began at **UC Berkeley** in **1986** as POSTGRES (Post-Ingres). The open-source PostgreSQL project started in **1996**. It's now one of the most advanced open-source databases.

# SEE ALSO

[pg_ctl](/man/pg_ctl)(1), [initdb](/man/initdb)(1), [psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1)
