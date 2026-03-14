# TAGLINE

Compute legacy file checksums and block counts

# TLDR

**Calculate checksum** using BSD algorithm (default)

```sum [file]```

**Use System V algorithm** with 512-byte blocks

```sum -s [file]```

**Explicitly use BSD algorithm** with 1K blocks

```sum -r [file]```

**Read from stdin**

```cat [file] | sum```

# SYNOPSIS

**sum** [_options_] [_file_...]

# PARAMETERS

**-r**
> Use BSD algorithm, use 1K blocks (default)

**-s**, **--sysv**
> Use System V algorithm, use 512-byte blocks

**--help**
> Display help and exit

**--version**
> Output version information and exit

# DESCRIPTION

**sum** prints checksum and block counts for each FILE. With no FILE, or when FILE is -, reads standard input. The default BSD algorithm uses 1024-byte blocks, while the System V algorithm uses 512-byte blocks.

This is a legacy utility provided for compatibility. The **cksum** command is preferred for new applications.

# CAVEATS

Not cryptographically secure. Use sha256sum or similar for integrity verification. The checksum algorithm is not suitable for detecting intentional data tampering.

# SEE ALSO

[cksum](/man/cksum)(1), [md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1)

