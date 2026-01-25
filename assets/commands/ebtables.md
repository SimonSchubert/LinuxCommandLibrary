# TLDR

**List all rules**

```sudo ebtables -L```

**List rules with line numbers**

```sudo ebtables -L --Ln```

**Block MAC address**

```sudo ebtables -A INPUT -s [00:11:22:33:44:55] -j DROP```

**Allow only specific MAC**

```sudo ebtables -A INPUT -s ! [00:11:22:33:44:55] -j DROP```

**Drop packets by protocol**

```sudo ebtables -A FORWARD -p IPv4 -j DROP```

**Flush all rules**

```sudo ebtables -F```

**Save rules to file**

```sudo ebtables-save > [rules.txt]```

# SYNOPSIS

**ebtables** [_options_] [_command_] [_rule_]

# PARAMETERS

**-L**, **--list**
> List all rules.

**-A** _chain_
> Append rule to chain.

**-D** _chain_
> Delete rule from chain.

**-I** _chain_ [_num_]
> Insert rule at position.

**-F** [_chain_]
> Flush rules (all or specific chain).

**-P** _chain_ _target_
> Set chain policy.

**-p** _protocol_
> Match protocol (IPv4, IPv6, ARP).

**-s** _mac_
> Source MAC address.

**-d** _mac_
> Destination MAC address.

**-i** _interface_
> Input interface.

**-o** _interface_
> Output interface.

**-j** _target_
> Jump to target (ACCEPT, DROP, CONTINUE).

# DESCRIPTION

**ebtables** filters Ethernet frames at the link layer (Layer 2) in Linux bridges. It controls traffic passing through a bridge based on MAC addresses, VLAN tags, and Ethernet protocols, complementing iptables which operates at Layer 3.

Ebtables uses chains (INPUT, OUTPUT, FORWARD) and tables (filter, nat, broute) similar to iptables. It's essential for bridge firewall configurations and MAC-based access control.

# CAVEATS

Only applies to bridged traffic. Requires kernel bridge-nf support. Legacy tool; nftables provides unified filtering for modern systems. Must be used in conjunction with iptables for IP-level filtering. Rules don't persist across reboots without save/restore.

# HISTORY

ebtables was developed for the Linux kernel in the early **2000s** to provide Ethernet frame filtering for bridges. It was modeled after iptables to provide familiar syntax. The project is now considered legacy, with nftables recommended for new deployments.

# SEE ALSO

[iptables](/man/iptables)(8), [nft](/man/nft)(8), [brctl](/man/brctl)(8), [bridge](/man/bridge)(8)
