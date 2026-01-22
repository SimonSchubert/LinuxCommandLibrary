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
> The numeric ID of the container

**--current**
> Show currently running configuration instead of saved

**--snapshot** _name_
> Display configuration from a specific snapshot

# CAVEATS

The default output shows saved configuration with pending changes. Use **--current** to see only the active runtime configuration.

# HISTORY

**pct config** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-set](/man/pct-set)(1)
