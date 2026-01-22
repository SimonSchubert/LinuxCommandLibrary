# TLDR

**Find** all files

```bfs [/path]```

**Find** by name

```bfs [/path] -name ["*.txt"]```

**Breadth-first** search

```bfs [/path] -type f```

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

# SEE ALSO

[find](/man/find)(1), [fd](/man/fd)(1), [locate](/man/locate)(1)
