# TLDR

**Compare compressed files**

```zcmp [file1.gz] [file2.gz]```

**Show differences**

```zcmp -l [file1.gz] [file2.gz]```

**Silent mode**

```zcmp -s [file1.gz] [file2.gz]```

# SYNOPSIS

**zcmp** [_-l_] [_-s_] _file1_ _file2_

# PARAMETERS

**-l**
> Show byte positions.

**-s**
> Silent, exit code only.

**-i** _SKIP_
> Skip bytes.

# DESCRIPTION

**zcmp** compares compressed files. It's cmp for gzip.

Gzip file comparison. Without decompressing.

Byte-by-byte. Like cmp.

Exit codes. 0=same, 1=differ.

Convenience wrapper. Uses zdiff.

# CAVEATS

Gzip format. For .gz files. Part of gzip package.

# HISTORY

**zcmp** is part of the gzip package, providing cmp-like functionality for compressed files.

# SEE ALSO

[cmp](/man/cmp)(1), [zdiff](/man/zdiff)(1), [zcat](/man/zcat)(1)
