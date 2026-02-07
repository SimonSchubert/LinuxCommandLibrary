# TAGLINE

WPA/WPA2 PSK precomputation tool

# TLDR

**Generate hash table**

```genpmk -f [wordlist.txt] -d [hashfile] -s [SSID]```

**Show progress**

```genpmk -f [wordlist.txt] -d [hashfile] -s [SSID] -v```

# SYNOPSIS

**genpmk** [_options_]

# DESCRIPTION

**genpmk** generates precomputed WPA/WPA2 PSK hash tables for use with cowpatty. Since WPA key derivation is SSID-dependent and computationally expensive, precomputing hashes for common SSIDs dramatically speeds up password auditing.

The tool creates hash files that cowpatty can use for fast offline attacks during authorized security testing.

# PARAMETERS

**-f** _file_
> Dictionary wordlist file.

**-d** _file_
> Output hash table file.

**-s** _ssid_
> Target SSID.

**-v**
> Verbose/progress output.

# CAVEATS

Hash tables are SSID-specific. Large wordlists create large hash files. Only for authorized security testing. Tables not portable between SSIDs.

# HISTORY

**genpmk** is part of the **cowpatty** suite, created by **Joshua Wright** for WPA security research. It addresses the performance limitation of WPA key derivation by enabling precomputation.

# SEE ALSO

[cowpatty](/man/cowpatty)(1), [aircrack-ng](/man/aircrack-ng)(1), [hashcat](/man/hashcat)(1)
