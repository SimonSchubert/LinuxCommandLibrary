# TAGLINE

displays MySQL binary log contents in readable format

# TLDR

**Read binary log**

```mysqlbinlog [mysql-bin.000001]```

**Read from specific position**

```mysqlbinlog --start-position=[4] [mysql-bin.000001]```

**Read events in time range**

```mysqlbinlog --start-datetime="[2024-01-01 00:00:00]" --stop-datetime="[2024-01-02 00:00:00]" [mysql-bin.000001]```

**Output specific database only**

```mysqlbinlog --database=[mydb] [mysql-bin.000001]```

# SYNOPSIS

**mysqlbinlog** [_options_] _log_file_...

# PARAMETERS

**--start-position** _pos_
> Start reading the binary log at the given byte position.

**--stop-position** _pos_
> Stop reading the binary log at the given byte position.

**--start-datetime** _datetime_
> Only show events with a timestamp equal to or later than the given datetime.

**--stop-datetime** _datetime_
> Stop reading at the first event with a timestamp equal to or later than the given datetime.

**-d** _db_, **--database** _db_
> Show only events belonging to the named database.

**-r** _file_, **--result-file** _file_
> Direct output to the specified file instead of stdout.

**--base64-output** _mode_
> Control base64 encoding of row-based events (AUTO, NEVER, DECODE-ROWS).

**-v**, **--verbose**
> Reconstruct row events as pseudo-SQL; repeat (**-vv**) to include column metadata comments.

**-R**, **--read-from-remote-server**
> Read binary log from a remote MySQL server rather than a local file.

**-h** _host_, **--host** _host_
> Connect to the given host (with **-R**).

**-u** _user_, **--user** _user_
> MySQL user name (with **-R**).

**-p**, **--password**[=_pw_]
> MySQL password (with **-R**).

**--to-last-log**
> With **-R**, continue reading through the last binary log on the server.

**--disable-log-bin**
> Write SET sql_log_bin=0 to the output so replayed statements are not re-logged.

# DESCRIPTION

**mysqlbinlog** reads MySQL binary (and relay) log files and displays their contents as SQL statements. It is commonly used for point-in-time recovery (by piping its output into **mysql**), replication debugging, and auditing changes.

Statement-based events appear directly as SQL; row-based events are emitted as base64-encoded BINLOG statements, optionally decoded to pseudo-SQL via **--verbose**.

# CAVEATS

Output from row-based events is not directly executable SQL unless decoded appropriately. When used for recovery, pipe the output to **mysql** rather than saving and re-reading as separate statements, to preserve session state (e.g., temporary tables).

# SEE ALSO

[mysql](/man/mysql)(1), [mysqldump](/man/mysqldump)(1)

