# TAGLINE

Simple OpenVPN and WireGuard server manager

# TLDR

**Add** new client device

```pivpn add```

Add a client **non-interactively** by name

```pivpn add -n [name]```

Show a client's **QR code** for the mobile app (WireGuard)

```pivpn qrcode [name]```

**List** all clients

```pivpn list```

Show **connected** clients and statistics

```pivpn clients```

**Remove** a client (WireGuard)

```pivpn remove [name]```

**Revoke** a client (OpenVPN)

```pivpn revoke```

Run a command for one protocol when **both** are installed

```pivpn [wg|ovpn] [command]```

**Uninstall** PiVPN

```pivpn uninstall```

# SYNOPSIS

**pivpn** [**wg**|**ovpn**] _command_ [_options_]

# COMMANDS

**add, -a**
> Create new client configuration. **-n** sets the client name; run without options for interactive mode.

**list, -l**
> List all client configurations

**clients, -c**
> Show connected clients with statistics

**remove, -r** (WireGuard), **revoke, -r** (OpenVPN)
> Remove a client or revoke its certificate

**qrcode, -qr** (WireGuard)
> Show a client's QR code for use with the mobile app.

**off, -off** (WireGuard)
> Disable a client without removing it.

**on, -on** (WireGuard)
> Re-enable a disabled client.

**debug, -d**
> Generate debug output for troubleshooting.

**update, -up**
> Update the PiVPN scripts.

**backup, -bk**
> Create a backup of server/client configurations.

**uninstall, -u**
> Remove PiVPN installation

**help, -h**
> Show the available commands.

# DESCRIPTION

**pivpn** simplifies OpenVPN or WireGuard server management on Linux, particularly Raspberry Pi. It handles certificate generation, client configuration, and connection management through an interactive menu system.

Originally designed for Raspberry Pi, it should also work on most Debian and Ubuntu based distributions. The command elevates itself with sudo when needed. When both protocols are installed, prefix the command with **wg** or **ovpn**. It automates the complex setup of VPN servers with security-hardened configurations.

# CONFIGURATION

**/etc/pivpn/**
> PiVPN configuration directory with setup variables and protocol settings.

**/etc/openvpn/** or **/etc/wireguard/**
> VPN server configuration files managed by PiVPN depending on chosen protocol.

**/home/\<user\>/ovpns/** or **/home/\<user\>/configs/**
> Generated client configuration files for distribution.

# CAVEATS

Maintained upstream on a best-effort basis. Requires curl for installation script. Initial setup requires internet access. Port forwarding needed on router for external access. WireGuard mode requires kernel 5.6+ or DKMS module.

# HISTORY

**PiVPN** was created to make VPN server setup accessible to home users, particularly those running Raspberry Pi. It evolved to support both OpenVPN and WireGuard protocols, providing security-focused default configurations.

# SEE ALSO

[openvpn](/man/openvpn)(8), [wg](/man/wg)(8), [wg-quick](/man/wg-quick)(8)

# RESOURCES

```[Source code](https://github.com/pivpn/pivpn)```

```[Homepage](https://pivpn.io)```

```[Documentation](https://docs.pivpn.io)```

<!-- verified: 2026-11-09 -->
