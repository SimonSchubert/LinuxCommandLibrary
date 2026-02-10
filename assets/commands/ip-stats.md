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

**Enable** L3 hardware statistics

```ip stats set dev [eth0] l3_stats on```

# SYNOPSIS

**ip stats** [_command_] [_options_]

# PARAMETERS

**show** [**dev** _DEVICE_]
> Display statistics

**set** **dev** _DEVICE_
> Configure statistics collection

**group** _GROUP_
> Statistics group: link, offload, afstats

**subgroup** _SUBGROUP_
> Specific subgroup within a group

**l3_stats** _on|off_
> Enable/disable L3 hardware statistics

# DESCRIPTION

**ip stats** manages and displays network interface statistics. It provides access to both software-maintained counters and hardware offload statistics where supported.

Statistics groups include link-layer counters, hardware offload metrics, and address-family specific statistics like MPLS. Hardware statistics collection may need to be explicitly enabled.

# CAVEATS

Hardware offload statistics require driver and hardware support. Some statistics may not be available on all interfaces. Enabling statistics collection may have a performance impact.

# HISTORY

ip stats was added to iproute2 to provide unified access to various network statistics including hardware offload metrics that became available in newer kernel versions.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ifstat](/man/ifstat)(1)
