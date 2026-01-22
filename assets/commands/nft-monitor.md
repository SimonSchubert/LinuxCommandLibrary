# TLDR

Monitor **all nftables events**

```sudo nft monitor```

Monitor only **rule updates** (add, delete, replace)

```sudo nft monitor rules```

Monitor **set and element** updates

```sudo nft monitor sets```

Monitor events and print **JSON output**

```sudo nft -j monitor```

# SYNOPSIS

**nft monitor** [_object_]

# PARAMETERS

**rules**
> Monitor only rule changes

**sets**
> Monitor only set and element changes

**tables**
> Monitor only table changes

**chains**
> Monitor only chain changes

**-j, --json**
> Output events in JSON format

# DESCRIPTION

**nft monitor** displays real-time changes to the nftables firewall configuration. It subscribes to netlink notifications and shows when rules, sets, chains, or tables are added, modified, or deleted.

Events are displayed as they occur, showing the exact nftables commands that would recreate the change. This is useful for debugging firewall behavior, auditing changes, or understanding how other tools modify the firewall.

Without a filter argument, all nftables events are shown. Specifying an object type (rules, sets, etc.) filters the output to only those changes.

# CAVEATS

Requires root privileges to access netlink notifications. The monitor runs continuously until interrupted with **Ctrl+C**. High-frequency changes (like connection tracking updates) may produce substantial output. Only shows changes made while monitoring is active.

# SEE ALSO

[nft](/man/nft)(8), [iptables](/man/iptables)(8), [conntrack](/man/conntrack)(8)
