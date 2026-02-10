# TAGLINE

modern Linux networking command for showing and manipulating routing

# TLDR

List interfaces with **detailed info**

```ip address```

List interfaces with **brief** network layer info

```ip -br address```

List interfaces with brief **link layer** info

```ip -br link```

Display the **routing table**

```ip route```

Show **neighbors** (ARP table)

```ip neighbour```

Make an interface **up/down**

```sudo ip link set [ethX] up```
```sudo ip link set [ethX] down```

**Add/Delete** an IP address to an interface

```sudo ip address add [ip_address]/[mask] dev [ethX]```
```sudo ip address delete [ip_address]/[mask] dev [ethX]```

Add a **default route**

```sudo ip route add default via [ip_address] dev [ethX]```

# SYNOPSIS

**ip** [_-br_] [_-c_] [_-4_|_-6_] _object_ [_command_]

# DESCRIPTION

**ip** is the modern Linux networking command for showing and manipulating routing, devices, policy routing, and tunnels. It replaces the older **ifconfig**, **route**, and **arp** commands.

# PARAMETERS

**address, a**
> Display and manage IP addresses

**link, l**
> Display and manage network interfaces

**route, r**
> Display and manage routing table

**neighbour, n**
> Display and manage ARP/neighbor cache

**tunnel**
> Display and manage IP tunnels

**maddr**
> Display and manage multicast addresses

**rule**
> Display and manage routing policy database

**-br, -brief**
> Print output in brief format

**-c, -color**
> Use color output

**-4**
> IPv4 only

**-6**
> IPv6 only

**-s, -stats**
> Output more statistics

**-o, -oneline**
> Output each record on a single line

# CAVEATS

Changes made with **ip** are not persistent across reboots. Use network configuration files or NetworkManager for persistent changes.

# HISTORY

Part of the **iproute2** package, introduced in **Linux 2.2** as a replacement for the older net-tools package (ifconfig, route, arp).

# SEE ALSO

[ifconfig](/man/ifconfig)(8), [route](/man/route)(8), [arp](/man/arp)(8), [ss](/man/ss)(8), [ip-address](/man/ip-address)(8), [ip-route](/man/ip-route)(8)
