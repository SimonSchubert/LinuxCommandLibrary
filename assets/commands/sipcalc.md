# TAGLINE

IPv4 and IPv6 subnet calculator

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

**sipcalc** is an advanced IP subnet calculator that handles both IPv4 and IPv6 addresses. Given an address with a prefix length or netmask, it displays the network address, broadcast address, host range, and other details in both CIDR and traditional netmask notation.

The subnet splitting option (**-s**) divides a network into smaller subnets at a specified prefix length, showing all resulting ranges. Interface mode accepts a network interface name instead of an address, reading the system's configured addresses for analysis. The **-b** option adds binary representations for bit-level understanding of subnet boundaries.

# CAVEATS

Complex subnetting may need verification. IPv6 output is verbose. Interface mode needs permissions.

# HISTORY

**sipcalc** was written by **Simon Ekstrand** for IP address calculations. It supports both protocol versions with consistent output.

# SEE ALSO

[ipcalc](/man/ipcalc)(1), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8)
