# TAGLINE

Alternative form of pct move-volume that moves container volumes

# TLDR

This command is an alias of **pct move-volume**

View documentation for the original command

```tldr pct move-volume```

# SYNOPSIS

**pct move_volume** _vmid_ _volume_ _storage_ [_options_]

# PARAMETERS

_vmid_
> Container ID (100-999999999).

_volume_
> Volume to move (e.g., rootfs, mp0, mp1).

_storage_
> Target storage identifier.

**--delete**
> Delete the original volume after moving (default: 0).

**--digest** _string_
> Prevent concurrent modifications with a config digest.

**--target-digest** _string_
> Target volume config digest to detect concurrent modifications.

**--target-vmid** _vmid_
> Target container ID (for moving a volume to a different container).

**--target-volume** _volume_
> Target volume name (when moving between containers).

# DESCRIPTION

**pct move_volume** is an alternative form of **pct move-volume** that moves container volumes to different storage backends in Proxmox VE. The underscore variant is provided for compatibility. It can move volumes between storages within the same container or to a different container entirely.

# SEE ALSO

[pct](/man/pct)(1), [pct-move-volume](/man/pct-move-volume)(1), [pvesm](/man/pvesm)(1)
