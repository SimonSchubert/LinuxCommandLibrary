# TAGLINE

dumps the current iptables IPv4 configuration to stdout or a file

# TLDR

**Print** all rules

```sudo iptables-save```

Print **specific table**

```sudo iptables-save -t filter```

**Save** to file

```sudo iptables-save -f /etc/iptables.rules```

# SYNOPSIS

**iptables-save** [_OPTIONS_]

# DESCRIPTION

**iptables-save** dumps the current iptables IPv4 configuration to stdout or a file. The output can be restored using iptables-restore. Use ip6tables-save for IPv6 rules.

# PARAMETERS

**-t, --table** _table_
> Only output rules for the specified table (filter, nat, mangle, raw, security)

**-f, --file** _filename_
> Write output to file instead of stdout

**-c, --counters**
> Include packet and byte counters in output

# CAVEATS

This saves only IPv4 rules. Use ip6tables-save for IPv6. Rules are output in a format suitable for iptables-restore. Counter values change constantly on active systems.

# HISTORY

**iptables-save** is part of the **iptables** package for managing the Linux kernel firewall.

# SEE ALSO

[iptables](/man/iptables)(8), [iptables-restore](/man/iptables-restore)(8), [ip6tables-save](/man/ip6tables-save)(8)
