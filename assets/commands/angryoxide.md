# TAGLINE

802.11 WiFi attack and penetration testing tool

# TLDR

**Start scanning** on a wireless interface

```sudo angryoxide -i [wlan0]```

**Scan specific channels**

```sudo angryoxide -i [wlan0] -c [1,6,11]```

**Target a specific network**

```sudo angryoxide -i [wlan0] -t [AA:BB:CC:DD:EE:FF]```

**Run in passive mode** without transmitting attack frames

```sudo angryoxide -i [wlan0] --notransmit```

**Scan an entire band** with auto-hunt

```sudo angryoxide -i [wlan0] -b [5] --autohunt```

**Run headless** with custom output

```sudo angryoxide -i [wlan0] --headless -o [output_prefix]```

# SYNOPSIS

**sudo angryoxide** **-i** _interface_ [_options_]

# PARAMETERS

**-i**, **--interface** _interface_
> Wireless interface to use (required)

**-c**, **--channel** _channels_
> Specific channel(s) to scan (default: 1,6,11)

**-b**, **--band** _band_
> Scan an entire band (2, 5, 6, or 60)

**-t** _target_
> Target specific MAC or SSID (repeatable)

**-w** _target_
> Whitelist a MAC or SSID from attacks (repeatable)

**--targetlist** _file_
> Load targets from a file

**--whitelist** _file_
> Load whitelist from a file

**-o**, **--output** _prefix_
> Custom output filename prefix

**-r**, **--rate** _level_
> Attack aggressiveness: 1 (low), 2 (default), 3 (high)

**--notransmit**
> Passive collection only, no attack frames sent

**--autohunt**
> Auto-discover target channels, then focus on them

**--headless**
> Run without the terminal UI

**--autoexit**
> Exit when all targets have valid hashlines

**--combine**
> Merge all .hc22000 files into a single output

**--gpsd** _ip:port_
> Connect to GPS daemon for wardriving

**-h**, **--help**
> Display help

# DESCRIPTION

**angryoxide** is an 802.11 WiFi attack tool written in Rust that autonomously collects WPA/WPA2/WPA3 hash material (EAPOL handshakes and PMKIDs) for offline cracking with Hashcat. It features a real-time TUI built with Ratatui showing discovered networks, captured handshakes, and attack status.

The attack engine performs PMKID collection, hidden SSID retrieval, anonymous reassociation (MFP bypass), Channel Switch Announcement attacks, RSN downgrade, and WiFi 6e disassociation. Output files include Hashcat-compatible .hc22000 hashlines, .pcapng packet captures, and Kismet-compatible .kismetdb databases.

# CAVEATS

Requires root/sudo privileges and a wireless adapter supporting monitor mode and packet injection. Intended strictly for authorized security testing and research. Rate-controlled transmission reduces but does not eliminate detection by wireless IDS.

# HISTORY

**angryoxide** was created by **Ragnt** (rage), inspired by hcxdumptool. Written in Rust and licensed under GPL-3.0, it is under heavy active development.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [hashcat](/man/hashcat)(1), [tcpdump](/man/tcpdump)(1), [iwconfig](/man/iwconfig)(8)
