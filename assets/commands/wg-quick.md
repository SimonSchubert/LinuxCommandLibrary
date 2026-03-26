# TAGLINE

Quick WireGuard VPN tunnel setup

# TLDR

**Bring up a WireGuard tunnel**

```sudo wg-quick up [wg0]```

**Tear down a WireGuard tunnel**

```sudo wg-quick down [wg0]```

**Bring up a tunnel from a specific config file**

```sudo wg-quick up [/etc/wireguard/wg0.conf]```

**Save current interface state to config**

```sudo wg-quick save [wg0]```

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

# HISTORY

**wg-quick** is part of the WireGuard tools, created by **Jason A. Donenfeld**. WireGuard was initially developed as a Linux kernel module and merged into the mainline Linux kernel in version **5.6** (March 2020). The wg-quick script simplifies the setup that would otherwise require multiple **wg** and **ip** commands.

# SEE ALSO

[wg](/man/wg)(8), [ip](/man/ip)(8)
