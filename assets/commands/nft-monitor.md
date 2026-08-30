# TAGLINE

displays real-time changes to the nftables firewall configuration

# TLDR

Watch **every change** to the ruleset as it happens

```sudo nft monitor```

Watch **rule changes** only

```sudo nft monitor rules```

Watch **set and element** changes only

```sudo nft monitor sets```

Watch only what is **added**

```sudo nft monitor new rules```

Watch only what is **removed**

```sudo nft monitor destroy rules```

Emit **JSON** so a program can consume the stream

```sudo nft -j monitor```

**Follow packets** through the ruleset, once a rule has set nftrace

```sudo nft monitor trace```

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

# INSTALL

```apt: sudo apt install nftables```

```dnf: sudo dnf install nftables```

```pacman: sudo pacman -S nftables```

```apk: sudo apk add nftables```

```zypper: sudo zypper install nftables```

```brew: brew install nftables```

```nix: nix profile install nixpkgs#nftables```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nft](/man/nft)(8), [iptables](/man/iptables)(8), [conntrack](/man/conntrack)(8)
