# TAGLINE

fast reverse proxy server

# TLDR

**Start frp server**

```frps -c [frps.ini]```

**Verify configuration**

```frps verify -c [frps.ini]```

**Simple server with** defaults

```frps --bind_port [7000]```

**Show version**

```frps -v```

# SYNOPSIS

**frps** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Operation: verify.

**-c** _FILE_
> Configuration file path.

**--bind_port** _PORT_
> Bind port for client connections.

**--dashboard_port** _PORT_
> Web dashboard port.

**--token** _STRING_
> Authentication token.

**verify**
> Verify configuration file.

**--help**
> Display help information.

# CONFIGURATION

**frps.ini**
> Server configuration file controlling bind port, dashboard settings, authentication requirements, and connection policies.

# DESCRIPTION

**frps** is the server component of frp (fast reverse proxy). It runs on a public server and accepts connections from frpc clients, routing traffic to exposed internal services.

The server manages client authentication, proxy routing, and port allocation. A web dashboard provides monitoring. Multiple clients can connect to one server.

frps provides the public endpoint for accessing services exposed by frpc clients.

# CAVEATS

Requires public server with open ports. Security depends on authentication setup. Resource usage scales with connections.

# HISTORY

frps is part of **frp**, providing server-side functionality for the reverse proxy system. It enables hosting your own tunnel infrastructure as an alternative to commercial services.

# SEE ALSO

[frpc](/man/frpc)(1), [frp](/man/frp)(1), [nginx](/man/nginx)(1)
