# TAGLINE

Manage ARP packet filtering rules.

# TLDR

**List** ARP rules

```sudo arptables -L```

**Drop** packets from IP

```sudo arptables -A INPUT -s 192.168.0.1 -j DROP```

**Delete** rule by number

```sudo arptables -D INPUT rule_number```

**Flush** all rules

```sudo arptables -F```

Set **default policy**

```sudo arptables -P OUTPUT ACCEPT```

**Save** rules to file

```sudo arptables-save > path/to/file```

# SYNOPSIS

**arptables** [_OPTIONS_] _chain_ _rule-specification_

# DESCRIPTION

**arptables** manages ARP (Address Resolution Protocol) packet filtering rules. It is similar to iptables but operates at the ARP level, allowing control over which ARP requests and replies are accepted or dropped.

# PARAMETERS

**-L, --list**
> List all rules in selected chain or all chains

**-A, --append**
> Append rule to the end of chain

**-I, --insert** _chain_ [_rulenum_]
> Insert rule at the given position (default: top of chain)

**-R, --replace** _chain_ _rulenum_
> Replace an existing rule by number

**-D, --delete**
> Delete matching rule or rule by number

**-F, --flush**
> Flush all rules

**-Z, --zero**
> Zero packet and byte counters in a chain

**-P, --policy**
> Set default policy for a chain

**-N, --new-chain** _name_
> Create a new user-defined chain

**-X, --delete-chain** [_name_]
> Delete a user-defined chain

**-s, --source-ip** _address_
> Match source IP address

**-d, --destination-ip** _address_
> Match destination IP address

**--source-mac** _address_
> Match source MAC address

**--destination-mac** _address_
> Match destination MAC address

**-i, --in-interface** _name_
> Match the input interface (INPUT, FORWARD)

**-o, --out-interface** _name_
> Match the output interface (OUTPUT, FORWARD)

**--opcode** _code_
> Match the ARP opcode (e.g., Request, Reply)

**-j, --jump** _target_
> Target for rule (ACCEPT, DROP, etc.)

# CAVEATS

Requires root privileges. Uses the nftables backend on modern systems. The nft-based **arptables** provides only the **INPUT** and **OUTPUT** chains; the **FORWARD** chain exists only in the legacy implementation. ARP filtering operates at the layer 2/3 boundary and may affect network connectivity if misconfigured. Use **arptables-save** and **arptables-restore** to persist and reload rule sets.

# HISTORY

**arptables** is part of the **xtables-nft** suite, providing ARP packet filtering integrated with the netfilter framework.

# INSTALL

```pacman: sudo pacman -S iptables```

```apk: sudo apk add iptables```

```zypper: sudo zypper install iptables```

```brew: brew install iptables```

```nix: nix profile install nixpkgs#iptables```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[iptables](/man/iptables)(8), [nft](/man/nft)(8), [arp](/man/arp)(8), [ebtables](/man/ebtables)(8)

# RESOURCES

```[Source code](https://git.netfilter.org/arptables/)```

```[Homepage](https://www.netfilter.org/)```

```[Documentation](https://man7.org/linux/man-pages/man8/arptables-nft.8.html)```

<!-- verified: 2026-06-16 -->
