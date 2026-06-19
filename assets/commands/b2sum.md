# TAGLINE

Compute and verify BLAKE2 cryptographic checksums.

# TLDR

**Calculate** BLAKE2 checksum

```b2sum [file]```

**Verify** checksums

```b2sum -c [checksums.b2]```

Use **specific length**

```b2sum -l [256] [file]```

Calculate for **multiple files**

```b2sum [file1] [file2] [file3]```

# SYNOPSIS

**b2sum** [_options_] [_file_...]

# DESCRIPTION

**b2sum** computes and verifies BLAKE2b cryptographic checksums. BLAKE2 is a fast, secure hash function that outperforms MD5, SHA-1, and SHA-2 in software while providing at least as much security as SHA-3.

The tool is part of GNU coreutils and provides similar functionality to md5sum and sha256sum.

# PARAMETERS

**-c**, **--check**
> Read checksums from the file(s) and verify them.

**-l**, **--length** _bits_
> Digest length in bits, a multiple of 8 (default: 512). Ignored when verifying.

**-b**, **--binary**
> Read in binary mode.

**-t**, **--text**
> Read in text mode (default).

**--tag**
> Create a BSD-style checksum line.

**-z**, **--zero**
> End each output line with NUL, not newline.

**--ignore-missing**
> When verifying, do not fail or report status for missing files.

**--quiet**
> When verifying, do not print OK for each successfully verified file.

**--status**
> When verifying, print nothing; signal result only via exit status.

**-w**, **--warn**
> When verifying, warn about improperly formatted checksum lines.

**--strict**
> When verifying, exit non-zero for any improperly formatted checksum line.

# FEATURES

- Fast performance
- Configurable output length (multiple of 8 bits)
- Verification mode
- Same interface as md5sum and sha256sum

# WORKFLOW

```bash
# Create checksums
b2sum file1 file2 > checksums.b2

# Verify
b2sum -c checksums.b2

# Use 256-bit digest
b2sum -l 256 file
```

# CAVEATS

Not as widely supported as SHA-256. Different tools may use BLAKE2b vs BLAKE2s. Length parameter affects compatibility. Relatively new compared to SHA family.

# HISTORY

**b2sum** was added to GNU coreutils in version **8.26** (2016), providing BLAKE2 hashing support following the algorithm's publication in **2012**.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [md5sum](/man/md5sum)(1), [b3sum](/man/b3sum)(1), [cksum](/man/cksum)(1)

# RESOURCES

```[Source code](https://github.com/coreutils/coreutils)```

```[Documentation](https://www.gnu.org/software/coreutils/manual/html_node/b2sum-invocation.html)```

<!-- verified: 2026-06-19 -->
