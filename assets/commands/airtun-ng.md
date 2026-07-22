# TAGLINE

Create virtual tunnel interfaces for encrypted WiFi traffic

# TLDR

**Create** a virtual tunnel interface

```sudo airtun-ng -a [AP_BSSID] [wlan0mon]```

Create tunnel with **WEP key**

```sudo airtun-ng -a [AP_BSSID] -w [hex_key] [wlan0mon]```

Create tunnel with **WPA passphrase**

```sudo airtun-ng -a [AP_BSSID] -p [passphrase] -e [SSID] [wlan0mon]```

Bidirectional tunnel (**inject and receive**)

```sudo airtun-ng -a [AP_BSSID] -w [hex_key] -b [wlan0mon]```

# SYNOPSIS

**airtun-ng** [_-a bssid_] [_-w wep_key_] [_-p wpa_pass -e essid_] [_options_] _interface_

# DESCRIPTION

**airtun-ng** creates virtual tunnel interfaces (at0, at1, etc.) that allow sending and receiving decrypted traffic to/from a wireless network. This enables using standard network tools with encrypted WiFi networks when you know the key.

The tool can operate in WEP or WPA mode, creating a virtual ethernet interface that handles encryption/decryption transparently.

# PARAMETERS

**-a** _bssid_
> Access point MAC address

**-w** _key_
> WEP key in hexadecimal (encrypt outgoing packets)

**-y** _file_
> Read PRGA (keystream) from file instead of a WEP key

**-p** _passphrase_
> WPA passphrase (decrypt packets; use with **-a** and **-e**)

**-e** _essid_
> Network name (required for WPA)

**-i** _iface_
> Capture packets from this additional interface

**-t** _tods_
> Frame destination: 0 = to client, 1 = to AP, 2 = WDS/Bridge

**-b**
> Bidirectional mode (send and receive)

**-r** _file_
> Read frames to inject from a pcap file

**-h** _mac_
> Source MAC address

# CAVEATS

For authorized testing only. Interface must be in monitor mode. WPA mode requires the 4-way handshake to be completed. Virtual interface must be configured (IP, etc.) after creation.

# HISTORY

**airtun-ng** was added to the aircrack-ng suite to enable post-exploitation scenarios where captured keys could be used to interact with the network using standard tools.

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

[aircrack-ng](/man/aircrack-ng)(1), [airbase-ng](/man/airbase-ng)(1), [airdecap-ng](/man/airdecap-ng)(1), [airodump-ng](/man/airodump-ng)(1), [aireplay-ng](/man/aireplay-ng)(1)

# RESOURCES

```[Source code](https://github.com/aircrack-ng/aircrack-ng)```

```[Homepage](https://www.aircrack-ng.org/)```

```[Documentation](https://www.aircrack-ng.org/documentation.html)```

<!-- verified: 2026-06-11 -->
