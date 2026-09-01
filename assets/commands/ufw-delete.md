# TAGLINE

Remove Uncomplicated Firewall rules by specification or number

# TLDR

List rules with **numbers** first

```sudo ufw status numbered```

**Delete** a rule by its number (prompts for confirmation)

```sudo ufw delete [3]```

Delete by number **without** a confirmation prompt

```sudo ufw --force delete [3]```

Delete by repeating the **original rule**

```sudo ufw delete deny 80/tcp```

Delete an **allow** by port and protocol

```sudo ufw delete allow 22/tcp```

Delete a **full-syntax** rule

```sudo ufw delete deny proto tcp from 10.0.0.0/8 to 192.168.0.1 port 25```

**Preview** a deletion without applying it

```sudo ufw --dry-run delete [3]```

# SYNOPSIS

**ufw** [_--dry-run_] [_--force_] **delete** _NUM_

**ufw** [_--dry-run_] **delete** _allow_|_deny_|_reject_|_limit_ [_rule_]

**ufw** [_--dry-run_] **route delete** _allow_|_deny_|_reject_|_limit_ [_rule_]

# PARAMETERS

**delete** _NUM_
> Remove the user rule with that index from `ufw status numbered`

**delete** _RULE_
> Remove the rule that matches the original **allow** / **deny** / **reject** / **limit** command (comment optional)

**route delete**
> Remove a forwarded/routed rule, using the same syntax as `ufw route ...`

**--force**
> Skip the confirmation prompt when deleting by number

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw delete** removes a previously added Uncomplicated Firewall user rule. It is a **ufw** subcommand, not a separate binary.

Two forms exist. **By number:** run `ufw status numbered`, then `ufw delete N`. Numbers are 1-based positions in that listing and shift after each deletion, so re-check the list between deletes. **By specification:** prefix the original add command with **delete**, for example `ufw delete deny 80/tcp`. The comment from the original rule may be omitted.

When IPv6 is enabled, a generic rule such as `ufw allow 22/tcp` creates paired IPv4 and IPv6 entries. Deleting by number removes only the numbered row. Prefixing the original rule with **delete** removes both versions in one command.

# CAVEATS

Requires root or sudo. Deleting the rule that permits your current SSH session can lock you out; prefer `--dry-run` and keep an alternate path. After a numbered delete, later rule numbers change. Multi-port rules must be deleted as a whole (you cannot drop one port from a `80,443` rule). `ufw delete` only affects ufw-managed user rules, not custom chains in `/etc/ufw/before.rules` or `/etc/ufw/after.rules`.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-status](/man/ufw-status)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-deny](/man/ufw-deny)(8), [ufw-default](/man/ufw-default)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-09-01 -->
