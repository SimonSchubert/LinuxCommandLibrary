# TLDR

**Connect to network**

```tailscale up```

**Disconnect**

```tailscale down```

**Show status**

```tailscale status```

**Show IP addresses**

```tailscale ip```

**Ping node**

```tailscale ping [hostname]```

**SSH to node**

```tailscale ssh [user@hostname]```

**Share file**

```tailscale file cp [file] [hostname:]```

**Receive files**

```tailscale file get [download_dir]```

# SYNOPSIS

**tailscale** [_up_] [_down_] [_status_] [_ip_] [_ping_] [_ssh_] [_file_] [_options_]

# PARAMETERS

**up**
> Connect to Tailscale.

**down**
> Disconnect.

**status**
> Show network status.

**ip** [_-4_] [_-6_]
> Show IP addresses.

**ping** _HOST_
> Ping a Tailscale node.

**ssh** _TARGET_
> SSH to node.

**file cp** _FILES_ _TARGET:_
> Copy files.

**file get** [_DIR_]
> Receive files.

**cert** _DOMAIN_
> Get TLS certificate.

**funnel**
> Expose to internet.

**serve**
> Serve content.

**logout**
> Log out.

**--accept-routes**
> Accept subnet routes.

**--advertise-routes** _ROUTES_
> Advertise routes.

**--exit-node** _NODE_
> Use exit node.

# DESCRIPTION

**tailscale** creates encrypted mesh networks. Devices connect directly using WireGuard, without central servers forwarding traffic.

Authentication uses SSO providers. After login, devices join your tailnet (Tailscale network). Each device gets a stable IP.

MagicDNS provides hostnames for devices. SSH integration enables authentication without managing keys.

File sharing transfers directly between devices. No cloud storage is involved - files go peer-to-peer.

Exit nodes route traffic through specific devices. This enables secure internet access through trusted locations.

Funnel exposes services to the internet. Serve provides quick HTTP/HTTPS serving with automatic certificates.

# CAVEATS

Requires Tailscale account. Control plane is cloud-based. Some features need paid plan. Network depends on coordination server availability.

# HISTORY

**Tailscale** was founded by **Brad Fitzpatrick** and others in **2019**. It builds on WireGuard to provide easy-to-use mesh VPN, focusing on zero-configuration connectivity.

# SEE ALSO

[wg](/man/wg)(8), [wireguard](/man/wireguard)(8), [ssh](/man/ssh)(1), [openvpn](/man/openvpn)(8)
