# TLDR

**List shares on server**

```net share```

**List sessions**

```net session```

**View user info**

```net user [username]```

**Join domain**

```net ads join -U [admin]```

**Map network drive**

```net use [Z:] [\\\\server\\share]```

**Show workgroup members**

```net rpc group members "[group]" -S [server]```

# SYNOPSIS

**net** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Net subcommand.

**share**
> Manage shares.

**session**
> View sessions.

**user**
> User management.

**ads**
> Active Directory ops.

**rpc**
> RPC commands.

**--help**
> Display help information.

# DESCRIPTION

**net** is a Samba network utility. It provides Windows networking functions on Linux.

The tool manages shares, users, and domains. Part of Samba suite.

net is Samba network command.

# CAVEATS

Part of Samba. Windows networking. Requires proper configuration.

# HISTORY

net is part of **Samba**, providing Windows-compatible network operations on Unix systems.

# SEE ALSO

[smbclient](/man/smbclient)(1), [samba](/man/samba)(1), [wbinfo](/man/wbinfo)(1)

