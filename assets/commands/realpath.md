# TLDR

**Get absolute path** of a file

```realpath [file.txt]```

**Resolve symlinks** and get canonical path

```realpath [symlink]```

**Get path without resolving symlinks**

```realpath -s [symlink]```

**Get path relative** to another directory

```realpath --relative-to=[/base/path] [/full/path/file]```

**Get relative base path**

```realpath --relative-base=[/base] [/base/subdir/file]```

**Get absolute paths** for multiple files

```realpath [file1] [file2] [file3]```

**Quiet mode** (suppress errors)

```realpath -q [file]```

# SYNOPSIS

**realpath** [_options_] _file_...

# DESCRIPTION

**realpath** prints the resolved absolute pathname of files. It expands all symbolic links, resolves references to /./, /../, and removes extra slashes to produce a canonical path.

The tool is useful in shell scripts when you need the absolute path of a file regardless of how it was specified (relative path, symlink, etc.). It can also compute relative paths between two locations.

realpath is part of GNU coreutils and provides similar functionality to the readlink command with -f flag.

# PARAMETERS

**-e**, **--canonicalize-existing**
> All path components must exist.

**-m**, **--canonicalize-missing**
> No path component needs to exist.

**-L**, **--logical**
> Resolve .. before symlinks.

**-P**, **--physical**
> Resolve symlinks first (default).

**-s**, **--strip**, **--no-symlinks**
> Don't resolve symlinks.

**--relative-to=** _dir_
> Print path relative to directory.

**--relative-base=** _dir_
> Print relative path if below base.

**-q**, **--quiet**
> Suppress error messages.

**-z**, **--zero**
> End each output line with NUL.

# CAVEATS

Behavior may differ between GNU coreutils and BSD versions. Without -e, path may not exist. Relative path options require careful base directory specification.

# HISTORY

**realpath** as a standalone command became part of **GNU coreutils** in version **8.15** (released **2012**). Prior to this, the realpath() function existed in C libraries, and the readlink command provided similar functionality. The standalone command simplified common shell scripting tasks.

# SEE ALSO

[readlink](/man/readlink)(1), [dirname](/man/dirname)(1), [basename](/man/basename)(1), [pwd](/man/pwd)(1)
