# TAGLINE

Alternative form of pct move-volume that moves container volumes

# TLDR

**Move a container volume** to a different storage

```pct move_volume [100] [rootfs] [local-lvm]```

**Move a volume** to a different container

```pct move_volume [100] [mp0] --target-vmid [200] --target-volume [mp1]```

**Move and delete** the original volume after copy

```pct move_volume [100] [mp0] [local-zfs] --delete 1```

**Move with I/O** bandwidth limit

```pct move_volume [100] [rootfs] [local-lvm] --bwlimit [10240]```

# SYNOPSIS

**pct move_volume** _vmid_ _volume_ [_storage_] [_options_]

# PARAMETERS

_vmid_
> Container ID (100-999999999).

_volume_
> Volume to move (rootfs, mp0-mp255, or unused0-unused255).

_storage_
> Target storage identifier.

**--bwlimit** _number_
> Override I/O bandwidth limit in KiB/s (default: from datacenter or storage config).

**--delete** _boolean_
> Delete the original volume after successful copy. By default the original is kept as an unused volume entry (default: 0).

**--digest** _string_
> Prevent changes if the current configuration file has a different SHA1 digest.

**--target-digest** _string_
> Prevent changes if the target container configuration file has a different SHA1 digest.

**--target-vmid** _vmid_
> Target container ID (for moving a volume to a different container).

**--target-volume** _volume_
> Target volume key (defaults to the source volume key).

# DESCRIPTION

**pct move_volume** is an alternative form of **pct move-volume** that moves container volumes to different storage backends in Proxmox VE. The underscore variant is provided for compatibility. It can move volumes between storages within the same container or to a different container entirely.

# SEE ALSO

[pct](/man/pct)(1), [pct-move-volume](/man/pct-move-volume)(1), [pvesm](/man/pvesm)(1)
