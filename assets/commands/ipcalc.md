# TAGLINE

Calculate IP network information

# TLDR

**Calculate network info**

```ipcalc [192.168.1.0/24]```

**Show with netmask**

```ipcalc [192.168.1.0] [255.255.255.0]```

**Split network into subnets**

```ipcalc [192.168.0.0/16] -s [256] [256] [256]```

**Check if IP is in network**

```ipcalc -c [192.168.1.100] [192.168.1.0/24]```

**Show binary representation**

```ipcalc -b [192.168.1.0/24]```

# SYNOPSIS

**ipcalc** [_options_] _address_ [_netmask_]

# PARAMETERS

_address_
> IP address with optional CIDR.

_netmask_
> Subnet mask (if not CIDR).

**-b**, **--broadcast**
> Show broadcast address.

**-n**, **--network**
> Show network address.

**-h**, **--hostname**
> Show hostname.

**-s** _size_...
> Split into subnets of size.

**-c**, **--check**
> Validate address.

**--class**
> Show address class (A, B, C, D, or E).

**--minaddr**
> Show minimum host address.

**--maxaddr**
> Show maximum host address.

**-4**, **-6**
> Force IPv4/IPv6.

**-r**, **--random-private**
> Generate a random private address for given prefix length.

**--no-decorate**
> Print output without decoration (suitable for scripting).

# DESCRIPTION

**ipcalc** calculates IP network information. It shows network address, broadcast address, host range, and other details from an IP address and netmask or CIDR notation.

The tool is essential for network planning, subnetting, and troubleshooting IP configuration issues.

# OUTPUT EXAMPLE

```
Address:   192.168.1.0
Netmask:   255.255.255.0 = 24
Wildcard:  0.0.0.255
Network:   192.168.1.0/24
HostMin:   192.168.1.1
HostMax:   192.168.1.254
Broadcast: 192.168.1.255
Hosts:     254
```

# CAVEATS

Two distinct implementations exist: the Red Hat version (ipcalc from initscripts) and the newer ipcalc by Nikos Mavrogiannopoulos. They have different options and features. The `-s` subnet splitting and `-c` check options are only available in certain versions. IPv6 support is available in the newer implementation only.

# SEE ALSO

[sipcalc](/man/sipcalc)(1), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8)
