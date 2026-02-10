# TAGLINE

manipulates IPv4 route metrics for network interfaces

# TLDR

Set the **priority** of a network interface (higher number = lower priority)

```sudo ifmetric [interface] [value]```

**Reset** the priority of an interface to default

```sudo ifmetric [interface] 0```

# SYNOPSIS

**ifmetric** _interface_ _metric_

# PARAMETERS

_interface_
> Name of the network interface (e.g., eth0, wlan0)

_metric_
> Route metric value (higher values mean lower priority, 0 resets to default)

# DESCRIPTION

**ifmetric** manipulates IPv4 route metrics for network interfaces. Route metrics determine which interface is preferred when multiple routes to the same destination exist - lower metric values have higher priority.

This is useful for systems with multiple network connections (e.g., wired and wireless) where you want to control which connection is preferred for outgoing traffic.

# CAVEATS

Requires root privileges. Only affects IPv4 routes. Changes are not persistent across reboots unless scripted. Does not work with IPv6 routes.

# HISTORY

ifmetric was created by Lennart Poettering (who later created PulseAudio and systemd) to provide a simple way to manipulate routing metrics without complex ip route commands.

# SEE ALSO

[ip](/man/ip)(8), [route](/man/route)(8), [ifup](/man/ifup)(8)
