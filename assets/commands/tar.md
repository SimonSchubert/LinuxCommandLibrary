# TAGLINE

Archive and compress files

# TLDR

**Create an archive** from files

```tar -cvf [archive.tar] [file1] [file2]```

**Create a gzip-compressed archive**

```tar -czvf [archive.tar.gz] [directory/]```

**Create a bzip2-compressed archive**

```tar -cjvf [archive.tar.bz2] [directory/]```

**Create an xz-compressed archive**

```tar -cJvf [archive.tar.xz] [directory/]```

**Extract an archive**

```tar -xvf [archive.tar]```

**Extract a compressed archive**

```tar -xzvf [archive.tar.gz]```

**Extract to a specific directory**

```tar -xvf [archive.tar] -C [directory/]```

**List contents** of an archive

```tar -tvf [archive.tar]```

**Extract specific files**

```tar -xvf [archive.tar] [file1] [file2]```

# SYNOPSIS

**tar** [_options_] [_archive_] [_file_...]

# PARAMETERS

**-c**, **--create**
> Create a new archive

**-x**, **--extract**
> Extract files from archive

**-t**, **--list**
> List archive contents

**-v**, **--verbose**
> Verbose output

**-f** _file_, **--file**=_file_
> Use specified archive file

**-z**, **--gzip**
> Filter through gzip

**-j**, **--bzip2**
> Filter through bzip2

**-J**, **--xz**
> Filter through xz

**-a**, **--auto-compress**
> Determine compression from file extension

**-C** _dir_, **--directory**=_dir_
> Change to directory before operation

**-p**, **--preserve-permissions**
> Preserve file permissions

**--exclude**=_pattern_
> Exclude files matching pattern

**-r**, **--append**
> Append files to archive

**-u**, **--update**
> Update archive with newer files

**--strip-components**=_N_
> Strip N leading path components

# DESCRIPTION

**tar** (tape archive) creates, extracts, and manages archive files. It bundles multiple files and directories into a single file while preserving permissions, ownership, and directory structure.

Tar itself doesn't compress; compression is handled by external programs (gzip, bzip2, xz) invoked via options or automatically based on file extension with **-a**.

Common extensions: **.tar** (uncompressed), **.tar.gz** or **.tgz** (gzip), **.tar.bz2** (bzip2), **.tar.xz** (xz). Modern tar auto-detects compression when extracting.

The order of options matters with short flags. **-cvf** works; **-fvc archive.tar** may not, as -f expects its argument immediately after.

# CAVEATS

By default, tar extracts with paths from the archive. Archives with absolute paths or **../** can overwrite files outside the target directory. Use **--strip-components** or extract to an empty directory first.

Extracting as root preserves original ownership. As a regular user, files are owned by you regardless of archive metadata.

GNU tar differs from BSD tar in some options. For portability, stick to common options or check the specific implementation.

# HISTORY

Tar originated in Version 7 Unix in **1979**, designed for tape backups (hence "tape archive"). It became the standard Unix archiving tool and is specified by POSIX. GNU tar added many extensions including compression integration.

# SEE ALSO

[gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1), [xz](/man/xz)(1), [zip](/man/zip)(1), [cpio](/man/cpio)(1)
