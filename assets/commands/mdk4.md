# TAGLINE

wireless security testing tool

# TLDR

**Beacon flood attack**

```mdk4 [wlan0] b```

**Authentication DoS**

```mdk4 [wlan0] a -a [BSSID]```

**Deauthentication attack**

```mdk4 [wlan0] d```

**WDS confusion attack**

```mdk4 [wlan0] w```

**Fuzzing**

```mdk4 [wlan0] f -t [BSSID]```

# SYNOPSIS

**mdk4** _interface_ _mode_ [_options_]

# PARAMETERS

_INTERFACE_
> Wireless interface in monitor mode.

_MODE_
> Attack mode (b, a, d, w, f).

**b**
> Beacon flooding — broadcasts fake AP beacons.

**a**
> Authentication DoS — floods target APs with auth frames.

**p**
> SSID probing / bruteforce (including hidden SSIDs).

**d**
> Deauthentication and disassociation of clients from an AP.

**m**
> Michael (TKIP countermeasures) exploitation.

**e**
> EAPOL start and logoff packet injection.

**s**
> Attacks on mesh-network link and routing.

**w**
> Wireless IDS/IPS confusion via spoofed clients.

**f**
> Packet fuzzer with configurable sources and modifiers.

**--help**
> Display help information.

# DESCRIPTION

**mdk4** is a wireless security testing tool. It's the successor to mdk3 with additional features.

The tool tests 802.11 network security and performs vulnerability assessment.

# CAVEATS

Security tool. Legal use only. Requires monitor mode. Authorized testing only.

# HISTORY

mdk4 is the successor to **mdk3**, providing updated wireless security testing capabilities.

# SEE ALSO

[mdk3](/man/mdk3)(1), [aircrack-ng](/man/aircrack-ng)(1), [wifite](/man/wifite)(1)

