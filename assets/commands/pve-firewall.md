# TAGLINE

Proxmox distributed firewall manager

# TLDR

Show whether the firewall is **running and enabled**

```pve-firewall status```

**Start** the firewall service

```pve-firewall start```

**Stop** it

```pve-firewall stop```

**Restart** it after editing the rule files

```pve-firewall restart```

**Compile** the configuration and print the iptables rules it produces

```pve-firewall compile```

Show which network the node treats as **local**

```pve-firewall localnet```

**Trace how a packet would be handled**

```pve-firewall simulate --from [vm100] --to [host] --dport [22]```

Trace it with **full detail**

```pve-firewall simulate --verbose --from [outside] --to [vm100] --dport [80]```

# SYNOPSIS

**pve-firewall** _command_ [_options_]

# PARAMETERS

**compile**, **c**
> Compile and print all firewall rules

**localnet**, **l**
> Show local network information

**restart**, **r**
> Restart the firewall service

**start**
> Start the firewall service

**stop**
> Stop the firewall service

**simulate**, **si**
> Simulate firewall rules without applying

**status**
> Show firewall service status

# DESCRIPTION

**pve-firewall** manages the Proxmox VE distributed firewall. It generates iptables rules based on cluster-wide and per-VM/container configurations. The firewall can be configured at datacenter, node, VM, and container levels.

The compile and simulate commands are useful for debugging firewall configurations before applying them. The firewall supports rule sets, IP sets, aliases, and security groups for organized configuration management.

# CAVEATS

Firewall rules are cluster-wide configuration stored in pmxcfs. Changes may affect all cluster nodes. Misconfiguration can lock out management access; ensure a working console connection before major changes.

# HISTORY

Part of **Proxmox VE**, providing integrated firewall management for virtualization environments. Builds on iptables/nftables and integrates with Proxmox's cluster filesystem for distributed configuration.

# SEE ALSO

[qm](/man/qm)(1), [pct](/man/pct)(1), [pvesh](/man/pvesh)(1)
