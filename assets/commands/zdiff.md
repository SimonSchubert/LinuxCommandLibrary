# TAGLINE

Compare gzip-compressed files line-by-line

# TLDR

**Compare two compressed files**

```zdiff [file1.gz] [file2.gz]```

**Compare in unified format**

```zdiff -u [file1.gz] [file2.gz]```

**Compare in context format**

```zdiff -c [file1.gz] [file2.gz]```

**Compare side by side**

```zdiff -y [file1.gz] [file2.gz]```

**Compare a compressed file** against its uncompressed version

```zdiff [file.gz]```

# SYNOPSIS

**zdiff** [_diff_options_] _file1_ [_file2_]

# PARAMETERS

All options are passed directly to **diff**(1). Common options include:

**-u**
> Unified output format.

**-c**
> Context output format.

**-y**
> Side-by-side output.

**-q**
> Report only whether files differ.

**-i**
> Ignore case differences.

**-w**
> Ignore all white space.

# DESCRIPTION

**zdiff** compares gzip-compressed files line-by-line without requiring manual decompression. It works like **diff** but transparently handles .gz files, decompressing them on the fly before comparing.

If only one file is specified, it is compared against the uncompressed contents of the corresponding .gz file. If two files are specified, their contents (uncompressed if necessary) are fed to diff.

All standard diff output formats are supported. Any options accepted by diff can be passed through to zdiff. The exit status from diff is preserved.

The command is part of the gzip package. For byte-by-byte comparison, use **zcmp** instead.

# CAVEATS

Only handles gzip-compressed files. Both files are fully decompressed in memory before comparison. For xz/lzma files, use xzdiff; for bzip2 files, use bzdiff.

# SEE ALSO

[diff](/man/diff)(1), [zcmp](/man/zcmp)(1), [zcat](/man/zcat)(1), [gzip](/man/gzip)(1), [zmore](/man/zmore)(1)
