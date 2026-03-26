# TAGLINE

creates secure tunnels to localhost

# TLDR

**Expose local port**

```ngrok http [8080]```

**Expose with custom domain**

```ngrok http --domain=[myapp.ngrok-free.app] [8080]```

**TCP tunnel**

```ngrok tcp [22]```

**Start named tunnel from config**

```ngrok start [tunnel-name]```

**Start all tunnels from config**

```ngrok start --all```

**Set authentication token**

```ngrok config add-authtoken [token]```

**TLS tunnel**

```ngrok tls [443]```

**Expose with basic auth**

```ngrok http --basic-auth="[user]:[password]" [8080]```

**Check configuration file validity**

```ngrok config check```

**Diagnose connectivity**

```ngrok diagnose```

# SYNOPSIS

**ngrok** [_command_] [_options_]

# PARAMETERS

**http** _PORT_
> Create HTTP tunnel to local port.

**tcp** _PORT_
> Create TCP tunnel.

**tls** _PORT_
> Create TLS tunnel (does not terminate TLS).

**start** _name_
> Start named tunnel(s) from configuration file.

**config** _SUBCOMMAND_
> Manage ngrok configuration (add-authtoken, check, edit).

**diagnose**
> Run connectivity diagnostics to ngrok service.

**service** _action_
> Manage ngrok as a system service (install, start, stop, restart, uninstall).

**--domain** _NAME_
> Custom domain for tunnel endpoint.

**--region** _REGION_
> Region for tunnel (us, eu, ap, au, sa, jp, in).

**--log** _path_
> Write logs to file or "stdout"/"stderr".

**--basic-auth** _USER:PASSWORD_
> Add HTTP basic authentication to the tunnel.

**api** _SUBCOMMAND_
> Access the ngrok API (e.g., list tunnels, manage reserved domains).

**--help**
> Display help information.

# DESCRIPTION

**ngrok** creates secure tunnels from a public endpoint to a locally running service. It exposes local servers to the internet through a public URL without deploying or configuring firewalls.

Common use cases include webhook development, demo presentations, testing mobile backends, and remote access to local services. The web inspection interface (default at localhost:4040) allows real-time traffic inspection and replay.

# CAVEATS

Free tier has connection limits and randomized URLs that change on restart. An account and authtoken are required for most features. The --subdomain flag was replaced by --domain in newer versions.

# HISTORY

ngrok was created by **Alan Shreve** to provide secure tunnels for local development.

# SEE ALSO

[localtunnel](/man/localtunnel)(1), [ssh](/man/ssh)(1), [cloudflared](/man/cloudflared)(1)

