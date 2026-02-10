# TAGLINE

ODBC command-line SQL client

# TLDR

**Connect to data source**

```isql [dsn_name]```

**Connect with credentials**

```isql [dsn_name] [username] [password]```

**Execute query from file**

```isql [dsn] -i [query.sql]```

**Output to file**

```isql [dsn] < [query.sql] > [output.txt]```

**Verbose mode**

```isql -v [dsn]```

**No header output**

```isql -b [dsn]```

# SYNOPSIS

**isql** [_options_] _dsn_ [_user_] [_password_]

# PARAMETERS

_DSN_
> Data source name from odbc.ini.

_USER_
> Database username.

_PASSWORD_
> Database password.

**-v**
> Verbose mode.

**-b**
> Batch mode (no headers).

**-d** _DELIM_
> Column delimiter.

**-i** _FILE_
> Input file.

**--help**
> Display help information.

# DESCRIPTION

**isql** is an ODBC command-line SQL client. It connects to any database with an ODBC driver.

The tool executes SQL queries interactively or from files. It provides database-agnostic access through ODBC.

# CAVEATS

Requires ODBC drivers. DSN must be configured. Part of unixODBC.

# HISTORY

isql is part of **unixODBC**, providing command-line database access through the Open Database Connectivity standard.

# SEE ALSO

[odbcinst](/man/odbcinst)(1), [psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlcmd](/man/sqlcmd)(1)
