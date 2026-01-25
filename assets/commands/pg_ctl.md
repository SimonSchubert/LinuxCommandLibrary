# TLDR

**Start PostgreSQL**

```pg_ctl start -D [/var/lib/postgresql/data]```

**Stop PostgreSQL**

```pg_ctl stop -D [/var/lib/postgresql/data]```

**Restart PostgreSQL**

```pg_ctl restart -D [/var/lib/postgresql/data]```

**Reload configuration**

```pg_ctl reload -D [/var/lib/postgresql/data]```

**Check status**

```pg_ctl status -D [/var/lib/postgresql/data]```

# SYNOPSIS

**pg_ctl** _action_ [**-D** _datadir_] [_options_]

# PARAMETERS

**start**
> Start the server.

**stop**
> Stop the server.

**restart**
> Stop then start.

**reload**
> Reload configuration.

**status**
> Check server status.

**-D** _directory_
> Data directory.

**-m** _mode_
> Shutdown mode (smart, fast, immediate).

**-l** _file_
> Log file.

**-w**
> Wait for completion.

# DESCRIPTION

**pg_ctl** is a utility for initializing, starting, stopping, and controlling a PostgreSQL database server. It's the preferred method for managing PostgreSQL services.

# EXAMPLES

```bash
# Start with logging
pg_ctl start -D /data -l /var/log/postgresql.log

# Fast shutdown
pg_ctl stop -D /data -m fast

# Initialize new cluster
pg_ctl initdb -D /data

# Promote standby
pg_ctl promote -D /data
```

# SHUTDOWN MODES

```
smart     - Wait for clients to disconnect
fast      - Rollback active transactions (default)
immediate - Abort immediately (may corrupt)
```

# CAVEATS

Must run as PostgreSQL user. Data directory required. Use systemctl on systemd systems.

# HISTORY

pg_ctl is part of **PostgreSQL**, the open source database originally from UC Berkeley's POSTGRES project.

# SEE ALSO

[postgres](/man/postgres)(1), [pg_dump](/man/pg_dump)(1), [pg_restore](/man/pg_restore)(1), [initdb](/man/initdb)(1)
