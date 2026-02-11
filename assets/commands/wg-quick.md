# TAGLINE

Quick WireGuard VPN tunnel setup

# TLDR

**Set up** a VPN tunnel

```wg-quick up [interface_name]```

**Delete** a VPN tunnel

```wg-quick down [interface_name]```

# SYNOPSIS

**wg-quick** [**up**|**down**|**save**|**strip**] _interface_

# PARAMETERS

**up _interface_**
> Bring up a WireGuard interface using config file

**down _interface_**
> Tear down a WireGuard interface

**save _interface_**
> Save current configuration to config file

**strip _interface_**
> Output configuration without wg-quick-specific options

# DESCRIPTION

**wg-quick** is a convenience wrapper for setting up WireGuard VPN tunnels quickly. It reads configuration files from **/etc/wireguard/** and handles interface creation, routing, and DNS configuration automatically.

Configuration files are named **[interface].conf** (e.g., **/etc/wireguard/wg0.conf**) and contain both WireGuard settings and wg-quick-specific options like Address, DNS, and routing rules.

# CAVEATS

Requires root privileges. Configuration files must exist in **/etc/wireguard/**. The script modifies routing tables and may affect network connectivity. DNS changes require resolvconf or systemd-resolved support.

# SEE ALSO

[wg](/man/wg)(8), [ip](/man/ip)(8)
