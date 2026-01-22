# TLDR

**Open archive manager**

```file-roller```

**Open specific archive**

```file-roller [archive.zip]```

**Extract archive**

```file-roller --extract-here [archive.tar.gz]```

**Extract to directory**

```file-roller --extract-to=[directory] [archive.zip]```

**Create new archive**

```file-roller --add [file1] [file2]```

# SYNOPSIS

**file-roller** [_options_] [_archives_...]

# PARAMETERS

_ARCHIVES_
> Archive files to open.

**--extract-here**
> Extract to current directory.

**--extract-to** _DIR_
> Extract to specified directory.

**--add** _FILES_
> Create archive from files.

**--add-to** _ARCHIVE_
> Add files to existing archive.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**file-roller** is the GNOME archive manager providing a graphical interface for creating, viewing, and extracting archives. It supports numerous formats through command-line tools.

The application integrates with the GNOME file manager for context menu archive operations. It handles zip, tar, gz, bz2, 7z, rar, and many other formats automatically.

file-roller provides drag-and-drop functionality and progress indication for archive operations.

# CAVEATS

Requires GNOME libraries. Format support depends on installed tools (unrar, p7zip, etc.). Command-line operation is basic.

# HISTORY

file-roller is part of the **GNOME desktop** project, providing archive management since GNOME 2. It serves as the default archive manager for GNOME and GNOME-based distributions.

# SEE ALSO

[tar](/man/tar)(1), [zip](/man/zip)(1), [7z](/man/7z)(1)
