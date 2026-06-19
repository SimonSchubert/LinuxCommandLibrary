# TAGLINE

Simple TCP tunnel for exposing local ports

# TLDR

**Expose** a local port using the public bore.pub server

```bore local [local_port] --to bore.pub```

**Expose** a local port to your own remote Bore server

```bore local [local_port] --to [remote_server_address]```

**Start** a Bore server

```bore server```

**Start** a Bore server requiring a shared secret

```bore server --secret [your_secret]```

Display **help**

```bore -h```

# SYNOPSIS

**bore** _command_ [_options_]

# DESCRIPTION

**bore** is a modern, simple TCP tunnel that exposes local ports to a remote server for public access. It allows making local services accessible from the internet without complex port forwarding or firewall configuration.

The tool consists of a client that connects local ports to a remote bore server, which then provides a public endpoint for incoming connections. A public server is available at **bore.pub**, or you can run your own with `bore server`. It is a single self-contained binary written in Rust.

# SUBCOMMANDS

**local**
> Expose a local port to a remote server. Takes a positional local port plus **-t, --to** for the server address (see [bore-local](/man/bore-local)(1)).

**server**
> Run a bore server that accepts client tunnels

# PARAMETERS

**-t, --to** _address_
> Remote bore server address (for **local**)

**-s, --secret** _secret_
> Shared secret for authentication (both **local** and **server**)

**--min-port** _port_
> Server: minimum TCP port number to accept (default: 1024)

**--max-port** _port_
> Server: maximum TCP port number to accept (default: 65535)

**--bind-addr** _address_
> Server: address to bind the control connection to (default: 0.0.0.0)

**-h, --help**
> Display help information

# CAVEATS

Requires a bore server to be running and accessible. Traffic is tunneled through the remote server, adding latency. The shared secret only authenticates the tunnel control channel: forwarded traffic is not encrypted by bore, so use HTTPS or another layer for sensitive data. Not designed for high-bandwidth applications.

# SEE ALSO

[bore-local](/man/bore-local)(1), [ngrok](/man/ngrok)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/ekzhang/bore)```

```[Homepage](https://bore.pub)```

<!-- verified: 2026-06-19 -->

