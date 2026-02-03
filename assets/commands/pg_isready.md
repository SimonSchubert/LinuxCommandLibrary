# TLDR

**Check if server is ready**

```pg_isready```

**Check specific host**

```pg_isready -h [host] -p [port]```

**Check with timeout**

```pg_isready -t [seconds]```

**Quiet mode**

```pg_isready -q```

# SYNOPSIS

**pg_isready** [_options_]

# PARAMETERS

**-h**, **--host** _host_
> Server hostname.

**-p**, **--port** _port_
> Server port.

**-t**, **--timeout** _seconds_
> Connection timeout.

**-q**, **--quiet**
> Suppress output.

**-d**, **--dbname** _name_
> Database name.

# DESCRIPTION

**pg_isready** checks PostgreSQL server connection readiness. Returns exit code indicating server status. Useful for scripts and health checks before connecting.

# SEE ALSO

[psql](/man/psql)(1), [pg_ctl](/man/pg_ctl)(1)

