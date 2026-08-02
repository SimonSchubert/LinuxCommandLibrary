# TAGLINE

Block traffic through Uncomplicated Firewall

# TLDR

**Deny** all traffic on a port

```sudo ufw deny [port]```

Deny traffic for a **protocol** on a port

```sudo ufw deny [port]/[protocol]```

Deny all traffic **from** a source address

```sudo ufw deny from [source_address]```

Deny all traffic from a **subnet**

```sudo ufw deny from 192.168.13.0/24```

Deny **UDP** from one host to another on a port

```sudo ufw deny from 192.168.1.12 to 192.168.1.100 port 8080 proto udp```

Deny with a **comment** for documentation

```sudo ufw deny in 23/tcp comment "block telnet"```

Deny **incoming** traffic on an interface by protocol

```sudo ufw deny in on eth0 to 192.168.1.100 proto igmp```

**Simulate** a deny rule without applying it

```sudo ufw --dry-run deny 80/tcp```

# SYNOPSIS

**ufw** [_--dry-run_] **deny** [_rule_]

# PARAMETERS

**deny**
> Drop matching traffic (inserts a deny/DROP rule)

_port_[**/**_protocol_]
> Simple form: port number, optional **/tcp** or **/udp**

**from** _address_
> Match source address or network (CIDR)

**to** _address_
> Match destination address

**port** _port_
> Destination port (or range) when using full rule syntax

**proto** _protocol_
> Protocol: **tcp**, **udp**, **igmp**, **gre**, etc.

**in** / **out**
> Direction of traffic

**on** _interface_
> Limit rule to a network interface

**comment** '_text_'
> Attach a human-readable comment to the rule

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw deny** adds a deny rule to Uncomplicated Firewall so matching packets are dropped (similar to iptables DROP). Rules can be simple port denials (`ufw deny 23/tcp`), source or network blocks (`ufw deny from 203.0.113.0/24`), or full five-tuple style rules with source, destination, port, protocol, and interface.

Deny rules are useful for blocking known bad hosts, unused services, or entire subnets while keeping a default allow policy elsewhere. Prefer **deny** when you want silent drops; use **reject** (via `ufw reject`) when you want the peer to receive an explicit refusal. Use `ufw status numbered` to list rules and `ufw delete` to remove them by number.

# CAVEATS

Requires root or sudo. Rule order matters when combined with allows — more specific rules should be ordered carefully (`ufw insert`). A deny rule does not override a more specific earlier allow if packet matching selects the allow first. Application profile names must match installed profiles under `/etc/ufw/applications.d/`. Blocking yourself from SSH while managing a remote host can lock you out; prefer `--dry-run` and ensure alternate access first.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-08-02 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-enable](/man/ufw-enable)(8), [ufw-disable](/man/ufw-disable)(8), [iptables](/man/iptables)(8), [nftables](/man/nftables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-08-02 -->
