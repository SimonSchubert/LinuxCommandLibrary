# TAGLINE

Calculate and verify file checksums

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

**-C**, **--crc32**
> Calculate CRC32 checksum.

**-M**, **--md5**
> Calculate MD5 hash.

**-H**, **--sha1**
> Calculate SHA1 hash.

**--sha256**
> Calculate SHA-256 hash.

**--sha512**
> Calculate SHA-512 hash.

**--sha3-256**
> Calculate SHA3-256 hash.

**--blake2b**
> Calculate BLAKE2b hash.

**-a**, **--all**
> Calculate all supported hashes.

**--list-hashes**
> Display names of supported hash functions.

**-c**, **--check**
> Verify hashes from file.

**-u**, **--update** _FILE_
> Add new digests to existing hash file.

**-k**, **--check-embedded**
> Verify files by CRC32 embedded in filenames.

**-B**, **--benchmark**
> Run benchmark for selected hash algorithm(s).

**-r**, **--recursive**
> Process directories recursively.

**--follow**
> Follow symbolic links when processing recursively.

**-m**, **--message** _TEXT_
> Calculate hash of a text message instead of a file.

**-o**, **--output** _FILE_
> Output to file.

**--bsd**
> Use BSD output format.

**--sfv**
> Use SFV output format (default).

**--simple**
> Use simple format (hash followed by filename).

**-g**, **--magnet**
> Output magnet link.

**-e**, **--embed-crc**
> Rename file with embedded CRC32 in filename.

**-v**, **--verbose**
> Show more detailed output.

**-P**, **--percents**
> Show progress percentage during processing.

**--speed**
> Display processing speed.

**-p** _FMT_, **--printf** _FMT_
> Custom output format using format directives.

**--template** _FILE_
> Read output format from file.

**-b**, **--base64**
> Output hash in Base64 encoding.

**--hex**
> Output hash in hexadecimal (default).

**--uppercase**
> Output hash in uppercase hexadecimal.

# DESCRIPTION

**rhash** (Recursive Hasher) calculates and verifies message digests and checksums for files. It supports numerous hash algorithms including CRC32, MD5, SHA family, SHA3, BLAKE2, BLAKE3, Tiger, TTH, AICH, ed2k, Whirlpool, GOST, and RIPEMD-160.

Multiple hashes can be calculated simultaneously in a single pass, efficient for creating comprehensive hash manifests. The default output format is SFV with CRC32; this can be changed with **--bsd**, **--simple**, **--magnet**, or **--printf**.

Verification mode (-c) reads hash files and checks files against stored values. It reports mismatches and missing files. Update mode modifies existing hash files with new entries.

Magnet link output creates links usable with BitTorrent clients. The link includes file hash, size, and optionally file name.

The --embed-crc option renames files to include CRC32 in the filename (common for anime/video files). This enables at-a-glance integrity checking.

Custom output formats via --printf allow integration with other tools. Templates use tokens for filename, hash, size, etc.

# CAVEATS

Large files take time to hash. Some algorithms (MD5, SHA1) are cryptographically weak. Not all algorithms supported on all platforms. Hash file formats vary between tools. CRC32 is not collision-resistant.

# HISTORY

**rhash** was created by **Aleksey Kravchenko** around **2005** as a fast, comprehensive hash calculation tool. Written in C, it emphasizes performance and supports more algorithms than most similar tools. The project continues development with regular updates for new hash functions.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha512sum](/man/sha512sum)(1), [sha1sum](/man/sha1sum)(1), [md5sum](/man/md5sum)(1), [shasum](/man/shasum)(1), [cksum](/man/cksum)(1), [b3sum](/man/b3sum)(1)
