# TAGLINE

Cloudflare WARP VPN client CLI

# TLDR

**Connect**

```warp-cli connect```

**Disconnect**

```warp-cli disconnect```

**Check status**

```warp-cli status```

**Register**

```warp-cli register```

**Set mode**

```warp-cli set-mode warp```

**Show settings**

```warp-cli settings```

# SYNOPSIS

**warp-cli** _command_ [_options_]

# PARAMETERS

**connect**
> Connect to WARP.

**disconnect**
> Disconnect.

**status**
> Show status.

**register**
> Register device.

**set-mode** _MODE_
> Set connection mode.

**settings**
> Show settings.

# DESCRIPTION

**warp-cli** is the command-line interface for managing Cloudflare WARP, a VPN and secure DNS service that encrypts traffic between the device and Cloudflare's network. It provides commands to connect, disconnect, check status, and configure the WARP client.

The client supports multiple connection modes including full WARP VPN mode that routes all traffic through Cloudflare's network, and DNS-over-HTTPS mode that only encrypts DNS queries for private name resolution. A WARP+ premium tier offers optimized routing through Cloudflare's Argo network for improved performance.

Device registration is required before first use, and the warp-svc daemon must be running for the CLI to function. The tool is available on Linux, macOS, and Windows.

# CAVEATS

Cloudflare service. Registration required. Daemon must run.

# HISTORY

**warp-cli** is the CLI for **Cloudflare WARP**, a VPN and DNS service by Cloudflare.

# SEE ALSO

[wireguard](/man/wireguard)(1), [cloudflared](/man/cloudflared)(1)
