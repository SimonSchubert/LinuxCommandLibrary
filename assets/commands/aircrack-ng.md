# TAGLINE

Crack WEP and WPA/WPA2 wireless encryption keys

# TLDR

**Crack WPA/WPA2** with wordlist

```aircrack-ng -w [wordlist.txt] [capture.cap]```

Crack WEP with **captured IVs**

```aircrack-ng [capture.cap]```

Specify **target BSSID**

```aircrack-ng -b [00:11:22:33:44:55] [capture.cap]```

Use **multiple wordlists**

```aircrack-ng -w [list1.txt],[list2.txt] [capture.cap]```

Show **cracking statistics**

```aircrack-ng -S [capture.cap]```

# SYNOPSIS

**aircrack-ng** [_-w wordlist_] [_-b bssid_] [_-e essid_] [_options_] _capture-file_

# DESCRIPTION

**aircrack-ng** is a WiFi security auditing tool that cracks WEP and WPA/WPA2-PSK encryption keys. For WPA/WPA2, it uses dictionary attacks against captured 4-way handshakes. For WEP, it exploits cryptographic weaknesses using statistical methods.

The tool reads packet capture files containing wireless traffic, identifies encryption types and captured handshakes, and attempts to recover the passphrase.

# PARAMETERS

**-w** _file_
> Wordlist for WPA/WPA2 cracking

**-b** _bssid_
> Target access point MAC address

**-e** _essid_
> Target network name

**-a** _mode_
> Attack mode (1: WEP, 2: WPA/WPA2)

**-l** _file_
> Write found key to file

**-q**
> Quiet mode (no status display)

**-S**
> WPA cracking speed test (benchmark)

**-p** _threads_
> Number of CPU threads to use

**-K**
> Use KoreK attack instead of PTW for WEP cracking (PTW is the faster modern default)

**-x**
> Disable last keybyte brute-force (WEP). -x1 enables (default), -x2 brute-forces last two keybytes

**-y**
> Experimental single brute-force attack, used when standard attacks fail with over 1 million IVs

# CAVEATS

For authorized security testing only. WPA/WPA2 cracking requires a captured 4-way handshake. Success depends on wordlist quality; complex passwords may be uncrackable. GPU-accelerated tools like hashcat are faster for WPA.

# HISTORY

**aircrack-ng** evolved from the original aircrack tool, with the "-ng" (next generation) version first released in **2006**. It became the standard open-source WiFi security assessment toolkit.

# SEE ALSO

[airodump-ng](/man/airodump-ng)(1), [aireplay-ng](/man/aireplay-ng)(1), [hashcat](/man/hashcat)(1)
