# TAGLINE

Generate directory trees in markdown format

# TLDR

**Generate markdown tree**

```treemd```

**For specific directory**

```treemd [path/to/directory]```

**Exclude patterns**

```treemd -e "[node_modules,*.log]"```

**Limit depth**

```treemd -d [2]```

**Output to file**

```treemd > [tree.md]```

# SYNOPSIS

**treemd** [_-e patterns_] [_-d depth_] [_options_] [_path_]

# PARAMETERS

**-e** _PATTERNS_
> Exclude patterns.

**-d** _DEPTH_
> Maximum depth.

**-f**
> Include files.

**--help**
> Show help.

# DESCRIPTION

**treemd** generates directory tree representations formatted as markdown, making it easy to include project structure documentation in README files and other markdown documents. The output uses markdown-compatible indentation and formatting that renders correctly on platforms like GitHub.

Patterns can be excluded to skip directories like node_modules or build artifacts that clutter the tree output. Depth limiting controls how many levels deep the tree displays, keeping documentation focused on the relevant structure.

The output can be redirected to a file or piped into other commands for integration into documentation workflows.

# CAVEATS

Various implementations. Output format varies. Check version.

# HISTORY

**treemd** tools generate directory structure as markdown, useful for documentation and README files.

# SEE ALSO

[tree](/man/tree)(1), [tre](/man/tre)(1), [find](/man/find)(1)
