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

**Add** an IP address to an interface

```sudo ip address add [192.168.1.100/24] dev [eth0]```

**Delete** an IP address from an interface

```sudo ip address delete [192.168.1.100/24] dev [eth0]```

**Flush** all addresses on an interface

```sudo ip address flush dev [eth0]```

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

**flush** [**dev** _device_]
> Remove all addresses matching criteria.

**save**
> Save address configuration to stdout.

**restore**
> Restore address configuration from stdin.

**dev** _device_
> Interface name to operate on.

**scope** _global|link|host_
> Filter or set address scope.

**label** _label_
> Set address label (must start with device name).

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
> Filter to show only permanent (static) addresses.

**dynamic**
> Filter to show only dynamically assigned addresses.

**to** _prefix_
> Filter addresses matching a prefix.

# CAVEATS

Addresses added are not persistent across reboots. Use network configuration files or NetworkManager for persistence. An interface can have multiple IP addresses.

# HISTORY

**ip address** is part of **iproute2**, replacing the deprecated ifconfig command.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ip-route](/man/ip-route)(8), [ip-neighbour](/man/ip-neighbour)(8)
