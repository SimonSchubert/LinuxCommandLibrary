# TAGLINE

opens a shell session inside a Proxmox LXC container

# TLDR

**Enter container shell**

```pct enter [VMID]```

**Enter as specific user**

```pct enter [VMID] --user [root]```

# SYNOPSIS

**pct enter** _vmid_ [_options_]

# PARAMETERS

**vmid**
> Container ID.

**--user** _name_
> User to login as.

# DESCRIPTION

**pct enter** opens a shell session inside a Proxmox LXC container. It provides direct console access without SSH, similar to docker exec.

# EXAMPLE

```bash
# Enter container 100
pct enter 100

# Enter as root
pct enter 100 --user root

# Run single command
pct exec 100 -- ls -la
```

# RELATED COMMANDS

```
pct enter   - Interactive shell
pct exec    - Run single command
pct console - Console access
```

# CAVEATS

Container must be running. Requires Proxmox VE. Use pct exec for non-interactive commands.

# HISTORY

pct commands are part of **Proxmox VE**, developed by Proxmox Server Solutions GmbH for managing LXC containers in their virtualization platform.

# SEE ALSO

[pct](/man/pct)(1), [pct-list](/man/pct-list)(1), [lxc-attach](/man/lxc-attach)(1)
