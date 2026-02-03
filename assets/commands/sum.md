# TLDR

**Calculate checksum**

```sum [file]```

**Use System V algorithm**

```sum -s [file]```

**Use BSD algorithm**

```sum -r [file]```

# SYNOPSIS

**sum** [_options_] [_file_...]

# PARAMETERS

**-r**
> Use BSD algorithm (default).

**-s**, **--sysv**
> Use System V algorithm.

# DESCRIPTION

**sum** computes file checksums and block counts. Legacy checksum utility. For security purposes, use sha256sum or similar modern hash functions instead.

# CAVEATS

Not cryptographically secure. Use sha256sum for integrity verification.

# SEE ALSO

[cksum](/man/cksum)(1), [md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1)

