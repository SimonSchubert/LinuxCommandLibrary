# TLDR

**List all rules**

```sudo nft list ruleset```

**Add table**

```sudo nft add table inet [filter]```

**Add chain**

```sudo nft add chain inet [filter] [input] '{ type filter hook input priority 0; }'```

**Add rule**

```sudo nft add rule inet [filter] [input] tcp dport [22] accept```

**Delete rule**

```sudo nft delete rule inet [filter] [input] handle [5]```

**Load rules from file**

```sudo nft -f [/etc/nftables.conf]```

**Flush all rules**

```sudo nft flush ruleset```

# SYNOPSIS

**nft** [_options_] [_commands_]

# PARAMETERS

**list**
> List objects.

**add**
> Add object.

**delete**
> Delete object.

**flush**
> Flush objects.

**-f** _file_
> Read commands from file.

**-i**
> Interactive mode.

**-n**
> Numeric output.

# DESCRIPTION

**nftables** is the modern Linux firewall framework replacing iptables. It provides a single unified interface for IPv4, IPv6, ARP, and bridge filtering.

nftables uses a new syntax and improves on iptables performance and functionality.

# RULE EXAMPLE

```
table inet filter {
    chain input {
        type filter hook input priority 0;
        ct state established,related accept
        tcp dport 22 accept
        tcp dport 80 accept
        drop
    }
}
```

# CAVEATS

Different syntax from iptables. Replaces iptables, ip6tables, arptables, ebtables. Requires kernel support.

# HISTORY

nftables was developed by the **Netfilter** project, authored primarily by **Patrick McHardy** and **Pablo Neira Ayuso**, released in Linux kernel **3.13** (2014).

# SEE ALSO

[iptables](/man/iptables)(8), [firewalld](/man/firewalld)(1), [ufw](/man/ufw)(8), [netfilter](/man/netfilter)(7)
