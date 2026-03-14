# TAGLINE

ODBC command-line SQL client

# TLDR

**Connect to data source**

```isql [dsn_name]```

**Connect with credentials**

```isql [dsn_name] [username] [password]```

**Connect with verbose error output**

```isql -v [dsn_name]```

**Run in batch mode (no headers)**

```isql -b [dsn_name] < [query.sql]```

**Use custom column delimiter**

```isql -d0x2C [dsn_name]```

**Output as HTML table**

```isql -w [dsn_name]```

**Use column headers with delimiter**

```isql -b -c -d0x09 [dsn_name]```

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
> Verbose mode with full error descriptions.

**-b**
> Batch mode (no headers, no prompts).

**-d** _HEX_
> Column delimiter as hex code (e.g., 0x09 for TAB, 0x2C for comma).

**-c**
> Output column names on first row (with -d or -x).

**-w**
> Format output as HTML table.

**-n**
> Use newline processing (multi-line SQL terminated with GO).

**-e**
> Use SQLExecDirect instead of Prepare.

**-k**
> Use SQLDriverConnect.

**-3**
> Use ODBC 3 calls.

**-L** _NUM_
> Maximum characters per field (default: 300).

**-q**
> Wrap character fields in double quotes.

**--version**
> Print version and exit.

# DESCRIPTION

**isql** is an ODBC command-line SQL client. It connects to any database with an ODBC driver.

The tool executes SQL queries interactively or from files. It provides database-agnostic access through ODBC.

# CAVEATS

Requires ODBC drivers. DSN must be configured. Part of unixODBC.

# HISTORY

isql is part of **unixODBC**, providing command-line database access through the Open Database Connectivity standard.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlcmd](/man/sqlcmd)(1)
