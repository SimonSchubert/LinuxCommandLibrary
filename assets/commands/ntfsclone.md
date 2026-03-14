# TAGLINE

Efficiently clone, image, restore, or rescue an NTFS volume

# TLDR

**Clone NTFS partition to an image file**

```ntfsclone --output [clone.img] [/dev/sda1]```

**Save as space-efficient special image format**

```ntfsclone --save-image --output [clone.img] [/dev/sda1]```

**Restore from special image to a partition**

```ntfsclone --restore-image --output [/dev/sda1] [clone.img]```

**Clone metadata only (for debugging)**

```ntfsclone --metadata --output [meta.img] [/dev/sda1]```

**Clone to stdout and compress with gzip**

```ntfsclone --save-image -o - [/dev/sda1] | gzip -c > [clone.img.gz]```

**Rescue a failing disk (continue on read errors)**

```ntfsclone --rescue --output [rescue.img] [/dev/sda1]```

# SYNOPSIS

**ntfsclone** [_options_] _source_

# PARAMETERS

**-o**, **--output** _FILE_
> Output file or device. Use **-** for standard output.

**-O**, **--overwrite** _FILE_
> Overwrite an existing file or device (required for writing to partitions).

**-s**, **--save-image**
> Save to the special ntfsclone image format (only copies used clusters).

**-r**, **--restore-image**
> Restore from a special ntfsclone image.

**-m**, **--metadata**
> Clone only NTFS metadata (for debugging; result is still mountable).

**--rescue**
> Continue on disk read errors, filling bad sectors with zeros.

**--ignore-fs-check**
> Ignore the result of the filesystem consistency check.

**-f**, **--force**
> Force cloning even if the volume is marked dirty.

**--help**
> Display help information.

# DESCRIPTION

**ntfsclone** efficiently clones an NTFS filesystem to a sparse file, special image, device, or standard output. It works at the cluster level and only copies used data, making it much faster and more space-efficient than sector-level tools like **dd**.

The special image format (**--save-image**) encodes unused space with control codes rather than storing it, producing significantly smaller backup files. These images can only be restored with **ntfsclone --restore-image** and are not directly mountable.

The **--rescue** mode is designed for dying disks, reading data with minimal stress on the hardware and filling unreadable sectors with zeros.

# CAVEATS

Part of the ntfs-3g package. Special image files are not mountable and can only be restored with ntfsclone. When cloning to a partition, the destination must be at least as large as the source. The volume should be unmounted during cloning.

# HISTORY

**ntfsclone** was developed as part of **ntfs-3g** (formerly ntfsprogs) for efficient NTFS backup and restore on Linux systems.

# SEE ALSO

[ntfsresize](/man/ntfsresize)(1), [ntfs-3g](/man/ntfs-3g)(1), [ntfsfix](/man/ntfsfix)(1), [dd](/man/dd)(1), [partclone](/man/partclone)(1)

