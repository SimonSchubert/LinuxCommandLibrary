# TLDR

**Calculate checksum of file**

```cksum [file.txt]```

**Calculate checksum of multiple files**

```cksum [file1] [file2]```

**Calculate from stdin**

```echo "data" | cksum```

**Use SHA256 algorithm**

```cksum --algorithm sha256 [file.txt]```

**Verify checksums from file**

```cksum -c [checksums.txt]```

**Output in base64**

```cksum --base64 [file.txt]```

# SYNOPSIS

**cksum** [_option_]... [_file_]...

# DESCRIPTION

**cksum** prints CRC checksum and byte count for files. By default uses 32-bit CRC algorithm. Part of GNU coreutils. Used to verify file integrity after transfers.

# PARAMETERS

**-a**, **--algorithm** _name_
> Select algorithm (crc, md5, sha1, sha256, sha512, etc.)

**-c**, **--check**
> Read checksums and verify them

**-l**, **--length** _bits_
> Digest length in bits

**--base64**
> Output base64-encoded digest

**--raw**
> Output raw binary digest

**--tag**
> BSD-style checksum (default)

**--untagged**
> Reversed style without digest type

**-z**, **--zero**
> End lines with NUL instead of newline

**--ignore-missing**
> Don't fail for missing files during check

**--quiet**
> Don't print OK for verified files

**--status**
> Silent mode, exit code shows result

**-w**, **--warn**
> Warn about malformed checksum lines

# OUTPUT FORMAT

```
checksum byte_count filename
```

# CAVEATS

CRC32 is not cryptographically secure. Use SHA256 or stronger for security-critical verification. Reads stdin when no file given or file is -.

# SEE ALSO

[md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1), [sum](/man/sum)(1)
