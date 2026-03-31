# TAGLINE

user-space daemon for wireless access points and authentication servers

# TLDR

**Start access point**

```sudo hostapd [/etc/hostapd/hostapd.conf]```

**Start in foreground** with debug

```sudo hostapd -d [hostapd.conf]```

**Start in background**

```sudo hostapd -B [hostapd.conf]```

**Start with debug and timestamps**

```sudo hostapd -dt [hostapd.conf]```

# SYNOPSIS

**hostapd** [_options_] _config_file_

# DESCRIPTION

**hostapd** is a user-space daemon for wireless access points and authentication servers. It implements IEEE 802.11 access point management, WPA/WPA2/WPA3 authentication, and IEEE 802.1X authenticator.

The tool transforms a wireless interface into an access point, handling client connections, encryption, and authentication protocols.

# PARAMETERS

**-B**
> Run in background (daemon).

**-d**
> Debug output.

**-dd**
> More verbose debug.

**-t**
> Include timestamps in debug output.

**-v**
> Display version information and exit.

**-K**
> Include key data in debug output.

**-g** _socket_
> Global control interface path.

**-P** _pidfile_
> PID file path.

**-f** _logfile_
> Redirect output to log file.

**-e** _entropy_file_
> File for storing entropy (to speed up restart).

# CONFIG OPTIONS

**interface**: Wireless interface (e.g. wlan0)
**driver**: Driver interface (nl80211, hostap, etc.)
**ssid**: Network name
**hw_mode**: Band (a = 5GHz, b = 2.4GHz 11Mbps, g = 2.4GHz 54Mbps)
**channel**: Channel number (0 = ACS if supported)
**ieee80211n**: Enable 802.11n (1 = yes)
**ieee80211ac**: Enable 802.11ac (1 = yes)
**wpa**: WPA mode (1 = WPA, 2 = WPA2, 3 = both)
**wpa_passphrase**: Password (8-63 characters)
**wpa_key_mgmt**: Key management (WPA-PSK, SAE for WPA3)

# CAVEATS

Requires AP-capable wireless card. Configuration complex. Driver support varies. May conflict with NetworkManager.

# HISTORY

**hostapd** was developed by **Jouni Malinen** as part of the Linux wireless stack. It became the standard way to create software access points on Linux, supporting evolving wireless security standards.

# SEE ALSO

[iw](/man/iw)(1), [iwconfig](/man/iwconfig)(1), [wpa_supplicant](/man/wpa_supplicant)(1), [dnsmasq](/man/dnsmasq)(1)
