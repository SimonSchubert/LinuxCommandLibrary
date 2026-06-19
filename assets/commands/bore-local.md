# TAGLINE

Expose local ports through a remote tunnel

# TLDR

**Expose** a local port using the public bore.pub server

```bore local [local_port] --to bore.pub```

**Expose** a local port to your own remote Bore server

```bore local [local_port] --to [remote_server_address]```

Expose a **specific local host** instead of localhost

```bore local [local_port] --local-host [host] --to [remote_server_address]```

Request a **specific remote port** explicitly

```bore local [local_port] --to [remote_server_address] --port [remote_port]```

Use a **secret for authentication**

```bore local [local_port] --to [remote_server_address] --secret [your_secret]```

# SYNOPSIS

**bore local** [_options_] _local_port_

# DESCRIPTION

**bore local** creates a tunnel from a local port to a remote bore server, making the local service accessible via the remote server's public address. This is useful for exposing development servers, webhooks, or other local services.

The connection is maintained as long as the command runs, and traffic is forwarded bidirectionally.

# PARAMETERS

**-t, --to** _address_
> Remote bore server address (required)

**-l, --local-host** _host_
> Local host to forward from (default: localhost)

**-p, --port** _port_
> Remote port to request on the server (default: 0, meaning the server assigns a random available port)

**-s, --secret** _secret_
> Authentication secret for the server

**-h, --help**
> Display help information

# CAVEATS

When **--port** is 0 (the default), the server assigns a random available port and prints the resulting public address on startup. Connection stability depends on network conditions. The secret must match the server's configured secret if authentication is required. Forwarded traffic is not encrypted by bore itself.

# SEE ALSO

[bore](/man/bore)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/ekzhang/bore)```

```[Homepage](https://bore.pub)```

<!-- verified: 2026-06-19 -->

