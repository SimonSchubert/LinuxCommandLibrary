# TAGLINE

copy a local file into a Proxmox LXC container

# TLDR

**Push** a local script into a container

```pct push 100 ./bootstrap.sh /root/bootstrap.sh```

Push a config and set **guest ownership**

```pct push 100 ./nginx.conf /etc/nginx/nginx.conf --user root --group root```

Push with **executable permissions**

```pct push 100 ./setup.sh /usr/local/bin/setup.sh --perms 0755```

# SYNOPSIS

**pct push** _vmid_ _file_ _destination_ [_OPTIONS_]

# PARAMETERS

**vmid**
> The numeric ID of the container (100–999999999)

**file**
> Path to a local file on the host

**destination**
> Destination path inside the container to write to

**--user** _name|id_
> Owner user name or id. When using a name, it must exist inside the container

**--group** _name|id_
> Owner group name or id. When using a name, it must exist inside the container

**--perms** _mode_
> File permissions (octal by default; prefix with **0x** for hexadecimal)

# DESCRIPTION

**pct push** copies a single local file from the Proxmox host into an LXC container. It is commonly used to install bootstrap scripts, drop configuration files, or stage packages without **scp**/SSH into the guest.

After a push, **pct exec** is often used to chmod and run the file. Ownership options refer to users and groups **inside** the container when names (not numeric ids) are given.

# CAVEATS

Single-file only; recursive directory push is not supported. Parent directories inside the container must already exist. For large tree copies, mount the filesystem with **pct mount** or use a network share instead. Name-based **--user**/**--group** fail if that account is not defined in the guest.

# HISTORY

**pct push** is part of the **Proxmox VE** **pct** (Proxmox Container Toolkit) for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-pull](/man/pct-pull)(1), [pct-exec](/man/pct-exec)(1), [pct-enter](/man/pct-enter)(1), [pct-mount](/man/pct-mount)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-17 -->
