# TAGLINE

RIP routing protocol daemon

# TLDR

**Start RIP daemon**

```ripd -d```

**Start with config file**

```ripd -d -f [/etc/frr/ripd.conf]```

**Connect to running daemon via VTY**

```vtysh -d ripd```

**Start with VTY bound to localhost**

```ripd -d -A 127.0.0.1```

**Open interactive terminal session**

```ripd -t```

# SYNOPSIS

**ripd** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run as daemon, forking to background after initialization.

**-f**, **--config_file** _file_
> Configuration file (default: /etc/frr/ripd.conf).

**-t**, **--terminal**
> Open an interactive VTY session on the terminal.

**-A**, **--vty_addr** _addr_
> VTY bind address.

**-P**, **--vty_port** _port_
> VTY port (default: 2602). Set to 0 to disable.

**-i**, **--pid_file** _file_
> PID file path (default: /var/run/frr/ripd.pid).

**-z**, **--zclient_path** _path_
> Override ZAPI socket path for zebra communication.

**-u**, **--user** _user_
> Run as user.

**-g**, **--group** _group_
> Run as group.

# DESCRIPTION

**ripd** is the RIP (Routing Information Protocol) daemon from Quagga/FRRouting. It implements RIPv1 and RIPv2 for dynamic routing in small to medium networks.

# EXAMPLES

```bash
# Start daemon
ripd -d -f /etc/frr/ripd.conf

# Connect via vtysh
vtysh
router rip
  network 192.168.1.0/24
  version 2
```

# CONFIGURATION

**/etc/frr/ripd.conf** (FRRouting) / **/etc/quagga/ripd.conf** (Quagga)
> Main configuration file defining RIP networks, version, redistribution rules, and interface settings.

# CAVEATS

Part of FRRouting (or legacy Quagga). Requires the zebra daemon to be running. RIP has a maximum hop count of 15 and slow convergence. Use OSPF for larger networks.

# HISTORY

ripd is part of **Quagga** routing suite (forked from GNU Zebra), and later **FRRouting** for Unix routing daemons.

# SEE ALSO

[zebra](/man/zebra)(8), [ospfd](/man/ospfd)(8), [vtysh](/man/vtysh)(1), [bgpd](/man/bgpd)(8)
