# TAGLINE

displays all LXC containers on a Proxmox VE host

# TLDR

**List all containers on the current node**

```pct list```

# SYNOPSIS

**pct list**

# DESCRIPTION

**pct list** displays a table of all LXC containers on the current Proxmox VE node. It shows the container VMID, status (running/stopped), lock state, and name.

# CAVEATS

Shows containers on the local node only. Use **pvesh** for cluster-wide container listing. Requires Proxmox VE.

# HISTORY

The pct command suite is part of **Proxmox VE**, providing comprehensive LXC container management since Proxmox adopted LXC.

# SEE ALSO

[pct](/man/pct)(1), [pct-create](/man/pct-create)(1), [pct-config](/man/pct-config)(1), [pct-status](/man/pct-status)(1), [pct-enter](/man/pct-enter)(1), [pct-destroy](/man/pct-destroy)(1), [pct-restore](/man/pct-restore)(1), [pvesh](/man/pvesh)(1), [lxc-ls](/man/lxc-ls)(1)
