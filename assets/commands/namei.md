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
> Use long-listing format (same as -m -o -v)

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

**-Z, --context**
> Show security context of each file

**-h, --help**
> Display help

**-V, --version**
> Display version

# DESCRIPTION

**namei** follows a pathname until a terminal point is found (file, directory, device, etc.), displaying each component of the path. It is particularly useful for diagnosing "too many levels of symbolic links" errors.

The output shows each path component with its type indicator: d (directory), l (symbolic link), - (regular file), c (character device), b (block device), s (socket), p (FIFO/pipe).

# OUTPUT SYMBOLS

**f:** - Pathname currently being resolved
**d** - Directory
**l** - Symbolic link
**s** - Socket
**b** - Block device
**c** - Character device
**p** - FIFO/named pipe
**-** - Regular file
**?** - Error of some kind
**D** - Mountpoint (with -x)

# CAVEATS

Symbolic link loops will cause errors. The command stops at the first unresolvable component. Permission denied errors occur if any path component is inaccessible.

# HISTORY

**namei** is part of **util-linux**, the standard Linux utility collection. It provides a diagnostic tool for understanding complex path structures and resolving symlink issues.

# SEE ALSO

[ls](/man/ls)(1), [stat](/man/stat)(1), [readlink](/man/readlink)(1)
