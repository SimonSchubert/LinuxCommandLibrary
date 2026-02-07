# TAGLINE

Simple TCP tunnel for exposing local ports

# TLDR

**Expose** a local port to a remote Bore server

```bore local -t [remote_server_address] [local_port]```

**Start** a Bore server

```bore server```

Display **help**

```bore -h```

# SYNOPSIS

**bore** _command_ [_options_]

# DESCRIPTION

**bore** is a modern, simple TCP tunnel that exposes local ports to a remote server for public access. It allows making local services accessible from the internet without complex port forwarding or firewall configuration.

The tool consists of a client that connects local ports to a remote bore server, which then provides a public endpoint for incoming connections.

# SUBCOMMANDS

**local**
> Expose a local port to a remote server

**server**
> Run a bore server

# PARAMETERS

**-t, --to** _address_
> Remote bore server address

**-h, --help**
> Display help information

# CAVEATS

Requires a bore server to be running and accessible. Traffic is tunneled through the remote server, adding latency. Not designed for high-bandwidth applications.

# SEE ALSO

[bore-local](/man/bore-local)(1), [ngrok](/man/ngrok)(1), [ssh](/man/ssh)(1)
