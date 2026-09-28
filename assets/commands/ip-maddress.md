# TAGLINE

manages link-layer multicast addresses

# TLDR

**List** all multicast addresses

```ip maddress```

List multicast addresses for a **specific device**

```ip maddress show dev [eth0]```

List only **IPv6** multicast group memberships

```ip -6 maddress show```

**Add** a static link-layer multicast address

```sudo ip maddress add [33:33:00:00:00:02] dev [eth0]```

**Remove** a static link-layer multicast address

```sudo ip maddress delete [33:33:00:00:00:02] dev [eth0]```

Display **help**

```ip maddress help```

# SYNOPSIS

**ip** [_options_] **maddress** { _command_ | **help** }

**ip maddress** [**add** | **del**] _MULTIADDR_ **dev** _NAME_

**ip maddress show** [**dev** _NAME_]

# PARAMETERS

**show** [**dev** _DEVICE_]
> Display multicast addresses (optionally for specific device)

**add** _LLADDRESS_ **dev** _DEVICE_
> Attach a static link-layer multicast address to listen on the device

**delete**, **del** _LLADDRESS_ **dev** _DEVICE_
> Detach a static link-layer multicast address from the device

**-4**, **-6**
> Global **ip** options to restrict output to IPv4 or IPv6 groups

**help**
> Display help information

# DESCRIPTION

**ip maddress** manages link-layer multicast addresses. It displays which multicast groups (link, IPv4 and IPv6) a device is subscribed to and allows manual addition or removal of static link-layer multicast addresses. The object name can be abbreviated, e.g. **maddr**.

Multicast addresses enable one-to-many communication, where a single packet can be received by multiple hosts that have joined the multicast group. This is commonly used for service discovery, streaming, and cluster communication.

# CAVEATS

Adding and deleting multicast addresses requires root privileges. Changes are not persistent across reboots. **add** and **delete** only manage link-layer (MAC) addresses: it is impossible to join protocol (IGMP/MLD) multicast groups statically with this command; applications join those via socket options.

# HISTORY

The ip maddress command is part of iproute2, the modern replacement for the older net-tools package. iproute2 was developed by Alexey Kuznetsov in the late **1990s** to provide a unified interface to Linux networking features.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ip-address](/man/ip-address)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-maddress.8.html)```

<!-- verified: 2026-09-29 -->
