# TAGLINE

displays all LXC containers on a Proxmox VE host

# TLDR

**List all containers**

```pct list```

**Show container status**

```pct status [VMID]```

**Show container config**

```pct config [VMID]```

# SYNOPSIS

**pct list** [_options_]

# DESCRIPTION

**pct list** displays all LXC containers on a Proxmox VE host. It shows container ID, status, lock state, and name.

# EXAMPLE OUTPUT

```
VMID       Status     Lock         Name
100        running                 webserver
101        stopped                 database
102        running                 mailserver
```

# RELATED COMMANDS

```bash
# List containers
pct list

# Get status
pct status 100

# Show config
pct config 100

# Start container
pct start 100

# Stop container
pct stop 100
```

# CAVEATS

Shows local node only. Use pvesh for cluster-wide listing. Requires Proxmox VE.

# HISTORY

The pct command suite is part of **Proxmox VE**, providing comprehensive LXC container management since Proxmox adopted LXC.

# SEE ALSO

[pct](/man/pct)(1), [pct-enter](/man/pct-enter)(1), [pct-restore](/man/pct-restore)(1), [lxc-ls](/man/lxc-ls)(1)
