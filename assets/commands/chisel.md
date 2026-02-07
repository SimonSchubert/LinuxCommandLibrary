# TAGLINE

TCP/UDP tunnel over HTTP secured via SSH

# TLDR

**Start server**

```chisel server --port [8080]```

**Start server with authentication**

```chisel server --authfile [users.json]```

**Connect client with port forward**

```chisel client [server:8080] [local:3000:remote:80]```

**Reverse tunnel**

```chisel client [server:8080] R:[remote:8001:local:80]```

**SOCKS5 proxy**

```chisel client [server:8080] socks```

**Connect via HTTPS**

```chisel client https://[server] [8080:localhost:80]```

# SYNOPSIS

**chisel** server [_options_]
**chisel** client [_options_] _server_ _remote_...

# DESCRIPTION

**chisel** is a fast TCP/UDP tunnel transported over HTTP and secured via SSH. A single executable contains both client and server functionality. It uses WebSockets to multiplex connections, allowing multiple tunnels through a single HTTP connection.

The tool is useful for traversing firewalls, accessing services behind NAT, and creating reverse tunnels. It supports forward and reverse port forwarding as well as SOCKS5 proxy mode. Authentication can be configured with username/password pairs or an authentication file. Written in Go.

# SERVER OPTIONS

**--port** _port_
> Listening port (default: 8080)

**--host** _host_
> Listening interface

**--authfile** _file_
> User authentication file

**--auth** _user:pass_
> Single user authentication

**--reverse**
> Allow reverse tunneling

**--keepalive** _duration_
> Keepalive interval

**--tls-key** / **--tls-cert**
> TLS key and certificate

# CLIENT OPTIONS

**--auth** _user:pass_
> Authentication credentials

**--fingerprint** _hash_
> Server fingerprint for verification

**--keepalive** _duration_
> Keepalive interval

# REMOTE SYNTAX

```
local-host:local-port:remote-host:remote-port/protocol
```

**R:** prefix for reverse tunnels

# CAVEATS

Useful for bypassing firewalls. WebSocket support varies by PaaS provider. Install: curl https://i.jpillora.com/chisel! | bash

# SEE ALSO

[ssh](/man/ssh)(1), [socat](/man/socat)(1), [ngrok](/man/ngrok)(1)
