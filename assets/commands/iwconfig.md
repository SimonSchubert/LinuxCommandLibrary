# TAGLINE

Configure and display wireless network interface parameters

# TLDR

**Show all wireless interfaces and their settings**

```iwconfig```

**Show a specific wireless interface**

```iwconfig [wlan0]```

**Set the network name (ESSID)**

```iwconfig [wlan0] essid [network_name]```

**Set the operating mode**

```iwconfig [wlan0] mode [Managed]```

**Set the channel**

```iwconfig [wlan0] channel [6]```

**Set the transmit power in dBm**

```iwconfig [wlan0] txpower [20]```

**Set the bit rate**

```iwconfig [wlan0] rate [54M]```

**Enable monitor mode on an interface**

```iwconfig [wlan0] mode Monitor```

# SYNOPSIS

**iwconfig** [_interface_] [_parameter_ _value_...]

# PARAMETERS

**essid** _name_
> Set the network name (SSID). Use **essid off** or **essid any** to disable ESSID checking.

**mode** _mode_
> Set operating mode: Ad-Hoc, Managed, Master, Repeater, Secondary, Monitor, or Auto.

**freq** _frequency_
> Set operating frequency (e.g. 2.46G for 2.46 GHz). Append k, M, or G suffix.

**channel** _channel_
> Set operating channel number. Use **iwlist** to see available channels.

**ap** _address_
> Force association with a specific access point by MAC address. Use **ap off** to re-enable auto selection.

**rate** _rate_
> Set the bit rate (e.g. 11M, 54M). Use **rate auto** for automatic selection.

**txpower** _power_
> Set transmit power in dBm, or use mW suffix for milliwatts. Use **txpower off** to disable the radio.

**sens** _threshold_
> Set sensitivity threshold for roaming decisions.

**retry** _limit_
> Set maximum MAC retransmission retry limit.

**rts** _threshold_
> Set the RTS/CTS handshake threshold in bytes. Use **rts off** to disable.

**frag** _threshold_
> Set maximum fragment size in bytes. Use **frag off** to disable.

**power** _mode_
> Set power management mode. Use **power off** to disable power management.

**key** _key_
> Set WEP encryption key (deprecated and insecure).

# DESCRIPTION

**iwconfig** is similar to **ifconfig**, but is dedicated to wireless network interfaces. It is used to set parameters specific to wireless operation such as ESSID, frequency, mode, encryption key, and power management. It can also display those parameters along with wireless statistics from /proc/net/wireless.

When called without arguments, iwconfig displays the wireless parameters for all interfaces. When called with an interface name only, it displays the settings for that interface.

# CAVEATS

**iwconfig** is deprecated in favor of **iw**. WEP encryption configured via **key** is insecure and should not be used. For WPA/WPA2/WPA3, use **wpa_supplicant** instead. Only the superuser can change wireless parameters.

# HISTORY

**iwconfig** was part of the **wireless-tools** package created by Jean Tourrilhes at Hewlett-Packard. It has been largely superseded by **iw** and **wpa_supplicant** for modern wireless configuration.

# SEE ALSO

[iw](/man/iw)(8), [iwlist](/man/iwlist)(8), [ifconfig](/man/ifconfig)(8), [wpa_supplicant](/man/wpa_supplicant)(8)
