# TAGLINE

Insert an Uncomplicated Firewall rule at a numbered position

# TLDR

List rules with **numbers**

```sudo ufw status numbered```

**Insert** a deny rule as rule number 1

```sudo ufw insert 1 deny from [source_address]```

Insert an **allow** for a port and protocol at a chosen position

```sudo ufw insert [3] allow [22]/tcp```

Insert a **full-syntax** rule at a position

```sudo ufw insert 3 deny to any port 22 from 10.0.0.135 proto tcp```

Insert a **rate limit** rule

```sudo ufw insert [2] limit [22]/tcp```

**Preview** an insertion without applying it

```sudo ufw --dry-run insert [3] deny from [source_address]```

# SYNOPSIS

**ufw** [_--dry-run_] **insert** _NUM_ **allow**|**deny**|**reject**|**limit** [_rule_]

**ufw** [_--dry-run_] **route insert** _NUM_ **allow**|**deny**|**reject**|**limit** [_rule_]

# PARAMETERS

**insert** _NUM_
> Place the new user rule at that 1-based position. Later rules shift down. Read positions from `ufw status numbered`

**route insert** _NUM_
> Same positioning for a forwarded rule. See **ufw route**

**allow** / **deny** / **reject** / **limit**
> Action of the inserted rule. The rest of the line is normal ufw rule syntax: a port, an application profile, or the full **from** / **to** / **port** / **proto** / **on** form

**comment** '_text_'
> Attach a comment to the new rule. **insert** cannot change the comment on a rule that already exists

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw insert** adds an Uncomplicated Firewall rule at a specific position instead of appending it. It is a **ufw** subcommand, not a separate binary.

The first matching rule wins, so position is the point of the command. With four rules already loaded, `ufw insert 3 deny to any port 22 from 10.0.0.135 proto tcp` makes the new rule number 3 and shifts the previous third and fourth rules down.

**prepend** is the form that does not take a number: it places the rule ahead of every existing rule of the same IP version. **route insert** uses the same numbering for traffic forwarded through the host.

# CAVEATS

Requires root or sudo. Check `ufw status numbered` immediately before inserting. Deletes and earlier inserts renumber the list. Inserting a rule that blocks the current SSH session can lock you out. Prefer **--dry-run** on a remote host.

When IPv6 is enabled, a generic rule such as `ufw allow 22/tcp` creates paired IPv4 and IPv6 entries. **insert** adds a rule; it does not rewrite rules already in the list.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables and nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-23 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-prepend](/man/ufw-prepend)(8), [ufw-delete](/man/ufw-delete)(8), [ufw-status](/man/ufw-status)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-route](/man/ufw-route)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://manpages.ubuntu.com/manpages/man8/ufw.8.html)```

<!-- verified: 2026-11-23 -->
