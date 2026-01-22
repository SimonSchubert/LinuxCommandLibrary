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

# SYNOPSIS

**ip route get** _destination_ [_options_]

# PARAMETERS

**from** _SOURCE_
> Source address for route lookup

**iif** _DEVICE_
> Input interface (for forwarded packets)

**oif** _DEVICE_
> Force output interface

**tos** _TOS_
> Type of Service value

**vrf** _NAME_
> VRF instance name

**mark** _MARK_
> Firewall mark value

# DESCRIPTION

**ip route get** performs a route lookup and displays exactly which route the kernel would use for a given destination. This shows the complete route entry including gateway, interface, source address, and any other attributes.

Unlike ip route list, which shows stored routes, ip route get queries the kernel's routing decision for a specific packet, accounting for policy routing rules and route selection algorithms.

# CAVEATS

The output reflects the current routing state, which may change dynamically. VRF lookups require the VRF to be configured. Mark-based lookups require matching policy rules.

# HISTORY

ip route get is part of iproute2 and provides insight into the kernel's actual routing decisions, which can differ from the stored route table due to policy rules and route metrics.

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ip-route-list](/man/ip-route-list)(8), [ip-rule](/man/ip-rule)(8)
