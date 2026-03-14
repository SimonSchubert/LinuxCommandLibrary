# TAGLINE

Restore IPv6 firewall rules from file

# TLDR

This command is an alias of **iptables-restore** for IPv6 firewall

```tldr iptables-restore```

# SYNOPSIS

**ip6tables-restore** [_options_] [_file_]

# DESCRIPTION

**ip6tables-restore** restores IPv6 firewall rules previously saved by **ip6tables-save**. It is functionally identical to **iptables-restore** but operates on the IPv6 **ip6tables** ruleset instead of the IPv4 **iptables** ruleset.

# SEE ALSO

[iptables-restore](/man/iptables-restore)(8), [ip6tables](/man/ip6tables)(8), [ip6tables-save](/man/ip6tables-save)(8), [iptables](/man/iptables)(8)
