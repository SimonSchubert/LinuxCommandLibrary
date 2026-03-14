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

**--accept-dns**
> Accept DNS configuration from the admin console.

**--advertise-routes** _CIDR_
> Expose physical subnet routes to the tailnet.

**--advertise-tags** _TAGS_
> Give tagged permissions to this device.

**--force-reauth**
> Force re-authentication.

**--reset**
> Reset unspecified settings to their defaults.

**--qr**
> Generate a QR code for the login URL.

**--exit-node-allow-lan-access**
> Allow LAN access while using an exit node.

**--operator** _USER_
> Unix username to operate tailscaled without sudo.

**--timeout** _DURATION_
> Maximum wait time for service initialization.

# DESCRIPTION

**tailscale up** connects the device to a Tailscale network. Authenticates and joins the tailnet. First run opens browser for authentication unless authkey is provided.

To change settings on an already-connected device, prefer **tailscale set** which only updates specified flags, whereas **tailscale up** applies OS defaults for all unspecified flags.

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-set](/man/tailscale-set)(1)

