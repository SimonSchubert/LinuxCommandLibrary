# TAGLINE

Interactive Microsoft SQL Server command-line query tool

# TLDR

**Connect** to a server

```mssql-cli -S [server] -U [user] -d [database]```

**Run a query** and exit

```mssql-cli -S [server] -U [user] -d [db] -Q "[SELECT 1]"```

# SYNOPSIS

**mssql-cli** [*options*]

# DESCRIPTION

**mssql-cli** is a dbcli-style interactive client for SQL Server with multi-line editing, auto-completion, and pretty result tables. Install via **pip install mssql-cli**. Related to the broader dbcli family (**pgcli**, **mycli**).

# PARAMETERS

**-S** *server*

> SQL Server host.

**-U** *user* / **-P** *password*

> Credentials (prefer env/prompt over shell history).

**-d** *database*

> Database name.

**-Q** *query*

> Execute query non-interactively.

**-E**

> Use integrated authentication where supported.

Full options: **mssql-cli --help**.

# CAVEATS

Check project maintenance status for your platform; Microsoft also ships **sqlcmd** and Azure Data Studio. Handle credentials securely.

# SEE ALSO

[sqlcmd](/man/sqlcmd)(1), [pgcli](/man/pgcli)(1), [mycli](/man/mycli)(1)

# RESOURCES

```[Source code](https://github.com/dbcli/mssql-cli)```

<!-- verified: 2026-07-19 -->
