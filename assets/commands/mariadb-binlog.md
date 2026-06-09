# TAGLINE

Read and replay MariaDB binary log files

# TLDR

**Display events** from a binary log file

```mariadb-binlog /var/lib/mysql/mariadb-bin.000003```

**Filter events** for one database

```mariadb-binlog -d mydb /var/lib/mysql/mariadb-bin.000003```

**Show events** between two timestamps

```mariadb-binlog --start-datetime='2026-01-01 00:00:00' --stop-datetime='2026-02-01 00:00:00' /var/lib/mysql/mariadb-bin.000003```

**Show events** between byte positions

```mariadb-binlog -j 100 --stop-position 200 /var/lib/mysql/mariadb-bin.000003```

**Replay** log output into MariaDB

```mariadb-binlog mariadb-bin.000001 | mariadb -u root -p```

# SYNOPSIS

**mariadb-binlog** [_options_] _log_file_ ...

# PARAMETERS

**-d** _db_name_, **--database** _db_name_
> Output only events that modify tables in _db_name_

**-j** _N_, **--start-position** _N_
> Start at the first event at or after byte position _N_

**--stop-position** _N_
> Stop at the first event at or after byte position _N_

**--start-datetime** _datetime_
> Start at the first event at or after _datetime_

**--stop-datetime** _datetime_
> Stop at the first event at or after _datetime_

**-h** _host_, **--host** _host_
> Read the binary log from a remote MariaDB server (with **--read-from-remote-server**)

**-R**, **--read-from-remote-server**
> Fetch logs from a server instead of local files

**-v**, **--verbose**
> Decode row events as commented SQL statements

**-H**, **--hexdump**
> Include a hex dump of each event in the output

**-s**, **--short-form**
> Print only SQL statements, without extra metadata

**-r** _file_, **--result-file** _file_
> Write output to _file_ instead of stdout

**--help**, **-?**
> Show help and exit

**--version**, **-V**
> Show version and exit

# DESCRIPTION

**mariadb-binlog** is a MariaDB client utility for reading binary log files. The server writes these logs in a compact binary format; **mariadb-binlog** converts the events into human-readable SQL or metadata so DBAs can audit changes, debug replication, and perform point-in-time recovery.

Each event is preceded by a header comment with the byte position, timestamp, server ID, and execution time. For statement-based logging, the output shows the original SQL. For row-based logging, use **--verbose** to reconstruct the affected rows as SQL comments.

The utility can read local log files or stream logs from a remote server. Its output can be piped into **mariadb** to replay statements, edited first for selective recovery, or saved to a text file for later inspection.

Relay logs on replication replicas use the same format, so **mariadb-binlog** can inspect them as well.

# CAVEATS

Replaying multiple log files through separate **mariadb** connections can break statements that rely on temporary tables created in an earlier file. Pipe all required logs through a single **mariadb** process instead.

When using **--database**, filtering behavior differs between statement-based and row-based logging. With row-based logs, only events that modify tables in the selected database are shown.

Remote log reading requires a running server and appropriate privileges.

# SEE ALSO

[mysqlbinlog](/man/mysqlbinlog)(1), [mariadb](/man/mariadb)(1), [mariadbd](/man/mariadbd)(8)