# TAGLINE

follows a pathname until a terminal point is found, displaying each component

# TLDR

**Resolve pathnames** following symbolic links

```namei [path/to/a] [path/to/b]```

Display in **long-listing format**

```namei -l [path/to/file]```

Show **mode bits** of each file type

```namei -m [path/to/file]```

Show **owner and group** of each file

```namei -o [path/to/file]```

**Don't follow** symbolic links

```namei -n [path/to/file]```

Show **all information** (long, modes, owners)

```namei -lmo [path/to/file]```

# SYNOPSIS

**namei** [**-l**] [**-m**] [**-o**] [**-n**] [**-x**] [**-v**] _pathname_...

# PARAMETERS

**-l, --long**
> Use long-listing format showing file type

**-m, --modes**
> Show mode bits of each file type in ls style

**-o, --owners**
> Show owner and group name of each file

**-n, --nosymlinks**
> Don't follow symbolic links

**-x, --mountpoints**
> Show mountpoint directories with D

**-v, --vertical**
> Vertical alignment of modes and owners

**-h, --help**
> Display help

**-V, --version**
> Display version

# DESCRIPTION

**namei** follows a pathname until a terminal point is found (file, directory, device, etc.), displaying each component of the path. It is particularly useful for diagnosing "too many levels of symbolic links" errors.

The output shows each path component with its type indicator: f (file), d (directory), l (symbolic link), c (character device), b (block device), s (socket), p (FIFO/pipe).

# OUTPUT SYMBOLS

**f** - Regular file
**d** - Directory
**l** - Symbolic link
**c** - Character device
**b** - Block device
**s** - Socket
**p** - FIFO/named pipe
**D** - Mountpoint (with -x)

# CAVEATS

Symbolic link loops will cause errors. The command stops at the first unresolvable component. Permission denied errors occur if any path component is inaccessible.

# HISTORY

**namei** is part of **util-linux**, the standard Linux utility collection. It provides a diagnostic tool for understanding complex path structures and resolving symlink issues.

# SEE ALSO

[ls](/man/ls)(1), [stat](/man/stat)(1), [readlink](/man/readlink)(1)
