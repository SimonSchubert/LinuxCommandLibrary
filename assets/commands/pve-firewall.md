# TLDR

**Compile** and print all firewall rules

```pve-firewall compile```

Show information about the **local network**

```pve-firewall localnet```

**Restart** the Proxmox VE Firewall service

```pve-firewall restart```

**Start** the Proxmox VE Firewall service

```pve-firewall start```

**Stop** the Proxmox VE Firewall service

```pve-firewall stop```

**Simulate** all firewall rules

```pve-firewall simulate```

Show the **status** of Proxmox VE Firewall

```pve-firewall status```

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
