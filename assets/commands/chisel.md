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

**-p**, **--port** _PORT_
> Listening port (default **8080**).

**--host** _HOST_
> Listening interface (default all).

**--authfile** _FILE_
> Path to a JSON file mapping **user:pass** credentials to allowed remotes.

**--auth** _USER:PASS_
> Single inline credential pair.

**--reverse**
> Allow clients to request reverse tunnels (**R:**).

**--socks5**
> Allow clients to request a SOCKS5 endpoint via the special **socks** remote.

**--backend** _URL_
> Forward non-chisel HTTP requests hitting the server to this backend URL (useful to co-host chisel with a web server).

**--keepalive** _DURATION_
> WebSocket keepalive interval (default **25s**).

**--key**, **--keygen**, **--keyfile**
> Manage the server's persistent SSH host key.

**--tls-key**, **--tls-cert**, **--tls-ca**, **--tls-domain**
> Enable native TLS termination and client-cert verification.

# CLIENT OPTIONS

**--auth** _USER:PASS_
> Authenticate to the server.

**--fingerprint** _HASH_
> Pin the expected server SSH key fingerprint.

**--proxy** _URL_
> Dial through an upstream HTTP **CONNECT** or SOCKS5 proxy.

**--header** _NAME: VAL_
> Extra HTTP header to add to the WebSocket handshake (repeatable).

**--hostname** _HOST_
> Override the HTTP **Host** header.

**--sni** _NAME_
> Override the TLS **ServerName** used during the handshake.

**--keepalive** _DURATION_
> WebSocket keepalive interval.

**--max-retry-count** _N_, **--max-retry-interval** _DURATION_
> Cap reconnection attempts and backoff.

**--tls-ca** _FILE_, **--tls-skip-verify**, **--tls-key** _FILE_, **--tls-cert** _FILE_
> Control TLS verification and client-certificate authentication.

# REMOTE SYNTAX

```
[<local-host>:]<local-port>[:<remote-host>:<remote-port>][/udp]
```

Defaults: local-host = **0.0.0.0**, remote-host = **0.0.0.0**, protocol = **tcp**. Prefix with **R:** for a reverse tunnel. Special values: **socks** (SOCKS5 endpoint, requires **--socks5** on the server) and **stdio:host:port** (stdio-attached tunnel).

# CAVEATS

Useful for bypassing firewalls. WebSocket support varies by PaaS provider. Install: curl https://i.jpillora.com/chisel! | bash

# SEE ALSO

[ssh](/man/ssh)(1), [socat](/man/socat)(1), [ngrok](/man/ngrok)(1)
