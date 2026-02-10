# TAGLINE

manages IP addresses on network interfaces

# TLDR

**List** all addresses

```ip address```

Show only **active** interfaces

```ip address show up```

Show **specific** interface

```ip address show eth0```

**Add** IP address

```sudo ip address add 192.168.1.100/24 dev eth0```

**Delete** IP address

```sudo ip address delete 192.168.1.100/24 dev eth0```

**Flush** addresses by scope

```sudo ip address flush eth0 scope global```

# SYNOPSIS

**ip address** [_command_] [_OPTIONS_]

# DESCRIPTION

**ip address** manages IP addresses on network interfaces. It can display, add, delete, and flush addresses for both IPv4 and IPv6 protocols.

# PARAMETERS

**show** [_device_]
> Display IP addresses (default action)

**add** _address_ **dev** _device_
> Add an IP address to interface

**delete** _address_ **dev** _device_
> Remove an IP address from interface

**flush** _device_
> Remove all addresses from interface

**up**
> Filter to show only active interfaces

**scope** _global|link|host_
> Filter or set address scope

**label** _label_
> Set address label

**broadcast** _address_
> Set broadcast address

# CAVEATS

Addresses added are not persistent across reboots. Use network configuration files or NetworkManager for persistence. An interface can have multiple IP addresses.

# HISTORY

**ip address** is part of **iproute2**, replacing the deprecated ifconfig command.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ip-route](/man/ip-route)(8)
