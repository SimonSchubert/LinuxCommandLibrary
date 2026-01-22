# TLDR

**Create file of size**

```mkfile [100m] [filename]```

**Create sparse file**

```mkfile -n [1g] [filename]```

**Create file in bytes**

```mkfile [1048576] [filename]```

**Create multiple files**

```mkfile [10m] [file1] [file2]```

**Verbose output**

```mkfile -v [100m] [filename]```

# SYNOPSIS

**mkfile** [_options_] _size_ _file_

# PARAMETERS

_SIZE_
> File size (b, k, m, g suffixes).

_FILE_
> Output filename.

**-n**
> Create sparse file.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mkfile** creates files of specified size. It can create empty files or sparse files.

The tool is useful for testing and creating disk images. Sparse files don't allocate full space.

mkfile creates sized files.

# CAVEATS

macOS/Solaris utility. Linux uses truncate/fallocate. Sparse file support varies.

# HISTORY

mkfile originates from **Solaris** and is also available on macOS for creating files of arbitrary size.

# SEE ALSO

[truncate](/man/truncate)(1), [fallocate](/man/fallocate)(1), [dd](/man/dd)(1)

