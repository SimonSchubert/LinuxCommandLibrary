# TLDR

**Start** Engrampa

```engrampa```

**Open** specific archives

```engrampa [path/to/archive1.tar] [path/to/archive2.tar]```

**Archive** files and directories

```engrampa --add-to=[path/to/archive.tar] [path/to/file_or_directory]```

**Extract** archives to a directory

```engrampa --extract-to=[path/to/directory] [path/to/archive.tar]```

# SYNOPSIS

**engrampa** [_options_] [_files_]

# DESCRIPTION

**engrampa** is the MATE desktop archive manager. It creates and extracts archives in various formats including tar, zip, 7z, rar, and more.

A fork of file-roller adapted for the MATE desktop environment.

# PARAMETERS

**--add-to** _archive_
> Create archive with specified files

**--extract-to** _directory_
> Extract to specified directory

**-h, --help**
> Show help options

# CAVEATS

MATE desktop application. Requires appropriate libraries for different archive formats. Command-line options are limited compared to dedicated tools like tar or zip.

# SEE ALSO

[tar](/man/tar)(1), [zip](/man/zip)(1), [unzip](/man/unzip)(1), [file-roller](/man/file-roller)(1)
