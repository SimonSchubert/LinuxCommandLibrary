# TAGLINE

Print or check xxHash non-cryptographic checksums

# TLDR

Calculate **XXH64 checksum** (default)

```xxhsum [path/to/file]```

Calculate **XXH32 checksum**

```xxhsum -H0 [path/to/file]```

Calculate **XXH128 checksum**

```xxhsum -H2 [path/to/file]```

**Verify checksums** from a file

```xxhsum -c [path/to/checksums.xxh]```

Run **benchmark**

```xxhsum -b```

# SYNOPSIS

**xxhsum** [_OPTION_]... [_FILE_...]

**xxhsum -b** [_OPTION_]...

# PARAMETERS

**-H** _HASHTYPE_
> Hash algorithm: 0 (XXH32), 1 (XXH64, default), 2 (XXH128), 3 (XXH3). Also accepts 32, 64, 128 as aliases.

**-b**
> Activate benchmark mode

**-B** _BLOCKSIZE_
> Set benchmark block size in bytes (default: 102400)

**-i** _ITERATIONS_
> Set number of benchmark iterations (default: 3)

**-c, --check** _FILE_
> Verify checksums from file

**-q, --quiet**
> Suppress OK messages during verification

**-w, --warn**
> Warn about malformed checksum lines

**--strict**
> Return error on invalid checksum lines

**--status**
> Silent verification; indicate result only via exit code

**--tag**
> Output in BSD-style format

**--little-endian**
> Display checksum in little-endian format (default is big-endian)

**-h, --help**
> Display help

**-V, --version**
> Display version

# DESCRIPTION

**xxhsum** prints or checks xxHash (32, 64, or 128 bit) checksums. xxHash is an extremely fast non-cryptographic hash function, suitable for integrity checking where speed is important.

When no FILE is specified, reads from standard input. The command line syntax is similar to md5sum(1).

Equivalent shortcut commands: **xxh32sum** (same as xxhsum -H0), **xxh64sum** (same as xxhsum -H1), **xxh128sum** (same as xxhsum -H2).

# CAVEATS

Not cryptographically secure. Should not be used for security-sensitive applications. For security, use SHA-256 or similar.

# SEE ALSO

[md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1), [b2sum](/man/b2sum)(1), [cksum](/man/cksum)(1)
