# TAGLINE

Connect device to Tailscale network

# TLDR

**Connect to Tailscale**

```tailscale up```

**Connect with exit node**

```tailscale up --exit-node=[node]```

**Connect accepting routes**

```tailscale up --accept-routes```

**Connect with SSH enabled**

```tailscale up --ssh```

**Advertise as exit node**

```tailscale up --advertise-exit-node```

# SYNOPSIS

**tailscale** **up** [_options_]

# PARAMETERS

**--accept-routes**
> Accept advertised routes.

**--advertise-exit-node**
> Offer as exit node.

**--exit-node** _node_
> Route traffic through node.

**--hostname** _name_
> Device hostname.

**--shields-up**
> Block incoming connections.

**--ssh**
> Enable Tailscale SSH.

**--login-server** _url_
> Custom control server.

**--authkey** _key_
> Pre-auth key.

# DESCRIPTION

**tailscale up** connects the device to a Tailscale network. Authenticates and joins the tailnet. First run opens browser for authentication unless authkey provided.

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-down](/man/tailscale-down)(1), [tailscale-set](/man/tailscale-set)(1)

