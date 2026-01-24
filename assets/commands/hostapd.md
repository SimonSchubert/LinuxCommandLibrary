# TLDR

**Start access point**

```sudo hostapd [/etc/hostapd/hostapd.conf]```

**Start in foreground** with debug

```sudo hostapd -d [hostapd.conf]```

**Start in background**

```sudo hostapd -B [hostapd.conf]```

**Test configuration**

```hostapd -t [hostapd.conf]```

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
> Include timestamps in debug.

**-K**
> Include key data in debug.

**-g** _socket_
> Global control interface.

**-P** _pidfile_
> PID file.

**-f** _logfile_
> Log file.

# CONFIG OPTIONS

**interface**: Wireless interface
**ssid**: Network name
**hw_mode**: Band (a/b/g)
**channel**: Channel number
**wpa**: WPA mode (1/2/3)
**wpa_passphrase**: Password
**wpa_key_mgmt**: Key management

# CAVEATS

Requires AP-capable wireless card. Configuration complex. Driver support varies. May conflict with NetworkManager.

# HISTORY

**hostapd** was developed by **Jouni Malinen** as part of the Linux wireless stack. It became the standard way to create software access points on Linux, supporting evolving wireless security standards.

# SEE ALSO

[wpa_supplicant](/man/wpa_supplicant)(1), [iw](/man/iw)(1), [iwconfig](/man/iwconfig)(1), [dnsmasq](/man/dnsmasq)(1)
