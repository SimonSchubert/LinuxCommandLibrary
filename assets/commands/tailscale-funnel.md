# TAGLINE

Expose local services to internet

# TLDR

**Expose a local service** on port 8080 to the internet

```tailscale funnel [8080]```

**Expose a local HTTPS proxy** target to the internet

```tailscale funnel https+insecure://localhost:[8443]```

**Expose on a specific port** (443, 8443, or 10000)

```tailscale funnel --serve-port [8443] [3000]```

**Turn off funnel**

```tailscale funnel off```

**Check funnel status**

```tailscale funnel status```

**Run in background** mode

```tailscale funnel --bg [8080]```

# SYNOPSIS

**tailscale** **funnel** [_options_] _target_

# PARAMETERS

**--bg**
> Run in background.

**--serve-port** _port_
> The public-facing port (443, 8443, or 10000; default 443).

**--set-path** _path_
> Mount the service at a specific URL path.

**off**
> Disable funnel.

**status**
> Show current funnel configuration.

**reset**
> Reset all funnel configuration.

# DESCRIPTION

**tailscale funnel** exposes local services to the public internet through your Tailscale node. Unlike **tailscale serve** which only makes services available within your tailnet, Funnel creates a publicly accessible HTTPS endpoint that anyone on the internet can reach.

Tailscale automatically provisions and manages TLS certificates for the endpoint, so traffic is encrypted without manual certificate setup. Services can be mapped to specific URL paths using **--set-path**, allowing multiple local services to be exposed under different routes. The **off** subcommand disables the funnel, and **status** shows the current configuration.

# CAVEATS

Exposes services to the public internet -- use with caution. Funnel must be enabled in the Tailscale admin console ACL policy. Only ports 443, 8443, and 10000 are supported for public-facing endpoints.

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-up](/man/tailscale-up)(1), [ngrok](/man/ngrok)(1)

