# TAGLINE

restores iptables IPv4 rules from a file created by iptables-save

# TLDR

**Restore** from file

```sudo iptables-restore /etc/iptables.rules```

# SYNOPSIS

**iptables-restore** [_OPTIONS_] [_file_]

# DESCRIPTION

**iptables-restore** restores iptables IPv4 rules from a file created by iptables-save. Use ip6tables-restore for IPv6 rules. Input can be from a file or stdin.

# PARAMETERS

**-c, --counters**
> Restore packet and byte counter values

**-n, --noflush**
> Don't flush existing rules before restoring

**-t, --table** _table_
> Only restore the specified table

**-w, --wait** [_seconds_]
> Wait for xtables lock

**-T, --test**
> Test mode - parse rules but don't apply

# CAVEATS

By default, all existing rules are flushed before restore. Use -n to add rules without flushing. This only restores IPv4 rules; use ip6tables-restore for IPv6.

# HISTORY

**iptables-restore** is part of the **iptables** package for managing the Linux kernel firewall.

# SEE ALSO

[iptables](/man/iptables)(8), [iptables-save](/man/iptables-save)(8), [ip6tables-restore](/man/ip6tables-restore)(8)
