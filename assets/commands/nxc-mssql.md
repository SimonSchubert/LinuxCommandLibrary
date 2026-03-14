# TAGLINE

Test Microsoft SQL Server credentials and execute queries via NetExec

# TLDR

**Test MSSQL credentials against a target**

```nxc mssql [192.168.1.100] -u [user] -p [password]```

**Authenticate using local authentication instead of Windows auth**

```nxc mssql [target] -u [sa] -p [password] --local-auth```

**Execute a SQL query**

```nxc mssql [target] -u [sa] -p [password] -q "[SELECT @@version]"```

**Execute an OS command via xp_cmdshell**

```nxc mssql [target] -u [sa] -p [password] -x "[whoami]"```

**Check for privilege escalation paths**

```nxc mssql [target] -u [user] -p [password] -M mssql_priv```

**Attempt privilege escalation to sysadmin**

```nxc mssql [target] -u [user] -p [password] -M mssql_priv -o ACTION=privesc```

# SYNOPSIS

**nxc mssql** _target_ [**-u** _user_] [**-p** _pass_] [_options_]

# PARAMETERS

**-u** _user_
> Username for authentication.

**-p** _pass_
> Password for authentication.

**-q** _query_
> Execute a SQL query on the target.

**-x** _cmd_
> Execute an OS command via xp_cmdshell.

**--local-auth**
> Use local authentication instead of Windows domain authentication.

**--port** _port_
> MSSQL port (default: 1433).

**-M** _module_
> Run a specific module (e.g., mssql_priv).

**-o** _KEY=VALUE_
> Module options (e.g., ACTION=privesc).

**--put-file** _src_ _dst_
> Upload a file to the target system.

**--get-file** _src_ _dst_
> Download a file from the target system.

# DESCRIPTION

**nxc mssql** is the Microsoft SQL Server protocol module of **NetExec** (formerly CrackMapExec). It tests credentials, executes SQL queries, runs OS commands, and supports privilege escalation against MSSQL targets.

The tool supports Windows (NTLM/Kerberos) and local SQL Server authentication. It can spray credentials across multiple targets, execute queries, and use modules like **mssql_priv** to check for and exploit privilege escalation paths.

# CAVEATS

For authorized security assessments only. Requires proper authorization before use. OS command execution requires xp_cmdshell to be enabled on the target.

# SEE ALSO

[nxc](/man/nxc)(1), [sqlcmd](/man/sqlcmd)(1)

