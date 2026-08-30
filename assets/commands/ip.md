# TAGLINE

modern Linux networking command for showing and manipulating routing

# TLDR

Show every interface and address as a **compact, colored table**

```ip -c -br address```

Show the addresses of a **single interface**

```ip address show dev [eth0]```

Restrict the output to **IPv4** (or `-6` for IPv6)

```ip -4 address```

**Assign** an address to an interface, with its prefix length

```sudo ip address add [192.168.1.10]/[24] dev [eth0]```

**Remove** an address from an interface

```sudo ip address del [192.168.1.10]/[24] dev [eth0]```

Bring an interface **up** (or `down` to disable it)

```sudo ip link set dev [eth0] up```

Change an interface's **MTU**

```sudo ip link set dev [eth0] mtu [9000]```

Print per-interface **error and packet counters**

```ip -s link show dev [eth0]```

Print the **routing table**

```ip route```

Ask which route the kernel would actually **use for one destination**

```ip route get [1.1.1.1]```

Set the **default gateway**

```sudo ip route add default via [192.168.1.1] dev [eth0]```

Inspect the **neighbour (ARP) cache**

```ip neighbour show```

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

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ifconfig](/man/ifconfig)(8), [route](/man/route)(8), [arp](/man/arp)(8), [ss](/man/ss)(8), [ip-address](/man/ip-address)(8), [ip-route](/man/ip-route)(8)
