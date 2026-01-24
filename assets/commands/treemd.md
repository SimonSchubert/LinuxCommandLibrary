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

**treemd** generates directory trees. It outputs as markdown.

Markdown formatted. Copy to docs.

Excludes configurable. Skip unwanted.

Depth limiting. Control detail.

Documentation ready. README trees.

# CAVEATS

Various implementations. Output format varies. Check version.

# HISTORY

**treemd** tools generate directory structure as markdown, useful for documentation and README files.

# SEE ALSO

[tree](/man/tree)(1), [tre](/man/tre)(1), [find](/man/find)(1)
