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
> Remove snapshot metadata.

# DESCRIPTION

**virsh undefine** removes a domain definition from libvirt. Domain must be shut off. By default keeps disk images; use --remove-all-storage to delete them.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-destroy](/man/virsh-destroy)(1), [virsh-define](/man/virsh-define)(1)

