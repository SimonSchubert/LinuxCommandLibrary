# TAGLINE

performs a route lookup and displays exactly which route the kernel would use

# TLDR

Print **route to destination**

```ip route get [1.1.1.1]```

Print route from a **specific source**

```ip route get [destination] from [source]```

Print route for packets arriving on a **specific interface**

```ip route get [destination] iif [eth0]```

Print route forcing output through **specific interface**

```ip route get [destination] oif [eth0]```

Print route with **Type of Service**

```ip route get [destination] tos [0x10]```

Print route using **VRF** instance

```ip route get [destination] vrf [myvrf]```

Print route for a packet with a **firewall mark** (policy routing)

```ip route get [destination] mark [0x1]```

Show the **matching FIB entry** instead of the resolved route

```ip route get fibmatch [destination]```

Look up a route for a specific **protocol and port**

```ip route get [destination] ipproto [tcp] dport [443]```

Look up an **IPv6** route

```ip -6 route get [2606:4700:4700::1111]```

# SYNOPSIS

**ip route get** [**fibmatch**] _ADDRESS_ [**from** _ADDRESS_] [**iif** _DEV_] [**oif** _DEV_] [**mark** _MARK_] [**tos** _TOS_] [**vrf** _NAME_] [**ipproto** _PROTOCOL_] [**sport** _NUMBER_] [**dport** _NUMBER_] [**connected**]

# PARAMETERS

**fibmatch**
> Return the full FIB lookup matched route instead of the resolved destination entry

**to** _ADDRESS_
> Destination address (the **to** keyword is optional)

**from** _SOURCE_
> Source address for route lookup

**iif** _DEVICE_
> Input interface (for forwarded packets)

**oif** _DEVICE_
> Force output interface

**tos**, **dsfield** _TOS_
> Type of Service value

**vrf** _NAME_
> VRF instance name

**mark** _MARK_
> Firewall mark (fwmark) value

**ipproto** _PROTOCOL_
> IP protocol as seen by the route lookup

**sport** _NUMBER_, **dport** _NUMBER_
> Source and destination port as seen by the route lookup

**connected**
> If no **from** is given, redo the lookup with the source set to the preferred address from the first lookup

# DESCRIPTION

**ip route get** performs a route lookup and displays exactly which route the kernel would use for a given destination. This shows the complete route entry including gateway, interface, source address, and any other attributes.

Unlike ip route list, which shows stored routes, ip route get queries the kernel's routing decision for a specific packet, accounting for policy routing rules and route selection algorithms. It is equivalent to sending a packet along this path, but no packets are actually sent. Without **iif**, the kernel resolves a route for locally generated output; with **iif**, it pretends a packet arrived on that interface and looks for a forwarding path.

# CAVEATS

The output reflects the current routing state, which may change dynamically. VRF lookups require the VRF to be configured. Mark-based lookups require matching policy rules. Using **iif** requires IP forwarding to be enabled, otherwise the lookup may fail.

# HISTORY

ip route get is part of iproute2 and provides insight into the kernel's actual routing decisions, which can differ from the stored route table due to policy rules and route metrics.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ip-route-list](/man/ip-route-list)(8), [ip-rule](/man/ip-rule)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-route.8.html)```

<!-- verified: 2026-09-29 -->
