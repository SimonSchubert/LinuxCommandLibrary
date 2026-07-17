# TAGLINE

copy a file from a Proxmox LXC container to the host

# TLDR

**Pull** a file from a container to the local host

```pct pull 100 /var/log/app.log ./app.log```

Pull a config file and set **host ownership**

```pct pull 100 /etc/myapp/config.yml ./config.yml --user root --group root```

Pull with **explicit permissions**

```pct pull 100 /tmp/report.pdf ./report.pdf --perms 0644```

# SYNOPSIS

**pct pull** _vmid_ _path_ _destination_ [_OPTIONS_]

# PARAMETERS

**vmid**
> The numeric ID of the container (100–999999999)

**path**
> Path to a file inside the container to pull

**destination**
> Destination path on the local (host) system

**--user** _name|id_
> Owner user name or id for the written host file

**--group** _name|id_
> Owner group name or id for the written host file

**--perms** _mode_
> File permissions (octal by default; prefix with **0x** for hexadecimal)

# DESCRIPTION

**pct pull** copies a single file from a Proxmox VE LXC container to the host filesystem. It is the inverse of **pct push**: the source path is inside the container, and the destination is on the node where **pct** runs.

This is useful for retrieving logs, configs, or build artifacts without mounting the container root or opening an interactive shell. Ownership and mode of the host-side copy can be set with **--user**, **--group**, and **--perms**.

# CAVEATS

Copies one file at a time (not recursive directories). The container must be accessible on the local node; network/remote pull is not a separate mode. Paths are evaluated in the container's filesystem namespace. On unprivileged containers, ensure the host process has rights to read the guest path via the usual LXC file-copy path.

# HISTORY

**pct pull** is part of the **Proxmox VE** **pct** (Proxmox Container Toolkit) for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-push](/man/pct-push)(1), [pct-exec](/man/pct-exec)(1), [pct-enter](/man/pct-enter)(1), [pct-mount](/man/pct-mount)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-17 -->
