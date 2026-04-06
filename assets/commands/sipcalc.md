# TAGLINE

IPv4 and IPv6 subnet calculator

# TLDR

**Calculate subnet**

```sipcalc [192.168.1.0/24]```

**Split network into /26 subnets**

```sipcalc -s [26] [192.168.1.0/24]```

**IPv6 address**

```sipcalc [2001:db8::1/64]```

**Show all info**

```sipcalc -a [192.168.1.100/24]```

**Interface addresses**

```sipcalc [eth0]```

**CIDR bitmap output**

```sipcalc -b [192.168.1.0/24]```

**Classful info**

```sipcalc -c [10.0.0.0]```

**Convert Cisco wildcard to netmask**

```sipcalc -w [0.0.0.255]```

**IPv6 reverse DNS**

```sipcalc -r [2001:db8::1/48]```

# SYNOPSIS

**sipcalc** [_-s size_] [_-a_] [_-b_] [_options_] _address_

# PARAMETERS

**-a**
> Give all possible information about an address or interface.

**-b**
> Display CIDR based bitmaps (IPv4).

**-c**
> Display classful address information (IPv4).

**-d**
> Enable name resolution.

**-e**
> Display v4inv6 address information (IPv6).

**-i**
> Display CIDR address information (default IPv4).

**-n** _NUM_
> Display NUM extra subnets starting from the current subnet.

**-r**
> Display IPv6 reverse DNS information.

**-s** _MASK_
> Split IPv4 network into subnets of MASK size.

**-S** _MASK_
> Split IPv6 network into subnets of MASK size.

**-t**
> Display standard IPv6 address information (default IPv6).

**-u**
> Verbose mode for network splitting.

**-w**
> Convert Cisco wildcard (inverse mask) to regular netmask.

**-4** _ADDR_
> Explicitly add an IPv4 address.

**-6** _ADDR_
> Explicitly add an IPv6 address.

# DESCRIPTION

**sipcalc** is an advanced IP subnet calculator that handles both IPv4 and IPv6 addresses. Given an address with a prefix length or netmask, it displays the network address, broadcast address, host range, and other details in both CIDR and traditional netmask notation.

The subnet splitting option (**-s**) divides a network into smaller subnets at a specified prefix length, showing all resulting ranges. Interface mode accepts a network interface name instead of an address, reading the system's configured addresses for analysis. The **-b** option adds binary representations for bit-level understanding of subnet boundaries.

# CAVEATS

Complex subnetting may need verification. IPv6 output is verbose. Interface mode needs permissions.

# HISTORY

**sipcalc** was written by **Simon Ekstrand** for IP address calculations. It supports both protocol versions with consistent output.

# SEE ALSO

[ipcalc](/man/ipcalc)(1), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8)
