# TAGLINE

Compute and verify SHA-384 checksums

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

**sha384sum** computes and verifies SHA-384 cryptographic hash values, producing a 384-bit (96-character hexadecimal) message digest. It is part of the SHA-2 family and is derived from SHA-512 with truncated output, offering a security level between SHA-256 and SHA-512.

SHA-384 is commonly used in TLS/SSL certificates and digital signatures where stronger security than SHA-256 is desired without the full 128-character output of SHA-512. With no FILE argument or when FILE is **-**, input is read from standard input. In check mode (**-c**), previously generated checksums are verified against current file contents.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha512sum](/man/sha512sum)(1), [sha224sum](/man/sha224sum)(1)

