# TAGLINE

modern Linux wireless configuration tool, replacing iwconfig

# TLDR

**Scan** for networks

```iw dev wlan0 scan```

**Connect** to open network

```iw dev wlan0 connect SSID```

**Disconnect**

```iw dev wlan0 disconnect```

Show **connection** info

```iw dev wlan0 link```

List **interfaces**

```iw dev```

List **capabilities**

```iw phy```

Show **regulatory** domain

```iw reg get```

# SYNOPSIS

**iw** [_OPTIONS_] _object_ _command_

# DESCRIPTION

**iw** is the modern Linux wireless configuration tool, replacing iwconfig. It interfaces with cfg80211/nl80211 to configure wireless network interfaces, scan for networks, and manage connections.

# PARAMETERS

**dev** _interface_
> Operate on specific interface

**phy** _phyN_
> Operate on specific physical device

**scan**
> Scan for wireless networks

**connect** _SSID_
> Connect to an open network

**disconnect**
> Disconnect from current network

**link**
> Show current connection status

**reg get**
> Show regulatory domain information

**set** _parameter_ _value_
> Set interface parameters

# CAVEATS

Only handles connection to open networks; for WPA/WPA2 use wpa_supplicant. Some operations require root privileges. Replaces the deprecated iwconfig tool.

# HISTORY

**iw** is the successor to **iwconfig**, providing a modern interface to the Linux cfg80211 wireless subsystem.

# SEE ALSO

[iwconfig](/man/iwconfig)(8), [wpa_supplicant](/man/wpa_supplicant)(8), [nmcli](/man/nmcli)(1)
