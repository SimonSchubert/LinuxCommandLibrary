# TAGLINE

Run a filesystem check on a Proxmox LXC volume

# TLDR

Check **all volumes** of a container

```pct fsck [100]```

Check a **specific volume** device

```pct fsck [100] --device [mp0|mp1|rootfs|...]```

# SYNOPSIS

**pct fsck** _vmid_ [_OPTIONS_]

# PARAMETERS

**vmid**
> Numeric ID of the container whose volumes to check

**--device** _volume_
> Limit the check to one volume (e.g. `rootfs`, `mp0`, `mp1`)

# DESCRIPTION

**pct fsck** runs a filesystem consistency check on one or more volumes of a Proxmox VE LXC container. Without `--device`, every configured volume for the container is checked.

Use this after unclean shutdowns, storage issues, or when the container fails to start due to filesystem errors. The underlying checker depends on the filesystem type of each volume (commonly `fsck` for ext-family filesystems).

# CAVEATS

The container should be **stopped** before running a filesystem check. Running `fsck` on a mounted, live volume can cause data corruption. Ensure storage is available on the node where the container's disks reside.

# HISTORY

Part of **Proxmox VE** LXC management (`pct`).

# SEE ALSO

[pct](/man/pct)(1), [fsck](/man/fsck)(8)

# RESOURCES

```[Homepage](https://www.proxmox.com)```

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

<!-- verified: 2026-07-28 -->
