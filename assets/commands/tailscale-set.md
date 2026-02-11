# TAGLINE

Configure persistent Tailscale options

# TLDR

**Set accept routes**

```tailscale set --accept-routes```

**Enable exit node**

```tailscale set --advertise-exit-node```

**Set hostname**

```tailscale set --hostname [name]```

**Disable key expiry**

```tailscale set --operator=$USER```

# SYNOPSIS

**tailscale** **set** [_options_]

# PARAMETERS

**--accept-routes**
> Accept subnet routes.

**--advertise-exit-node**
> Offer as exit node.

**--exit-node** _node_
> Use exit node.

**--hostname** _name_
> Set device hostname.

**--shields-up**
> Block incoming connections.

**--ssh**
> Enable Tailscale SSH.

# DESCRIPTION

**tailscale set** configures Tailscale options persistently. Changes settings that survive restarts. Alternative to passing options to tailscale up.

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-up](/man/tailscale-up)(1)

