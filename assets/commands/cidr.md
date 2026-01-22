# TLDR

**Calculate subnet info**

```ipcalc [192.168.1.0/24]```

**Show network range**

```sipcalc [10.0.0.0/8]```

**Calculate with netmask**

```ipcalc [192.168.1.0] [255.255.255.0]```

**Design subnets**

```ipcalc [192.168.1.0/24] [/27]```

# SYNOPSIS

**ipcalc** [_options_] _address_[/_prefix_] [_netmask_]
**sipcalc** [_options_] _address_[/_prefix_]

# DESCRIPTION

CIDR calculators compute network information from IP addresses and subnet masks. Common tools include ipcalc, sipcalc, and whatmask. They calculate network/broadcast addresses, host ranges, and wildcard masks.

# IPCALC OPTIONS

**-n**
> Don't show hostname

**-b**
> Don't show broadcast

**-s** _hosts_
> Split network for hosts

**-r** _hosts_
> Calculate needed prefix

# SIPCALC OPTIONS

**-a**
> All information

**-d**
> Resolve hostnames

**-4**
> IPv4 only

**-6**
> IPv6 only

# OUTPUT FIELDS

**Network**
> First address in subnet

**Broadcast**
> Last address in subnet

**HostMin/HostMax**
> Usable address range

**Hosts/Net**
> Number of usable addresses

**Wildcard**
> Cisco wildcard mask

# INSTALLATION

```
apt install ipcalc sipcalc
```

# CAVEATS

Use for network planning and troubleshooting. Online tools available at cidr.xyz for visualization.

# SEE ALSO

[ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8), [netmask](/man/netmask)(1)
