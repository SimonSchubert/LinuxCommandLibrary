# TAGLINE

reads a file from an NTFS volume and outputs it to stdout

# TLDR

**Extract file from NTFS**

```ntfscat /dev/[sda1] [path/to/file] > [output]```

**Extract by inode number**

```ntfscat /dev/[sda1] -i [12345] > [output]```

**Extract named data stream**

```ntfscat /dev/[sda1] [file]:stream > [output]```

**Force extraction**

```ntfscat -f /dev/[sda1] [file] > [output]```

# SYNOPSIS

**ntfscat** [_options_] _device_ _file_

# PARAMETERS

**-i**, **--inode** _num_
> Use inode number.

**-a**, **--attribute** _type_
> Attribute type.

**-n**, **--attr-name** _name_
> Attribute name.

**-f**, **--force**
> Force operation.

**-q**, **--quiet**
> Quiet mode.

# DESCRIPTION

**ntfscat** reads a file from an NTFS volume and outputs its contents to standard output. Files can be referenced by their path within the volume or by MFT inode number, and named alternate data streams can be accessed using the `filename:stream` syntax.

Useful for forensics and data recovery from NTFS partitions without mounting the volume.

# CAVEATS

Requires ntfs-3g package. Device should be unmounted or mounted read-only. Windows paths use backslash.

# HISTORY

ntfscat is part of **ntfs-3g**, the open-source NTFS driver and utilities, providing read access to NTFS filesystems.

# SEE ALSO

[ntfsls](/man/ntfsls)(8), [ntfs-3g](/man/ntfs-3g)(8), [ntfsresize](/man/ntfsresize)(8)
