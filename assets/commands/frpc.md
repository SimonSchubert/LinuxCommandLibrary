# TAGLINE

fast reverse proxy client

# TLDR

**Start frp client**

```frpc -c [frpc.ini]```

**Verify configuration**

```frpc verify -c [frpc.ini]```

**Reload configuration**

```frpc reload -c [frpc.ini]```

**Show status**

```frpc status -c [frpc.ini]```

**Show version**

```frpc -v```

# SYNOPSIS

**frpc** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Operation: verify, reload, status.

**-c** _FILE_
> Configuration file path.

**verify**
> Verify configuration file.

**reload**
> Reload configuration without restart.

**status**
> Show proxy status.

**-v**, **--version**
> Show version.

**--help**
> Display help information.

# CONFIGURATION

**frpc.ini**
> Client configuration file specifying server address, authentication token, and proxy definitions for each service to expose through the tunnel.

# DESCRIPTION

**frpc** is the client component of frp (fast reverse proxy). It runs on internal networks and establishes connections to the frps server, creating tunnels for exposed services.

Configuration defines proxies for TCP, UDP, HTTP, and HTTPS services. The client maintains persistent connections and handles reconnection. Multiple services can be exposed through one client.

frpc enables accessing internal services through a public frps server.

# CAVEATS

Requires frps server running. Configuration must match server. Network connectivity required.

# HISTORY

frpc is part of **frp**, an open source reverse proxy project. It provides the client-side functionality for creating tunnels through NAT and firewalls.

# SEE ALSO

[frps](/man/frps)(1), [frp](/man/frp)(1), [ssh](/man/ssh)(1)
