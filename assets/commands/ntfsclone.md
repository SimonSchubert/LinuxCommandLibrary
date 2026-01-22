# TLDR

**Clone NTFS partition**

```ntfsclone --output [clone.img] [/dev/sda1]```

**Clone to file (compressed)**

```ntfsclone --save-image --output [clone.img.gz] [/dev/sda1] | gzip```

**Restore from image**

```ntfsclone --restore-image --output [/dev/sda1] [clone.img]```

**Clone metadata only**

```ntfsclone --metadata --output [meta.img] [/dev/sda1]```

# SYNOPSIS

**ntfsclone** [_options_] _source_

# PARAMETERS

**-o**, **--output** _FILE_
> Output file or device.

**-O**, **--overwrite**
> Overwrite existing file.

**-s**, **--save-image**
> Save as special image format.

**-r**, **--restore-image**
> Restore from special image.

**-m**, **--metadata**
> Clone only metadata.

**--rescue**
> Continue on read errors.

**--help**
> Display help information.

# DESCRIPTION

**ntfsclone** clones NTFS partitions efficiently. Copies only used clusters.

The tool creates space-efficient backups. Supports special image format for compression.

ntfsclone clones NTFS volumes.

# CAVEATS

Part of ntfs-3g. Special image not mountable. Destination must be same size or larger.

# HISTORY

ntfsclone was developed as part of **ntfs-3g** for efficient NTFS backup and restore.

# SEE ALSO

[ntfsresize](/man/ntfsresize)(1), [ntfs-3g](/man/ntfs-3g)(1), [dd](/man/dd)(1)

