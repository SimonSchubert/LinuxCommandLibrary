# TLDR

**View connection settings**

```nmcli connection show [connection_name]```

**Set IPv4 address**

```nmcli connection modify [conn] ipv4.addresses "[192.168.1.10/24]"```

**Set DNS servers**

```nmcli connection modify [conn] ipv4.dns "[8.8.8.8 8.8.4.4]"```

**Set gateway**

```nmcli connection modify [conn] ipv4.gateway "[192.168.1.1]"```

**Set to static IP**

```nmcli connection modify [conn] ipv4.method manual```

# SYNOPSIS

**nm-settings** - NetworkManager connection settings reference

# PARAMETERS

**connection.id**
> Connection name.

**connection.type**
> Connection type.

**ipv4.method**
> auto, manual, disabled.

**ipv4.addresses**
> IP addresses.

**ipv4.dns**
> DNS servers.

**802-11-wireless.ssid**
> WiFi network name.

# DESCRIPTION

**nm-settings** describes the properties available for NetworkManager connections. These settings are configured via nmcli, nm-connection-editor, or directly in keyfiles.

Settings are organized by category (connection, ipv4, ipv6, wifi, etc.).

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
addresses=192.168.1.10/24
gateway=192.168.1.1
dns=8.8.8.8;
```

# CAVEATS

Setting names vary by connection type. Some settings require specific types. Keyfile format differs from D-Bus names.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nm-connection-editor](/man/nm-connection-editor)(1), [NetworkManager.conf](/man/NetworkManager.conf)(5)
