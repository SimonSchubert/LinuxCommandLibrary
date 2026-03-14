# TAGLINE

Create and manage QEMU disk images

# TLDR

**Create disk image**

```qemu-img create -f [qcow2] [disk.qcow2] [20G]```

**Convert image format**

```qemu-img convert -f [raw] -O [qcow2] [input.img] [output.qcow2]```

**Show image info**

```qemu-img info [disk.qcow2]```

**Resize image**

```qemu-img resize [disk.qcow2] +[10G]```

**Create a snapshot**

```qemu-img snapshot -c [snapshot1] [disk.qcow2]```

**Check image** for consistency errors

```qemu-img check [disk.qcow2]```

**List snapshots** in an image

```qemu-img snapshot -l [disk.qcow2]```

# SYNOPSIS

**qemu-img** _command_ [_options_]

# PARAMETERS

**create**
> Create new image.

**convert**
> Convert format.

**info**
> Show image info.

**resize**
> Resize image.

**snapshot**
> Manage snapshots (-c create, -a apply, -d delete, -l list).

**check**
> Perform consistency check (qcow2, qed, vdi only).

**commit**
> Commit changes from an overlay image to its backing file.

**compare**
> Compare two disk images.

**rebase**
> Change the backing file of an image.

**map**
> Display allocation map of an image.

**-f** _FORMAT_
> Input image format (raw, qcow2, vmdk, vdi, vhd, etc.).

**-O** _FORMAT_
> Output format for convert.

**-p**
> Display progress bar.

**-q**
> Quiet mode; suppress non-error output.

# DESCRIPTION

**qemu-img** is the QEMU disk image utility for creating, converting, resizing, and inspecting virtual machine disk images. It supports multiple formats including qcow2, raw, vmdk, vdi, and vhd, making it essential for managing virtual machine storage and migrating between hypervisors.

The **create** command builds new images with optional thin provisioning, while **convert** transforms between formats and can compress or encrypt output. The **info** command displays image metadata including format, virtual size, and snapshot details. Snapshots within qcow2 images can be created and managed for point-in-time recovery.

# CAVEATS

Part of the QEMU suite (qemu-utils package). Shrinking images with resize requires the guest filesystem to be resized first. Only qcow2, qed, and vdi formats support consistency checks.

# SEE ALSO

[qemu](/man/qemu)(1), [virt-sparsify](/man/virt-sparsify)(1)

