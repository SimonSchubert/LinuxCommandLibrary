# TAGLINE

Create software-based wireless access points for penetration testing

# TLDR

**Create** a fake access point

```sudo airbase-ng -e "[FakeSSID]" -c [6] [wlan0mon]```

Create AP with **WPA1/TKIP**

```sudo airbase-ng -e "[SSID]" -c [6] -z 2 [wlan0mon]```

Create AP with **WPA2/CCMP**

```sudo airbase-ng -e "[SSID]" -c [6] -Z 4 [wlan0mon]```

Respond to **all probes**

```sudo airbase-ng -e "[SSID]" -P -c [6] [wlan0mon]```

# SYNOPSIS

**airbase-ng** [_-e essid_] [_-c channel_] [_-a bssid_] [_options_] _interface_

# DESCRIPTION

**airbase-ng** is an aircrack-ng suite tool that creates software access points for penetration testing. It can simulate access points, capture WPA handshakes, perform MITM attacks, and test client security.

The tool creates virtual interfaces (at0) that can be used to route traffic, enabling network analysis of connected clients.

# PARAMETERS

**-e** _essid_
> Access point ESSID (network name)

**-c** _channel_
> Operating channel

**-a** _bssid_
> Set the BSSID (MAC address) of the access point

**-W** _0|1_
> Set the WEP flag advertised in beacons (0 = off, 1 = on; default 0)

**-z** _type_
> Set WPA1 cipher: 1 = WEP40, 2 = TKIP, 4 = CCMP, 5 = WEP104

**-Z** _type_
> Same as **-z** but for WPA2

**-P**
> Respond to all probe requests, including those for other ESSIDs

**-C** _seconds_
> Enable beaconing of probed ESSID values (used with **-P**), at this interval

**-v**
> Verbose output

**-F** _prefix_
> Write all sent and received frames to a pcap file with this prefix

**-I** _interval_
> Set the beacon interval in milliseconds

**--caffe-latte**
> Caffe-Latte attack mode

**--cfrag**
> PRGA attack using fragmentation

# CAVEATS

For authorized security testing only. Requires interface in monitor mode. Creating fake access points may violate local laws if used without permission. Clients may connect and expose traffic.

# HISTORY

**airbase-ng** is part of the aircrack-ng suite, which evolved from aircrack in the mid-**2000s**. It was developed to test wireless security by simulating various access point scenarios.

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

[aircrack-ng](/man/aircrack-ng)(1), [airmon-ng](/man/airmon-ng)(1), [aireplay-ng](/man/aireplay-ng)(1), [airodump-ng](/man/airodump-ng)(1), [airtun-ng](/man/airtun-ng)(1), [airdecap-ng](/man/airdecap-ng)(1)

# RESOURCES

```[Source code](https://github.com/aircrack-ng/aircrack-ng)```

```[Homepage](https://www.aircrack-ng.org/)```

```[Documentation](https://www.aircrack-ng.org/documentation.html)```

<!-- verified: 2026-06-11 -->
