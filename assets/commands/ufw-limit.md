# TAGLINE

Rate-limit connections through Uncomplicated Firewall

# TLDR

**Rate-limit** SSH to slow brute-force attempts

```sudo ufw limit 22/tcp```

Rate-limit a known **application profile**

```sudo ufw limit OpenSSH```

Rate-limit **TCP** on a custom port with a comment

```sudo ufw limit 2222/tcp comment "SSH port"```

Rate-limit only from a **source subnet**

```sudo ufw limit from 192.168.0.0/16 to any port 22 proto tcp```

Rate-limit on a **specific interface**

```sudo ufw limit in on eth0 to any port 22```

**Simulate** a limit rule without applying it

```sudo ufw --dry-run limit 22/tcp```

**Delete** a previously added limit rule

```sudo ufw delete limit 22/tcp```

# SYNOPSIS

**ufw** [_--dry-run_] **limit** [_rule_]

# PARAMETERS

**limit**
> Insert a rate-limit rule: matching traffic is allowed until one source IP opens 6 or more connections within 30 seconds, after which further attempts from that IP are denied

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
> Limit the rule to a network interface

**comment** '_text_'
> Attach a human-readable comment to the rule

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw limit** adds a rate-limit rule to Uncomplicated Firewall. It is a **ufw** subcommand, not a separate binary. Matching connections are normally allowed; if one IP address tries to open 6 or more connections within 30 seconds, further attempts from that address are denied. The intended use is slowing brute-force logins on services such as SSH (`ufw limit ssh/tcp` or `ufw limit 22/tcp`).

Rules can be simple port limits, application profiles (`ufw limit OpenSSH`), or full five-tuple style rules with source, destination, port, protocol, and interface. `ufw status` prints these as **LIMIT**. Remove a rule with `ufw delete limit ...` or by number after `ufw status numbered`.

`ufw route limit` applies the same rate limit to forwarded traffic rather than traffic destined for the local host.

# CAVEATS

Requires root or sudo. Rate limiting is per source IP over a 30-second window of 6 new connections; it is not a general bandwidth cap and does not replace fail2ban-style bans. An existing session can still be locked out if later attempts trip the limit while you are connecting from the same address. Application profile names must match installed profiles under `/etc/ufw/applications.d/`. Prefer `--dry-run` before changing rules on a remote host.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-09-29 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-deny](/man/ufw-deny)(8), [ufw-delete](/man/ufw-delete)(8), [ufw-enable](/man/ufw-enable)(8), [ufw-status](/man/ufw-status)(8), [iptables](/man/iptables)(8), [nftables](/man/nftables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-09-29 -->
