# TAGLINE

Virtual LAN hub and client over UDP

# TLDR

**Generate** a shared network key

```openssl rand -base64 24 > tund.key```

**Start** the TunD server (hub)

```sudo tund-cli server --key-file tund.key```

**Connect** a client to the server

```sudo tund-cli client -s [server_ip] --key-stdin```

**Connect** with a display name and key file

```sudo tund-cli client -s [server_ip] -n [name] --key-file tund.key```

**Run the server** without the terminal UI

```sudo tund-cli server --key-file tund.key --no-tui```

**Ping** the hub's virtual address after connecting

```ping 10.9.0.1```

# SYNOPSIS

**tund-cli** **server**|_client_ [_options_]

# DESCRIPTION

**tund-cli** is the command-line core of **TunD**, a lightweight self-hosted virtual LAN tool. One host runs **server** mode as a UDP hub; other machines run **client** mode and receive automatic addresses in the fixed virtual subnet **10.9.0.0/24** (hub at **10.9.0.1**). Traffic is tunneled over UDP through the server so peers appear on one IPv4 LAN—useful for LAN-party style multiplayer, unreliable physical LANs, and direct-IP games.

The C core creates a TUN device, configures routing, and encrypts datagrams in transit between each endpoint and the server (shared-key crypto; the server decrypts to route). Clients only need outbound UDP to a reachable hub (default port **9909**). An optional terminal UI shows peers; **--no-tui** disables it. A separate Flutter desktop GUI can launch the same binary.

TunD is narrower than WireGuard, Tailscale, or ZeroTier: fixed virtual IPv4 subnet, peer assignment, and broadcast support for compatible games—not a general secure overlay VPN.

# PARAMETERS

**server**
> Run as the virtual LAN hub. Requires a shared key via **--key-file**, **--key-stdin**, or **-k**/**--key**.

**client**
> Join a hub. Requires **-s**/**--server** _host_ and the same shared key as the server.

**-s**, **--server** _ip_
> Server IP or hostname (**client** only).

**-p**, **--port** _port_
> UDP port (default **9909**).

**-n**, **--name** _name_
> Client display name (default: hostname).

**-k**, **--key** _key_
> Shared network key on the command line (visible in process lists; prefer file or stdin).

**--key-file** _path_
> Read the shared key from a file.

**--key-stdin**
> Read the key from the first stdin line or an interactive prompt.

**-t**, **--no-tui**
> Disable the live peer dashboard TUI.

**-v**, **--verbose**
> Debug logging.

**--json-events**
> Emit machine-readable peer events on stdout (**server**).

# CAVEATS

Root or administrator privileges are required for TUN setup. Use a long random shared key; traffic is encrypted to the hub but **not** end-to-end against the server operator. Not an Ethernet bridge: no Layer-2 discovery, IPv6, or multicast discovery—games that need those may require manual host IPs or may not work. Avoid if **10.9.0.0/24** is already routed elsewhere. For general confidential networking, prefer WireGuard/Tailscale/ZeroTier.

# SEE ALSO

[wireguard](/man/wireguard)(8), [tailscale](/man/tailscale)(1), [zerotier-cli](/man/zerotier-cli)(1), [ip](/man/ip)(8), [ping](/man/ping)(8)

# RESOURCES

```[Source code](https://github.com/danterolle/tund)```

```[Homepage](https://danterolle.github.io/tund/)```

```[Documentation](https://github.com/danterolle/tund/blob/main/docs/USAGE.md)```

<!-- verified: 2026-07-22 -->
