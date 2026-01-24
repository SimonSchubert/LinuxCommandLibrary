# TLDR

**Calculate subnet**

```sipcalc [192.168.1.0/24]```

**Split network**

```sipcalc -s [26] [192.168.1.0/24]```

**IPv6 address**

```sipcalc [2001:db8::1/64]```

**Show all info**

```sipcalc -a [192.168.1.100/24]```

**Interface addresses**

```sipcalc [eth0]```

**Binary output**

```sipcalc -b [192.168.1.0/24]```

**Classful info**

```sipcalc -c [10.0.0.0]```

# SYNOPSIS

**sipcalc** [_-s size_] [_-a_] [_-b_] [_options_] _address_

# PARAMETERS

**-s** _SIZE_
> Split into subnets.

**-a**
> All information.

**-b**
> Binary output.

**-c**
> Classful info.

**-d**
> Resolve hostnames.

**-n**
> Suppress newlines.

**-4**
> IPv4 mode.

**-6**
> IPv6 mode.

# DESCRIPTION

**sipcalc** calculates IP subnet information. It handles both IPv4 and IPv6.

Address analysis shows network, broadcast, and host range. CIDR and netmask formats supported.

Subnet splitting divides networks. Calculates new ranges for specified prefix length.

Interface mode reads system addresses. Shows configuration of network interfaces.

Binary output shows bit-level details. Useful for learning and verification.

# CAVEATS

Complex subnetting may need verification. IPv6 output is verbose. Interface mode needs permissions.

# HISTORY

**sipcalc** was written by **Simon Ekstrand** for IP address calculations. It supports both protocol versions with consistent output.

# SEE ALSO

[ipcalc](/man/ipcalc)(1), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8)
