# TAGLINE

Compute and verify SHA-512 checksums

# TLDR

**Calculate the SHA512 checksum** of a file

```sha512sum [path/to/file]```

**Calculate checksums for multiple files**

```sha512sum [file1] [file2] [file3]```

**Calculate and save checksums** to a file

```sha512sum [*.iso] > [checksums.sha512]```

**Verify checksums** from a file

```sha512sum -c [checksums.sha512]```

**Verify silently** (only show failures)

```sha512sum -c --quiet [checksums.sha512]```

**Read from stdin**

```echo -n "[text]" | sha512sum```

# SYNOPSIS

**sha512sum** [_OPTION_]... [_FILE_]...

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

**sha512sum** computes and verifies SHA512 (512-bit) message digests as described in FIPS-180-2. It generates a 128-character hexadecimal hash for file contents, providing strong integrity verification.

With no FILE argument or when FILE is **-**, sha512sum reads from standard input. Output format is: checksum, space, mode indicator (* for binary, space for text), and filename.

SHA512 provides stronger security than SHA1 or MD5 and is suitable for cryptographic applications. There is no difference between binary and text mode on GNU systems.

# CAVEATS

SHA512 produces significantly longer hashes (128 hex characters) compared to SHA256 (64) or SHA1 (40). While more secure, verification may be slower for large numbers of files compared to weaker algorithms.

# HISTORY

sha512sum is part of **GNU coreutils**, written by Ulrich Drepper, Scott Miller, and David Madore. SHA-512 was published by NIST as part of the SHA-2 family in **2001**, designed to replace the aging SHA-1 algorithm.

# SEE ALSO

[sha256sum](/man/sha256sum)(1), [sha1sum](/man/sha1sum)(1), [md5sum](/man/md5sum)(1), [b2sum](/man/b2sum)(1)
