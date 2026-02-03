# TLDR

**Connect to MSSQL server**

```impacket-mssqlclient [domain]/[user]:[password]@[target]```

**Connect with Windows authentication**

```impacket-mssqlclient -windows-auth [domain]/[user]:[password]@[target]```

**Specify port**

```impacket-mssqlclient -port [1433] [user]:[password]@[target]```

**Execute query**

```impacket-mssqlclient [user]:[password]@[target] -q "[SELECT @@version]"```

# SYNOPSIS

**impacket-mssqlclient** [_options_] _target_

# PARAMETERS

**-windows-auth**
> Use Windows authentication.

**-port** _port_
> SQL Server port (default 1433).

**-q** _query_
> Execute query and exit.

**-file** _file_
> Execute SQL from file.

**-hashes** _lm:nt_
> Use NTLM hashes.

# DESCRIPTION

**impacket-mssqlclient** connects to Microsoft SQL Server databases for executing queries and database operations. Part of the Impacket toolkit. Supports SQL and Windows authentication. Interactive mode provides a SQL shell for commands like xp_cmdshell.

# SEE ALSO

[sqlcmd](/man/sqlcmd)(1), [impacket-psexec](/man/impacket-psexec)(1)

