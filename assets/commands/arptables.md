# TLDR

**List** ARP rules

```sudo arptables -L```

**Drop** packets from IP

```sudo arptables -A INPUT -s 192.168.0.1 -j DROP```

**Delete** rule by number

```sudo arptables -D INPUT rule_number```

**Flush** all rules

```sudo arptables -F```

Set **default policy**

```sudo arptables -P OUTPUT ACCEPT```

**Save** rules to file

```sudo arptables-save > path/to/file```

# SYNOPSIS

**arptables** [_OPTIONS_] _chain_ _rule-specification_

# DESCRIPTION

**arptables** manages ARP (Address Resolution Protocol) packet filtering rules. It is similar to iptables but operates at the ARP level, allowing control over which ARP requests and replies are accepted or dropped.

# PARAMETERS

**-L, --list**
> List all rules in selected chain or all chains

**-A, --append**
> Append rule to the end of chain

**-D, --delete**
> Delete matching rule or rule by number

**-F, --flush**
> Flush all rules

**-P, --policy**
> Set default policy for a chain

**-s, --source-ip** _address_
> Match source IP address

**-d, --destination-ip** _address_
> Match destination IP address

**-j, --jump** _target_
> Target for rule (ACCEPT, DROP, etc.)

# CAVEATS

Requires root privileges. Uses the nftables backend on modern systems. ARP filtering operates at layer 2/3 boundary and may affect network connectivity if misconfigured.

# HISTORY

**arptables** is part of the **xtables-nft** suite, providing ARP packet filtering integrated with the netfilter framework.

# SEE ALSO

[iptables](/man/iptables)(8), [nft](/man/nft)(8), [arp](/man/arp)(8)
