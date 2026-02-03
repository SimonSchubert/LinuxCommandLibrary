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
> Start reading from position.

**--stop-position** _pos_
> Stop reading at position.

**--start-datetime** _datetime_
> Start time filter.

**--stop-datetime** _datetime_
> Stop time filter.

**--database** _db_
> Show only database events.

**--result-file** _file_
> Output to file.

**--base64-output** _mode_
> Base64 output mode.

# DESCRIPTION

**mysqlbinlog** displays MySQL binary log contents in readable format. Used for point-in-time recovery, replication debugging, and audit purposes. Converts binary events to SQL statements.

# SEE ALSO

[mysql](/man/mysql)(1), [mysqldump](/man/mysqldump)(1)

