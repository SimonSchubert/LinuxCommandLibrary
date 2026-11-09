# TAGLINE

List all Vagrant environments system-wide

# TLDR

**Show all VMs**

```vagrant global-status```

**Prune invalid entries**

```vagrant global-status --prune```

# SYNOPSIS

**vagrant** **global-status** [_options_]

# PARAMETERS

**--prune**
> Remove invalid entries from the list. Much slower than simply listing entries.

# DESCRIPTION

**vagrant global-status** lists all active Vagrant environments on the system for the current user. Shows VM ID, name, provider, state, and directory. The short IDs (such as a1b2c3) can be used with any Vagrant command that takes a target machine, from any directory.

# CAVEATS

The output comes from a cache and does not actively verify machine state, so results can be stale (for example after a host reboot). Use **--prune** to clean up invalid entries. Environments created before upgrading Vagrant may not show up until they are destroyed and recreated.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-status](/man/vagrant-status)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/global-status)```

<!-- verified: 2026-11-09 -->
