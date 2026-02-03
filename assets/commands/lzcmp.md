# TLDR

**Compare two lzip-compressed files**

```lzcmp [file1.lz] [file2.lz]```

**Compare with verbose output**

```lzcmp -l [file1.lz] [file2.lz]```

**Compare silently**

```lzcmp -s [file1.lz] [file2.lz]```

# SYNOPSIS

**lzcmp** [_options_] _file1_ _file2_

# PARAMETERS

**-l**
> Print byte number and values for differences.

**-s**
> Silent mode, exit status only.

# DESCRIPTION

**lzcmp** compares two lzip-compressed files byte by byte. Equivalent to running cmp on the decompressed contents. Returns exit status 0 if identical, 1 if different, 2 on error.

# SEE ALSO

[lzip](/man/lzip)(1), [lzdiff](/man/lzdiff)(1), [cmp](/man/cmp)(1)

