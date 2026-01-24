# TLDR

**Start with config**

```wpa_supplicant -i [wlan0] -c [/etc/wpa_supplicant.conf]```

**Run in foreground**

```wpa_supplicant -i [wlan0] -c [config.conf] -d```

**Background daemon**

```wpa_supplicant -i [wlan0] -c [config.conf] -B```

**Use specific driver**

```wpa_supplicant -i [wlan0] -c [config.conf] -D [nl80211]```

# SYNOPSIS

**wpa_supplicant** [_-i interface_] [_-c config_] [_-B_] [_-D driver_]

# PARAMETERS

**-i** _IFACE_
> Interface name.

**-c** _FILE_
> Config file.

**-B**
> Background mode.

**-D** _DRIVER_
> Driver backend.

**-d**
> Debug output.

**-P** _FILE_
> PID file.

# DESCRIPTION

**wpa_supplicant** handles WiFi authentication. It manages WPA/WPA2.

Wireless security. WPA/WPA2/WPA3.

Enterprise support. 802.1X.

Multiple networks. Network selection.

Low-level tool. Usually via NetworkManager.

# CAVEATS

Root required. Config file syntax. Usually managed by NM.

# HISTORY

**wpa_supplicant** was created by **Jouni Malinen** for wireless network authentication on Linux.

# SEE ALSO

[wpa_cli](/man/wpa_cli)(1), [iwconfig](/man/iwconfig)(8), [NetworkManager](/man/NetworkManager)(8)
