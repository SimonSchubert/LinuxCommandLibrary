# TAGLINE

converts a Proxmox LXC container into a template

# TLDR

**Convert** container to template

```pct template 100```

# SYNOPSIS

**pct template** _vmid_

# DESCRIPTION

**pct template** converts a Proxmox LXC container into a template. Templates are read-only base images that can be used to quickly create new containers through cloning.

# PARAMETERS

**vmid**
> The numeric ID of the container to convert

# CAVEATS

The container must be stopped before conversion. This operation is irreversible - the container cannot be started again after becoming a template. Templates can only be cloned, not run directly.

# HISTORY

**pct template** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-clone](/man/pct-clone)(1), [pct-create](/man/pct-create)(1)
