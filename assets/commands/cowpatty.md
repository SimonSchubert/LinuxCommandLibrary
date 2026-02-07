# TAGLINE

WPA/WPA2 PSK offline auditing tool

# TLDR

**Dictionary attack** on capture file

```cowpatty -f [wordlist.txt] -r [capture.cap] -s [SSID]```

**Use precomputed hash table**

```cowpatty -d [hashfile] -r [capture.cap] -s [SSID]```

**Generate hash table**

```genpmk -f [wordlist.txt] -d [hashfile] -s [SSID]```

**Check single passphrase**

```cowpatty -r [capture.cap] -s [SSID] -p "[passphrase]"```

# SYNOPSIS

**cowpatty** [_options_]

# DESCRIPTION

**cowpatty** is a WPA/WPA2 PSK auditing tool that performs offline dictionary attacks against captured authentication handshakes. It's used for authorized wireless security testing.

The tool processes four-way handshake captures and tests passphrases against the captured authentication exchange. Precomputed hash tables can dramatically speed up testing for common SSIDs.

# PARAMETERS

**-f** _file_
> Dictionary file with passphrases.

**-d** _file_
> Precomputed hash table file.

**-r** _file_
> Packet capture file.

**-s** _ssid_
> Network SSID (required).

**-p** _pass_
> Single passphrase to test.

**-c**
> Check for valid handshake only.

**-v**
> Verbose output.

**-2**
> Use frames 1 and 2 or 2 and 3.

# CAVEATS

Requires valid captured handshake. Only for authorized security testing. SSID-specific hash tables needed for each network. Dictionary attack limited by wordlist quality.

# HISTORY

**cowpatty** was created by **Joshua Wright** around **2004** for WPA security research. It was one of the first public tools for WPA PSK auditing, demonstrating the importance of strong passphrases. The tool influenced subsequent wireless security tools like aircrack-ng.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [genpmk](/man/genpmk)(1), [hashcat](/man/hashcat)(1), [wifite](/man/wifite)(1)
