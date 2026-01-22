# TLDR

**Create archive**

```7za a [archive.7z] [files...]```

**Extract archive**

```7za x [archive.7z]```

**List archive contents**

```7za l [archive.7z]```

**Create zip archive**

```7za a -tzip [archive.zip] [files]```

**Extract with password**

```7za x -p[password] [archive.7z]```

# SYNOPSIS

**7za** _command_ [_switches_] _archive_ [_files_...]

# COMMANDS

**a**
> Add files to archive

**x**
> Extract with full paths

**e**
> Extract (flat, no paths)

**l**
> List archive contents

**t**
> Test archive integrity

**d**
> Delete from archive

**u**
> Update archive

# PARAMETERS

**-o**_dir_
> Output directory

**-p**_password_
> Set password

**-mx=**_n_
> Compression level (0-9)

**-t**_type_
> Archive type (7z, zip, gzip, bzip2, tar)

**-r**
> Recurse subdirectories

**-y**
> Assume yes to queries

# DESCRIPTION

**7za** is the standalone version of the 7-Zip command-line tool. Unlike **7z** which may use external plugins, 7za includes all codecs in a single executable.

7za supports fewer formats than the full 7z but is more portable as a single binary. It handles 7z, ZIP, GZIP, BZIP2, TAR, and XZ formats.

The command syntax is identical to **7z**. For scripts that only need common formats, 7za is often preferred for its simplicity and reliability.

# CAVEATS

7za supports fewer formats than 7z. For RAR, CAB, or ISO extraction, use the full 7z command.

The "a" in 7za stands for "alone" (standalone), not "alpha" or "advanced".

Performance is identical to 7z for supported formats.

# SEE ALSO

[7z](/man/7z)(1), [7zr](/man/7zr)(1), [tar](/man/tar)(1), [gzip](/man/gzip)(1)
