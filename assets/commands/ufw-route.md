# TAGLINE

Manage Uncomplicated Firewall rules for forwarded traffic

# TLDR

**Allow** traffic forwarded from one interface to another

```sudo ufw route allow in on eth0 out on eth1```

Allow a **subnet** to reach a host on one port and protocol

```sudo ufw route allow from 10.0.0.0/24 to [destination_address] port [80] proto tcp```

**Deny** forwarded traffic to an address

```sudo ufw route deny to [destination_address]```

**Reject** forwarded traffic leaving an interface

```sudo ufw route reject out on [eth1]```

**Insert** a route rule at a numbered position

```sudo ufw route insert [1] deny from [source_address]```

**Delete** a route rule by repeating it

```sudo ufw route delete deny to 192.168.0.12```

**Preview** a route rule without applying it

```sudo ufw --dry-run route allow in on eth0 out on eth1```

# SYNOPSIS

**ufw** [_--dry-run_] **route** [**delete**] [**insert** _NUM_] [**prepend**] **allow**|**deny**|**reject**|**limit** [_rule_]

# PARAMETERS

**route**
> Match traffic forwarded through this host, not traffic destined to the host

**allow** / **deny** / **reject** / **limit**
> Action for matching forwarded packets

**in on** _interface_
> Interface the forwarded packet arrives on

**out on** _interface_
> Interface the forwarded packet leaves on

**from** _address_ / **to** _address_
> Source and destination. **to** is often a host behind the firewall, not this machine

**port** _port_ / **proto** _protocol_
> Destination port and protocol, as in other ufw rules. An application profile uses **app** in place of **port**

**insert** _NUM_
> Place the route rule at that 1-based position

**prepend**
> Place the route rule ahead of other route rules of the same IP version

**delete**
> Remove the route rule given in the rest of the command. Numbered removal is `ufw delete NUM` after `ufw status numbered`

**comment** '_text_'
> Attach a comment to the rule

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw route** manages rules for packets routed through the host. It is a **ufw** subcommand, not a separate binary.

Ordinary **allow** and **deny** rules apply when this machine is an endpoint. A route rule applies when the packet should leave toward another host. `ufw route allow in on eth0 out on eth1 to 12.34.45.67 port 80 proto tcp` accepts packets that arrive on eth0 and are forwarded out eth1 to TCP port 80 on that address.

In `ufw status`, forwarded rules are marked **ALLOW FWD** (or the matching deny, reject, or limit action). Input and output rules print the interface relative to this host as an endpoint. Route rules print it relative to the direction packets flow through the firewall.

The default policy for routed traffic is deny. A route rule does not turn forwarding on. Enable IPv4 forwarding and IPv6 forwarding for `default` and `all` in `/etc/ufw/sysctl.conf`, then run `ufw disable` and `ufw enable` so ufw reloads those settings. Another sysctl configuration can override that file. See **sysctl**.

# CAVEATS

Requires root or sudo. Turning on forwarding makes the host a router. Keep the default routed policy at deny unless every forwarded flow is intentional.

Route syntax is not OpenBSD PF syntax. Interfaces are written **in on** and **out on**, matching netfilter's FORWARD chain.

Deleting by number removes one numbered row. When IPv6 is enabled, prefixing the original rule with **route delete** is the form that drops the rule as specified rather than a single numbered row.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables and nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-23 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-default](/man/ufw-default)(8), [ufw-delete](/man/ufw-delete)(8), [ufw-insert](/man/ufw-insert)(8), [ufw-prepend](/man/ufw-prepend)(8), [sysctl](/man/sysctl)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://manpages.ubuntu.com/manpages/man8/ufw.8.html)```

<!-- verified: 2026-11-23 -->
