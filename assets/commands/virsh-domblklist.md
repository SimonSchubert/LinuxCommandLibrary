# TAGLINE

List VM block devices

# TLDR

**List domain block devices**

```virsh domblklist [domain]```

**Show with details**

```virsh domblklist [domain] --details```

**List the devices used on next boot**

```virsh domblklist [domain] --inactive```

# SYNOPSIS

**virsh** **domblklist** _domain_ [**--inactive**] [**--details**]

# PARAMETERS

**--details**
> Also print disk type and device value.

**--inactive**
> Query the block devices that will be used on the next boot rather than those currently in use.

# DESCRIPTION

**virsh domblklist** lists block devices attached to a VM. Shows device targets and source paths. Useful for identifying disk images and CD-ROMs attached to VMs. Commands that need a block device name, such as **domblkinfo** or **snapshot-create**, accept either the target or the unique source name printed here.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-list](/man/virsh-list)(1), [virsh-domblkinfo](/man/virsh-domblkinfo)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-09 -->
