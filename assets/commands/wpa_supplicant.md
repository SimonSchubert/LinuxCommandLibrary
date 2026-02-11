# TAGLINE

WPA/WPA2 wireless network authentication

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

**wpa_supplicant** is the standard wireless network authentication daemon for Linux systems. It implements WPA, WPA2, and WPA3 security protocols, handling the key negotiation and authentication process required to connect to protected wireless networks.

The daemon supports both personal (PSK) and enterprise (802.1X/EAP) authentication methods, and can manage multiple configured networks with automatic selection based on signal strength and priority. Configuration is defined in a config file specifying network SSIDs, security settings, and credentials.

On most desktop Linux systems, wpa_supplicant runs as a backend service managed by NetworkManager or systemd-networkd rather than being invoked directly by users.

# CAVEATS

Root required. Config file syntax. Usually managed by NM.

# HISTORY

**wpa_supplicant** was created by **Jouni Malinen** for wireless network authentication on Linux.

# SEE ALSO

[wpa_cli](/man/wpa_cli)(1), [iwconfig](/man/iwconfig)(8), [NetworkManager](/man/NetworkManager)(8)
