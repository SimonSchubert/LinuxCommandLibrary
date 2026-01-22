# TLDR

**Move a file to the trash**

```gvfs-trash [path/to/file]```

**Move multiple files to the trash**

```gvfs-trash [file1] [file2] [file3]```

**Empty the trash**

```gvfs-trash --empty```

**Move files to trash** ignoring errors for non-existent files

```gvfs-trash -f [path/to/file]```

**Read files to trash from stdin** (one per line)

```echo "[path/to/file]" | gvfs-trash```

# SYNOPSIS

**gvfs-trash** [_options_] [_file_...]

**gvfs-trash** --empty

# PARAMETERS

**-f**, **--force**
> Ignore nonexistent and non-deletable files

**--empty**
> Empty the trash

**-h**, **--help**
> Print help text and exit

**--version**
> Show version information and exit

# DESCRIPTION

**gvfs-trash** is a GNOME Virtual File System command that moves files and directories to the user's trash bin instead of permanently deleting them. This provides a safer alternative to **rm** by allowing recovery of accidentally deleted files.

The trash location depends on the file's filesystem. For files in the user's home directory, trash is stored in **$XDG_DATA_HOME/Trash** (typically **~/.local/share/Trash**). Files on removable drives may have their own trash folders.

When called without the **--empty** option, gvfs-trash expects file paths as arguments. If no files are specified, it reads paths from standard input, one per line. Moving files to trash does not free disk space until the trash is emptied.

# CAVEATS

Not all filesystems support the trash concept; files on such systems may be deleted immediately. The command has been deprecated in favor of **gio trash**, which provides the same functionality. Use **gvfs-rm** for permanent deletion or **gvfs-ls trash://** to view trash contents.

# HISTORY

gvfs-trash is part of **GVFS** (GNOME Virtual File System), introduced with **GNOME 2.22** in **2008** as a replacement for the older gnome-vfs library. GVFS provides a unified interface for various filesystems and storage backends in GNOME. The gvfs command-line tools were later deprecated in favor of the **gio** command, which consolidates all GVFS operations under a single tool.

# SEE ALSO

[gio](/man/gio)(1), [trash-cli](/man/trash-cli)(1), [rm](/man/rm)(1), [gvfs-rm](/man/gvfs-rm)(1)
