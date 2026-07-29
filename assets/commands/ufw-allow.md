# TAGLINE

Allow traffic through Uncomplicated Firewall

# TLDR

**Allow** all traffic on a port

```sudo ufw allow [port]```

Allow traffic for a **protocol** on a port

```sudo ufw allow [port]/[protocol]```

Allow a known **application profile**

```sudo ufw allow OpenSSH```

Allow all traffic **from** a source address

```sudo ufw allow from [source_address]```

Allow **TCP** from one host to another on port 443

```sudo ufw allow from 192.168.1.12 to 192.168.1.100 port 443 proto tcp```

Allow with a **comment** for documentation

```sudo ufw allow 5432 comment "PostgreSQL"```

**Simulate** an allow rule without applying it

```sudo ufw --dry-run allow 80/tcp```

# SYNOPSIS

**ufw** [_--dry-run_] **allow** [_rule_]

# PARAMETERS

**allow**
> Permit matching traffic (inserts an allow rule)

_port_[**/**_protocol_]
> Simple form: port number, optional **/tcp** or **/udp**

**from** _address_
> Match source address or network (CIDR)

**to** _address_
> Match destination address

**port** _port_
> Destination port (or range) when using full rule syntax

**proto** _protocol_
> Protocol: **tcp**, **udp**, **gre**, etc.

**in** / **out**
> Direction of traffic

**on** _interface_
> Limit rule to a network interface

**comment** '_text_'
> Attach a human-readable comment to the rule

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw allow** adds an allow rule to Uncomplicated Firewall so matching packets are accepted. Rules can be simple port allows (`ufw allow 22/tcp`), service or application profiles (`ufw allow OpenSSH`), or full five-tuple style rules with source, destination, port, protocol, and interface.

Allow rules are typically configured **before** `ufw enable` on remote hosts so SSH and other admin access remain available. Use `ufw status numbered` to list rules and `ufw delete` to remove them by number.

# CAVEATS

Requires root or sudo. Order and default policies (`ufw default deny incoming`) matter — an allow rule only helps if the default policy would otherwise block the traffic. Application profile names must match installed profiles under `/etc/ufw/applications.d/`.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-07-29 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-enable](/man/ufw-enable)(8), [ufw-disable](/man/ufw-disable)(8), [iptables](/man/iptables)(8), [nftables](/man/nftables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-07-29 -->
