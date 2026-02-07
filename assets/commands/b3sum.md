# TAGLINE

Compute and verify BLAKE3 cryptographic checksums.

# TLDR

**Calculate** BLAKE3 checksum

```b3sum [file]```

**Verify** checksums

```b3sum -c [checksums.b3]```

Calculate from **stdin**

```echo "data" | b3sum```

**Multiple files**

```b3sum [file1] [file2] [file3]```

Generate **keyed hash**

```b3sum --keyed < [keyfile] [file]```

# SYNOPSIS

**b3sum** [_options_] [_file_...]

# DESCRIPTION

**b3sum** computes BLAKE3 cryptographic checksums. BLAKE3 is significantly faster than BLAKE2, MD5, SHA-1, and SHA-2, while maintaining high security. It's optimized for parallelism and can fully utilize modern CPU capabilities.

The tool provides similar interface to md5sum and sha256sum but with much better performance.

# PARAMETERS

**-c**, **--check**
> Verify checksums from file

**--keyed**
> Use keyed hashing mode

**--derive-key** _context_
> Key derivation mode

**--length** _bytes_
> Output length (default: 32)

**--num-threads** _n_
> Number of threads to use

**--no-mmap**
> Disable memory mapping

**--no-names**
> Omit filenames (output hash only)

# FEATURES

- Extremely fast (GBs per second)
- Parallel processing
- Unlimited output length
- Tree hashing for verification
- Keyed mode for authentication
- Deterministic output

# WORKFLOW

```bash
# Hash files
b3sum *.tar.gz > checksums.b3

# Verify
b3sum -c checksums.b3

# Hash stdin
cat largefile | b3sum

# Use multiple threads
b3sum --num-threads 8 hugefile.bin
```

# CAVEATS

Relatively new algorithm (2020). Less widely adopted than SHA-256. Not suitable for password hashing (use argon2 instead). Requires recent software versions.

# HISTORY

**b3sum** was released in **2020** alongside the BLAKE3 specification, created by Jack O'Connor and Samuel Neves as an evolution of BLAKE2 optimized for speed and parallelism.

# SEE ALSO

[b2sum](/man/b2sum)(1), [sha256sum](/man/sha256sum)(1), [xxhsum](/man/xxhsum)(1)
