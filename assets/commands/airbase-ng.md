# TAGLINE

Create software-based wireless access points for penetration testing

# TLDR

**Create** a fake access point

```sudo airbase-ng -e "[FakeSSID]" -c [6] [wlan0mon]```

Create **open AP** for capturing handshakes

```sudo airbase-ng -e "[TargetSSID]" -c [6] -W 1 [wlan0mon]```

Create AP with **WPA2** encryption

```sudo airbase-ng -e "[SSID]" -c [6] -z 4 [wlan0mon]```

Respond to **all probes**

```sudo airbase-ng -e "[SSID]" -P -c [6] [wlan0mon]```

# SYNOPSIS

**airbase-ng** [_-e essid_] [_-c channel_] [_-W wep_] [_-z wpa_] [_options_] _interface_

# DESCRIPTION

**airbase-ng** is an aircrack-ng suite tool that creates software access points for penetration testing. It can simulate access points, capture WPA handshakes, perform MITM attacks, and test client security.

The tool creates virtual interfaces (at0) that can be used to route traffic, enabling network analysis of connected clients.

# PARAMETERS

**-e** _essid_
> Access point ESSID (network name)

**-c** _channel_
> Operating channel

**-W** _0|1_
> WEP mode (0: open, 1: shared key)

**-z** _type_
> WPA encryption (2: TKIP, 4: CCMP)

**-a** _bssid_
> Set specific BSSID

**-P**
> Respond to all probe requests

**-C** _seconds_
> Beacon interval

**-v**
> Verbose output

**-F** _prefix_
> Write captured packets to file

**--caffe-latte**
> Caffe-Latte attack mode

**--cfrag**
> PRGA attack using fragmentation

# CAVEATS

For authorized security testing only. Requires interface in monitor mode. Creating fake access points may violate local laws if used without permission. Clients may connect and expose traffic.

# HISTORY

**airbase-ng** is part of the aircrack-ng suite, which evolved from aircrack in the mid-**2000s**. It was developed to test wireless security by simulating various access point scenarios.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airmon-ng](/man/airmon-ng)(1), [aireplay-ng](/man/aireplay-ng)(1)
