# TAGLINE

Compares two files using mtools

# TLDR

**Compare a file on a DOS disk with a local file**

```mcomp [a:file.txt] [path/to/local_file.txt]```

**Compare a file from a disk image with a local file**

```mcomp -i [path/to/disk.img] [::/file.txt] [path/to/local_file.txt]```

# SYNOPSIS

**mcomp** _msdos-file_ _local-file_

# PARAMETERS

_msdos-file_
> File on a DOS/floppy disk accessed via mtools.

_local-file_
> Local file to compare against.

# DESCRIPTION

**mcomp** compares two files byte by byte, where the first file resides on a DOS-formatted disk (such as a floppy) accessible through mtools. It is functionally equivalent to using mcopy to copy the file locally and then comparing with cmp.

This command is part of the **mtools** package, a collection of utilities for accessing MS-DOS disks from Unix without mounting them.

# CAVEATS

The first argument must be a file accessible via mtools (e.g., on a DOS-formatted disk or disk image). On modern systems, using mcopy followed by cmp provides the same functionality and is more commonly used.

# SEE ALSO

[cmp](/man/cmp)(1), [mcopy](/man/mcopy)(1), [diff](/man/diff)(1)
