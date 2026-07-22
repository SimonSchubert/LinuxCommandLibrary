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

**Use custom column delimiter** (comma)

```isql -d, [dsn_name]```

**Output as HTML table**

```isql -w [dsn_name]```

**Use column headers with tab delimiter** (hex)

```isql -b -c -x0x09 [dsn_name]```

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

**-d** _DELIMITER_
> Column delimiter character (e.g., -d, for comma).

**-x** _HEX_
> Column delimiter as a hex code (e.g., -x0x09 for TAB).

**-c**
> Output column names on first row (use with -d or -x).

**-m** _NUM_
> Limit column display width to NUM characters.

**-w**
> Format output as HTML table.

**-n**
> Use newline processing (multi-line SQL terminated with GO).

**-e**
> Use SQLExecDirect instead of Prepare.

**-k**
> Use SQLDriverConnect (DSN-less connection strings).

**-l** _LOCALE_
> Set locale.

**-3**
> Use ODBC 3 calls.

**-L** _NUM_
> Maximum characters per field (default: 300).

**-q**
> Wrap character fields in double quotes.

**--version**
> Print version and exit.

# DESCRIPTION

**isql** is an ODBC command-line SQL client included with unixODBC. It connects to any database with an ODBC driver using a DSN configured in odbc.ini, and executes SQL queries interactively or from a script piped on standard input.

Built-in runtime commands include `help` (list tables), `help <table>` (list columns), and `quit` to exit the session.

# CAVEATS

Requires ODBC drivers and a DSN configured in /etc/odbc.ini or ~/.odbc.ini. Part of unixODBC.

# HISTORY

isql is part of **unixODBC**, providing command-line database access through the Open Database Connectivity standard.

# INSTALL

```apt: sudo apt install unixodbc```

```pacman: sudo pacman -S unixodbc```

```apk: sudo apk add unixodbc```

```brew: brew install unixodbc```

```nix: nix profile install nixpkgs#unixodbc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlcmd](/man/sqlcmd)(1)
