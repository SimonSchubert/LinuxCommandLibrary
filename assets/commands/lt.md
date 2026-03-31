# TAGLINE

lists directory contents as a tree

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

**lt** lists directory contents in a tree format. It is typically a shell alias rather than a standalone command, commonly configured as an alias for **lsd --tree**, **exa --tree**, or **eza --tree**.

The exact behavior and available options depend on the underlying command. Run **type lt** or **alias lt** to see the actual definition on your system.

# CAVEATS

Not a standard command. Behavior and available flags depend entirely on how the alias is configured. Options shown here correspond to common implementations like lsd or eza.

# HISTORY

**lt** is commonly configured as a shell alias for tree-style directory listing using modern ls alternatives like **lsd**, **exa**, or **eza**.

# SEE ALSO

[tree](/man/tree)(1), [lsd](/man/lsd)(1), [exa](/man/exa)(1), [eza](/man/eza)(1), [ls](/man/ls)(1)

