# TAGLINE

TUI for WireGuard and OpenVPN with telemetry

# TLDR

**Launch the VPN management TUI**

```sudo vortix```

**Import a VPN configuration**

```vortix import [tunnel.conf]```

**Display version and config info**

```vortix info```

# SYNOPSIS

**vortix** [_command_]

# DESCRIPTION

**vortix** is a terminal UI for managing WireGuard and OpenVPN connections with real-time telemetry and leak guarding. It auto-detects VPN configuration files and provides live metrics including throughput, latency, jitter, packet loss, and geolocation data. Requires root privileges for VPN operations.

# HISTORY

**vortix** was created by **Harry-kp** and is written in **Rust**.

# SEE ALSO

[wg](/man/wg)(1), [openvpn](/man/openvpn)(1), [wg-cmd](/man/wg-cmd)(1)
