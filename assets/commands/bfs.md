# TAGLINE

Breadth-first file search

# TLDR

**Find** all files

```bfs [/path]```

**Find** by name

```bfs [/path] -name ["*.txt"]```

**Find** only regular files

```bfs [/path] -type f```

**Search** in parallel with N threads

```bfs [/path] -j [8] -name ["*.c"]```

**Exclude** a subtree from the search

```bfs [/path] -exclude -name [node_modules]```

**Execute** command

```bfs [/path] -name ["*.log"] -delete```

# SYNOPSIS

**bfs** [_options_] [_path_...] [_expression_]

# DESCRIPTION

**bfs** is a breadth-first variant of the Unix find command. It traverses directories in breadth-first order rather than depth-first, which can be faster for certain operations and more intuitive when printing results.

The tool is compatible with GNU find but uses a different traversal strategy.

# PARAMETERS

**-name** _pattern_
> Match filename pattern

**-type** _type_
> File type (f, d, l, etc.)

**-size** _n_
> File size

**-mtime** _n_
> Modification time

**-exec** _command_ **;**
> Execute command

**-delete**
> Delete matched files

**-depth**
> Process directory contents before directory

**-maxdepth** _n_
> Maximum depth to descend

# BFS-SPECIFIC FLAGS

**-j** _n_
> Search with N threads in parallel (default: number of CPUs, up to 8)

**-S** _bfs|dfs|ids|eds_
> Select the search strategy: breadth-first (default), depth-first, iterative deepening, or exponential deepening

**-color** / **-nocolor**
> Turn colors on or off (default: -color when output is a terminal)

**-hidden** / **-nohidden**
> Include or exclude hidden files (those beginning with .)

**-exclude** _expression_
> Exclude all paths matching the expression from the search

**-unique**
> Skip files that have already been seen (useful with -L)

**-x**
> Do not descend into other mount points (same as -xdev)

**-status**
> Display a status bar while searching

**-files0-from** _file_
> Read NUL-separated starting paths from a file

**-D** _flag_
> Turn on a debugging flag

# DIFFERENCES FROM FIND

- **Breadth-first** traversal order
- Generally faster for -quit operations
- More intuitive output ordering
- Compatible command-line syntax

# WORKFLOW

```bash
# Find all PDFs (breadth-first)
bfs /home -name "*.pdf"

# Find large files in top levels first
bfs / -size +100M

# Delete empty directories
bfs /tmp -type d -empty -delete

# Find recently modified
bfs /var/log -mtime -1
```

# CAVEATS

Less widely available than find. Different traversal order may affect some operations. Not installed by default on most systems. For complex queries, behavior differences possible.

# HISTORY

**bfs** was created by Tavian Barnes in **2015** as an optimized, breadth-first alternative to the traditional find command.

# INSTALL

```apt: sudo apt install bfs```

```dnf: sudo dnf install bfs```

```pacman: sudo pacman -S bfs```

```apk: sudo apk add bfs```

```brew: brew install bfs```

```nix: nix profile install nixpkgs#bfs```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[find](/man/find)(1), [fd](/man/fd)(1), [locate](/man/locate)(1)

# RESOURCES

```[Source code](https://github.com/tavianator/bfs)```

```[Homepage](https://tavianator.com/projects/bfs.html)```

<!-- verified: 2026-06-19 -->
