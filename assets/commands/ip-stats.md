# TAGLINE

manages and displays network interface statistics

# TLDR

Show **all** interface statistics

```ip stats```

Show statistics for a **specific interface**

```ip stats show dev [eth0]```

Show **link-layer** statistics

```ip stats show group link```

Show **hardware offload** statistics

```ip stats show group offload```

Show offload statistics for **specific interface**

```ip stats show dev [eth0] group offload```

Show specific **offload subgroup**

```ip stats show dev [eth0] group offload subgroup [l3_stats|cpu_hit|hw_stats_info]```

Show **bridge** STP, multicast or VLAN statistics

```ip stats show dev [br0] group xstats subgroup bridge suite [stp|mcast|vlan]```

Show **LACP** statistics for a bond

```ip stats show dev [bond0] group xstats subgroup bond suite 802.3ad```

Show **MPLS** statistics

```ip stats show dev [eth0] group afstats subgroup mpls```

Output as **JSON**

```ip -j -p stats show dev [eth0] group link```

**Enable** L3 hardware statistics

```ip stats set dev [eth0] l3_stats on```

# SYNOPSIS

**ip stats** { _command_ | **help** }

**ip stats show** [**dev** _DEV_] [**group** _GROUP_ [**subgroup** _SUBGROUP_ [**suite** _SUITE_] ...] ...] ...

**ip stats set dev** _DEV_ **l3_stats** { **on** | **off** }

# PARAMETERS

**show** [**dev** _DEVICE_]
> Display statistics

**set** **dev** _DEVICE_
> Configure statistics collection

**group** _GROUP_
> Statistics group: link, offload, xstats, xstats_slave, afstats. Several groups may be given

**subgroup** _SUBGROUP_
> Specific subgroup within a group: cpu_hit, hw_stats_info, l3_stats (offload); bridge, bond (xstats); mpls (afstats)

**suite** _SUITE_
> Specific suite within a subgroup, e.g. stp, mcast, vlan (bridge) or 802.3ad (bond)

**l3_stats** _on|off_
> Enable/disable L3 hardware statistics

# DESCRIPTION

**ip stats** manages and displays network interface statistics. It provides access to both software-maintained counters and hardware offload statistics where supported.

Statistics groups include link-layer counters (the same as **ip -s link show**), hardware offload metrics, extended per-device-type statistics for bridges and bonds, and address-family specific statistics like MPLS. By default, all stats are requested. Hardware statistics collection may need to be explicitly enabled.

# CAVEATS

Hardware offload statistics require driver and hardware support. Some statistics may not be available on all interfaces. L3 offload statistics are disabled by default and must be enabled with **ip stats set**; use subgroup **hw_stats_info** to check whether a driver actually installed the counters. Requires iproute2 5.19 or newer.

# HISTORY

ip stats was added in iproute2 **5.19** (2022), contributed by Petr Machata, to expose the kernel's RTM_GETSTATS interface, including the L3 hardware offload statistics introduced in Linux 5.18.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ip-monitor](/man/ip-monitor)(8), [ifstat](/man/ifstat)(1), [nstat](/man/nstat)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-stats.8.html)```

<!-- verified: 2026-09-29 -->
