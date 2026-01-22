# TLDR

**Start Midnight Commander**

```mc```

**Start in directory**

```mc [/path/to/dir]```

**Two directories**

```mc [dir1] [dir2]```

**Black and white mode**

```mc -b```

**View file**

```mc -v [file]```

**Edit file**

```mc -e [file]```

# SYNOPSIS

**mc** [_options_] [_path1_] [_path2_]

# PARAMETERS

_PATH1_ _PATH2_
> Directories for panels.

**-b**
> Black and white mode.

**-c**
> Color mode.

**-v** _FILE_
> View file only.

**-e** _FILE_
> Edit file only.

**-d**
> Disable mouse support.

**--help**
> Display help information.

# DESCRIPTION

**mc** is Midnight Commander, a visual file manager. It provides dual-pane navigation and file operations.

The tool handles copying, moving, deleting with keyboard shortcuts. Supports FTP, SFTP, and archives.

mc is a visual file manager.

# CAVEATS

Terminal-based. Function keys used extensively. Some terminals need configuration.

# HISTORY

Midnight Commander was created in 1994 by **Miguel de Icaza** as a Unix clone of Norton Commander.

# SEE ALSO

[ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1)

