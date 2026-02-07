# TAGLINE

Discover hosts on local networks via ARP requests.

# TLDR

**Scan** local network

```sudo arp-scan -l```

Scan **specific subnet**

```sudo arp-scan [192.168.1.0/24]```

Scan with **interface**

```sudo arp-scan -I [eth0] -l```

Scan showing **vendor** information

```sudo arp-scan -l --resolve```

**Quiet** output (IPs only)

```sudo arp-scan -l -q```

# SYNOPSIS

**arp-scan** [_-l_] [_-I interface_] [_options_] [_targets_]

# DESCRIPTION

**arp-scan** discovers hosts on a local network by sending ARP requests. It's faster than ping-based scanning because ARP works at layer 2 and hosts cannot easily hide from it.

The tool shows IP addresses, MAC addresses, and optionally vendor names from the IEEE OUI database.

# PARAMETERS

**-l**, **--localnet**
> Scan all addresses on local network

**-I** _interface_
> Network interface to use

**-q**, **--quiet**
> Quiet mode (only show responding hosts)

**-r** _n_, **--retry** _n_
> Retry count

**-t** _ms_, **--timeout** _ms_
> Timeout per host

**--resolve**
> Resolve MAC to vendor name

**-g**, **--bandwidth** _bps_
> Limit bandwidth

**-N**, **--no-resolve**
> Don't resolve addresses

**-x**, **--ignoredups**
> Ignore duplicate responses

# CONFIGURATION

**/etc/arp-scan/mac-vendor.txt**
> MAC address to vendor name mapping database used for OUI resolution.

# CAVEATS

Requires root/sudo for raw socket access. Only works on local network segment (can't scan across routers). Some hosts may rate-limit ARP responses.

# HISTORY

**arp-scan** was written by Roy Hills and has been maintained since the early **2000s** as a reliable network discovery tool.

# SEE ALSO

[arp](/man/arp)(8), [arping](/man/arping)(8), [nmap](/man/nmap)(1)
