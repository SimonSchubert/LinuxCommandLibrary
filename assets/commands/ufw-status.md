# TAGLINE

show Uncomplicated Firewall state and rules

# TLDR

Show whether the firewall is **active** and list rules

```sudo ufw status```

List rules with **numbers** (needed before deleting by number)

```sudo ufw status numbered```

**Verbose** status: default policies and listening ports

```sudo ufw status verbose```

# SYNOPSIS

**ufw** [_--dry-run_] **status** [_numbered_ | _verbose_]

# PARAMETERS

**status**
> Print firewall activity and the current rule set.

**numbered**
> Include a number for each user rule (use with **ufw delete** _N_).

**verbose**
> Include default incoming/outgoing/routed policies, logging level, and listening sockets.

**--dry-run**
> Global ufw flag: show what would change without applying (has no effect on a read-only status query).

# DESCRIPTION

**ufw status** reports whether Uncomplicated Firewall is active and prints the user rules currently loaded. After **ufw enable**, a typical line of output includes the policy (ALLOW/DENY/REJECT/LIMIT), direction, and port or application profile.

**numbered** is the usual step before **ufw delete** _number_. **verbose** adds the default policies that apply when no rule matches, plus ports ufw knows are listening.

This is a **ufw** subcommand, not a separate binary.

# CAVEATS

Reading status often needs root because rule files and iptables/nftables state are privileged. An inactive firewall still prints `Status: inactive` even if leftover netfilter rules exist from another tool.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), Ubuntu's frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-enable](/man/ufw-enable)(8), [ufw-disable](/man/ufw-disable)(8), [ufw-allow](/man/ufw-allow)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-08-26 -->
