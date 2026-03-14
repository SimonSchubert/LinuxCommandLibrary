# TAGLINE

Terminal UI for Proxmox VE cluster management

# TLDR

**Launch the Proxmox VE TUI**

```pvetui```

# SYNOPSIS

**pvetui** [_options_]

# DESCRIPTION

**pvetui** is a terminal user interface for managing Proxmox VE clusters, nodes, virtual machines, and LXC containers. It supports starting, stopping, migrating, and monitoring resources, secure authentication via API tokens or passwords, integrated SSH shells, VNC console access with an embedded noVNC client, multi-cluster profile switching, and plugin extensibility including a community scripts installer.

# CAVEATS

Requires network access to a Proxmox VE instance and valid authentication credentials.

# HISTORY

**pvetui** was created by **devnullvoid** and is written in **Go**.

# SEE ALSO

[ssh](/man/ssh)(1), [virsh](/man/virsh)(1), [virsh-help](/man/virsh-help)(1)
