# TLDR

**Add** new client device

```sudo pivpn add```

**List** all clients

```sudo pivpn list```

Show **connected** clients and statistics

```sudo pivpn clients```

**Revoke** a client

```sudo pivpn revoke```

**Uninstall** PiVPN

```sudo pivpn uninstall```

# SYNOPSIS

**pivpn** [**add**|**list**|**clients**|**revoke**|**uninstall**|**-d**|**-u**]

# COMMANDS

**add**
> Create new client configuration

**list**
> List all client configurations

**clients**
> Show connected clients with statistics

**revoke**
> Revoke client certificate

**uninstall**
> Remove PiVPN installation

**-d, debug**
> Generate debug output for troubleshooting

**-u, update**
> Check for PiVPN updates

# DESCRIPTION

**pivpn** simplifies OpenVPN or WireGuard server management on Linux, particularly Raspberry Pi. It handles certificate generation, client configuration, and connection management through an interactive menu system.

Originally designed for Raspberry Pi, it works on any Debian-based system. It automates the complex setup of VPN servers with security-hardened configurations.

# CAVEATS

Requires curl for installation script. Initial setup requires internet access. Port forwarding needed on router for external access. WireGuard mode requires kernel 5.6+ or DKMS module.

# HISTORY

**PiVPN** was created to make VPN server setup accessible to home users, particularly those running Raspberry Pi. It evolved to support both OpenVPN and WireGuard protocols, providing security-focused default configurations.

# SEE ALSO

[openvpn](/man/openvpn)(8), [wg](/man/wg)(8), [wg-quick](/man/wg-quick)(8)
