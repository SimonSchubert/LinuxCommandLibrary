# TLDR

**Scan** for networks

```iwlist wlan0 scan```

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

**scan**
> List available networks in range

**frequency**
> Show available frequencies/channels

**rate**
> Show supported bit rates

**auth**
> Display authentication parameters

**wpakeys**
> Show WPA encryption keys

**keys**
> Show WEP encryption keys and sizes

**power**
> Display power management settings

**txpower**
> Show transmit power settings

**genie**
> Show WPA information elements

# CAVEATS

iwlist is deprecated in favor of iw. Scanning may briefly disrupt connectivity. Some information requires root privileges to display.

# HISTORY

**iwlist** was part of the **wireless-tools** package, providing wireless network information on Linux.

# SEE ALSO

[iw](/man/iw)(8), [iwconfig](/man/iwconfig)(8), [nmcli](/man/nmcli)(1)
