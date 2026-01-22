# TLDR

**Create** persistent SSH tunnel

```autossh -M [20000] -N -L [8080:localhost:80] [user@remote]```

Tunnel with **no monitoring port**

```autossh -M 0 -N -L [8080:localhost:80] [user@remote]```

**Reverse** tunnel

```autossh -M [20000] -N -R [8080:localhost:80] [user@remote]```

Run in **background**

```autossh -f -M [20000] -N -L [8080:localhost:80] [user@remote]```

# SYNOPSIS

**autossh** -M _monitor_port_ [_ssh_options_] _destination_

# DESCRIPTION

**autossh** wraps SSH connections with automatic reconnection. It monitors the connection and restarts it if it dies, making SSH tunnels and connections persistent.

The tool is essential for maintaining long-running SSH tunnels, remote port forwards, and SOCKS proxies.

# PARAMETERS

**-M** _port_[:_port_]
> Monitoring port(s). Use -M 0 to disable port monitoring

**-f**
> Background after authentication

**-N**
> No command execution (forwarding only)

**-L** _port_:_host_:_port_
> Local port forward

**-R** _port_:_host_:_port_
> Remote port forward

**-D** _port_
> SOCKS proxy

All other **ssh** options are supported.

# ENVIRONMENT VARIABLES

**AUTOSSH_GATETIME**
> Seconds before first connection check (default: 30)

**AUTOSSH_POLL**
> Poll time in seconds (when monitoring disabled)

**AUTOSSH_DEBUG**
> Enable debug logging

# CAVEATS

Monitoring ports must be free on both sides. ServerAliveInterval in SSH config can replace monitoring. May not detect all disconnection types. Recent SSH versions have built-in keepalives.

# HISTORY

**autossh** was created by Carson Harding to address the problem of SSH connections dying without notification, first released around **2002**.

# SEE ALSO

[ssh](/man/ssh)(1), [systemd](/man/systemd)(1), [tmux](/man/tmux)(1)
