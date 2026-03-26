# TAGLINE

command-line interface for nftables packet filtering

# TLDR

**List current ruleset**

```sudo nft list ruleset```

**Add a table**

```sudo nft add table inet [filter]```

**Add a chain with a hook**

```sudo nft add chain inet [filter] [input] \{ type filter hook input priority 0 \; policy accept \; \}```

**Add a rule to accept specific ports**

```sudo nft add rule inet [filter] [input] tcp dport \{ ssh, http, https \} accept```

**Delete a rule by handle**

```sudo nft delete rule inet [filter] [input] handle [3]```

**Flush all rules**

```sudo nft flush ruleset```

**Save ruleset to file**

```sudo nft list ruleset > /etc/nftables.conf```

# SYNOPSIS

**nft** [_OPTIONS_] [_commands_]

# DESCRIPTION

**nft** is the command-line interface for nftables, the modern Linux kernel packet filtering framework that replaces iptables, ip6tables, arptables, and ebtables with a unified syntax and improved performance.

nftables uses a hierarchy of tables, chains, and rules. Address families include **inet** (IPv4+IPv6), **ip** (IPv4 only), **ip6** (IPv6 only), **bridge**, **arp**, and **netdev**. Rules can be loaded from files using `nft -f /etc/nftables.conf`.

# PARAMETERS

**list ruleset**
> Display the current complete ruleset

**add table** _family_ _name_
> Create a new table

**add chain** _family_ _table_ _chain_ _specification_
> Create a new chain

**add rule** _family_ _table_ _chain_ _statement_
> Add a rule to a chain

**delete rule** _family_ _table_ _chain_ **handle** _n_
> Delete a rule by its handle

**flush ruleset**
> Remove all rules and tables

**--handle**
> Show rule handles for deletion

**--numeric**
> Show numeric output (no name resolution)

# CAVEATS

Nftables syntax differs significantly from iptables. Tables must exist before chains, chains before rules. Changes are immediate but not persistent by default - save to /etc/nftables.conf for persistence.

# HISTORY

**nft** is part of the **nftables** project, the successor to iptables, providing unified packet classification framework in the Linux kernel.

# SEE ALSO

[iptables](/man/iptables)(8), [firewall-cmd](/man/firewall-cmd)(1)
