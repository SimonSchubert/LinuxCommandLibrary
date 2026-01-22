# TLDR

Display **neighbor data**

```sudo lldpctl```

Display **help**

```lldpctl --help```

# SYNOPSIS

**lldpctl** [_options_] [_interfaces_]

# DESCRIPTION

**lldpctl** displays Link Layer Discovery Protocol (LLDP) information collected by the lldpd daemon. LLDP is used by network devices to advertise their identity, capabilities, and neighbors on a local network.

# PARAMETERS

**-f FORMAT**
> Output format: plain, xml, json, keyvalue

**-a**
> Show all interfaces including hidden

**-C PATTERN**
> Configure specific settings

**-L LOCATION**
> Set location information

**-h, --help**
> Display help information

# CAVEATS

Requires lldpd daemon to be running. Root privileges needed for full functionality.

# HISTORY

LLDP was standardized as IEEE 802.1AB in **2005** as a vendor-neutral discovery protocol, replacing proprietary protocols like Cisco CDP.

# SEE ALSO

[lldpd](/man/lldpd)(8), [tcpdump](/man/tcpdump)(8)
