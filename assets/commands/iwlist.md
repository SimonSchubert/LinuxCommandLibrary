# TAGLINE

retrieve detailed wireless information from a network interface

# TLDR

**Scan** for networks

```iwlist wlan0 scanning```

List **frequencies**

```iwlist wlan0 frequency```

List **bit rates**

```iwlist wlan0 rate```

Show **WPA** authentication

```iwlist wlan0 auth```

Show **WPA keys**

```iwlist wlan0 wpakeys```

Show **encryption** keys

```iwlist wlan0 keys```

Show **power** management

```iwlist wlan0 power```

# SYNOPSIS

**iwlist** _interface_ _action_

# DESCRIPTION

**iwlist** retrieves detailed information from a wireless network interface including available networks, supported frequencies, bit rates, and encryption capabilities.

# PARAMETERS

**scan**[**ning**]
> List access points and ad-hoc cells in range with detailed info

**frequency**
> Show available frequencies and channels

**rate**
> Show supported bit rates

**keys**
> Show WEP encryption keys and key sizes

**auth**
> Display WPA authentication parameters

**wpakeys**
> Show WPA encryption keys

**genie**
> Show Generic Information Elements (used for WPA)

**power**
> Display power management settings

**txpower**
> Show transmit power settings

**retry**
> Show transmit retry limits and retry lifetime

**event**
> List wireless events supported by the device

**modulation**
> List supported and enabled modulations

# CAVEATS

iwlist is deprecated in favor of iw. Scanning may briefly disrupt connectivity. Some information requires root privileges to display.

# HISTORY

**iwlist** was part of the **wireless-tools** package, providing wireless network information on Linux.

# SEE ALSO

[iw](/man/iw)(8), [iwconfig](/man/iwconfig)(8), [nmcli](/man/nmcli)(1)
