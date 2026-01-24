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

**zdiff** compares compressed files. It's diff for gzip.

Gzip comparison. Decompress and diff.

All diff options. Same functionality.

Convenience tool. Automatic decompression.

Part of gzip. Standard tool.

# CAVEATS

Gzip format. Decompresses to compare. Part of gzip package.

# HISTORY

**zdiff** is part of the gzip package, providing diff functionality for compressed files.

# SEE ALSO

[diff](/man/diff)(1), [zcmp](/man/zcmp)(1), [zcat](/man/zcat)(1)
