# TLDR

**Initialize cotton** in a repository

```cotton init```

**Create a new worktree**

```cotton new [branch-name]```

**List all worktrees**

```cotton list```

**Switch to a worktree**

```cotton switch [branch-name]```

**Remove a worktree**

```cotton remove [branch-name]```

**Show current worktree status**

```cotton status```

# SYNOPSIS

**cotton** _command_ [_options_] [_arguments_]

# PARAMETERS

**init**
> Initialize cotton configuration in the repository.

**new** _BRANCH_
> Create a new worktree for the specified branch.

**list**
> List all managed worktrees.

**switch** _BRANCH_
> Switch to the specified worktree.

**remove** _BRANCH_
> Remove a worktree.

**status**
> Show the status of all worktrees.

**prune**
> Remove stale worktree references.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**cotton** is a Git worktree management tool that simplifies working with multiple branches simultaneously. It wraps Git's worktree functionality with a more intuitive interface for creating, switching, and managing worktrees.

Git worktrees allow checking out multiple branches at once in separate directories, useful for comparing implementations, reviewing pull requests while continuing development, or running tests on different versions. Cotton manages these worktrees with consistent naming and organization.

The tool maintains a directory structure for worktrees and provides quick switching between them, making multi-branch development workflows more efficient than constantly stashing and switching branches.

# CAVEATS

Requires Git with worktree support (Git 2.5+). Each worktree consumes disk space for the working directory. Changes must be committed or stashed before removing worktrees to avoid losing work.

# HISTORY

cotton emerged from the developer community's need for simpler Git worktree management. While Git worktrees were introduced in **Git 2.5** in **2015**, tools like cotton provide more user-friendly interfaces for common worktree operations.

# SEE ALSO

[git-worktree](/man/git-worktree)(1), [git](/man/git)(1), [git-checkout](/man/git-checkout)(1)
