# TAGLINE

creates files of specified size

# TLDR

**Create file of size**

```mkfile [100m] [filename]```

**Create sparse file**

```mkfile -n [1g] [filename]```

**Create file of exact byte size** (no suffix means bytes)

```mkfile [1048576] [filename]```

**Create file in 512-byte blocks**

```mkfile [2048]b [filename]```

**Create multiple files**

```mkfile [10m] [file1] [file2]```

**Report** names and sizes of created files

```mkfile -v [100m] [filename]```

# SYNOPSIS

**mkfile** [**-nv**] _size_[**b**|**k**|**m**|**g**] _file_ ...

# PARAMETERS

_SIZE_
> File size in bytes; suffixes **b** (512), **k** (1024), **m** (1048576), **g** (1073741824).

_FILE_
> One or more output filenames.

**-n**
> Create an empty (sparse) file: the size is recorded but disk blocks are not allocated until written.

**-v**
> Verbose: report the names and sizes of created files.

# DESCRIPTION

**mkfile** creates one or more files of a given size, padded with zeros by default. It was designed to create NFS-mounted swap files, so it also sets the **sticky bit** on the new files (non-root users must set it with chmod).

It is handy for creating test files and disk images. With **-n** the file is sparse and consumes no space until data is written.

# CAVEATS

macOS/Solaris/BSD utility, not available on Linux: use **truncate -s** (sparse) or **fallocate -l** (allocated) instead. Note that the **b** suffix means 512-byte blocks, not bytes. On macOS the tool lives in /usr/sbin.

# HISTORY

mkfile originates from **Solaris** and is also available on macOS for creating files of arbitrary size.

# SEE ALSO

[truncate](/man/truncate)(1), [fallocate](/man/fallocate)(1), [dd](/man/dd)(1)

# RESOURCES

```[Source code](https://github.com/apple-oss-distributions/system_cmds/tree/main/mkfile)```

<!-- verified: 2026-09-29 -->
