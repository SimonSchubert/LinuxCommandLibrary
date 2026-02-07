# TAGLINE

CRC-32 checksum calculator

# TLDR

**Calculate CRC32 checksum** of a file

```crc32 [path/to/file]```

**Calculate checksum for multiple** files

```crc32 [file1] [file2] [file3]```

**Calculate checksum from stdin**

```echo "[text]" | crc32 /dev/stdin```

**Calculate with filename output**

```crc32 [file.txt]```

# SYNOPSIS

**crc32** [_file_...]

# PARAMETERS

_FILE_
> File(s) to calculate CRC32 checksum for. Multiple files can be specified.

**/dev/stdin**
> Use to read from standard input.

# DESCRIPTION

**crc32** calculates the CRC-32 checksum for files, using the same polynomial as used in ZIP archives, gzip, and PNG files. It outputs the checksum as an 8-character hexadecimal value.

CRC-32 (Cyclic Redundancy Check) is a hash function used primarily for detecting accidental changes to data. While not cryptographically secure, it's widely used in file formats and network protocols for error detection due to its speed and simplicity.

The command processes files specified on the command line, outputting the checksum along with the filename. It's useful for verifying file integrity, comparing files, and working with archives or protocols that use CRC-32 checksums.

# CAVEATS

CRC-32 is not suitable for security purposes as it can be easily manipulated. It detects accidental corruption but provides no protection against intentional modification. For security-sensitive applications, use cryptographic hashes like SHA-256.

# HISTORY

CRC-32 was first published in **1975** as part of Ethernet protocol development. The specific polynomial used (IEEE 802.3) became the most common variant. The crc32 command provides convenient command-line access to this widely-used checksum algorithm.

# SEE ALSO

[cksum](/man/cksum)(1), [md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1), [xxhsum](/man/xxhsum)(1)
