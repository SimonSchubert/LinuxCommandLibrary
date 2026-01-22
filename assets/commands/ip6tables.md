# TLDR

**List** all rules

```sudo ip6tables -L```

**List** rules with line numbers

```sudo ip6tables -L --line-numbers```

**Accept** traffic on port

```sudo ip6tables -A INPUT -p tcp --dport 22 -j ACCEPT```

**Drop** traffic from address

```sudo ip6tables -A INPUT -s 2001:db8::1 -j DROP```

**Delete** rule by number

```sudo ip6tables -D INPUT 1```

**Flush** all rules

```sudo ip6tables -F```

# SYNOPSIS

**ip6tables** [_OPTIONS_] [_chain_] [_rule-specification_]

# DESCRIPTION

**ip6tables** is the IPv6 packet filter administration tool. It has the same syntax and functionality as iptables but operates on IPv6 traffic. It manages rules for filtering, NAT, and packet mangling.

# PARAMETERS

**-L, --list**
> List all rules in the selected chain

**-A, --append**
> Append a rule to the end of chain

**-D, --delete**
> Delete a rule from chain

**-I, --insert**
> Insert a rule at position

**-F, --flush**
> Flush (delete all rules in) a chain

**-P, --policy**
> Set default policy for a chain

**-p, --protocol**
> Protocol to match (tcp, udp, icmpv6)

**--dport**
> Destination port

**-s, --source**
> Source address

**-j, --jump**
> Target (ACCEPT, DROP, REJECT, etc.)

# CAVEATS

IPv6 and IPv4 rules are managed separately. Rules are not persistent by default - use ip6tables-save/restore. Consider migrating to nftables for unified IPv4/IPv6 management.

# HISTORY

**ip6tables** is the IPv6 counterpart to **iptables**, part of the netfilter framework. It is being superseded by nftables.

# SEE ALSO

[iptables](/man/iptables)(8), [ip6tables-save](/man/ip6tables-save)(8), [nft](/man/nft)(8)
