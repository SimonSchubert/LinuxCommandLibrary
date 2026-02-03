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

**tailscale funnel** exposes local services to the public internet. Creates HTTPS endpoint accessible outside Tailscale network. Managed TLS certificates included.

# CAVEATS

Exposes services to the public internet. Use with caution.

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-serve](/man/tailscale-serve)(1)

