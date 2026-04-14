# TAGLINE

MATE desktop archive manager

# TLDR

**Open** specific archives

```engrampa [path/to/archive1.tar] [path/to/archive2.tar]```

**Add** files to an archive and quit

```engrampa --add-to=[path/to/archive.tar] [path/to/file_or_directory]```

**Extract** archives to a directory and quit

```engrampa --extract-to=[path/to/directory] [path/to/archive.tar]```

**Extract** archives into a folder named after each archive and quit

```engrampa --extract-here [path/to/archive.tar]```

# SYNOPSIS

**engrampa** [_options_] [_files_]

# DESCRIPTION

**engrampa** is the MATE desktop archive manager. It creates and extracts archives in various formats including tar, zip, 7z, rar, and more.

A fork of file-roller adapted for the MATE desktop environment.

# PARAMETERS

**-a**, **--add-to** _archive_
> Add files to the specified archive and quit.

**-d**, **--add** _file_
> Add files, prompting for the archive name, and quit.

**-e**, **--extract-to** _folder_
> Extract archives to the specified folder and quit.

**-f**, **--extract**
> Extract archives, prompting for the destination folder, and quit.

**-h**, **--extract-here**
> Extract archives using the archive name as destination folder and quit.

**--default-dir** _folder_
> Default folder to use for `--add` and `--extract` commands.

**--force**
> Create destination folder without asking for confirmation.

# CAVEATS

MATE desktop application. Requires appropriate libraries for different archive formats. Command-line options are limited compared to dedicated tools like tar or zip.

# SEE ALSO

[file-roller](/man/file-roller)(1), [tar](/man/tar)(1), [zip](/man/zip)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)
