# TLDR

**Restore files from parent**

```jj restore```

**Restore specific files**

```jj restore [file1] [file2]```

**Restore from specific revision**

```jj restore --from [revision]```

**Restore to specific revision**

```jj restore --to [revision] --from [source]```

# SYNOPSIS

**jj** **restore** [_options_] [_paths_...]

# PARAMETERS

**--from** _revision_
> Source revision for content.

**--to** _revision_
> Target revision to modify.

# DESCRIPTION

**jj restore** restores file contents from another revision. By default, restores from the parent revision, effectively discarding changes. Can restore specific files or entire working copy.

# SEE ALSO

[jj](/man/jj)(1), [jj-revert](/man/jj-revert)(1)

