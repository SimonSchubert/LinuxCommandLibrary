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

**ntfscat** reads a file from an NTFS volume and outputs it to stdout. It can extract files by path or inode number, and can access NTFS alternate data streams.

Useful for forensics and data recovery from NTFS partitions.
# Extract file
ntfscat /dev/sda1 /Users/user/document.txt > recovered.txt

# Extract alternate data stream
ntfscat /dev/sda1 file.txt:hidden > hidden_data

# Extract by inode
ntfscat -i 54321 /dev/sda1 > file_by_inode
```

# CAVEATS

Requires ntfs-3g package. Device should be unmounted or mounted read-only. Windows paths use backslash.

# HISTORY

ntfscat is part of **ntfs-3g**, the open-source NTFS driver and utilities, providing read access to NTFS filesystems.

# SEE ALSO

[ntfsls](/man/ntfsls)(8), [ntfsinfo](/man/ntfsinfo)(8), [ntfs-3g](/man/ntfs-3g)(8), [ntfsresize](/man/ntfsresize)(8)
