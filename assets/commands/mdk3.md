# TLDR

**Beacon flood attack**

```mdk3 [wlan0] b```

**Authentication DoS**

```mdk3 [wlan0] a -a [BSSID]```

**Deauthentication attack**

```mdk3 [wlan0] d```

**Michael shutdown attack**

```mdk3 [wlan0] m -t [BSSID]```

**Probe request flood**

```mdk3 [wlan0] p```

# SYNOPSIS

**mdk3** _interface_ _mode_ [_options_]

# PARAMETERS

_INTERFACE_
> Wireless interface in monitor mode.

_MODE_
> Attack mode (b, a, d, m, p).

**b**
> Beacon flood.

**a**
> Authentication flood.

**d**
> Deauthentication.

**-t** _BSSID_
> Target BSSID.

**--help**
> Display help information.

# DESCRIPTION

**mdk3** is a wireless security testing tool. It tests 802.11 network resilience.

The tool performs various attack simulations for security auditing. Requires authorization.

mdk3 tests wireless security.

# CAVEATS

Security tool. Legal use only with authorization. Requires monitor mode.

# HISTORY

mdk3 was created for **wireless security** testing and penetration testing of 802.11 networks.

# SEE ALSO

[mdk4](/man/mdk4)(1), [aircrack-ng](/man/aircrack-ng)(1), [aireplay-ng](/man/aireplay-ng)(1)

