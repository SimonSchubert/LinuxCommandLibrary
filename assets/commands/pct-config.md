# TAGLINE

displays the configuration of a Proxmox LXC container

# TLDR

**Show** container configuration

```pct config 100```

Show **current** running config

```pct config 100 --current```

Show **snapshot** configuration

```pct config 100 --snapshot snapshot_name```

# SYNOPSIS

**pct config** [_OPTIONS_] _vmid_

# DESCRIPTION

**pct config** displays the configuration of a Proxmox LXC container. By default, it shows the saved configuration including pending changes that will be applied on next start.

# PARAMETERS

**vmid**
> The unique numeric ID of the container (integer, 100 to 999999999)

**--current**
> Get current values instead of pending values (boolean, default 0)

**--snapshot** _name_
> Fetch configuration values from a given snapshot

# CAVEATS

The default output shows saved configuration with pending changes. Use **--current** to see only the active runtime configuration.

# HISTORY

**pct config** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-set](/man/pct-set)(1), [pct-list](/man/pct-list)(1), [pct-status](/man/pct-status)(1)
