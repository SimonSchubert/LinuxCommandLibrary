# TAGLINE

Reject traffic through Uncomplicated Firewall

# TLDR

**Reject** all traffic on a port

```sudo ufw reject [port]```

Reject traffic for a **protocol** on a port

```sudo ufw reject [port]/[protocol]```

Reject all traffic **from** a source address

```sudo ufw reject from [source_address]```

Reject all incoming traffic from a **subnet**

```sudo ufw reject from 192.168.13.0/24```

Reject **UDP** from one host to another on a port

```sudo ufw reject from 192.168.1.12 to 192.168.1.100 port 8080 proto udp```

Reject with a **comment** for documentation

```sudo ufw reject in 23/tcp comment "block telnet"```

**Simulate** a reject rule without applying it

```sudo ufw --dry-run reject 80/tcp```

# SYNOPSIS

**ufw** [_--dry-run_] **reject** [_rule_]

# PARAMETERS

**reject**
> Refuse matching traffic and send a rejection response (inserts a reject/REJECT rule)

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

**ufw reject** adds a reject rule to Uncomplicated Firewall so matching packets are refused and the peer is told (similar to iptables REJECT). It is a **ufw** subcommand, not a separate binary.

Rules can be simple port rejections (`ufw reject 23/tcp`), source or network blocks (`ufw reject from 203.0.113.0/24`), or full five-tuple style rules with source, destination, port, protocol, and interface.

Use **reject** when the sender should learn the port is closed. Use **ufw deny** when you want a silent drop. List rules with `ufw status numbered` and remove them with **ufw delete**.

# CAVEATS

Requires root or sudo. Rule order matters when combined with allows. Application profile names must match installed profiles under `/etc/ufw/applications.d/`. Rejecting SSH while managing a remote host can lock you out; prefer **--dry-run** and keep alternate access.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-12 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-deny](/man/ufw-deny)(8), [ufw-enable](/man/ufw-enable)(8), [ufw-disable](/man/ufw-disable)(8), [iptables](/man/iptables)(8), [nftables](/man/nftables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-11-12 -->
