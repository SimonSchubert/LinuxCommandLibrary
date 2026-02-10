# TAGLINE

netExec WMI module

# TLDR

**Check WMI credentials**

```nxc wmi [target] -u [user] -p [password]```

**Execute command via WMI**

```nxc wmi [target] -u [user] -p [password] -x "[command]"```

**Query WMI**

```nxc wmi [target] -u [user] -p [password] --wmi "[query]"```

**Use hash authentication**

```nxc wmi [target] -u [user] -H [hash]```

# SYNOPSIS

**nxc** **wmi** [_target_] [_options_]

# PARAMETERS

_TARGET_
> Windows host address.

**-u** _USER_
> Username.

**-p** _PASSWORD_
> Password.

**-x** _COMMAND_
> Execute command.

**--wmi** _QUERY_
> WMI query string.

**-H** _HASH_
> NT hash for pass-the-hash.

**--help**
> Display help information.

# DESCRIPTION

**nxc wmi** is the NetExec WMI module. Executes via Windows Management Instrumentation.

The tool uses WMI for remote execution. Part of NetExec suite.

# CAVEATS

Security tool. Authorized use only. Part of NetExec.

# HISTORY

nxc wmi provides **WMI-based execution** capabilities within NetExec.

# SEE ALSO

[nxc](/man/nxc)(1), [wmic](/man/wmic)(1), [impacket](/man/impacket)(1)

