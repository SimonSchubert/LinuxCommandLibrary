# TAGLINE

RIP routing protocol daemon

# TLDR

**Start RIP daemon**

```ripd -d```

**Start with config file**

```ripd -f [/etc/quagga/ripd.conf]```

**Connect to running daemon**

```vtysh -d ripd```

**Debug mode**

```ripd -d -A 127.0.0.1```

# SYNOPSIS

**ripd** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run as daemon.

**-f**, **--config_file** _file_
> Configuration file.

**-A**, **--vty_addr** _addr_
> VTY bind address.

**-P**, **--vty_port** _port_
> VTY port.

**-u**, **--user** _user_
> Run as user.

**-g**, **--group** _group_
> Run as group.

# DESCRIPTION

**ripd** is the RIP (Routing Information Protocol) daemon from Quagga/FRRouting. It implements RIPv1 and RIPv2 for dynamic routing in small to medium networks.

# EXAMPLES

```bash
# Start daemon
ripd -d -f /etc/quagga/ripd.conf

# Connect via vtysh
vtysh
router rip
  network 192.168.1.0/24
  version 2
```

# CONFIGURATION

**/etc/quagga/ripd.conf** / **/etc/frr/ripd.conf**
> Main configuration file defining RIP networks, version, redistribution rules, and interface settings. Location depends on whether Quagga or FRRouting is installed.

# CAVEATS

Part of Quagga or FRRouting. Requires zebra daemon. RIP has slow convergence. Use OSPF for larger networks.

# HISTORY

ripd is part of **Quagga** routing suite (forked from GNU Zebra), and later **FRRouting** for Unix routing daemons.

# SEE ALSO

[zebra](/man/zebra)(8), [ospfd](/man/ospfd)(8), [vtysh](/man/vtysh)(1), [bgpd](/man/bgpd)(8)
