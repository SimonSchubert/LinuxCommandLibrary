# TLDR

**Compare two bzip2 compressed files**

```bzdiff [file1.bz2] [file2.bz2]```

**Compare compressed file with uncompressed version**

```bzdiff [file.bz2]```

**Compare with diff options**

```bzdiff -u [file1.bz2] [file2.bz2]```

**Compare using cmp instead of diff**

```bzcmp [file1.bz2] [file2.bz2]```

# SYNOPSIS

**bzdiff** [_diff_options_] _file1_ [_file2_]

**bzcmp** [_cmp_options_] _file1_ [_file2_]

# DESCRIPTION

**bzdiff** compares bzip2 compressed files by decompressing them and passing the content to diff. All options are passed directly to the underlying diff command.

**bzcmp** works similarly but uses cmp instead of diff for byte-by-byte comparison.

# PARAMETERS

All parameters are passed directly to **diff** or **cmp**:

**-u**
> Unified diff format

**-c**
> Context diff format

**-i**
> Ignore case differences

**-w**
> Ignore whitespace

**-q**
> Report only whether files differ

# BEHAVIOR

**Single file**
> Compares file1 with file1.bz2 (uncompressed version)

**Two files**
> Decompresses both if needed and compares

# EXIT STATUS

Returns the exit status from diff or cmp, preserving the comparison result.

# CAVEATS

Error messages refer to temporary filenames instead of original filenames. Files are decompressed to temporary storage during comparison.

# SEE ALSO

[diff](/man/diff)(1), [cmp](/man/cmp)(1), [bzgrep](/man/bzgrep)(1), [bzmore](/man/bzmore)(1), [bzip2](/man/bzip2)(1)
