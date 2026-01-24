# TLDR

**Calculate SHA256 hash**

```rhash --sha256 [file]```

**Calculate multiple hashes**

```rhash --md5 --sha1 --sha256 [file]```

**Calculate all supported hashes**

```rhash --all [file]```

**Verify hash from file**

```rhash -c [hashfile.sha256]```

**Create hash file**

```rhash --sha256 [file] -o [file.sha256]```

**Hash all files recursively**

```rhash -r --sha256 [directory]```

**Output in BSD format**

```rhash --bsd --sha256 [file]```

**Calculate CRC32**

```rhash --crc32 [file]```

# SYNOPSIS

**rhash** [_--algorithm_] [_-c_] [_-r_] [_-o file_] [_options_] _files_

# PARAMETERS

**--md5**
> Calculate MD5 hash.

**--sha1**
> Calculate SHA1 hash.

**--sha256**
> Calculate SHA-256 hash.

**--sha512**
> Calculate SHA-512 hash.

**--crc32**
> Calculate CRC32.

**--all**, **-a**
> Calculate all supported hashes.

**-c**, **--check**
> Verify hashes from file.

**-r**, **--recursive**
> Process directories recursively.

**-o**, **--output** _FILE_
> Output to file.

**--bsd**
> Use BSD output format.

**--sfv**
> Use SFV output format.

**--magnet**
> Output magnet link.

**-u**, **--update**
> Update hash file.

**--embed-crc**
> Rename file with embedded CRC.

**-q**, **--quiet**
> Quiet mode.

**-p** _FMT_, **--printf** _FMT_
> Custom output format.

# DESCRIPTION

**rhash** (Recursive Hasher) calculates and verifies message digests and checksums for files. It supports over 30 hash algorithms including MD5, SHA family, CRC32, Tiger, and ed2k.

Multiple hashes can be calculated simultaneously in a single pass, efficient for creating comprehensive hash manifests. Output formats include standard, BSD tag format, and SFV.

Verification mode (-c) reads hash files and checks files against stored values. It reports mismatches and missing files. Update mode modifies existing hash files with new entries.

Magnet link output creates links usable with BitTorrent clients. The link includes file hash, size, and optionally file name.

The --embed-crc option renames files to include CRC32 in the filename (common for anime/video files). This enables at-a-glance integrity checking.

Custom output formats via --printf allow integration with other tools. Templates use tokens for filename, hash, size, etc.

# CAVEATS

Large files take time to hash. Some algorithms (MD5, SHA1) are cryptographically weak. Not all algorithms supported on all platforms. Hash file formats vary between tools. CRC32 is not collision-resistant.

# HISTORY

**rhash** was created by **Aleksey Kravchenko** around **2005** as a fast, comprehensive hash calculation tool. Written in C, it emphasizes performance and supports more algorithms than most similar tools. The project continues development with regular updates for new hash functions.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [md5sum](/man/md5sum)(1), [cksum](/man/cksum)(1), [b3sum](/man/b3sum)(1)
