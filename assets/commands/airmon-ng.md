# TAGLINE

Enable and manage wireless monitor mode

# TLDR

**List** wireless interfaces

```sudo airmon-ng```

**Enable** monitor mode

```sudo airmon-ng start [wlan0]```

Enable on **specific channel**

```sudo airmon-ng start [wlan0] [6]```

**Disable** monitor mode

```sudo airmon-ng stop [wlan0mon]```

**Kill** interfering processes

```sudo airmon-ng check kill```

# SYNOPSIS

**airmon-ng** [_start_|_stop_|_check_] [_interface_] [_channel_]

# DESCRIPTION

**airmon-ng** manages wireless interfaces for monitor mode operation. Monitor mode allows capturing all wireless packets in range, not just those addressed to your device, which is required for wireless security auditing.

The tool can identify and kill processes that might interfere with monitor mode operation, such as NetworkManager and wpa_supplicant.

# PARAMETERS

**start** _interface_
> Enable monitor mode on interface

**stop** _interface_
> Disable monitor mode

**check**
> List processes that may interfere

**check kill**
> Kill interfering processes

**channel**
> Lock interface to specific channel

# OUTPUT

Without arguments, **airmon-ng** lists the PHY name, interface name, driver in use, and chipset for each detected wireless device.

# CAVEATS

Enabling monitor mode disconnects from any connected network. Some drivers don't support monitor mode. Killing interfering processes may disable normal WiFi connectivity until restarted.

# HISTORY

**airmon-ng** is part of the aircrack-ng suite, evolved from earlier airmon scripts. The "-ng" version was released in **2006** with improved driver support and process management.

# INSTALL

```apt: sudo apt install aircrack-ng```

```dnf: sudo dnf install aircrack-ng```

```pacman: sudo pacman -S aircrack-ng```

```apk: sudo apk add aircrack-ng```

```zypper: sudo zypper install aircrack-ng```

```brew: brew install aircrack-ng```

```nix: nix profile install nixpkgs#aircrack-ng```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [aireplay-ng](/man/aireplay-ng)(1), [iw](/man/iw)(8), [iwconfig](/man/iwconfig)(8)

# RESOURCES

```[Source code](https://github.com/aircrack-ng/aircrack-ng)```

```[Homepage](https://www.aircrack-ng.org/)```

```[Documentation](https://www.aircrack-ng.org/documentation.html)```

<!-- verified: 2026-06-11 -->
