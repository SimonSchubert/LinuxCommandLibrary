# TAGLINE

Compute and verify SHA-224 checksums

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

**sha224sum** computes and verifies SHA-224 cryptographic hash values, producing a 224-bit (56-character hexadecimal) message digest. It is part of the SHA-2 family of hash functions and operates identically to **sha256sum** in usage, differing only in output length and the underlying truncation of the hash.

SHA-224 is less commonly used than SHA-256 but provides adequate security for applications where a shorter hash is preferred, such as certain certificate signature schemes. With no FILE argument or when FILE is **-**, input is read from standard input. In check mode (**-c**), previously generated checksums are verified against current file contents.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha384sum](/man/sha384sum)(1), [sha512sum](/man/sha512sum)(1)

