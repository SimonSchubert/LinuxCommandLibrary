# TAGLINE

attaches to a container's TTY console, providing direct terminal access

# TLDR

**Attach** to container console by ID

```pct console [100]```

**Use a different escape prefix** (Ctrl+b, then q to detach)

```pct console [100] --escape ^b```

# SYNOPSIS

**pct console** _vmid_ [**--escape** _prefix_]

# DESCRIPTION

**pct console** attaches to a container's TTY console, providing direct terminal access. This is useful for accessing containers that don't have network connectivity or for troubleshooting boot issues.

# PARAMETERS

**vmid**
> The numeric ID of the container

**--escape** _prefix_
> Escape sequence prefix, in the form `^a` to `^z` (default: `^a`). For example, `^b` makes **Ctrl+b** then **q** the detach sequence.

# CAVEATS

With the default escape prefix, press **Ctrl+a** then **q** to detach from the console without terminating the session. The container must be running. For non-interactive command execution, use **pct exec** instead. For entering the container's namespace directly, use **pct enter**.

# HISTORY

**pct console** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-enter](/man/pct-enter)(1), [pct-exec](/man/pct-exec)(1), [lxc-console](/man/lxc-console)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

<!-- verified: 2026-11-09 -->
