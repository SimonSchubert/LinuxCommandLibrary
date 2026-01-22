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

**nxc vnc** is the NetExec VNC module. Tests VNC server security.

The tool checks VNC authentication. Part of NetExec suite.

nxc vnc tests VNC servers.

# CAVEATS

Security tool. Authorized use only. Part of NetExec.

# HISTORY

nxc vnc provides **VNC penetration testing** capabilities within NetExec.

# SEE ALSO

[nxc](/man/nxc)(1), [vncviewer](/man/vncviewer)(1), [tigervnc](/man/tigervnc)(1)

