# TAGLINE

Expose local ports through a remote tunnel

# TLDR

**Expose** a local port to a remote Bore server

```bore local -t [remote_server_address] [local_port]```

Expose a **specific local host** instead of localhost

```bore local -l [host] -t [remote_server_address] [local_port]```

Specify a **remote server port** explicitly

```bore local -t [remote_server_address] -p [remote_port] [local_port]```

Use a **secret for authentication**

```bore local -t [remote_server_address] -s [your_secret] [local_port]```

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
> Remote port to request on the server

**-s, --secret** _secret_
> Authentication secret for the server

**-h, --help**
> Display help information

# CAVEATS

Remote port assignment may be automatic if not specified. Connection stability depends on network conditions. The secret must match the server's configured secret if authentication is required.

# SEE ALSO

[bore](/man/bore)(1), [ssh](/man/ssh)(1)
