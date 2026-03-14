# TAGLINE

attaches to a container's TTY console, providing direct terminal access

# TLDR

**Attach** to container console by ID

```pct console [100]```

# SYNOPSIS

**pct console** _vmid_

# DESCRIPTION

**pct console** attaches to a container's TTY console, providing direct terminal access. This is useful for accessing containers that don't have network connectivity or for troubleshooting boot issues.

# PARAMETERS

**vmid**
> The numeric ID of the container

# CAVEATS

Press **Ctrl+a** then **q** to detach from the console without terminating the session. The container must be running. For non-interactive command execution, use **pct exec** instead. For entering the container's namespace directly, use **pct enter**.

# HISTORY

**pct console** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-enter](/man/pct-enter)(1), [pct-exec](/man/pct-exec)(1)
