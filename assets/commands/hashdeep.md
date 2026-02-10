# TAGLINE

computes multiple cryptographic hashes simultaneously for files and directories

# TLDR

**Compute MD5 and SHA-256 hashes** of files recursively

```hashdeep -r [path/to/directory]```

**Compute specific hash types** (md5, sha1, sha256, tiger, whirlpool)

```hashdeep -c [sha256] [path/to/files]```

**Create a hash manifest** of files

```hashdeep -r [path/to/directory] > [manifest.txt]```

**Audit files against a known hash manifest**

```hashdeep -r -a -k [manifest.txt] [path/to/directory]```

**Find files matching** hashes in a manifest

```hashdeep -r -m -k [manifest.txt] [path/to/directory]```

**Find files NOT matching** hashes in a manifest

```hashdeep -r -x -k [manifest.txt] [path/to/directory]```

**Show progress indicator** while hashing

```hashdeep -r -e [path/to/directory]```

# SYNOPSIS

**hashdeep** [_-c alg_] [_-k file_] [_-amxwMXrespblvv_] [_files_]

**hashdeep** -c _alg1_,_alg2_ -r _directory_

# PARAMETERS

**-c** _ALG_
> Compute hashes using specified algorithms (md5, sha1, sha256, tiger, whirlpool); default is md5,sha256

**-r**
> Recursive mode; traverse all subdirectories

**-k** _FILE_
> Load file of known hashes for comparison

**-a**
> Audit mode; compare files against known hashes

**-m**
> Positive matching; only show files that match known hashes

**-x**
> Negative matching; only show files NOT in known hashes

**-M**
> Like -m but also print hash of each matching file

**-X**
> Like -x but also print hash of each non-matching file

**-w**
> When auditing, display which known file matched

**-e**
> Display progress indicator and time estimate

**-s**
> Silent mode; suppress error messages

**-b**
> Bare mode; strip directory paths from output

**-l**
> Use relative file paths instead of absolute

**-p** _SIZE_
> Piecewise mode; break files into chunks before hashing

**-v**
> Verbose mode; use multiple times for more detail

**-j** _NUM_
> Use specified number of threads

**-d**
> Output in DFXML format

**-h**
> Show help message

**-V**
> Show version

# DESCRIPTION

**hashdeep** computes multiple cryptographic hashes simultaneously for files and directories. Unlike single-hash tools, it calculates MD5 and SHA-256 by default, providing stronger verification through multiple algorithms.

The tool excels at file integrity verification and digital forensics. It can create manifests of known-good files, then audit systems to detect changes, additions, or deletions. Audit mode reports file states: MATCH for identical files, MISMATCH for modified files, MISSING for deleted files, and NEW for added files.

Output follows the DFXML-compatible hashdeep format, including file size, hash values, and path. This format can be loaded with **-k** for later verification. The tool handles large directory trees efficiently with recursive scanning and optional threading.

# CAVEATS

Hash algorithms like MD5 and SHA-1 have known collision vulnerabilities and should not be relied upon for security-critical verification. Use SHA-256 or stronger algorithms when integrity is paramount. Very large files may take considerable time to hash. The tool reads files sequentially and may be I/O bound.

# HISTORY

hashdeep was written by **Jesse Kornblum** and **Simson Garfinkel** as part of the **md5deep** package of forensic hashing tools. First released in **2003**, it was designed for digital forensics investigators who needed to verify file integrity and detect tampering. The multi-hash capability was added to address weaknesses in individual algorithms. The project is commonly used in law enforcement digital forensics and enterprise data integrity verification.

# SEE ALSO

[md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1), [sha1deep](/man/sha1deep)(1), [md5deep](/man/md5deep)(1)
