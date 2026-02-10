# TAGLINE

discovers and fingerprints IPsec VPN servers

# TLDR

**Scan for IKE hosts**

```sudo ike-scan [192.168.1.0/24]```

**Aggressive mode**

```sudo ike-scan -A [target]```

**Specify transform**

```sudo ike-scan --trans=[5,2,1,2] [target]```

**Show vendor ID**

```sudo ike-scan -M [target]```

**Source port**

```sudo ike-scan -s [500] [target]```

# SYNOPSIS

**ike-scan** [_options_] _targets_

# PARAMETERS

_TARGETS_
> IP addresses or ranges.

**-A**, **--aggressive**
> Aggressive mode.

**-M**, **--multiline**
> Multiline output.

**--trans** _SET_
> Transform set.

**-s** _PORT_
> Source port.

**-d** _PORT_
> Destination port.

**--help**
> Display help information.

# DESCRIPTION

**ike-scan** discovers and fingerprints IPsec VPN servers. It sends IKE packets and analyzes responses to identify VPN implementations.

The tool performs IKE protocol scanning for security assessment. It identifies vendor, version, and supported transforms.

# CAVEATS

Security testing tool. Authorization required. UDP port 500.

# HISTORY

ike-scan was created by **Roy Hills** for IPsec VPN discovery and fingerprinting.

# SEE ALSO

[nmap](/man/nmap)(1), [strongswan](/man/strongswan)(8), [ipsec](/man/ipsec)(8)
