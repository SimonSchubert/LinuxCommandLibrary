# TLDR

**Attach** to container console

```pct console 100```

**Detach** from console

```Ctrl+a q```

# SYNOPSIS

**pct console** _vmid_

# DESCRIPTION

**pct console** attaches to a container's TTY console, providing direct terminal access. This is useful for accessing containers that don't have network connectivity or for troubleshooting boot issues.

# PARAMETERS

**vmid**
> The numeric ID of the container

# CAVEATS

Use Ctrl+a followed by q to detach from the console without terminating the session. The container must be running to attach to its console. For command execution without interactive terminal, use **pct exec** instead.

# HISTORY

**pct console** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-enter](/man/pct-enter)(1), [pct-exec](/man/pct-exec)(1)
