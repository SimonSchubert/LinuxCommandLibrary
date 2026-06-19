# TAGLINE

Automated WiFi security auditing tool

# TLDR

**Auto-crack all WEP networks and log WPA handshakes**

```besside-ng [wlan0mon]```

**Target specific access point**

```besside-ng -b [AA:BB:CC:DD:EE:FF] [wlan0mon]```

**Lock to specific channel**

```besside-ng -c [6] [wlan0mon]```

**WPA handshakes only**

```besside-ng -W [wlan0mon]```

**Upload captured handshakes to a cracking server**

```besside-ng -s [wpa.darkircop.org] [wlan0mon]```

**Set flood rate**

```besside-ng -p [300] [wlan0mon]```

# SYNOPSIS

**besside-ng** [_options_] _interface_

# DESCRIPTION

**besside-ng** is an automated WiFi security auditing tool from the Aircrack-ng suite. It automatically cracks all WEP networks in range and captures WPA handshakes for later cracking.

The tool requires a wireless interface in monitor mode. Captured WPA handshakes are saved to wpa.cap for use with aircrack-ng or online cracking services.

# PARAMETERS

**-b** _bssid_
> Target specific access point by MAC address

**-c** _channel_
> Lock to specific channel (otherwise hops across channels)

**-s** _server_
> Upload the capture file to a WPA cracking server (e.g. wpa.darkircop.org)

**-p** _pps_
> Packets per second to send (flood rate)

**-W**
> Crack only WPA networks (skip WEP)

**-v**
> Verbose mode; repeat (-vv, -vvv) for more detail

**-h**
> Show the help screen

# OUTPUT FILES

**wpa.cap**
> Captured WPA handshakes, ready for aircrack-ng

**wep.cap**
> Captured WEP traffic

**besside.log**
> Log of cracked networks and handshake status

# CAVEATS

Requires wireless interface in monitor mode. Only use on networks you own or have explicit authorization to test. WPA cracking requires dictionary attack after handshake capture. Some access points may detect and block flooding attacks.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [aireplay-ng](/man/aireplay-ng)(1), [airmon-ng](/man/airmon-ng)(1)

# RESOURCES

```[Source code](https://github.com/aircrack-ng/aircrack-ng)```

```[Documentation](https://www.aircrack-ng.org/doku.php?id=besside-ng)```

```[Homepage](https://www.aircrack-ng.org/)```

<!-- verified: 2026-06-19 -->
