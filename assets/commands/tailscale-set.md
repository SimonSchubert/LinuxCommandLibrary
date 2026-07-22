# TAGLINE

Configure persistent Tailscale options

# TLDR

**Accept routes** advertised by other tailnet nodes

```tailscale set --accept-routes```

**Advertise this device as an exit node**

```tailscale set --advertise-exit-node```

**Set the device hostname**

```tailscale set --hostname [name]```

**Allow a non-root user to control tailscaled**

```tailscale set --operator=[$USER]```

**Route this device's traffic through an exit node**

```tailscale set --exit-node [node-name-or-ip]```

# SYNOPSIS

**tailscale** **set** [_options_]

# PARAMETERS

**--accept-routes**
> Accept subnet routes advertised by other nodes.

**--accept-dns**
> Accept DNS configuration from the admin console.

**--advertise-routes** _CIDRS_
> Expose physical subnet routes to the tailnet.

**--advertise-exit-node**
> Offer this node as an exit node.

**--advertise-tags** _TAGS_
> Apply ACL tags to this device.

**--exit-node** _NODE_
> Route traffic through the named exit node (empty string clears it).

**--exit-node-allow-lan-access**
> Allow LAN access while connected to an exit node.

**--hostname** _NAME_
> Override the device hostname.

**--shields-up**
> Block all incoming connections.

**--ssh**
> Enable Tailscale SSH on this device.

**--operator** _USER_
> Allow the named local user to operate **tailscaled** without sudo.

**--auto-update**
> Enable automatic Tailscale client updates (where supported).

# DESCRIPTION

**tailscale set** changes per-node Tailscale options without disrupting the existing connection. Unlike **tailscale up**, which resets every unspecified flag back to its default, **set** modifies only the flags you pass — making it the safer choice for incremental changes.

# INSTALL

```dnf: sudo dnf install tailscale```

```pacman: sudo pacman -S tailscale```

```apk: sudo apk add tailscale```

```zypper: sudo zypper install tailscale```

```brew: brew install tailscale```

```nix: nix profile install nixpkgs#tailscale```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-up](/man/tailscale-up)(1)

