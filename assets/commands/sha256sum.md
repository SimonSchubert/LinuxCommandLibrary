# TLDR

**Calculate the SHA256 checksum** of a file

```sha256sum [file]```

**Calculate checksums** for multiple files

```sha256sum [file1] [file2]```

**Read from stdin** and calculate checksum

```echo "text" | sha256sum```

**Generate a checksum file** for later verification

```sha256sum [file1] [file2] > [checksums.sha256]```

**Verify files** against a checksum file

```sha256sum -c [checksums.sha256]```

**Verify silently** (only show failures)

```sha256sum -c --quiet [checksums.sha256]```

# SYNOPSIS

**sha256sum** [_-bctwz_] [_--tag_] [_--strict_] [_FILE..._]

# PARAMETERS

**-b**, **--binary**
> Read in binary mode

**-c**, **--check**
> Read checksums from file and verify them

**-t**, **--text**
> Read in text mode (default)

**--tag**
> Create a BSD-style checksum output

**-z**, **--zero**
> End each output line with NUL, not newline

**--quiet**
> Don't print OK for each verified file

**--status**
> Don't output anything, exit code shows success

**-w**, **--warn**
> Warn about improperly formatted checksum lines

**--strict**
> Exit non-zero for improperly formatted checksum lines

**--ignore-missing**
> Don't fail for missing files during verification

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**sha256sum** computes and verifies SHA-256 cryptographic hash values. SHA-256 (Secure Hash Algorithm 256-bit) is part of the SHA-2 family and produces a 256-bit (32-byte) hash value, typically rendered as a 64-character hexadecimal number.

The command is commonly used to verify file integrity and authenticity. Software distributors often provide SHA256 checksums alongside downloads, allowing users to verify that files were not corrupted during transfer or tampered with.

When checking files with **-c**, the input file should contain lines in the format produced by sha256sum: the hash, two spaces (or a space and asterisk for binary mode), and the filename.

# CAVEATS

SHA-256 is not designed for password hashing; use **bcrypt** or **argon2** for that purpose. While SHA-256 is cryptographically secure against collisions, identical files always produce identical hashes, making it unsuitable for detecting small modifications with any probability of missing them. On macOS, the equivalent command is **shasum -a 256**.

# HISTORY

SHA-256 was designed by the **NSA** and published by **NIST** in **2001** as part of the SHA-2 family of hash functions. The **sha256sum** command was added to **GNU Coreutils** to provide a standard Unix utility for computing these hashes. It has become essential for software distribution verification, replacing MD5 and SHA-1 which have known weaknesses. SHA-256 is widely used in security applications, including Bitcoin's proof-of-work system.

# SEE ALSO

[md5sum](/man/md5sum)(1), [sha1sum](/man/sha1sum)(1), [sha512sum](/man/sha512sum)(1), [b2sum](/man/b2sum)(1), [cksum](/man/cksum)(1)
