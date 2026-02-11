# TAGLINE

XDP-based network packet filtering

# TLDR

**Load** filter on interface

```sudo xdp-filter load -p allow -m skb [network_interface]```

**Unload** filter

```sudo xdp-filter unload [network_interface]```

**Deny** destination port

```sudo xdp-filter port [destination_port]```

Deny **source IP**

```sudo xdp-filter ip -m src [source_ip]```

Deny **source MAC**

```sudo xdp-filter ether -m src [mac_address]```

Show **statistics**

```sudo xdp-filter poll -i 10000```

# SYNOPSIS

**xdp-filter** _COMMAND_ [_OPTIONS_]

# PARAMETERS

**load** _INTERFACE_
> Load filter on network interface

**unload** _INTERFACE_
> Unload filter from interface

**port** _PORT_
> Filter by port number

**ip** _ADDRESS_
> Filter by IP address

**ether** _ADDRESS_
> Filter by MAC address

**poll**
> Show statistics

**-p, --policy** _POLICY_
> Set default policy (allow/deny)

**-m, --mode** _MODE_
> Filter mode (src/dst for direction, skb/native for XDP mode)

**-i, --interval** _MS_
> Poll interval in milliseconds

# DESCRIPTION

**xdp-filter** loads and manages eBPF XDP (eXpress Data Path) packet filters. It provides high-performance packet filtering at the network driver level, before packets reach the kernel networking stack.

Part of the xdp-tools collection for managing XDP programs.

# CAVEATS

Requires root privileges. Not all network drivers support native XDP mode. Filters operate at layer 2/3, not application layer.

# SEE ALSO

[iptables](/man/iptables)(8), [nftables](/man/nftables)(8), [tc](/man/tc)(8)
