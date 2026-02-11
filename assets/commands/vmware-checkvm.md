# TAGLINE

Detect VMware virtual machine environment

# TLDR

Check if running in **VMware**

```vmware-checkvm```

Get **hardware** version

```vmware-checkvm -h```

# SYNOPSIS

**vmware-checkvm** [_OPTIONS_]

# PARAMETERS

**-h**
> Return VMware hardware version

# DESCRIPTION

**vmware-checkvm** checks if the current host is running inside a VMware virtual machine. The exit status indicates whether the system is a VM (exit 0) or not (non-zero exit).

When run inside VMware, it returns the VMware software version information.

# CAVEATS

VMware specific. Only detects VMware virtualization. Part of open-vm-tools package.

# SEE ALSO

[virt-what](/man/virt-what)(1), [systemd-detect-virt](/man/systemd-detect-virt)(1)
