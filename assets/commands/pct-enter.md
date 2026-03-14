# TAGLINE

Open a shell session inside a Proxmox LXC container

# TLDR

**Enter an interactive shell in a container**

```pct enter [VMID]```

**Run a single command inside a container** (use pct exec)

```pct exec [VMID] -- [ls -la]```

# SYNOPSIS

**pct enter** _vmid_

# PARAMETERS

**vmid**
> Numeric container ID (e.g., 100).

# DESCRIPTION

**pct enter** opens an interactive shell session inside a running Proxmox LXC container. It provides direct console access without SSH, similar to **lxc-attach** or **docker exec**. For running non-interactive single commands, use **pct exec** instead.

# RELATED COMMANDS

```
pct enter   - Interactive shell session
pct exec    - Run a single command in a container
pct console - Full console access (login prompt)
```

# CAVEATS

The container must be running. Requires Proxmox VE host access. Use **pct exec** for non-interactive or scripted commands.

# HISTORY

pct commands are part of **Proxmox VE**, developed by **Proxmox Server Solutions GmbH** for managing LXC containers in their virtualization platform.

# SEE ALSO

[pct](/man/pct)(1), [pct-exec](/man/pct-exec)(1), [pct-console](/man/pct-console)(1), [pct-list](/man/pct-list)(1), [lxc-attach](/man/lxc-attach)(1)
