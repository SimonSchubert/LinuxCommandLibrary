# TAGLINE

Extract files from squashfs filesystems

# TLDR

**Extract** to squashfs-root

```unsquashfs [filesystem.squashfs]```

Extract to **specific** directory

```unsquashfs -d [path/to/directory] [filesystem.squashfs]```

Show **filenames** during extraction

```unsquashfs -i [filesystem.squashfs]```

Show files with **attributes**

```unsquashfs -li [filesystem.squashfs]```

**List** files without extracting

```unsquashfs -l [filesystem.squashfs]```

**List** files with attributes

```unsquashfs -ll [filesystem.squashfs]```

**Extract** specific files or directories

```unsquashfs [filesystem.squashfs] [path/to/file] [path/to/dir]```

Display filesystem **superblock** information

```unsquashfs -s [filesystem.squashfs]```

# SYNOPSIS

**unsquashfs** [_OPTIONS_] _FILESYSTEM_

# PARAMETERS

**-d, -dest** _DIR_
> Extract to specified directory

**-i, -info**
> Display filenames during extraction

**-li, -linfo**
> Display filenames and attributes during extraction

**-l, -ls**
> List files without extracting

**-ll, -lls**
> List files with attributes without extracting

**-f, -force**
> Overwrite files that already exist

**-s, -stat**
> Display filesystem superblock information

**-n, -no-progress**
> Don't display the progress bar

**-p** _NUMBER_, **-processors** _NUMBER_
> Use NUMBER processors for decompression

**-e** _FILE_, **-ef** _FILE_
> List of directories or files to extract, one per line

# DESCRIPTION

**unsquashfs** extracts and lists files from squashfs compressed filesystems. Squashfs is a read-only compressed filesystem commonly used for Linux distributions, live CDs, and embedded systems.

By default, files are extracted to a squashfs-root directory in the current working directory.

# CAVEATS

Extraction may require significant disk space. Some filesystems contain device nodes requiring root. Original permissions and ownership are preserved when run as root.

# SEE ALSO

[mksquashfs](/man/mksquashfs)(1), [sqfscat](/man/sqfscat)(1)
