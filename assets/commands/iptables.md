# TLDR

**View** chains, rules, and counters with line numbers

```sudo iptables -vnL --line-numbers```

Set chain **policy** rule

```sudo iptables -P [chain] [rule]```

**Append** rule to chain for an IP

```sudo iptables -A [chain] -s [ip_address] -j [rule]```

Append rule for IP with **protocol and port**

```sudo iptables -A [chain] -s [ip_address] -p tcp --dport [port] -j [rule]```

Add a **NAT masquerade** rule

```sudo iptables -t nat -A POSTROUTING -s 192.168.0.0/24 -j MASQUERADE```

**Delete** a chain rule by line number

```sudo iptables -D [chain] [rule_line_number]```

**Flush** all rules

```sudo iptables -F```

# SYNOPSIS

**iptables** [_-t table_] _command_ [_chain_] [_options_] [_-j target_]

# DESCRIPTION

**iptables** is the administration tool for IPv4 packet filtering and NAT in the Linux kernel firewall (netfilter). It allows configuration of tables, chains, and rules to control network traffic.

# PARAMETERS

**-L, --list**
> List all rules in selected chain

**-A, --append chain**
> Append rule to chain

**-D, --delete chain**
> Delete rule from chain

**-I, --insert chain**
> Insert rule at position in chain

**-P, --policy chain target**
> Set default policy for chain

**-F, --flush**
> Flush all rules

**-t, --table table**
> Specify table (filter, nat, mangle, raw)

**-s, --source address**
> Source address specification

**-d, --destination address**
> Destination address specification

**-p, --protocol protocol**
> Protocol (tcp, udp, icmp, all)

**--dport port**
> Destination port

**--sport port**
> Source port

**-j, --jump target**
> Target for rule (ACCEPT, DROP, REJECT, MASQUERADE, etc.)

**-v, --verbose**
> Verbose output

**-n, --numeric**
> Numeric output (don't resolve names)

**--line-numbers**
> Show line numbers

# CAVEATS

Rules are not persistent by default; use **iptables-save** and **iptables-restore** for persistence. Use **ip6tables** for IPv6 traffic. Modern systems may use **nftables** instead.

# HISTORY

Part of the **netfilter** project. Introduced in **Linux 2.4** (2001) as a replacement for ipchains. Being gradually replaced by **nftables**.

# SEE ALSO

[ip6tables](/man/ip6tables)(8), [iptables-save](/man/iptables-save)(8), [iptables-restore](/man/iptables-restore)(8), [nft](/man/nft)(8), [firewall-cmd](/man/firewall-cmd)(1)
