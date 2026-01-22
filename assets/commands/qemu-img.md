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

**qemu-img** manages QEMU disk images. Image creation and manipulation.

The tool creates and converts images. Supports various formats.

qemu-img handles disk images.

# CAVEATS

Part of QEMU suite. Various format options.

# HISTORY

qemu-img is part of **QEMU** for disk image management.

# SEE ALSO

[qemu](/man/qemu)(1), [virt-sparsify](/man/virt-sparsify)(1)

