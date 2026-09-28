# TAGLINE

describes the properties available for NetworkManager connections

# TLDR

**View connection settings**

```nmcli connection show [connection_name]```

Open the **interactive editor** (type **describe ipv4.method** there for property help)

```nmcli connection edit [conn]```

**Set IPv4 address**

```nmcli connection modify [conn] ipv4.addresses "[192.168.1.10/24]"```

**Set DNS servers**

```nmcli connection modify [conn] ipv4.dns "[8.8.8.8 8.8.4.4]"```

**Set gateway**

```nmcli connection modify [conn] ipv4.gateway "[192.168.1.1]"```

**Set to static IP**

```nmcli connection modify [conn] ipv4.method manual```

**Ignore DHCP-provided DNS** and use only your own

```nmcli connection modify [conn] ipv4.ignore-auto-dns yes```

**Append** a value to a list property

```nmcli connection modify [conn] +ipv4.dns "[1.1.1.1]"```

**Reload** after editing keyfiles by hand

```nmcli connection reload```

# SYNOPSIS

**man 5 nm-settings-nmcli** | **nm-settings-dbus** | **nm-settings-keyfile**

# PARAMETERS

**connection.id** (alias con-name)
> Connection name.

**connection.type**
> Connection type (ethernet, wifi, vpn, bridge, bond, wireguard, ...).

**connection.interface-name** (alias ifname)
> Restrict the profile to one interface.

**connection.autoconnect** (alias autoconnect)
> Activate automatically when possible.

**connection.autoconnect-priority**
> Higher values are preferred when several profiles can autoconnect.

**ipv4.method**
> auto, manual, link-local, shared, disabled (IPv6 also: ignore, dhcp).

**ipv4.addresses** (alias ip4)
> Static IP addresses in address/prefix form.

**ipv4.gateway** (alias gw4)
> Default gateway.

**ipv4.dns**, **ipv4.dns-search**
> DNS servers and search domains.

**ipv4.never-default**
> Never use this connection for the default route.

**802-11-wireless.ssid** (alias ssid, or wifi.ssid)
> WiFi network name.

**802-11-wireless-security.psk** (or wifi-sec.psk)
> WPA pre-shared key.

# DESCRIPTION

**nm-settings** describes the properties available for NetworkManager connection profiles. These settings are configured via nmcli, nm-connection-editor, or directly in keyfiles.

Settings are organized by category (connection, ipv4, ipv6, 802-11-wireless, vpn, wireguard, etc.) and referenced as **setting.property**. Not every setting applies to every connection type.

Since NetworkManager 1.26 this reference is split into three pages: **nm-settings-nmcli**(5) (property names and value formats as nmcli expects them), **nm-settings-dbus**(5) (the D-Bus API format, formerly nm-settings(5)) and **nm-settings-keyfile**(5) (the on-disk keyfile format).

# COMMON SETTINGS

```
connection.autoconnect=yes
ipv4.method=auto|manual
ipv4.addresses=192.168.1.10/24
ipv4.gateway=192.168.1.1
ipv4.dns=8.8.8.8
802-11-wireless.ssid=MyNetwork
```

# KEYFILE FORMAT

```ini
# /etc/NetworkManager/system-connections/MyConn.nmconnection
[connection]
id=MyConn
type=ethernet

[ipv4]
method=manual
address1=192.168.1.10/24
gateway=192.168.1.1
dns=8.8.8.8;
```

# CAVEATS

Setting names vary by connection type. Some settings require specific types. Keyfile format differs from D-Bus and nmcli names: list properties such as addresses and routes become **address1**, **address2**, **route1**, ...

Keyfiles must be owned by root and not readable by other users (mode 600), or NetworkManager ignores them. Hand edits take effect only after **nmcli connection reload** (or load) and reactivating the connection.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-connection](/man/nmcli-connection)(1), [nm-connection-editor](/man/nm-connection-editor)(1), [nmtui](/man/nmtui)(1), [NetworkManager](/man/NetworkManager)(8), [NetworkManager.conf](/man/NetworkManager.conf)(5)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/NetworkManager/NetworkManager)```

```[Homepage](https://networkmanager.dev/)```

```[Documentation](https://networkmanager.dev/docs/api/latest/nm-settings-nmcli.html)```

<!-- verified: 2026-09-29 -->
