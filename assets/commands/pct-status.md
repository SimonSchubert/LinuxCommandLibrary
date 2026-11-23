# TAGLINE

Show the running state of a Proxmox LXC container

# TLDR

**Check** container status (prints e.g. `status: running`)

```pct status [100]```

**Show verbose** runtime and configuration details

```pct status [100] --verbose```

**Print only the state** for use in scripts

```pct status [100] | awk '{print $2}'```

**Get the same status** as JSON through the API

```pvesh get /nodes/[node]/lxc/[100]/status/current --output-format json```

# SYNOPSIS

**pct status** _vmid_ [**--verbose** _boolean_]

# PARAMETERS

**vmid**
> The numeric ID of the container (100 - 999999999).

**--verbose** _boolean_
> Verbose output format, listing all status fields such as CPU, memory, disk and network usage, uptime and PID.

# DESCRIPTION

**pct status** displays the current status of a Proxmox LXC container, typically **running** or **stopped**. It must be run on the node that hosts the container.

# CAVEATS

Status is reported from the Proxmox perspective. A container showing as running may have internal issues not visible through this command. The command exits successfully for both running and stopped containers, so scripts must parse the output.

# HISTORY

**pct status** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-list](/man/pct-list)(1), [pct-start](/man/pct-start)(1), [pct-stop](/man/pct-stop)(1), [qm-status](/man/qm-status)(1), [pvesh](/man/pvesh)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

```[Homepage](https://www.proxmox.com/en/products/proxmox-virtual-environment/overview)```

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

<!-- verified: 2026-11-23 -->
