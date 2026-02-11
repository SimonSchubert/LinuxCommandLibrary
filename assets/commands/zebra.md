# TAGLINE

Quagga routing manager daemon

# TLDR

**Start zebra daemon**

```sudo zebra -d```

**Start with specific config file**

```sudo zebra -d -f [/etc/quagga/zebra.conf]```

**Run in foreground**

```sudo zebra -A [127.0.0.1]```

**Start with VTY on specific port**

```sudo zebra -d -P [2601]```

**Connect to zebra shell**

```telnet localhost 2601```

# SYNOPSIS

**zebra** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run as daemon in background.

**-f**, **--config_file** _file_
> Use specified configuration file.

**-P**, **--vty_port** _port_
> VTY (telnet) port number.

**-A**, **--vty_addr** _address_
> VTY bind address.

**-u**, **--user** _user_
> Run as specified user.

**-g**, **--group** _group_
> Run as specified group.

**-v**, **--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**zebra** is the core routing manager daemon from Quagga (formerly GNU Zebra). It manages the kernel routing table and provides the Zserv API for protocol daemons like ospfd, bgpd, and ripd to communicate routing updates.

Zebra abstracts the kernel's routing interface, allowing protocol daemons to be portable across Unix variants. It receives routes from protocol daemons and installs them in the kernel FIB (Forwarding Information Base).

Configuration uses a Cisco-like CLI accessible via telnet or the vtysh unified shell. Routes can be viewed and static routes configured through this interface.

# CONFIGURATION

Config file: /etc/quagga/zebra.conf

Defines interfaces, static routes, and access control. Protocol daemons have separate configuration files.

# CAVEATS

Quagga is largely superseded by FRRouting (FRR). Default VTY password should be changed. Requires root or CAP_NET_ADMIN capability.

# HISTORY

**zebra** originated from the GNU Zebra project by Kunihiro Ishiguro, discontinued in 2005. Quagga forked from it and maintained development until FRRouting forked from Quagga in 2017 for faster, more open development. The zebra daemon name persists in both projects.

# SEE ALSO

[ospfd](/man/ospfd)(8), [bgpd](/man/bgpd)(8), [ripd](/man/ripd)(8), [vtysh](/man/vtysh)(1), [frr](/man/frr)(8)
