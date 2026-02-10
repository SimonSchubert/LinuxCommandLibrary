# TAGLINE

compares two lzip-compressed files and shows differences

# TLDR

**Compare two lzip-compressed files**

```lzdiff [file1.lz] [file2.lz]```

**Show unified diff**

```lzdiff -u [file1.lz] [file2.lz]```

**Show context diff**

```lzdiff -c [file1.lz] [file2.lz]```

# SYNOPSIS

**lzdiff** [_options_] _file1_ _file2_

# PARAMETERS

**-u**
> Unified diff format.

**-c**
> Context diff format.

All diff options are supported.

# DESCRIPTION

**lzdiff** compares two lzip-compressed files and shows differences. Automatically decompresses before comparing. Equivalent to running diff on decompressed contents. Passes options through to diff.

# SEE ALSO

[lzip](/man/lzip)(1), [lzcmp](/man/lzcmp)(1), [diff](/man/diff)(1)

