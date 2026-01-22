# TLDR

Create an **open network** without passphrase

```create_ap [wlan0] [eth0] [access_point_ssid]```

Create AP with **WPA/WPA2 passphrase**

```create_ap [wlan0] [eth0] [access_point_ssid] [passphrase]```

Create AP **without Internet sharing**

```create_ap -n [wlan0] [access_point_ssid] [passphrase]```

Create **bridged network** with Internet sharing

```create_ap -m bridge [wlan0] [eth0] [access_point_ssid] [passphrase]```

Use **pre-configured bridge** interface

```create_ap -m bridge [wlan0] [br0] [access_point_ssid] [passphrase]```

Share Internet from **same WiFi interface**

```create_ap [wlan0] [wlan0] [access_point_ssid] [passphrase]```

Use **different WiFi driver**

```create_ap --driver [wifi_adapter] [wlan0] [eth0] [access_point_ssid] [passphrase]```

# SYNOPSIS

**create_ap** [_options_] _wifi_interface_ [_internet_interface_] [_ssid_] [_passphrase_]

# DESCRIPTION

**create_ap** creates a WiFi access point using hostapd. It handles the configuration of hostapd, dnsmasq, iptables, and network interfaces automatically.

Supports NAT and bridge modes, WPA/WPA2 encryption, and various WiFi drivers.

# PARAMETERS

**-n**
> Don't share Internet (isolated AP)

**-m** _mode_
> Mode: nat (default), bridge, none

**--driver** _driver_
> WiFi driver (nl80211, rtl871xdrv, etc.)

**-c** _channel_
> WiFi channel

**--hidden**
> Hide SSID

**--ieee80211n**
> Enable 802.11n

**--ieee80211ac**
> Enable 802.11ac

# CAVEATS

Requires hostapd and dnsmasq. WiFi adapter must support AP mode. Some adapters may not work due to driver limitations. Requires root privileges.

# SEE ALSO

[hostapd](/man/hostapd)(8), [dnsmasq](/man/dnsmasq)(8), [iw](/man/iw)(8)
