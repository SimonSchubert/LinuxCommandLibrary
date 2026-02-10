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

**--help**
> Display help information.

# DESCRIPTION

**ifconfig** configures network interfaces. It displays and modifies IP addresses, netmasks, and interface status.

The tool is being replaced by ip command but remains widely used. It shows interface statistics and configuration.

# CAVEATS

Deprecated for ip command. Part of net-tools. Root needed for changes.

# HISTORY

ifconfig is a traditional **Unix** network configuration tool, now superseded by **iproute2** ip command.

# SEE ALSO

[ip](/man/ip)(8), [route](/man/route)(8), [netstat](/man/netstat)(8)
