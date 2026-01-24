# TLDR

**Extract archive**

```7z x [archive.7z]```

**Extract to specific directory**

```7z x [archive.7z] -o[/path/to/output]```

**Create 7z archive**

```7z a [archive.7z] [files_or_dirs]```

**Create with maximum compression**

```7z a -mx=9 [archive.7z] [files]```

**List archive contents**

```7z l [archive.7z]```

**Test archive integrity**

```7z t [archive.7z]```

**Add password encryption**

```7z a -p[password] [archive.7z] [files]```

**Create encrypted archive** (including filenames)

```7z a -p[password] -mhe=on [archive.7z] [files]```

# SYNOPSIS

**7z** _command_ [_-mhe_] [_-mx=level_] [_-p[password]_] [_-o[dir]_] [_options_] _archive_ [_files_]

# PARAMETERS

**a**
> Add files to archive.

**x**
> Extract with full paths.

**e**
> Extract to current directory.

**l**
> List archive contents.

**t**
> Test archive integrity.

**d**
> Delete from archive.

**u**
> Update files in archive.

**-mx=** _LEVEL_
> Compression level (0=store, 9=ultra).

**-p** [_PASSWORD_]
> Set password (prompts if omitted).

**-mhe=on**
> Encrypt header (hide filenames).

**-o** _DIR_
> Output directory.

**-r**
> Recurse subdirectories.

**-y**
> Assume yes to all prompts.

**-t** _TYPE_
> Archive type: 7z, zip, tar, gzip, bzip2.

**-v** _SIZE_
> Create volumes of specified size.

**-m0=** _METHOD_
> Compression method: lzma, lzma2, bzip2, ppmd.

**-ms=on**
> Enable solid archive mode.

# DESCRIPTION

**p7zip** is the Unix port of 7-Zip, providing high-ratio compression. The 7z format typically achieves 30-70% better compression than ZIP using LZMA/LZMA2 algorithms.

The package provides three commands: **7z** (full-featured), **7za** (standalone), and **7zr** (reduced, 7z format only). Most users use 7z or 7za.

Archive format support includes: 7z, ZIP, GZIP, BZIP2, XZ, TAR, and extraction from many others (RAR, CAB, ISO, DMG, etc.). The -t option overrides automatic format detection.

Solid archives (-ms=on) compress files as a single block, improving compression when archiving many similar files. However, this means extracting one file requires decompressing all preceding files.

Encryption uses AES-256. The -mhe option encrypts filenames in addition to content, hiding what's in the archive. Password can be provided on command line (visible in process list) or prompted interactively.

# CAVEATS

7z format doesn't store Unix permissions by default. RAR support is extraction-only. Command-line password visible in process list. Solid archives slow single-file extraction. Maximum compression is memory-intensive. Some 7-Zip features not available in p7zip.

# HISTORY

**7-Zip** was created by **Igor Pavlov** in **1999** for Windows. **p7zip** is the POSIX port by various contributors, first released around **2004**. The 7z format and LZMA algorithm became popular for high compression ratios. The software is free under LGPL license and has influenced many other compression tools.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1), [tar](/man/tar)(1)
