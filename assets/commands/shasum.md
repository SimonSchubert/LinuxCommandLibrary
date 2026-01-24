# TLDR

**Calculate SHA-1 hash**

```shasum [file]```

**Calculate SHA-256 hash**

```shasum -a 256 [file]```

**Calculate SHA-512 hash**

```shasum -a 512 [file]```

**Check hashes from file**

```shasum -c [checksums.txt]```

**Calculate hash from stdin**

```echo -n "[text]" | shasum```

**Binary mode**

```shasum -b [file]```

**Create checksums for multiple files**

```shasum -a 256 [*.tar.gz] > [SHA256SUMS]```

# SYNOPSIS

**shasum** [_-a algorithm_] [_-b_] [_-c_] [_options_] [_files_]

# PARAMETERS

**-a** _ALG_
> Algorithm (1, 224, 256, 384, 512, 512224, 512256).

**-b**
> Binary mode.

**-c**, **--check**
> Check hashes from file.

**-t**
> Text mode (default).

**-p**
> Portable mode.

**-s**, **--status**
> Status only (with -c).

**-w**, **--warn**
> Warn about improper lines.

**--strict**
> Exit non-zero for improperly formatted lines.

**--tag**
> BSD-style output.

**-h**, **--help**
> Show help.

# DESCRIPTION

**shasum** computes and verifies SHA message digests. SHA hashes are cryptographic fingerprints used for file integrity verification.

Algorithm selection chooses hash size. SHA-256 is commonly used for downloads and security. SHA-1 is legacy but still used in some contexts.

Check mode verifies files against recorded hashes. It reads a checksum file and confirms each listed file matches its hash.

Output format shows hash followed by filename. BSD-style output includes the algorithm name. Both formats are understood for verification.

Binary mode is recommended for non-text files. It ensures consistent hashing across platforms.

Stdin processing enables hashing command output or piped data without intermediate files.

# CAVEATS

SHA-1 is cryptographically weakened - use SHA-256+ for security. Hash verification requires original hash to be trusted.

# HISTORY

**shasum** is a Perl script included with Perl. It provides a unified interface to SHA algorithms, mirroring the functionality of sha256sum and similar coreutils programs.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [md5sum](/man/md5sum)(1), [openssl](/man/openssl)(1), [b2sum](/man/b2sum)(1)
