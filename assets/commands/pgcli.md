# TAGLINE

enhanced PostgreSQL client with auto-completion and syntax highlighting

# TLDR

**Connect to database**

```pgcli [database]```

**Connect with user and host**

```pgcli -h [hostname] -u [user] [database]```

**Connect with URL**

```pgcli postgresql://[user]:[password]@[host]/[database]```

**Connect via socket**

```pgcli -h /var/run/postgresql [database]```

**Run single query**

```pgcli -c "[SELECT * FROM table]" [database]```

**Execute file**

```pgcli [database] < [script.sql]```

**List databases**

```pgcli --list```

# SYNOPSIS

**pgcli** [_-h host_] [_-p port_] [_-u user_] [_-c command_] [_options_] [_database_]

# PARAMETERS

**-h** _HOST_, **--host** _HOST_
> Database server host.

**-p** _PORT_, **--port** _PORT_
> Database port.

**-u** _USER_, **--user** _USER_
> Username.

**-W**, **--password**
> Prompt for password.

**-d** _DB_, **--dbname** _DB_
> Database name.

**-c** _CMD_
> Execute command and exit.

**--list**
> List databases.

**--auto-vertical-output**
> Automatic vertical display for wide output.

**--row-limit** _N_
> Limit displayed rows.

**-l**, **--log-file** _FILE_
> Log to file.

**--pgclirc** _FILE_
> Config file path.

**--version**
> Show version.

# DESCRIPTION

**pgcli** is an enhanced PostgreSQL client with auto-completion and syntax highlighting. It provides a more user-friendly experience than psql.

Auto-completion suggests table names, column names, SQL keywords, and function names as you type. Context-aware suggestions understand joins, subqueries, and complex expressions.

Syntax highlighting makes queries more readable. Errors in SQL are visible before execution.

Multi-line editing supports complex queries. History search finds previous commands. Output can be saved to files.

The interface responds to psql backslash commands (\d, \dt, \l, etc.) for compatibility. Additional commands are available for pgcli-specific features.

Configuration controls colors, key bindings, and behavior. The pgclirc file customizes the environment.

# CAVEATS

Requires Python. Some psql features not implemented. Large result sets may be slow to display.

# HISTORY

**pgcli** was created by **Amjith Ramanujam** around **2014**, inspired by mycli for MySQL. It brought modern CLI features to PostgreSQL, emphasizing usability improvements over the basic psql client.

# SEE ALSO

[psql](/man/psql)(1), [mycli](/man/mycli)(1), [litecli](/man/litecli)(1), [pg_dump](/man/pg_dump)(1)
