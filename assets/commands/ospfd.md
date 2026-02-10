# TAGLINE

OSPF routing daemon from FRRouting

# TLDR

**Start OSPF daemon**

```ospfd -d```

**Start with config file**

```ospfd -f [/etc/frr/ospfd.conf]```

**Start with debug**

```ospfd -d -A [127.0.0.1]```

**Run in foreground**

```ospfd -A [127.0.0.1]```

# SYNOPSIS

**ospfd** [_options_]

# PARAMETERS

**-d**
> Run as daemon.

**-f** _file_
> Config file.

**-A** _address_
> VTY bind address.

**-P** _port_
> VTY port.

**-u** _user_
> Run as user.

**-g** _group_
> Run as group.

# DESCRIPTION

**ospfd** is the OSPF (Open Shortest Path First) routing daemon from FRRouting (or Quagga). It implements OSPF version 2 for IPv4 routing, enabling dynamic routing in networks.

OSPF is a link-state routing protocol commonly used in enterprise networks.

# CONFIGURATION

```
! /etc/frr/ospfd.conf
router ospf
  ospf router-id 1.1.1.1
  network 192.168.1.0/24 area 0
  network 10.0.0.0/8 area 1
```

# VTY COMMANDS

```
show ip ospf neighbor
show ip ospf route
show ip ospf database
```

# CAVEATS

Part of FRRouting suite. Requires zebra daemon. Configuration via vtysh recommended.

# HISTORY

ospfd was part of GNU Zebra, then Quagga, and is now maintained as part of **FRRouting**, the leading open-source routing suite.

# SEE ALSO

[zebra](/man/zebra)(8), [vtysh](/man/vtysh)(1), [bgpd](/man/bgpd)(8), [ripd](/man/ripd)(8)
