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

**Create snapshot**

```qemu-img snapshot -c [snapshot1] [disk.qcow2]```

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
> Manage snapshots.

**-f** _FORMAT_
> Image format.

**-O** _FORMAT_
> Output format.

# DESCRIPTION

**qemu-img** is the QEMU disk image utility for creating, converting, resizing, and inspecting virtual machine disk images. It supports multiple formats including qcow2, raw, vmdk, vdi, and vhd, making it essential for managing virtual machine storage and migrating between hypervisors.

The **create** command builds new images with optional thin provisioning, while **convert** transforms between formats and can compress or encrypt output. The **info** command displays image metadata including format, virtual size, and snapshot details. Snapshots within qcow2 images can be created and managed for point-in-time recovery.

# CAVEATS

Part of QEMU suite. Various format options.

# HISTORY

qemu-img is part of **QEMU** for disk image management.

# SEE ALSO

[qemu](/man/qemu)(1), [virt-sparsify](/man/virt-sparsify)(1)

