# TLDR

**Decrypt WEP** capture file

```airdecap-ng -w [hex_key] [capture.cap]```

**Decrypt WPA/WPA2** capture file

```airdecap-ng -p [passphrase] -e [SSID] [capture.cap]```

**Remove wireless headers** (convert to ethernet)

```airdecap-ng -l [capture.cap]```

Decrypt with **BSSID filter**

```airdecap-ng -p [passphrase] -e [SSID] -b [00:11:22:33:44:55] [capture.cap]```

# SYNOPSIS

**airdecap-ng** [_-l_] [_-w key_] [_-p pass -e essid_] [_-b bssid_] _capture-file_

# DESCRIPTION

**airdecap-ng** decrypts WEP and WPA/WPA2 encrypted capture files when you know the key. It produces an unencrypted capture file that can be analyzed with tools like Wireshark.

The tool can also strip 802.11 wireless headers to convert captures to standard ethernet format, useful when analyzing the actual network traffic content.

# PARAMETERS

**-w** _key_
> WEP key in hexadecimal

**-p** _passphrase_
> WPA/WPA2 passphrase

**-e** _essid_
> Network name (required for WPA)

**-b** _bssid_
> Access point MAC address filter

**-l**
> Remove 802.11 header (don't decrypt)

# CAVEATS

For WPA decryption, you need the passphrase AND the SSID. The capture file must contain the 4-way handshake for initial WPA key derivation. Output file is named input-dec.cap by default.

# HISTORY

**airdecap-ng** is part of the aircrack-ng suite, developed in the mid-**2000s**. It provides the complementary function to aircrack-ng: once a key is recovered, airdecap-ng can decrypt the traffic for analysis.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1)
