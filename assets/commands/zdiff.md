# TAGLINE

Compare gzip-compressed files line-by-line

# TLDR

**Compare compressed files**

```zdiff [file1.gz] [file2.gz]```

**Unified format**

```zdiff -u [file1.gz] [file2.gz]```

**Context format**

```zdiff -c [file1.gz] [file2.gz]```

**Side by side**

```zdiff -y [file1.gz] [file2.gz]```

# SYNOPSIS

**zdiff** [_-u_] [_-c_] [_-y_] [_options_] _file1_ _file2_

# PARAMETERS

**-u**
> Unified format.

**-c**
> Context format.

**-y**
> Side by side.

**-q**
> Brief output.

# DESCRIPTION

**zdiff** compares gzip-compressed files line-by-line without requiring manual decompression. It works like **diff** but transparently handles .gz files, decompressing them on the fly before comparing.

All standard diff output formats are supported: unified (**-u**), context (**-c**), and side-by-side (**-y**). Any options accepted by diff can be passed through to zdiff.

The command is part of the gzip package and serves as a convenience wrapper. For byte-by-byte comparison of compressed files, use **zcmp** instead.

# CAVEATS

Gzip format. Decompresses to compare. Part of gzip package.

# HISTORY

**zdiff** is part of the gzip package, providing diff functionality for compressed files.

# SEE ALSO

[diff](/man/diff)(1), [zcmp](/man/zcmp)(1), [zcat](/man/zcat)(1)
