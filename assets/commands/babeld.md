# TLDR

**Start** Babel routing daemon

```babeld [eth0]```

Start with **configuration file**

```babeld -c [/etc/babeld.conf] [eth0]```

Run in **foreground**

```babeld -d [1] [eth0]```

**Multiple interfaces**

```babeld [eth0] [eth1] [wlan0]```

# SYNOPSIS

**babeld** [_options_] _interface_...

# DESCRIPTION

**babeld** is a loop-avoiding distance-vector routing protocol daemon. Babel is designed for IPv6 and IPv4 networks, particularly wireless mesh networks, providing fast convergence and low overhead.

The daemon implements the Babel routing protocol (RFC 8966) and is suitable for small to medium-sized networks.

# PARAMETERS

**-c** _file_
> Configuration file

**-d** _level_
> Debug level (1-4)

**-D**
> Daemonize

**-L** _file_
> Log file

**-I** _file_
> PID file

**-S** _state-file_
> State file for persistent data

**-h** _cost_
> Default hello interval

**-H** _cost_
> Default wired hello interval

# FEATURES

- Loop-free routing
- Fast convergence
- IPv4 and IPv6 support
- Link quality sensing
- Multiple routing metrics
- Extensible through configuration

# CONFIGURATION

Example /etc/babeld.conf:
```
interface eth0
interface wlan0 rxcost 256
redistribute local deny
```

# CAVEATS

Requires proper network configuration. All nodes must run compatible Babel implementation. Wireless networks need link quality extensions. Not suitable for large-scale networks (use BGP/OSPF). Configuration errors can cause routing loops.

# HISTORY

**Babel** was designed by Juliusz Chroboczek around **2008** as an improved distance-vector protocol for mesh networks, later standardized as RFC 6126 and updated to RFC 8966.

# SEE ALSO

[bird](/man/bird)(8), [quagga](/man/quagga)(8), [olsrd](/man/olsrd)(8)
