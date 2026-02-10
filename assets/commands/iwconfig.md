# TAGLINE

configures and displays parameters of wireless network interfaces

# TLDR

Show **all** interfaces

```iwconfig```

Show **specific** interface

```iwconfig wlan0```

Set **ESSID**

```iwconfig wlan0 essid network_name```

Set **mode**

```iwconfig wlan0 mode Managed```

# SYNOPSIS

**iwconfig** [_interface_] [_parameter_ _value_...]

# DESCRIPTION

**iwconfig** configures and displays parameters of wireless network interfaces. It is the wireless equivalent of ifconfig, providing access to wireless-specific settings like ESSID, mode, channel, and encryption.

# PARAMETERS

**essid** _name_
> Set the network name (SSID)

**mode** _mode_
> Set operating mode (Ad-Hoc, Managed, Master, Monitor, Auto)

**freq** _frequency_
> Set operating frequency

**channel** _channel_
> Set operating channel

**ap** _address_
> Force association with specific access point

**rate** _rate_
> Set bit rate

**txpower** _power_
> Set transmit power

**sens** _threshold_
> Set sensitivity threshold

**key** _key_
> Set WEP encryption key (deprecated)

# CAVEATS

iwconfig is deprecated in favor of iw. WEP encryption is insecure and should not be used. For WPA/WPA2, use wpa_supplicant instead.

# HISTORY

**iwconfig** was part of the **wireless-tools** package, now largely superseded by iw and wpa_supplicant.

# SEE ALSO

[iw](/man/iw)(8), [iwlist](/man/iwlist)(8), [wpa_supplicant](/man/wpa_supplicant)(8)
