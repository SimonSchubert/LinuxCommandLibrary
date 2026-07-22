# TAGLINE

unix port of 7-Zip, providing high-ratio compression

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
> Compression level (0=store, 1=fastest, 5=normal, 7=maximum, 9=ultra).

**-p**_PASSWORD_
> Set password (no space between switch and value; prompts interactively if omitted).

**-mhe=on**
> Encrypt header so filenames inside the archive are also hidden.

**-o**_DIR_
> Output directory for `x`/`e` (no space between `-o` and the path).

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

The 7z format does not store Unix permissions, ownership, or symlinks by default — use `-mtc=on -mta=on -mtm=on` to preserve timestamps, and prefer **tar** (or `tar | 7z`) when POSIX metadata matters. RAR support is extraction-only. Passwords supplied on the command line are visible in `/proc/<pid>/cmdline`. Solid archives (default for `.7z`) make single-file extraction proportional to total preceding data. The original p7zip project has been unmaintained since 2016; many distributions now ship the official **7-Zip** Linux build (`7zz` binary) by Igor Pavlov instead.

# HISTORY

**7-Zip** was created by **Igor Pavlov** in **1999** for Windows. **p7zip** is the POSIX port begun by Myspace in **2004**. Since 2021, Pavlov publishes official Linux/macOS binaries (`7zz`), making p7zip largely obsolete.

# INSTALL

```apt: sudo apt install 7zip```

```dnf: sudo dnf install 7zip```

```pacman: sudo pacman -S 7zip```

```zypper: sudo zypper install 7zip```

```brew: brew install 7zip```

```nix: nix profile install nixpkgs#p7zip```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1), [tar](/man/tar)(1)
