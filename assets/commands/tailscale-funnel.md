# TAGLINE

Expose local services to internet

# TLDR

**Expose local port to internet**

```tailscale funnel [443]```

**Expose specific port with path**

```tailscale funnel --set-path /api localhost:8080```

**Turn off funnel**

```tailscale funnel off```

**Check funnel status**

```tailscale funnel status```

# SYNOPSIS

**tailscale** **funnel** [_options_] _target_

# PARAMETERS

**--set-path** _path_
> URL path for service.

**--bg**
> Run in background.

**off**
> Disable funnel.

**status**
> Show funnel status.

# DESCRIPTION

**tailscale funnel** exposes local services to the public internet through your Tailscale node. Unlike **tailscale serve** which only makes services available within your tailnet, Funnel creates a publicly accessible HTTPS endpoint that anyone on the internet can reach.

Tailscale automatically provisions and manages TLS certificates for the endpoint, so traffic is encrypted without manual certificate setup. Services can be mapped to specific URL paths using **--set-path**, allowing multiple local services to be exposed under different routes. The **off** subcommand disables the funnel, and **status** shows the current configuration.

# CAVEATS

Exposes services to the public internet. Use with caution.

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-serve](/man/tailscale-serve)(1)

