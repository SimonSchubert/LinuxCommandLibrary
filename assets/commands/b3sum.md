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

Generate a **keyed hash** (32-byte key read from stdin)

```b3sum --keyed [file] < [keyfile]```

**Derive a key** from a context string

```b3sum --derive-key "[app 2026-06-19 context]" [file]```

# SYNOPSIS

**b3sum** [_options_] [_file_...]

# DESCRIPTION

**b3sum** computes BLAKE3 cryptographic checksums. BLAKE3 is significantly faster than BLAKE2, MD5, SHA-1, and SHA-2, while maintaining high security. It's optimized for parallelism and can fully utilize modern CPU capabilities.

The tool provides similar interface to md5sum and sha256sum but with much better performance.

# PARAMETERS

**-c**, **--check**
> Read BLAKE3 sums from the file(s) and verify them.

**--keyed**
> Keyed hashing mode; reads a 32-byte key from stdin.

**--derive-key** _context_
> Key derivation mode using the given context string.

**-l**, **--length** _bytes_
> Output length in bytes before hex encoding (default: 32).

**--seek** _offset_
> Start output at the given byte offset (default: 0).

**--num-threads** _n_
> Maximum number of threads to use.

**--no-mmap**
> Disable memory mapping of input files.

**--no-names**
> Omit filenames; output the hash only.

**--raw**
> Write the raw hash bytes to stdout instead of hex (single input only).

**--tag**
> Produce BSD-style checksum lines.

**--quiet**
> When verifying, do not print OK for each successfully verified file.

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

[b2sum](/man/b2sum)(1), [sha256sum](/man/sha256sum)(1), [md5sum](/man/md5sum)(1), [xxhsum](/man/xxhsum)(1)

# RESOURCES

```[Source code](https://github.com/BLAKE3-team/BLAKE3)```

```[Documentation](https://github.com/BLAKE3-team/BLAKE3/blob/master/b3sum/README.md)```

<!-- verified: 2026-06-19 -->
