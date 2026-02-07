# TAGLINE

Create virtual tunnel interfaces for encrypted WiFi traffic

# TLDR

**Create** a virtual tunnel interface

```sudo airtun-ng -a [AP_BSSID] [wlan0mon]```

Create tunnel with **WEP key**

```sudo airtun-ng -a [AP_BSSID] -w [hex_key] [wlan0mon]```

Create tunnel with **WPA passphrase**

```sudo airtun-ng -a [AP_BSSID] -p [passphrase] -e [SSID] [wlan0mon]```

Create **repeater** mode tunnel

```sudo airtun-ng -a [AP_BSSID] -r [capture.cap] [wlan0mon]```

# SYNOPSIS

**airtun-ng** [_-a bssid_] [_-w wep_key_] [_-p wpa_pass -e essid_] [_options_] _interface_

# DESCRIPTION

**airtun-ng** creates virtual tunnel interfaces (at0, at1, etc.) that allow sending and receiving decrypted traffic to/from a wireless network. This enables using standard network tools with encrypted WiFi networks when you know the key.

The tool can operate in WEP or WPA mode, creating a virtual ethernet interface that handles encryption/decryption transparently.

# PARAMETERS

**-a** _bssid_
> Access point MAC address

**-w** _key_
> WEP key in hexadecimal

**-p** _passphrase_
> WPA passphrase

**-e** _essid_
> Network name (required for WPA)

**-t** _flag_
> Tunnel type: 0=auto, 1=WDS, 2=normal

**-r** _file_
> Replay packets from capture file

**-h** _mac_
> Source MAC address

# CAVEATS

For authorized testing only. Interface must be in monitor mode. WPA mode requires the 4-way handshake to be completed. Virtual interface must be configured (IP, etc.) after creation.

# HISTORY

**airtun-ng** was added to the aircrack-ng suite to enable post-exploitation scenarios where captured keys could be used to interact with the network using standard tools.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airbase-ng](/man/airbase-ng)(1)
