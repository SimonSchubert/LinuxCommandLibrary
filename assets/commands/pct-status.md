# TLDR

**Check** container status

```pct status 100```

Show **verbose** details

```pct status 100 --verbose```

# SYNOPSIS

**pct status** [_OPTIONS_] _vmid_

# DESCRIPTION

**pct status** displays the current status of a Proxmox LXC container, showing whether it is running, stopped, or in another state.

# PARAMETERS

**vmid**
> The numeric ID of the container

**--verbose**
> Display detailed status information including resource usage

# CAVEATS

Status is reported from the Proxmox perspective. A container showing as running may have internal issues not visible through this command.

# HISTORY

**pct status** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-list](/man/pct-list)(1)
