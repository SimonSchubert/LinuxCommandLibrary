# TAGLINE

Decrypt WEP and WPA/WPA2 encrypted capture files

# TLDR

**Decrypt WEP** capture file

```airdecap-ng -w [hex_key] [capture.cap]```

**Decrypt WPA/WPA2** capture file

```airdecap-ng -p [passphrase] -e [SSID] [capture.cap]```

**Keep 802.11 headers** (don't strip wireless headers)

```airdecap-ng -l -w [hex_key] [capture.cap]```

Decrypt with **BSSID filter**

```airdecap-ng -p [passphrase] -e [SSID] -b [00:11:22:33:44:55] [capture.cap]```

Decrypt using a **Pairwise Master Key** (PMK)

```airdecap-ng -k [pmk_hex] -e [SSID] [capture.cap]```

# SYNOPSIS

**airdecap-ng** [_-l_] [_-w key_] [_-p pass -e essid_] [_-b bssid_] _capture-file_

# DESCRIPTION

**airdecap-ng** decrypts WEP and WPA/WPA2 encrypted capture files when you know the key. It produces an unencrypted capture file (by default suffixed with **-dec.cap**) that can be analyzed with tools like Wireshark.

By default, 802.11 wireless headers are stripped so the output resembles a standard Ethernet capture. Use **-l** to preserve the original 802.11 frames.

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
> Don't remove the 802.11 header from decrypted output (keep wireless frames).

**-k** _pmk_
> Use the specified WPA/WPA2 Pairwise Master Key (in hex) instead of passphrase.

# CAVEATS

For WPA decryption, you need the passphrase AND the SSID. The capture file must contain a valid 4-way handshake, and only data packets that follow a successful handshake will be decrypted. Output file is named _input_-dec.cap by default. Single file names are recommended over shell wildcards.

# HISTORY

**airdecap-ng** is part of the aircrack-ng suite, developed in the mid-**2000s**. It provides the complementary function to aircrack-ng: once a key is recovered, airdecap-ng can decrypt the traffic for analysis.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1)
