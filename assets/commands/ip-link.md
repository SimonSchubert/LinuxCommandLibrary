# TAGLINE

network device configuration: bring interfaces up/down, set MAC, MTU, create virtual links

# TLDR

Show **all** interfaces

```ip link```

Show **specific** interface

```ip link show eth0```

Show **detailed** statistics

```ip -s link show eth0```

Bring interface **up/down**

```sudo ip link set eth0 up```

Set **alias** name

```sudo ip link set eth0 alias "LAN Interface"```

Change **MAC** address (interface must be down)

```sudo ip link set dev eth0 address ff:ee:dd:cc:bb:aa```

Set **MTU** size

```sudo ip link set eth0 mtu 9000```

Set **promiscuous** mode

```sudo ip link set eth0 promisc on```

Create a **VLAN** sub-interface

```sudo ip link add link eth0 name eth0.10 type vlan id 10```

# SYNOPSIS

**ip** [_OPTIONS_] **link** _COMMAND_ [_arguments_]

# DESCRIPTION

**ip link** manages network devices. It can list interfaces, change their state and parameters (MAC address, MTU, alias, promiscuous mode), and create or delete virtual links such as bridges, bonds, VLANs, VXLANs, dummies, veth pairs, and tun/tap devices.

It is part of the **iproute2** suite that replaces the older **ifconfig** utility.

# PARAMETERS

**show** [_device_]
> Display interface information. Without _device_, all interfaces are shown. Combine with **-s** for statistics, **-d** for detailed driver info.

**set** _device_
> Modify properties of an existing interface.

**add** [_link DEV_] **name** _NAME_ **type** _TYPE_
> Create a virtual interface of the given type (bridge, vlan, veth, dummy, bond, vxlan, ...).

**delete** _device_
> Remove a virtual interface.

**up** | **down**
> Bring the interface administratively up or down.

**address** _LLADDR_
> Set the link-layer (MAC) address. Usually requires the interface to be down first.

**mtu** _BYTES_
> Set the Maximum Transmission Unit.

**alias** _NAME_
> Set a human-readable interface description.

**promisc** **on** | **off**
> Enable or disable promiscuous mode.

**multicast** **on** | **off**
> Enable or disable multicast reception.

**arp** **on** | **off**
> Enable or disable ARP on the interface.

**master** _DEVICE_
> Enslave the interface to a master (bridge or bond).

**nomaster**
> Detach the interface from its master.

**txqueuelen** _N_
> Set the transmit queue length.

**netns** _PID_ | _NAME_
> Move the interface into the given network namespace.

# CAVEATS

Changing the MAC address usually requires the interface to be brought down first. Virtual interfaces created with **ip link add** are not persistent across reboots unless declared in distribution-specific network configuration (NetworkManager, systemd-networkd, /etc/network/interfaces, etc.). Some operations require **CAP_NET_ADMIN** (typically root).

# HISTORY

**ip link** is part of **iproute2**, originally written by **Alexey Kuznetsov** and now maintained by **Stephen Hemminger**. It supersedes the deprecated **ifconfig** command from net-tools.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-address](/man/ip-address)(8), [ip-route](/man/ip-route)(8), [ip-tuntap](/man/ip-tuntap)(8), [ip-monitor](/man/ip-monitor)(8), [bridge](/man/bridge)(8), [ethtool](/man/ethtool)(8)
