# TAGLINE

Generate WPA pre-shared key from passphrase

# TLDR

**Compute** WPA-PSK key reading passphrase from stdin

```wpa_passphrase [SSID]```

**Compute** WPA-PSK key with passphrase as argument

```wpa_passphrase [SSID] [passphrase]```

# SYNOPSIS

**wpa_passphrase** _ssid_ [_passphrase_]

# PARAMETERS

**ssid**
> The network name (SSID) to generate the key for

**passphrase**
> The WiFi password (read from stdin if omitted)

# DESCRIPTION

**wpa_passphrase** generates a WPA-PSK (Pre-Shared Key) configuration from an ASCII passphrase for a given network SSID. The output is in wpa_supplicant.conf format and can be appended to the configuration file.

The tool pre-computes the PSK using PBKDF2, which is faster than having wpa_supplicant compute it each time. The output includes both the plain text passphrase (commented) and the computed PSK.

# CAVEATS

Providing the passphrase on the command line exposes it in process listings and shell history. For security, prefer reading from stdin. The SSID is case-sensitive and must match exactly. Part of the wpa_supplicant package.

# SEE ALSO

[wpa_supplicant](/man/wpa_supplicant)(8), [wpa_cli](/man/wpa_cli)(8), [wpa_supplicant.conf](/man/wpa_supplicant.conf)(5)
