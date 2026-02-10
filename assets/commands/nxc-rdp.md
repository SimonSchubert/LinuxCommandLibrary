# TAGLINE

netExec RDP module

# TLDR

**Check RDP credentials**

```nxc rdp [target] -u [user] -p [password]```

**Screenshot on login**

```nxc rdp [target] -u [user] -p [password] --screenshot```

**Check NLA status**

```nxc rdp [target] -u [user] -p [password] --nla```

**Scan multiple hosts**

```nxc rdp [targets.txt] -u [user] -p [password]```

# SYNOPSIS

**nxc** **rdp** [_target_] [_options_]

# PARAMETERS

_TARGET_
> RDP server address.

**-u** _USER_
> Username.

**-p** _PASSWORD_
> Password.

**--screenshot**
> Capture screenshot on login.

**--nla**
> Check NLA status.

**-H** _HASH_
> NT hash for pass-the-hash.

**--help**
> Display help information.

# DESCRIPTION

**nxc rdp** is the NetExec RDP module. Tests Remote Desktop credentials.

The tool validates RDP access. Part of NetExec suite.

# CAVEATS

Security tool. Authorized use only. Part of NetExec.

# HISTORY

nxc rdp provides **RDP penetration testing** capabilities within NetExec.

# SEE ALSO

[nxc](/man/nxc)(1), [rdesktop](/man/rdesktop)(1), [xfreerdp](/man/xfreerdp)(1)

