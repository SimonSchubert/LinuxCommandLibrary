# TAGLINE

Add an Uncomplicated Firewall rule ahead of existing rules

# TLDR

**Deny** a source address ahead of the current rules

```sudo ufw prepend deny from [source_address]```

Prepend a deny for a **subnet**

```sudo ufw prepend deny from 192.168.0.0/24```

**Reject** traffic from a source to one port

```sudo ufw prepend reject from [source_address] to any port [25]```

Prepend an **allow** for a port and protocol

```sudo ufw prepend allow [22]/tcp```

Prepend a **routed** rule

```sudo ufw route prepend deny to [destination_address]```

**Preview** a prepend without applying it

```sudo ufw --dry-run prepend deny from [source_address]```

# SYNOPSIS

**ufw** [_--dry-run_] **prepend** **allow**|**deny**|**reject**|**limit** [_rule_]

**ufw** [_--dry-run_] **route prepend** **allow**|**deny**|**reject**|**limit** [_rule_]

# PARAMETERS

**prepend**
> Insert the rule before every existing user rule of the same IP version. No rule number is required

**route prepend**
> Same placement for a forwarded rule

**allow** / **deny** / **reject** / **limit**
> Action of the new rule. The rest of the line is normal ufw rule syntax

**comment** '_text_'
> Attach a comment to the new rule. **prepend** cannot change the comment on a rule that already exists

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw prepend** adds a rule at the front of the matching ruleset. It is a **ufw** subcommand, not a separate binary.

Unlike **ufw insert**, prepend does not take a position. An IPv4 rule is placed before every other IPv4 rule. An IPv6 rule is placed before every other IPv6 rule. That is the form used by dynamic firewalls and intrusion-prevention hooks, which must push a block ahead of rules already loaded without looking up a number.

The rule body is the same syntax as **ufw allow**, **ufw deny**, **ufw reject**, and **ufw limit**, including the full **from** / **to** / **port** / **proto** form. **ufw route prepend** targets traffic forwarded through the host rather than traffic destined to it.

# CAVEATS

Requires root or sudo. A broad prepended allow can shadow a later, more specific deny, because the first match wins. A prepended deny of the current SSH source can lock you out. Prefer **--dry-run**.

IPv4 and IPv6 lists are ordered separately, so the new rule is not always number 1 in the combined `ufw status numbered` listing.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables and nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-23 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-insert](/man/ufw-insert)(8), [ufw-delete](/man/ufw-delete)(8), [ufw-status](/man/ufw-status)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-deny](/man/ufw-deny)(8), [ufw-route](/man/ufw-route)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://manpages.ubuntu.com/manpages/man8/ufw.8.html)```

<!-- verified: 2026-11-23 -->
