# TAGLINE

Show virtual machine disk size information

# TLDR

**Show size info** for one disk by target name

```virsh domblkinfo [domain] [vda]```

**Human-readable sizes** for one disk

```virsh domblkinfo [domain] [vda] --human```

**Table of all disks** attached to a domain

```virsh domblkinfo [domain] --all```

**Human-readable table** of all disks

```virsh domblkinfo [domain] --all --human```

**Look up disk target names** first

```virsh domblklist [domain]```

# SYNOPSIS

**virsh** **domblkinfo** _domain_ {_block-device_ | **--all**} [**--human**]

# PARAMETERS

**_block-device_**
> Disk to query: the unique target name (`<target dev='name'/>`, such as `vda`) or a unique source path (`<source file='name'/>`).

**--all**
> Print a table of size info for every block device on the domain. Mutually exclusive with _block-device_; if both are given, **--all** wins.

**--human**
> Print sizes in human-readable units instead of raw bytes.

# DESCRIPTION

**virsh domblkinfo** reports block-device size information for a libvirt domain. Without **--all**, it prints three fields for a single disk:

**Capacity**
> Logical size of the virtual disk (the size the guest sees).

**Allocation**
> How much of that capacity is currently allocated on the host (relevant for sparse and qcow2 images).

**Physical**
> Size of the backing file or volume on the host.

With **--all**, the same three columns are printed as a table, with a **Target** column naming each disk. Use **virsh domblklist** to list the target and source names that **domblkinfo** accepts.

The domain can be specified by name, UUID, or numeric id.

# CAVEATS

**--all** and _block-device_ cannot be combined usefully: the command treats them as exclusive, and **--all** takes precedence. Querying size info requires that libvirt can open the image or volume; that typically needs a running **libvirtd** and, for system domains, root or equivalent privileges. Inactive domains can still be queried when the backing storage is accessible.

# INSTALL

```apt: sudo apt install libvirt-clients```

```dnf: sudo dnf install libvirt-client```

```apk: sudo apk add libvirt-client```

```zypper: sudo zypper install libvirt-client```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-domblklist](/man/virsh-domblklist)(1), [virsh-list](/man/virsh-list)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-08-26 -->
