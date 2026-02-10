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

**--help**
> Display help information.

# DESCRIPTION

**ls** lists directory contents. It shows files, directories, and their attributes.

The tool is one of the most used Unix commands. Options control format, sorting, and filtering.

# CAVEATS

Output varies by implementation. Colors need terminal support. Hidden files start with dot.

# HISTORY

ls dates back to the original **Unix** system at AT&T Bell Labs in 1971, remaining a fundamental command.

# SEE ALSO

[dir](/man/dir)(1), [exa](/man/exa)(1), [lsd](/man/lsd)(1), [tree](/man/tree)(1)

