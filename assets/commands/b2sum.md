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
> Verify checksums from file

**-l**, **--length** _bits_
> Digest length in bits (default: 512)

**-b**, **--binary**
> Read in binary mode

**-t**, **--text**
> Read in text mode

**--tag**
> Create BSD-style checksums

**--quiet**
> Don't print OK for verified files

**--strict**
> Exit non-zero on improperly formatted checksum lines

# FEATURES

- Fast performance
- Configurable output length
- Keyed hashing support
- Verification mode
- Compatible with standard checksum tools

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

[sha256sum](/man/sha256sum)(1), [md5sum](/man/md5sum)(1), [b3sum](/man/b3sum)(1)
