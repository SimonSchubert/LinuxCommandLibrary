# TAGLINE

manages network device configuration including bringing interfaces

# TLDR

Show **all** interfaces

```ip link```

Show **specific** interface

```ip link show eth0```

Bring interface **up/down**

```sudo ip link set eth0 up```

Set **alias** name

```sudo ip link set eth0 alias "LAN Interface"```

Change **MAC** address

```sudo ip link set eth0 address ff:ff:ff:ff:ff:ff```

Set **MTU** size

```sudo ip link set eth0 mtu 9000```

Set **promiscuous** mode

```sudo ip link set eth0 promisc on```

# SYNOPSIS

**ip link** [_command_] [_OPTIONS_]

# DESCRIPTION

**ip link** manages network device configuration including bringing interfaces up/down, setting MAC addresses, MTU, and creating virtual interfaces like bridges, bonds, and VLANs.

# PARAMETERS

**show** [_device_]
> Display interface information

**set** _device_
> Modify interface properties

**add**
> Create a virtual interface

**delete**
> Remove a virtual interface

**up/down**
> Bring interface up or down

**address** _mac_
> Set MAC address

**mtu** _bytes_
> Set Maximum Transmission Unit

**alias** _name_
> Set interface description

**promisc** _on|off_
> Enable/disable promiscuous mode

**master** _bridge_
> Assign interface to a bridge

# CAVEATS

Changing MAC address usually requires interface to be down first. Virtual interfaces persist only until reboot unless configured in network configuration files.

# HISTORY

**ip link** is part of **iproute2**, replacing the deprecated ifconfig command.

# SEE ALSO

[ip](/man/ip)(8), [ip-address](/man/ip-address)(8), [ethtool](/man/ethtool)(8)
