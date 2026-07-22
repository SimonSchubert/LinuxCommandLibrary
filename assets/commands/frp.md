# TAGLINE

Fast reverse proxy for NAT traversal

# TLDR

**Start frp client**

```frpc -c [frpc.toml]```

**Start frp server**

```frps -c [frps.toml]```

**Verify client configuration**

```frpc verify -c [frpc.toml]```

**Reload client config without restart**

```frpc reload -c [frpc.toml]```

**Show proxy status**

```frpc status -c [frpc.toml]```

# SYNOPSIS

**frpc** | **frps** [_command_] [_options_]

# COMMANDS

**reload**
> Hot-reload the client configuration without restarting the process.

**verify**
> Validate the configuration file syntax and exit.

**status**
> Print the status of all proxies defined for the client.

**stop**
> Stop the running frpc instance via its admin API.

# PARAMETERS

**-c**, **--config** _FILE_
> Configuration file path (TOML, YAML, or JSON).

**-L**, **--log_level** _LEVEL_
> Log level (trace, debug, info, warn, error).

**-t**, **--token** _TOKEN_
> Authentication token shared between client and server.

**-s**, **--server_addr** _ADDR_
> frps server address (frpc only).

**-v**, **--version**
> Print version information.

**-h**, **--help**
> Display help information.

# CONFIGURATION

**frpc.toml**
> Client configuration: defines server connection, authentication token, and proxy definitions for services to expose.

**frps.toml**
> Server configuration: specifies bind ports, dashboard settings, authentication tokens, and connection limits.

# DESCRIPTION

**frp** (fast reverse proxy) exposes local servers behind NAT or firewalls to the internet. It consists of a client (**frpc**) on the internal network and a server (**frps**) on a public host.

The tool supports TCP, UDP, HTTP, HTTPS, STCP, SUDP, and XTCP protocols with features like encryption, compression, multiplexing, and authentication. It enables remote access to internal services, SSH tunnels, web applications, and peer-to-peer connections.

Since v0.52.0, frp supports **TOML**, **YAML**, and **JSON** configuration formats. The legacy **INI** format is deprecated and scheduled for removal.

frp provides a self-hosted alternative to services like ngrok.

# CAVEATS

Requires a publicly reachable server. Each exposed service needs its own proxy entry in the client config. Security relies on a strong shared token and TLS configuration. INI configuration is deprecated; migrate to TOML.

# HISTORY

**frp** was created by **fatedier** as an open source alternative to commercial reverse proxy services. Written in Go, it provides self-hosted tunneling for developers and system administrators.

# INSTALL

```nix: nix profile install nixpkgs#frp```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[frpc](/man/frpc)(1), [frps](/man/frps)(1), [ngrok](/man/ngrok)(1)
