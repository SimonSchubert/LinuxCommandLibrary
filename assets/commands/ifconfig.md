# TAGLINE

configures network interfaces

# TLDR

**Show all interfaces**

```ifconfig```

**Show specific interface**

```ifconfig [eth0]```

**Set IP address**

```sudo ifconfig [eth0] [192.168.1.100]```

**Enable interface**

```sudo ifconfig [eth0] up```

**Disable interface**

```sudo ifconfig [eth0] down```

**Set netmask**

```sudo ifconfig [eth0] netmask [255.255.255.0]```

# SYNOPSIS

**ifconfig** [_interface_] [_options_]

# PARAMETERS

_INTERFACE_
> Network interface name.

**up**
> Activate interface.

**down**
> Deactivate interface.

**netmask** _MASK_
> Set network mask.

**broadcast** _ADDR_
> Set broadcast address.

**mtu** _SIZE_
> Set MTU size.

**-a**
> Display all interfaces, even if down.

**hw** _class_ _address_
> Set hardware (MAC) address.

**--help**
> Display help information.

# DESCRIPTION

**ifconfig** configures network interfaces. It displays and modifies IP addresses, netmasks, and interface status. Without arguments, it shows all active interfaces. With **-a**, it shows all interfaces including those that are down.

The tool is part of **net-tools** and is being replaced by the **ip** command from iproute2, but remains widely used on many systems.

# CAVEATS

Deprecated for ip command. Part of net-tools. Root needed for changes.

# HISTORY

**ifconfig** has been part of Unix networking since **4.2BSD** (1983). On Linux it is part of the **net-tools** package, now largely superseded by **iproute2**.

# SEE ALSO

[ip](/man/ip)(8), [route](/man/route)(8), [netstat](/man/netstat)(8)
