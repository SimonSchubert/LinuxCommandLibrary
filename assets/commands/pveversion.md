# TLDR

Print **system version**

```pveversion```

Print Proxmox **subpackage versions**

```pveversion -v```

# SYNOPSIS

**pveversion** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Show version of all Proxmox-related packages

# DESCRIPTION

**pveversion** displays version information for the Proxmox VE installation. Without options, it shows the main Proxmox VE version. With **--verbose**, it lists versions of all Proxmox subpackages including pve-manager, pve-kernel, qemu-server, and others.

This is useful for support requests, verifying update status, and checking component compatibility.

# SEE ALSO

[pvesh](/man/pvesh)(1), [pveam](/man/pveam)(1), [pvecm](/man/pvecm)(1)
