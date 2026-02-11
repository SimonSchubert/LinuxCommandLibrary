# TAGLINE

Show Proxmox VM running status

# TLDR

Display **status** of a virtual machine

```qm status 100```

Display **detailed status**

```qm status --verbose true 100```

# SYNOPSIS

**qm status** [_options_] _vmid_

# PARAMETERS

**--verbose** _true|false_
> Show detailed status information

# DESCRIPTION

**qm status** shows the current status of a virtual machine. Basic output shows running state (running, stopped, paused). Verbose mode shows additional details like uptime and resource usage.

# SEE ALSO

[qm](/man/qm)(1), [qm-list](/man/qm-list)(1)
