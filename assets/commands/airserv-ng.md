# TAGLINE

Wireless card server for remote access over TCP/IP

# TLDR

**Start the wireless server on an interface with a specific channel and port**

```sudo airserv-ng -d [wlan0mon] -c [6] -p [666]```

**Start the server on the default port**

```sudo airserv-ng -d [wlan0mon]```

**Start with verbose debug output**

```sudo airserv-ng -d [wlan0mon] -v [3]```

# SYNOPSIS

**airserv-ng** [_options_]

# PARAMETERS

**-d** _IFACE_
> Wireless interface to serve (required).

**-c** _CHAN_
> Lock the interface to a specific channel.

**-p** _PORT_
> TCP port to listen on (default: 666).

**-v** _LEVEL_
> Debug level. Level 1 shows client connect/disconnect (default), higher levels show more detail.

**-h**
> Display help information.

# DESCRIPTION

**airserv-ng** is a wireless card server that allows multiple wireless application programs to independently use a wireless card via a client-server TCP network connection. All operating system and wireless card driver specific code is incorporated into the server.

Clients connect by specifying **host:port** as the interface name instead of a local device. This enables using aircrack-ng tools on one machine while the wireless card is physically connected to another.

# CAVEATS

No built-in authentication or encryption; use SSH tunneling for secure remote access. Network latency may affect real-time packet injection. The wireless card should typically be in monitor mode before starting the server.

# HISTORY

**airserv-ng** was created as part of the **aircrack-ng** suite to enable distributed wireless testing scenarios where the wireless hardware and analysis software run on different machines.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [aireplay-ng](/man/aireplay-ng)(1), [airmon-ng](/man/airmon-ng)(1)
