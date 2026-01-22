# TLDR

**Create archive**

```zpaq add [archive.zpaq] [files...]```

**Extract archive**

```zpaq extract [archive.zpaq]```

**List archive contents**

```zpaq list [archive.zpaq]```

**Add with maximum compression**

```zpaq add [archive.zpaq] [files] -method 5```

**Extract to specific directory**

```zpaq extract [archive.zpaq] -to [/output/dir]```

**Incremental backup**

```zpaq add [backup.zpaq] [directory] -all```

# SYNOPSIS

**zpaq** _command_ _archive_[**.zpaq**] [_files_...] [_options_]

# COMMANDS

**add**
> Add or update files in archive

**extract**
> Extract files from archive

**list**
> List archive contents

**compare**
> Compare archive with filesystem

**test**
> Test archive integrity

# PARAMETERS

**-method** _level_
> Compression level (0-5, higher = better compression)

**-to** _path_
> Destination directory for extraction

**-all**
> Include hidden files and empty directories

**-not** _pattern_
> Exclude files matching pattern

**-only** _pattern_
> Include only matching files

**-until** _date_
> Extract version as of date

**-threads** _n_
> Number of threads to use

**-key** _password_
> Encrypt/decrypt with password

# DESCRIPTION

**zpaq** is an archiver with high compression ratios and journaling capability. It uses context mixing and neural network-based prediction for compression, achieving ratios better than most conventional archivers.

ZPAQ's journaling feature makes it excellent for incremental backups. Each **add** creates a new version, and previous versions remain accessible. The **-until** flag extracts files as they existed at a specific time.

Archives are append-only by default - new versions add to the archive without modifying previous data. This provides some protection against corruption and allows versioned backups.

Compression levels range from 0 (store only) to 5 (maximum compression, slow).

# CAVEATS

High compression levels are CPU-intensive and slow. Level 5 can be orders of magnitude slower than level 1.

ZPAQ format is not widely supported outside the zpaq tool itself. Consider compatibility needs.

Journaling archives can grow large over time. Use **zpaq add -method 0** to consolidate.

Encryption is optional and must be specified during archive creation.

# SEE ALSO

[tar](/man/tar)(1), [7z](/man/7z)(1), [gzip](/man/gzip)(1), [zstd](/man/zstd)(1)
