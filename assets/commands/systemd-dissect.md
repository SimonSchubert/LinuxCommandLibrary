# TAGLINE

Inspect and mount disk images

# TLDR

**Show** general image information

```systemd-dissect [path/to/image.raw]```

**Mount** an OS image

```systemd-dissect -m [path/to/image.raw] [/mnt/image]```

**Unmount** an OS image

```systemd-dissect -u [/mnt/image]```

**List** files in an image

```systemd-dissect -l [path/to/image.raw]```

**Attach** an OS image to a loopback device

```systemd-dissect --attach [path/to/image.raw]```

**Detach** an OS image from a loopback device

```systemd-dissect --detach [path/to/device]```

# SYNOPSIS

**systemd-dissect** [_options_] [_image_]

# PARAMETERS

**-m, --mount**
> Mount the image to a directory

**-u, --umount**
> Unmount a mounted image

**-l, --list**
> List files in the image

**--attach**
> Attach image to loopback device

**--detach**
> Detach image from loopback device

**-x, --copy-from**
> Copy files from image

**-a, --copy-to**
> Copy files to image

**--root-hash _hash_**
> Specify dm-verity root hash

# DESCRIPTION

**systemd-dissect** introspects and interacts with Discoverable Disk Images (DDIs) and other OS disk images. It can mount, list, and manipulate image contents without requiring manual loopback setup.

The tool supports various image formats including raw disk images with GPT partition tables, following the Discoverable Partitions Specification for automatic partition type recognition.

# CAVEATS

Requires appropriate kernel support for filesystem types in the image. dm-verity images require the root hash to be provided. Part of the systemd suite.

# SEE ALSO

[systemd-nspawn](/man/systemd-nspawn)(1), [losetup](/man/losetup)(8), [mount](/man/mount)(8)
