# TAGLINE

tests Microsoft SQL Server credentials and executes queries

# TLDR

**Test MSSQL credentials**

```nxc mssql [192.168.1.100] -u [user] -p [password]```

**Execute query**

```nxc mssql [target] -u [sa] -p [password] -q "[SELECT @@version]"```

**Enable xp_cmdshell**

```nxc mssql [target] -u [sa] -p [password] -M mssql_priv```

**Execute OS command**

```nxc mssql [target] -u [sa] -p [password] -x [whoami]```

# SYNOPSIS

**nxc mssql** _target_ [_options_]

# PARAMETERS

**-u** _user_
> Username.

**-p** _pass_
> Password.

**-q** _query_
> Execute SQL query.

**-x** _cmd_
> Execute OS command via xp_cmdshell.

**--port** _port_
> MSSQL port.

**-M** _module_
> Run module.

# DESCRIPTION

**nxc mssql** tests Microsoft SQL Server credentials and executes queries. Part of NetExec security testing framework. Supports privilege escalation and command execution.

# CAVEATS

For authorized security assessments only. Requires proper authorization.

# SEE ALSO

[nxc](/man/nxc)(1), [sqlcmd](/man/sqlcmd)(1)

