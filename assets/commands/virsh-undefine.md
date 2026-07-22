# TAGLINE

Remove libvirt domain definition

# TLDR

**Undefine domain**

```virsh undefine [domain]```

**Undefine and remove storage**

```virsh undefine [domain] --remove-all-storage```

**Undefine NVRAM domain**

```virsh undefine [domain] --nvram```

# SYNOPSIS

**virsh** **undefine** _domain_ [_options_]

# PARAMETERS

**--remove-all-storage**
> Delete associated volumes.

**--nvram**
> Remove NVRAM file.

**--keep-nvram**
> Preserve NVRAM file.

**--snapshots-metadata**
> Remove all snapshot metadata associated with the domain.

**--managed-save**
> Remove any managed save image for the domain.

**--storage** _volumes_
> Comma-separated list of volume target names or source paths to remove.

**--checkpoints-metadata**
> Remove all checkpoint metadata for the domain.

# DESCRIPTION

**virsh undefine** removes a persistent domain definition from libvirt. If the domain is running it becomes transient (running but no longer persistent); otherwise it is removed entirely. By default disk images are preserved; use **--remove-all-storage** to delete associated managed volumes as well.

For domains using UEFI/NVRAM, the NVRAM file is removed by default; pass **--keep-nvram** to preserve it.

# CAVEATS

Removing storage with **--remove-all-storage** is irreversible. Domains with snapshots cannot be undefined unless **--snapshots-metadata** is supplied. Storage volumes managed outside of libvirt pools must be cleaned up manually.

# INSTALL

```apt: sudo apt install libvirt-clients```

```dnf: sudo dnf install libvirt-client```

```apk: sudo apk add libvirt-client```

```zypper: sudo zypper install libvirt-client```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-list](/man/virsh-list)(1), [virsh-pool-undefine](/man/virsh-pool-undefine)(1)

