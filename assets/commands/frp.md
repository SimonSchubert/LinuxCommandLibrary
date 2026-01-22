# TLDR

**Start frp client**

```frpc -c [frpc.ini]```

**Start frp server**

```frps -c [frps.ini]```

**Verify configuration**

```frpc verify -c [frpc.ini]```

**Reload client config**

```frpc reload -c [frpc.ini]```

# SYNOPSIS

**frpc** | **frps** [_options_]

# PARAMETERS

**-c** _FILE_
> Configuration file path.

**verify**
> Verify configuration syntax.

**reload**
> Reload configuration.

**--help**
> Display help information.

# DESCRIPTION

**frp** (fast reverse proxy) exposes local servers behind NAT or firewalls to the internet. It consists of a client (frpc) on the internal network and server (frps) on the public server.

The tool supports TCP, UDP, HTTP, and HTTPS protocols with features like encryption, compression, and authentication. It enables accessing internal services, SSH tunnels, and web applications remotely.

frp provides a self-hosted alternative to services like ngrok.

# CAVEATS

Requires public server. Configuration needed for each service. Security depends on proper setup.

# HISTORY

frp was created as an open source alternative to commercial reverse proxy services. Written in Go, it provides self-hosted tunneling for developers and system administrators.

# SEE ALSO

[frpc](/man/frpc)(1), [frps](/man/frps)(1), [ngrok](/man/ngrok)(1)
