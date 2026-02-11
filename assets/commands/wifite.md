# TAGLINE

Automated wireless network security auditing

# TLDR

**Start wifite** in interactive mode

```sudo wifite```

**Target only WPA networks**

```sudo wifite --wpa```

**Target only WPS-enabled networks**

```sudo wifite --wps```

**Specify wireless interface**

```sudo wifite -i [wlan0]```

**Attack networks with minimum signal strength**

```sudo wifite --power [50]```

**Target specific network** by ESSID

```sudo wifite --essid "[NetworkName]"```

**Use specific wordlist** for cracking

```sudo wifite --dict [/path/to/wordlist.txt]```

**Scan 5GHz channels**

```sudo wifite --5ghz```

# SYNOPSIS

**wifite** [_options_]

# PARAMETERS

**-i** _INTERFACE_
> Wireless interface to use

**-c** _CHANNEL_
> Channel(s) to scan (e.g., 1,3-6)

**-5**, **--5ghz**
> Include 5GHz channels

**-p** _POWER_, **--power** _POWER_
> Minimum signal strength (dBm)

**--essid** _NAME_
> Target specific network by name

**--bssid** _MAC_
> Target specific network by MAC address

**--wpa**
> Target only WPA-encrypted networks

**--wps**
> Target only WPS-enabled networks

**--wep**
> Target only WEP-encrypted networks

**--dict** _FILE_
> Wordlist for password cracking

**--pmkid**
> Use PMKID capture attack

**--new-hs**
> Capture new handshake, ignore existing

**--pixie**
> Use Pixie Dust attack on WPS

**--bully**
> Use Bully for WPS attacks

**--reaver**
> Use Reaver for WPS attacks

**--clients-only**
> Only show networks with clients

**--nodeauths**
> Passive mode; no deauthentication

**--daemon**
> Return interface to managed mode on exit

**--infinite**
> Enable infinite attack mode

**-v**, **--verbose**
> Show more output and commands

**-h**, **--help**
> Show help

# DESCRIPTION

**wifite** is an automated wireless network auditing tool that simplifies Wi-Fi security testing. It automates scanning for networks, capturing handshakes, and attempting to crack passwords using various attack methods.

The tool supports multiple attack vectors: WPA handshake capture with dictionary attacks, WPS PIN brute-forcing, Pixie Dust attacks against vulnerable WPS implementations, and legacy WEP attacks. It integrates with tools like Aircrack-ng, Reaver, Bully, and Hashcat.

Wifite handles putting the wireless adapter into monitor mode, scanning for targets, and sequentially attempting attacks. Results are displayed in an interactive interface that shows network details and attack progress.

# CAVEATS

Requires a wireless adapter supporting monitor mode and packet injection. Root privileges are required. Only test networks you own or have explicit permission to audit—unauthorized access is illegal. Some attacks (deauthentication) disrupt legitimate network users. Success depends on network configuration and password complexity.

# HISTORY

Wifite was originally created by **derv82** to automate common Wi-Fi auditing tasks that previously required manual use of multiple tools. Wifite2, a complete rewrite, added Python 3 support, improved attack methods, and better handling of modern wireless security. The tool became popular in the security community for penetration testing and is included by default in Kali Linux.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [reaver](/man/reaver)(1), [bully](/man/bully)(1), [kismet](/man/kismet)(1)
