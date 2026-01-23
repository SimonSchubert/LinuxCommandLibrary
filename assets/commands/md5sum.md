# TLDR

**Calculate MD5 hash** of a file

```md5sum [file]```

**Calculate hash** for multiple files

```md5sum [file1] [file2] [file3]```

**Calculate hash** from stdin

```echo "text" | md5sum```

**Save hashes** to file

```md5sum [*.iso] > checksums.md5```

**Verify files** against checksums

```md5sum -c checksums.md5```

**Verify silently** (only show failures)

```md5sum -c --quiet checksums.md5```

**Verify with status** code only

```md5sum -c --status checksums.md5```

**Output in BSD format**

```md5sum --tag [file]```

# SYNOPSIS

**md5sum** [_options_] [_file_...]

# DESCRIPTION

**md5sum** computes and verifies MD5 message digests (checksums). MD5 produces a 128-bit hash value, typically displayed as a 32-character hexadecimal number.

The tool is commonly used to verify file integrity after transfers, detect changes in files, and generate unique identifiers for content. Files can be checked against a previously generated checksum file.

Note that MD5 is cryptographically broken and should not be used for security purposes. Use SHA-256 or better for security-critical applications.

# PARAMETERS

**-c**, **--check**
> Read checksums and verify files.

**--quiet**
> Don't print OK for verified files.

**--status**
> Don't output, use exit status only.

**-w**, **--warn**
> Warn about malformed checksum lines.

**--strict**
> Exit non-zero for malformed lines.

**--tag**
> Create BSD-style checksum output.

**-b**, **--binary**
> Read files in binary mode.

**-t**, **--text**
> Read files in text mode (default).

**--ignore-missing**
> Ignore missing files when checking.

# CAVEATS

MD5 is cryptographically broken and vulnerable to collision attacks. Not suitable for security purposes. Different results for binary vs text mode on some systems. Empty file produces constant hash d41d8cd98f00b204e9800998ecf8427e.

# HISTORY

**md5sum** is part of **GNU coreutils**, implementing the MD5 algorithm designed by **Ronald Rivest** in **1991**. MD5 was widely used for file verification until cryptographic weaknesses were demonstrated in **2004-2005**. While still commonly used for non-security checksums, SHA-2 family hashes are recommended for security applications.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha1sum](/man/sha1sum)(1), [cksum](/man/cksum)(1), [b2sum](/man/b2sum)(1)
