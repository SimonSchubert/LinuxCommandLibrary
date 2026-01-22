# TLDR

Calculate **checksum**

```xxhsum -H[0|32|64|128] [path/to/file]```

Run **benchmark**

```xxhsum -b```

# SYNOPSIS

**xxhsum** [_OPTIONS_] [_FILE..._]

# PARAMETERS

**-H** _ALGO_
> Hash algorithm: 0 (XXH32), 32 (XXH32), 64 (XXH64), 128 (XXH128)

**-b**
> Run benchmark

**-c** _FILE_
> Verify checksums from file

**-q**
> Quiet mode

# DESCRIPTION

**xxhsum** calculates and verifies checksums using the xxHash algorithm. xxHash is an extremely fast non-cryptographic hash function, suitable for integrity checking where speed is important.

It's faster than MD5 or SHA but not suitable for cryptographic purposes.

# CAVEATS

Not cryptographically secure. Should not be used for security-sensitive applications. For security, use SHA-256 or similar.

# SEE ALSO

[md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1), [b2sum](/man/b2sum)(1)
