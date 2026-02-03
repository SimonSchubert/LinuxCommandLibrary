# TLDR

**List domain block devices**

```virsh domblklist [domain]```

**Show with details**

```virsh domblklist [domain] --details```

# SYNOPSIS

**virsh** **domblklist** _domain_ [_options_]

# PARAMETERS

**--details**
> Include type and device info.

**--inactive**
> Show inactive config.

# DESCRIPTION

**virsh domblklist** lists block devices attached to a VM. Shows device targets and source paths. Useful for identifying disk images and CD-ROMs attached to VMs.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-list](/man/virsh-list)(1)

