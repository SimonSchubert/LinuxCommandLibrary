# TAGLINE

OpenWRT utility that displays network interface status in JSON format

# TLDR

Display **interface status** in JSON format

```ifstatus [interface_name]```

Display **help**

```ifstatus```

# SYNOPSIS

**ifstatus** _interface_

# PARAMETERS

_interface_
> Name of the network interface to query

# DESCRIPTION

**ifstatus** is an OpenWRT utility that displays network interface status in JSON format. It queries the netifd (network interface daemon) for detailed information about interface configuration and state.

The output includes IP addresses, DNS servers, connection state, protocol type, and other interface-specific information in a machine-readable format suitable for scripts and automation.

# CAVEATS

Only available on OpenWRT/LEDE systems. Interface names correspond to netifd logical interfaces, not kernel device names. Requires netifd to be running.

# HISTORY

ifstatus is part of netifd, the OpenWRT network interface daemon introduced in OpenWRT **12.09** (Attitude Adjustment). It replaced the older hotplug-based network configuration system with a more robust daemon-based approach.

# SEE ALSO

[ubus](/man/ubus)(1), [uci](/man/uci)(1), [netifd](/man/netifd)(8)
