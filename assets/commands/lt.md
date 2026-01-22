# TLDR

**List files as tree**

```lt```

**List specific directory**

```lt [directory/]```

**Show hidden files**

```lt -a```

**Limit depth**

```lt -L [2]```

**Show file details**

```lt -l```

**Color output**

```lt --color```

# SYNOPSIS

**lt** [_options_] [_path_]

# PARAMETERS

_PATH_
> Directory to list.

**-a**
> Show hidden files.

**-L** _DEPTH_
> Maximum depth.

**-l**
> Long listing format.

**--color**
> Enable color output.

**--help**
> Display help information.

# DESCRIPTION

**lt** lists directory contents as a tree. It's an alias or alternative for tree-style listings.

The tool displays hierarchical directory structure visually. May be an alias for lsd --tree or similar.

lt shows directory tree.

# CAVEATS

May be an alias. Varies by system. Check actual implementation.

# HISTORY

lt is commonly configured as an alias for **tree-style** directory listing, often using lsd or exa.

# SEE ALSO

[tree](/man/tree)(1), [lsd](/man/lsd)(1), [exa](/man/exa)(1), [ls](/man/ls)(1)

