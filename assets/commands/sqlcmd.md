# TAGLINE

SQL Server command-line query tool

# TLDR

**Connect to SQL Server** locally

```sqlcmd -S [localhost] -U [sa] -P "[password]"```

**Connect to a remote server**

```sqlcmd -S [server.example.com] -U [username] -P "[password]"```

**Execute a query** and exit

```sqlcmd -S [server] -U [user] -P "[password]" -Q "SELECT @@VERSION"```

**Execute a SQL script file**

```sqlcmd -S [server] -U [user] -P "[password]" -i [script.sql]```

**Output results to a file**

```sqlcmd -S [server] -U [user] -P "[password]" -Q "[query]" -o [output.txt]```

**Connect with Windows Authentication**

```sqlcmd -S [server] -E```

**Connect with encryption optional**

```sqlcmd -S [server] -U [user] -P "[password]" -No```

# SYNOPSIS

**sqlcmd** [**-S** _server_] [**-U** _login_] [**-P** _password_] [_options_]

# PARAMETERS

**-S** _server_
> SQL Server instance to connect to. Format: [protocol:]server[\instance][,port].

**-U** _login_
> User login name.

**-P** _password_
> Password for the login.

**-E**
> Use Windows Authentication (trusted connection).

**-d** _database_
> Initial database to use.

**-Q** _query_
> Execute query and exit.

**-q** _query_
> Execute query and enter interactive mode.

**-i** _file_
> Input file containing SQL statements.

**-o** _file_
> Output file for results.

**-N**
> Encryption mode: **o** (optional), **m** (mandatory, default in 2025), **s** (strict).

**-No**
> Encryption optional (shorthand).

**-C**
> Trust server certificate.

**-t** _timeout_
> Query timeout in seconds.

**-l** _timeout_
> Login timeout in seconds.

**-h** _headers_
> Rows between column headers (-1 to disable).

**-s** _separator_
> Column separator character.

**-w** _width_
> Screen width for output.

**-?**
> Display help for ODBC sqlcmd flags.

**--help**
> Display help for go-sqlcmd subcommands.

# DESCRIPTION

**sqlcmd** is Microsoft's command-line utility for SQL Server and Azure SQL. It allows executing Transact-SQL statements, stored procedures, and SQL scripts interactively or in batch mode. Two implementations exist: the newer Go-based version (go-sqlcmd) and the traditional ODBC-based version.

The utility supports various authentication methods including SQL Server authentication, Windows/Kerberos authentication, and Azure Active Directory. Results can be output to the terminal, files, or piped to other commands.

In interactive mode, commands like **:quit** exit the session, **GO** executes the statement batch, and **:r** includes a script file. The prompt shows the current line number.

# CAVEATS

Starting with SQL Server 2025, mandatory encryption (**-Nm**) is the default, which is a breaking change from earlier versions. Use **-No** for optional encryption when connecting to older servers. Password on command line is visible in process listings; consider using environment variables or prompts instead. Linux requires the mssql-tools package from Microsoft repositories.

# HISTORY

**sqlcmd** was introduced by Microsoft as the replacement for the older **osql** and **isql** utilities. The ODBC-based version has been available since SQL Server 2005 and was ported to Linux when SQL Server on Linux was released in **2017**. In **2022**, Microsoft released go-sqlcmd, a Go-based reimplementation with modern features and cross-platform support. Development continues with SQL Server 2025 adding TDS 8.0 support.

# SEE ALSO

[mssql-cli](/man/mssql-cli)(1), [psql](/man/psql)(1), [mysql](/man/mysql)(1), [bcp](/man/bcp)(1)
