# TAGLINE

Reduce working tree to a subset of tracked files

# TLDR

**Enable sparse checkout and set directories** (cone mode)

```git sparse-checkout set [dir1] [dir2]```

**Add more directories to sparse checkout**

```git sparse-checkout add [dir]```

**List current sparse patterns**

```git sparse-checkout list```

**Reapply sparse patterns** after config changes

```git sparse-checkout reapply```

**Disable sparse checkout** and restore all files

```git sparse-checkout disable```

**Check which paths match sparse rules**

```echo "[path/to/file]" | git sparse-checkout check-rules```

# SYNOPSIS

**git** **sparse-checkout** _command_ [_options_]

# SUBCOMMANDS

**init**
> Deprecated. Use set instead to enable and configure sparse checkout.

**set**
> Define which directories/patterns to include in the working tree.

**add**
> Add additional directories/patterns to the sparse checkout.

**list**
> List the current sparse checkout patterns.

**disable**
> Disable sparse checkout and restore all files.

**reapply**
> Reapply patterns after manual config changes.

**check-rules**
> Check if paths match the current sparsity rules.

# PARAMETERS

**--cone**
> Use cone mode for directory-based patterns (default, faster).

**--no-cone**
> Use full pattern mode for arbitrary gitignore-style patterns.

**--sparse-index**
> Enable sparse index format for improved performance.

**--no-sparse-index**
> Disable sparse index format for compatibility with external tools.

**--stdin**
> Read patterns from stdin (one per line) instead of arguments.

# DESCRIPTION

**git sparse-checkout** enables partial repository checkouts, where only specified directories and files are materialized in the working tree. This significantly reduces working directory size for large monorepos.

Cone mode (the default) restricts patterns to directory-based inclusion, which is faster and simpler than full pattern matching. In cone mode, the set and add subcommands accept directory names rather than arbitrary gitignore patterns.

# CONFIGURATION

**.git/info/sparse-checkout**
> File containing the sparse-checkout patterns that control which paths are checked out.

# SEE ALSO

[git-read-tree](/man/git-read-tree)(1), [git-checkout](/man/git-checkout)(1), [git-clone](/man/git-clone)(1), [git-worktree](/man/git-worktree)(1)
