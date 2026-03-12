# TAGLINE

lists directory contents

# TLDR

**List files**

```ls```

**List with details**

```ls -l```

**List all including hidden**

```ls -la```

**Human readable sizes**

```ls -lh```

**Sort by time**

```ls -lt```

**Sort by size**

```ls -lS```

**Recursive listing**

```ls -R```

# SYNOPSIS

**ls** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files or directories to list.

**-l**
> Long listing format.

**-a**
> Include hidden files.

**-h**
> Human readable sizes.

**-t**
> Sort by modification time.

**-S**
> Sort by size.

**-R**
> Recursive listing.

**-r**
> Reverse sort order.

**-1**
> One file per line.

**-d**
> List directories themselves, not contents.

**--color** _WHEN_
> Colorize output (auto, always, never).

**-i**
> Print inode number.

**-F**, **--classify**
> Append indicator (/ for dirs, * for executables).

# DESCRIPTION

**ls** lists directory contents. Without arguments, it lists the current directory. With **-l**, it shows permissions, owner, size, and modification time for each entry.

Entries are sorted alphabetically by default. Sorting can be changed with **-t** (time), **-S** (size), or **-r** (reverse). The **--color** option highlights files by type (directories, executables, symlinks).

# CAVEATS

Output varies by implementation. Colors need terminal support. Hidden files start with dot.

# HISTORY

ls dates back to the original **Unix** system at AT&T Bell Labs in 1971, remaining a fundamental command.

# SEE ALSO

[dir](/man/dir)(1), [exa](/man/exa)(1), [lsd](/man/lsd)(1), [tree](/man/tree)(1)

