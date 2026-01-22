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

Without arguments, airmon-ng lists:
- Interface name
- Chipset information
- Driver in use
- Current mode (managed/monitor)

# CAVEATS

Enabling monitor mode disconnects from any connected network. Some drivers don't support monitor mode. Killing interfering processes may disable normal WiFi connectivity until restarted.

# HISTORY

**airmon-ng** is part of the aircrack-ng suite, evolved from earlier airmon scripts. The "-ng" version was released in **2006** with improved driver support and process management.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [iwconfig](/man/iwconfig)(8)
