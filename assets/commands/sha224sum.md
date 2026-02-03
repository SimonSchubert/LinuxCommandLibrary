# TLDR

**Calculate SHA224 hash**

```sha224sum [file]```

**Check hashes from file**

```sha224sum -c [checksums.txt]```

**Calculate for multiple files**

```sha224sum [file1] [file2]```

**Read from stdin**

```echo "[text]" | sha224sum```

# SYNOPSIS

**sha224sum** [_options_] [_file_...]

# PARAMETERS

**-c**, **--check**
> Verify checksums from file.

**-b**, **--binary**
> Read in binary mode.

**-t**, **--text**
> Read in text mode.

**--quiet**
> Don't print OK for verified files.

# DESCRIPTION

**sha224sum** computes SHA-224 message digest. Part of SHA-2 family with 224-bit output. Used for file integrity verification. Less common than SHA-256.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha384sum](/man/sha384sum)(1), [sha512sum](/man/sha512sum)(1)

