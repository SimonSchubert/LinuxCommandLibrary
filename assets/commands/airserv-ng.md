# TAGLINE

Serve a wireless card over TCP/IP for remote access

# TLDR

**Start** the wireless server

```sudo airserv-ng -p [666] -c [6] -d [wlan0mon]```

Start on **specific interface**

```sudo airserv-ng -d [wlan0] -p [666]```

# SYNOPSIS

**airserv-ng** [_-d device_] [_-c channel_] [_-p port_]

# DESCRIPTION

**airserv-ng** is a wireless card server that allows remote access to a wireless interface over TCP/IP. This enables using aircrack-ng tools on one computer while the wireless card is physically connected to another.

The server provides network access to the wireless interface, and clients connect using the interface specification format **ip:port** instead of a local device name.

# PARAMETERS

**-d** _device_
> Wireless interface to serve

**-c** _channel_
> Lock interface to specific channel

**-p** _port_
> TCP port to listen on (default: 666)

# CAVEATS

No built-in authentication or encryption; use SSH tunneling for secure remote access. Network latency may affect real-time packet injection. The server must have the wireless card in monitor mode.

# HISTORY

**airserv-ng** was created as part of the aircrack-ng suite to enable distributed wireless testing scenarios where the wireless hardware and analysis software are on different machines.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1)
