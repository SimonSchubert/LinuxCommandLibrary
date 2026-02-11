# TAGLINE

Compute and verify SHA message digests

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

**shasum** is a unified Perl-based utility for computing and verifying SHA message digests across all algorithm variants. The **-a** option selects the algorithm: SHA-1 (default), SHA-224, SHA-256, SHA-384, SHA-512, and the truncated SHA-512/224 and SHA-512/256 variants. SHA-256 is the most commonly used for software distribution verification and security applications.

In check mode (**-c**), shasum reads a file containing previously generated checksums and verifies each listed file against its recorded hash, reporting success or failure. Output format shows the hash followed by the filename, with BSD-style output (**--tag**) additionally including the algorithm name. Both formats are understood during verification.

This command is the standard SHA utility on macOS and systems with Perl installed, providing equivalent functionality to the separate **sha1sum**, **sha256sum**, and **sha512sum** commands found in GNU coreutils.

# CAVEATS

SHA-1 is cryptographically weakened - use SHA-256+ for security. Hash verification requires original hash to be trusted.

# HISTORY

**shasum** is a Perl script included with Perl. It provides a unified interface to SHA algorithms, mirroring the functionality of sha256sum and similar coreutils programs.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [md5sum](/man/md5sum)(1), [openssl](/man/openssl)(1), [b2sum](/man/b2sum)(1)
