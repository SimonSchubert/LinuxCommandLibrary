# TAGLINE

Print network interface information

# TLDR

**Show interfaces that are up**

```trawl```

**Show with column names**

```trawl -n```

**Filter interface names by regular expression**

```trawl -f [eth]```

**List available interfaces**

```trawl -i```

**Include the loopback interface**

```trawl -l```

**Show one interface**

```trawl [eth0]```

**Print only the IPv4 address of an interface**

```trawl -a [eth0]```

**Show your public IP address**

```trawl -p```

# SYNOPSIS

**trawl** [_options_] [_interface_]

# PARAMETERS

**-n**
> Show column names.

**-f** _REGEX_
> Filter interface names with a case-insensitive regular expression.

**-i**
> List available interfaces.

**-l**
> Include the loopback interface.

**-p**
> Print your public IP address.

**-a** _INTERFACE_
> Print the IPv4 address.

**-m** _INTERFACE_
> Print the IPv4 subnet mask.

**-s** _INTERFACE_
> Print the IPv4 network.

**-u** _INTERFACE_
> Print the MTU.

**-hw** _INTERFACE_
> Print the MAC address.

**-6a** _INTERFACE_
> Print the IPv6 address and mask.

**-4c**, **-6c** _INTERFACE_
> Print the complete list of IPv4 or IPv6 addresses.

# DESCRIPTION

**trawl** prints network interface information to the console, similar to ifconfig, ipconfig, ip or ifdata. For each interface that is up it shows the name, IPv4 address, mask and network, MTU, MAC address, IPv6 address and address count.

The loopback interface is ignored by default. Single-value flags print just one field for a named interface, which suits shell scripts.

# CAVEATS

The robphoenix/trawl repository is archived and no longer developed. The name is shared with unrelated projects.

# HISTORY

**trawl** was written in Go by Rob Phoenix and also runs on Windows.

# SEE ALSO

[ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8), [ss](/man/ss)(8)

# RESOURCES

```[Source code](https://github.com/robphoenix/trawl)```

<!-- verified: 2026-11-09 -->
