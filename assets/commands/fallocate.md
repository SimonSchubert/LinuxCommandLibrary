# TLDR

**Allocate** 700 MiB file

```fallocate -l 700M path/to/file```

**Shrink** file by 200 MiB

```fallocate -c -l 200M path/to/file```

Shrink at **offset**

```fallocate -c -o 100M -l 20M path/to/file```

# SYNOPSIS

**fallocate** [_OPTIONS_] _filename_

# DESCRIPTION

**fallocate** preallocates or deallocates space to a file. Unlike writing zeros, fallocate uses filesystem-specific operations to quickly allocate space without initializing the data, making it very fast for creating large files.

# PARAMETERS

**-l, --length** _size_
> Length of the range to allocate or deallocate

**-o, --offset** _offset_
> Offset of the range from the beginning of the file

**-c, --collapse-range**
> Remove a range from the file without leaving a hole

**-d, --dig-holes**
> Detect and convert zero blocks to holes

**-p, --punch-hole**
> Deallocate space (create a hole) in the file

**-z, --zero-range**
> Zero a range but keep space allocated

**-n, --keep-size**
> Maintain apparent file size when extending allocation

# CAVEATS

Not all filesystems support all operations. The collapse operation requires filesystem support (ext4 4.2+, XFS 4.15+). Space allocation without zeroing means the file may contain previous disk data.

# HISTORY

**fallocate** is a Linux-specific utility that uses the fallocate() system call introduced in kernel 2.6.23.

# SEE ALSO

[truncate](/man/truncate)(1), [dd](/man/dd)(1), [fstrim](/man/fstrim)(8)
