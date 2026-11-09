# TAGLINE

manages IP addresses on network interfaces

# TLDR

**List** all addresses

```ip address show```

Show only **active** interfaces

```ip address show up```

Show addresses for a **specific** interface

```ip address show dev [eth0]```

Show only **IPv4** addresses

```ip -4 address show```

Show a **brief** one-line-per-interface summary

```ip -br address```

Print addresses as **JSON**

```ip -j address show```

**Add** an IP address to an interface

```sudo ip address add [192.168.1.100/24] dev [eth0]```

**Delete** an IP address from an interface

```sudo ip address delete [192.168.1.100/24] dev [eth0]```

**Flush** all addresses on an interface

```sudo ip address flush dev [eth0]```

**Flush** only the global addresses, keeping IPv6 link-local ones

```sudo ip address flush dev [eth0] scope global```

# SYNOPSIS

**ip** [_OPTIONS_] **address** {_command_|**help**}

# DESCRIPTION

**ip address** manages IP addresses on network interfaces. It can display, add, delete, and flush addresses for both IPv4 and IPv6 protocols.

# PARAMETERS

**show** [**dev** _device_]
> Display IP addresses (default action).

**add** _address/prefix_ **dev** _device_
> Add an IP address to an interface.

**change** _address/prefix_ **dev** _device_
> Change properties of an existing address.

**replace** _address/prefix_ **dev** _device_
> Add or update an address on an interface.

**delete** _address/prefix_ **dev** _device_
> Remove an IP address from an interface.

**flush** _selectors_
> Remove all addresses matching the criteria. Takes the selectors of **show**, except **type** and **master**, and refuses to run without arguments.

**save**
> Save address configuration to stdout.

**restore**
> Restore address configuration from stdin.

**showdump**
> Display a saved address configuration read from stdin.

**dev** _device_
> Interface name to operate on.

**scope** _global|link|host_
> Filter or set address scope.

**label** _label_
> Tag the address with a label (at most 15 characters). In **show** and **flush**, filter by a shell-style pattern.

**peer** _address_
> Remote endpoint for point-to-point interfaces.

**noprefixroute**
> Do not automatically create a route for the network prefix of the address.

**broadcast** _address_
> Set broadcast address.

**metric** _number_
> Set priority of the prefix route for the address.

**valid_lft** _lft_
> Valid lifetime of the address (default: forever).

**preferred_lft** _lft_
> Preferred lifetime of the address (default: forever).

**up**
> Filter to show only active (UP) interfaces.

**permanent**
> IPv6 only: filter to show only permanent (not dynamic) addresses.

**dynamic**
> IPv6 only: filter to show only addresses installed by stateless autoconfiguration.

**master** _device_
> Filter to interfaces enslaved to a master device.

**type** _type_
> Filter to interfaces of a given type.

**to** _prefix_
> Filter addresses matching a prefix.

# CAVEATS

Addresses added are not persistent across reboots. Use network configuration files or NetworkManager for persistence. An interface can have multiple IP addresses. **flush** is unforgiving: without a **scope** selector it also removes IPv6 link-local addresses.

# HISTORY

**ip address** is part of **iproute2**, replacing the deprecated ifconfig command.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ip-route](/man/ip-route)(8), [ip-neighbour](/man/ip-neighbour)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-address.8.html)```

<!-- verified: 2026-11-09 -->
