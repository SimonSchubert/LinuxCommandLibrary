# TAGLINE

TUI for managing WireGuard configurations

# TLDR

**Start the setup wizard for a new interface**

```wg-cmd new```

**Manage an existing WireGuard interface**

```wg-cmd [wg0]```

**Generate configuration without UI**

```wg-cmd [wg0] make```

# SYNOPSIS

**wg-cmd** [_command_] [_interface_]

# DESCRIPTION

**wg-cmd** (WG Commander) provides a text-based user interface for managing WireGuard configuration files. It includes an initial setup wizard, peer management with QR code viewing, and automatic configuration of sysctl, systemd, and NAT rules. Requires root permissions and assumes Linux with iptables and systemd.

# HISTORY

**wg-cmd** was created by **Andrian Budantsov** (AndrianBdn) and is written in **Go**.

# SEE ALSO

[wg](/man/wg)(1), [vortix](/man/vortix)(1)
