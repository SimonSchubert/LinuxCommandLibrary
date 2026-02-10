# TAGLINE

netExec WinRM module

# TLDR

**Check WinRM credentials**

```nxc winrm [target] -u [user] -p [password]```

**Execute command**

```nxc winrm [target] -u [user] -p [password] -x "[command]"```

**Execute PowerShell**

```nxc winrm [target] -u [user] -p [password] -X "[ps_command]"```

**Use hash authentication**

```nxc winrm [target] -u [user] -H [hash]```

# SYNOPSIS

**nxc** **winrm** [_target_] [_options_]

# PARAMETERS

_TARGET_
> WinRM server address.

**-u** _USER_
> Username.

**-p** _PASSWORD_
> Password.

**-x** _COMMAND_
> Execute cmd command.

**-X** _COMMAND_
> Execute PowerShell command.

**-H** _HASH_
> NT hash for pass-the-hash.

**--help**
> Display help information.

# DESCRIPTION

**nxc winrm** is the NetExec WinRM module. Tests Windows Remote Management.

The tool validates WinRM access and executes commands. Part of NetExec suite.

# CAVEATS

Security tool. Authorized use only. Part of NetExec.

# HISTORY

nxc winrm provides **WinRM penetration testing** capabilities within NetExec.

# SEE ALSO

[nxc](/man/nxc)(1), [evil-winrm](/man/evil-winrm)(1), [winrm](/man/winrm)(1)

