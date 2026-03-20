# TAGLINE

command-line interface for InfluxDB time-series database

# TLDR

**Start interactive shell**

```influx```

**Connect to host**

```influx -host [hostname] -port [8086]```

**Execute query**

```influx -execute "[SELECT * FROM measurement]"```

**Use specific database**

```influx -database [mydb]```

**Import data**

```influx -import -path [data.txt]```

**Execute query** with JSON output

```influx -database [mydb] -execute "[SELECT * FROM measurement]" -format json```

**Authenticate**

```influx -username [user] -password [pass]```

# SYNOPSIS

**influx** [_options_]

# PARAMETERS

**-host** _HOST_
> InfluxDB server hostname.

**-port** _PORT_
> Server port (default 8086).

**-database** _DB_
> Database to use.

**-execute** _QUERY_
> Execute query and exit.

**-import**
> Import data from file.

**-path** _FILE_
> File path for import.

**-username** _USER_
> Authentication username.

**-password** _PASS_
> Authentication password.

**-precision** _UNIT_
> Timestamp precision (ns, u, ms, s, m, h).

**-ssl**
> Use HTTPS for requests.

**-format** _FORMAT_
> Output format: column, csv, json (default: column).

**-type** _TYPE_
> Query type: influxql or flux.

**--help**
> Display help information.

# DESCRIPTION

**influx** is the command-line interface for InfluxDB time-series database. It provides an interactive shell for querying and managing data.

The v1 CLI uses direct connection flags (-host, -port, -username) and supports InfluxQL. The v2 CLI is a separate tool that uses token-based authentication and configuration profiles, supporting both InfluxQL and Flux query languages. The options documented here apply to the v1 CLI.

# CAVEATS

InfluxDB must be running. Authentication may be required. InfluxQL syntax differs from SQL.

# HISTORY

influx is part of **InfluxDB**, created by **InfluxData** as an open-source time-series database platform.

# SEE ALSO

[grafana-cli](/man/grafana-cli)(1), [mysql](/man/mysql)(1), [psql](/man/psql)(1)
