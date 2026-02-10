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
> Timestamp precision (ns, u, ms, s).

**--help**
> Display help information.

# DESCRIPTION

**influx** is the command-line interface for InfluxDB time-series database. It provides an interactive shell for querying and managing data.

The tool supports InfluxQL for querying time-series data. It can import, export, and manage databases and measurements.

# CAVEATS

InfluxDB must be running. Authentication may be required. InfluxQL syntax differs from SQL.

# HISTORY

influx is part of **InfluxDB**, created by **InfluxData** as an open-source time-series database platform.

# SEE ALSO

[influxd](/man/influxd)(1), [telegraf](/man/telegraf)(1), [grafana-cli](/man/grafana-cli)(1)
