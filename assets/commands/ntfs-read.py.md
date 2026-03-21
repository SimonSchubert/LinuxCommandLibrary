# TAGLINE

Impacket tool for reading NTFS volumes without mounting

# TLDR

**Read a file from an NTFS partition**

```ntfs-read.py [/dev/sda1] [/path/to/file]```

**List contents of a directory**

```ntfs-read.py [/dev/sda1] -l [/path/to/dir]```

**Extract a file to a local output file**

```ntfs-read.py [/dev/sda1] [/path/to/file] -o [output]```

**List the root directory**

```ntfs-read.py [/dev/sda1] -l /```

# SYNOPSIS

**ntfs-read.py** [_options_] _device_ [_path_]

# PARAMETERS

_DEVICE_
> NTFS partition device (e.g., /dev/sda1).

_PATH_
> Path within the NTFS volume to read or list.

**-l**
> List directory contents instead of reading a file.

**-o** _FILE_
> Write output to the specified file.

**--help**
> Display help information.

# DESCRIPTION

**ntfs-read.py** is an Impacket tool that reads NTFS file systems directly from block devices without mounting them. It parses the NTFS structures at a low level, providing access to files and directories on NTFS partitions.

This is useful for forensic analysis and data recovery scenarios where mounting the filesystem is undesirable or not possible. The tool can list directories, read individual files, and extract their contents.

Part of the **Impacket** security toolkit, which provides Python classes for working with network protocols and Windows-related structures.

# CAVEATS

Requires raw device access, so typically needs root privileges. As an Impacket Python script, it requires the Impacket library to be installed. Intended for security research and forensic use; not suitable as a general-purpose NTFS access tool.

# HISTORY

ntfs-read.py is part of **Impacket**, a collection of Python classes for working with network protocols originally developed by **SecureAuth** (now **Fortra**). It provides low-level NTFS access for security research and digital forensics.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(1), [ntfsfix](/man/ntfsfix)(1), [ntfsclone](/man/ntfsclone)(1), [impacket](/man/impacket)(1), [getTGT.py](/man/getTGT.py)(1)

