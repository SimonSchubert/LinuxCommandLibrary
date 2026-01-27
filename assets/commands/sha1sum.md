# TLDR

**Calculate the SHA1 checksum** of a file

```sha1sum [path/to/file]```

**Calculate checksums for multiple files**

```sha1sum [file1] [file2] [file3]```

**Calculate and save checksums** to a file

```sha1sum [*.iso] > [checksums.sha1]```

**Verify checksums** from a file

```sha1sum -c [checksums.sha1]```

**Verify silently** (only show failures)

```sha1sum -c --quiet [checksums.sha1]```

**Read from stdin**

```echo -n "[text]" | sha1sum```

# SYNOPSIS

**sha1sum** [_OPTION_]... [_FILE_]...

# PARAMETERS

**-b**, **--binary**
> Read in binary mode

**-c**, **--check**
> Read checksums from FILEs and verify them

**-t**, **--text**
> Read in text mode (default)

**--tag**
> Create a BSD-style checksum output

**-z**, **--zero**
> End each output line with NUL instead of newline

**--ignore-missing**
> Don't fail for missing files when checking

**--quiet**
> Don't print OK for each successfully verified file

**--status**
> Don't output anything; use exit status for result

**--strict**
> Exit non-zero for improperly formatted checksum lines

**-w**, **--warn**
> Warn about improperly formatted checksum lines

# DESCRIPTION

**sha1sum** computes and verifies SHA1 (160-bit) message digests as described in FIPS-180-1. It generates a unique 40-character hexadecimal hash for file contents, useful for verifying file integrity and detecting modifications.

With no FILE argument or when FILE is **-**, sha1sum reads from standard input. Output format is: checksum, space, mode indicator (* for binary, space for text), and filename.

When checking with **-c**, input should be previous sha1sum output. Each line is verified and reported as OK or FAILED.

# CAVEATS

SHA-1 is cryptographically broken and vulnerable to collision attacks. It should not be used for security-sensitive applications like digital signatures. For stronger security, use **sha256sum** or **sha512sum** instead.

# HISTORY

sha1sum is part of **GNU coreutils**, written by Ulrich Drepper, Scott Miller, and David Madore. SHA-1 was designed by the NSA and published by NIST in **1995**. Collision vulnerabilities were demonstrated in **2017**, leading to deprecation for cryptographic purposes.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha512sum](/man/sha512sum)(1), [md5sum](/man/md5sum)(1), [cksum](/man/cksum)(1)
