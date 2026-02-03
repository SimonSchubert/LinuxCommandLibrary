# TLDR

**Calculate SHA384 hash**

```sha384sum [file]```

**Check hashes from file**

```sha384sum -c [checksums.txt]```

**Calculate for multiple files**

```sha384sum [file1] [file2]```

**Read from stdin**

```echo "[text]" | sha384sum```

# SYNOPSIS

**sha384sum** [_options_] [_file_...]

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

**sha384sum** computes SHA-384 message digest. Part of SHA-2 family with 384-bit output. Provides security between SHA-256 and SHA-512. Used in TLS certificates.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha512sum](/man/sha512sum)(1), [sha224sum](/man/sha224sum)(1)

