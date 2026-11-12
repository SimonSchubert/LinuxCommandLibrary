# TAGLINE

Share a local server, file, or directory on your tailnet

# TLDR

Expose an HTTP server at 127.0.0.1:3000 in the **foreground**

```tailscale serve 3000```

Expose that server in the **background**

```tailscale serve --bg 3000```

Expose a local **file or directory**

```sudo tailscale serve /[path/to/file_or_directory]```

Listen on a specific **HTTPS** port

```tailscale serve --https [8443] [localhost:3000]```

**Stop** serving on a port

```tailscale serve --https [443] off```

Show current **status**

```tailscale serve status```

Status as **JSON**

```tailscale serve status --json```

**Clear** all serve configuration

```tailscale serve reset```

# SYNOPSIS

**tailscale** **serve** [_flags_] _target_

**tailscale** **serve** **status** [_--json_]

**tailscale** **serve** **reset** | **drain** _service_ | **advertise** _service_

# PARAMETERS

_target_
> Port (`3000`), host:port (`localhost:3000`), URL (`https+insecure://localhost:8443`), absolute file or directory path, or `text:` followed by a static string.

**--bg**
> Run in the background until disabled.

**--https**=_port_
> HTTPS listener port (default). Certificates are provisioned automatically.

**--http**=_port_
> HTTP listener port. HTTP is reachable on short MagicDNS names such as `http://my-node`.

**--set-path**=_path_
> Mount the service at a slash-separated URL path.

**--tcp**=_port_
> Raw TCP forwarder on _port_.

**--tls-terminated-tcp**=_port_
> TLS-terminated TCP forwarder on _port_.

**--proxy-protocol**=_1_|_2_
> PROXY protocol version for TCP forwarding (typically 2).

**--service**=_virtual-ip_
> Serve for a Tailscale Service virtual IP instead of this device's address.

**--tun**
> Layer 3 Service that forwards all traffic to the local machine (Services only).

**--accept-app-caps**=_caps_
> App capabilities to forward, comma-separated.

**--yes**
> Update without interactive prompts.

**off**
> Remove this serve mapping. Original flags are required; _target_ is optional.

**status** [_--json_]
> List servers currently configured on this device.

**reset**
> Clear the current serve configuration.

**drain** _service_
> Stop accepting new connections for a Service (`svc:name`) without dropping existing ones.

**advertise** _service_
> Advertise this node as a Service host.

# DESCRIPTION

**tailscale serve** shares a local service, file, directory, or static text with devices on your Tailscale network (tailnet). It is a **tailscale** subcommand, not a separate binary. Traffic stays inside the tailnet. Use **tailscale funnel** when the endpoint must be on the public internet.

HTTPS uses a certificate Tailscale provisions for the node. Targets can reverse-proxy a local HTTP server, serve files (requires root on Linux), or return static text. TCP mode forwards raw or TLS-terminated streams to a local TCP server.

With **--bg**, serve survives reboot and `tailscale down` / `tailscale up`. Without **--bg**, you must start it again after a restart. Serve for Tailscale Services runs in the background by default.

# CAVEATS

Funnel and Serve CLI flags changed in Tailscale 1.52. File and directory serving needs root on Linux (`sudo tailscale serve /path`). Reverse-proxy targets only support `http://127.0.0.1` backends. macOS App Store and Standalone variants can share ports but not files, because of the app sandbox. **status** and **status --json** do not return the same fields; **get-config --all** lists Services.

# INSTALL

```dnf: sudo dnf install tailscale```

```pacman: sudo pacman -S tailscale```

```apk: sudo apk add tailscale```

```zypper: sudo zypper install tailscale```

```brew: brew install tailscale```

```nix: nix profile install nixpkgs#tailscale```

<!-- packages: 2026-11-12 -->

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-funnel](/man/tailscale-funnel)(1), [tailscale-up](/man/tailscale-up)(1)

# RESOURCES

```[Documentation](https://tailscale.com/docs/reference/tailscale-cli/serve)```

```[Homepage](https://tailscale.com/)```

<!-- verified: 2026-11-12 -->
