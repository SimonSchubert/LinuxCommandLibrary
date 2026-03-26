# TAGLINE

Make a virtual machine disk image sparse

# TLDR

Sparsify a disk image by copying to a new file

```virt-sparsify [path/to/input.qcow2] [path/to/output.qcow2]```

Create a **compressed** sparse image

```virt-sparsify --compress [path/to/image.qcow2] [path/to/new_image.qcow2]```

Sparsify **in-place** (no extra disk space required)

```virt-sparsify --in-place [path/to/image.img]```

**Convert** format while sparsifying

```virt-sparsify --convert [qcow2|raw|vdi] [path/to/input] [path/to/output]```

Zero and sparsify a specific partition inside the image

```virt-sparsify --zero [/dev/sda2] [path/to/input] [path/to/output]```

# SYNOPSIS

**virt-sparsify** [_OPTIONS_] _indisk_ _outdisk_

**virt-sparsify** [_OPTIONS_] **--in-place** _disk_

# PARAMETERS

**--compress**
> Compress the output file. Only works with qcow2 format. Incompatible with **--in-place**.

**--in-place**
> Sparsify the image in-place without creating a copy. More efficient but may recover slightly less space. Incompatible with **--convert**, **--compress**, and **-o**.

**--convert** _FORMAT_
> Convert the output to the specified format (qcow2, raw, vdi, vmdk, etc.). Defaults to the same format as the input.

**--format** _FORMAT_
> Declare the format of the input disk image (raw, qcow2, etc.). Auto-detected if not specified. Should be set explicitly when processing untrusted images.

**--ignore** _filesystem_|_volgroup_
> Do not zero free space on the named filesystem or volume group. When using **--in-place**, the filesystem is skipped entirely. Can be specified multiple times. Use volume group names without the `/dev/` prefix.

**--zero** _partition_|_logvol_
> Zero the entire contents of the named partition or logical volume. All data on the device is lost, but sparsification is maximised.

**--tmp** _block\_device_|_directory_|**prebuilt:**_file_
> Set the location for the temporary overlay file used during copying. The `prebuilt:` form accepts a freshly-formatted qcow2 file with the input disk as its backing file (used by oVirt).

**--check-tmpdir** _ignore_|_continue_|_warn_|_fail_
> Control behaviour when the temporary directory has insufficient space. Default is `warn` (warn and prompt for confirmation).

**-o** _option_[,_option_,...]
> Pass output options to **qemu-img** to fine-tune the output format. Provide all options in a single **-o** flag as a comma-separated list.

**-q**, **--quiet**
> Disable progress bars and non-essential output.

**--machine-readable**[=_format_]
> Format output for programmatic parsing, enabling structured progress and status messages.

**--key** _ID_:**key:**_KEY_|**file:**_file_|**clevis**
> Supply a LUKS encryption key for the named disk, partition, or logical volume by string, filename, or Clevis network-bound decryption.

**--keys-from-stdin**
> Read encryption passphrases from standard input instead of prompting at the terminal.

**-v**, **--verbose**
> Enable verbose debug messages.

**-V**, **--version**
> Display version number and exit.

**-x**
> Enable tracing of libguestfs API calls.

# DESCRIPTION

**virt-sparsify** makes virtual machine disk images sparse (thin-provisioned) by zeroing free blocks inside guest filesystems and then creating a sparse copy. This can significantly reduce the on-disk size of image files.

In copying mode (the default), the input image is left unchanged and a new sparse output image is produced. The output format can be changed with **--convert** and compressed with **--compress**.

In **--in-place** mode, the image is modified directly without needing extra disk space, at the cost of potentially recovering slightly less space.

# CAVEATS

The virtual machine must be shut down before running **virt-sparsify** to avoid data corruption. In copying mode, sufficient free disk space must be available for both the temporary overlay and the output image. Back up the original image before using **--in-place**. The tool does not support live or running guests.

# SEE ALSO

[virt-resize](/man/virt-resize)(1), [qemu-img](/man/qemu-img)(1), [truncate](/man/truncate)(1)
