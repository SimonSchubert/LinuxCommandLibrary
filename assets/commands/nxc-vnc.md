# TAGLINE

netExec VNC module

# TLDR

**Check VNC access**

```nxc vnc [target]```

**Authenticate with password**

```nxc vnc [target] -p [password]```

**Screenshot on connect**

```nxc vnc [target] --screenshot```

**Scan multiple hosts**

```nxc vnc [targets.txt]```

# SYNOPSIS

**nxc** **vnc** [_target_] [_options_]

# PARAMETERS

_TARGET_
> VNC server address.

**-p** _PASSWORD_
> VNC password.

**--screenshot**
> Capture screenshot.

**--port** _PORT_
> VNC port (default: 5900).

**--help**
> Display help information.

# DESCRIPTION

**nxc vnc** is the NetExec VNC module. It tests VNC servers for weak or missing authentication across one or more targets, and can capture a screenshot of the remote desktop on a successful connection.

Part of the NetExec suite, the maintained successor to CrackMapExec.

# CAVEATS

Security tool. Only use against systems you have explicit written permission to test. Part of NetExec.

# HISTORY

nxc vnc provides **VNC penetration testing** capabilities within NetExec.

# SEE ALSO

[nxc](/man/nxc)(1), [vncviewer](/man/vncviewer)(1), [tigervnc](/man/tigervnc)(1)

# RESOURCES

```[Source code](https://github.com/Pennyw0rth/NetExec)```

```[Documentation](https://www.netexec.wiki)```

<!-- verified: 2026-11-07 -->

