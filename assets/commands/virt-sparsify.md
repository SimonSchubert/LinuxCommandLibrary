# TLDR

Create **compressed** sparse image

```virt-sparsify --compress [path/to/image.qcow2] [path/to/new_image.qcow2]```

Sparsify **in-place**

```virt-sparsify --in-place [path/to/image.img]```

**Convert** format

```virt-sparsify [path/to/image] --convert [qcow2|raw|vdi] [path/to/new_image]```

# SYNOPSIS

**virt-sparsify** [_OPTIONS_] _INPUT_ _OUTPUT_

# PARAMETERS

**--compress**
> Compress output file

**--in-place**
> Sparsify image in-place

**--convert** _FORMAT_
> Convert to specified format (qcow2, raw, vdi, etc.)

# DESCRIPTION

**virt-sparsify** makes virtual machine disk images thin-provisioned by removing unused space and creating sparse files. This can significantly reduce disk image file sizes.

The tool reclaims space by zeroing free blocks within the guest filesystem and then creating a sparse copy.

# CAVEATS

Only use on offline virtual machines to avoid data corruption. Requires sufficient disk space for output image. Original image should be backed up before in-place operation.

# SEE ALSO

[virt-resize](/man/virt-resize)(1), [qemu-img](/man/qemu-img)(1)
