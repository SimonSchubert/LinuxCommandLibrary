# TAGLINE

Interactive Git worktree manager TUI

# TLDR

**Launch** the worktree manager

```branchlet```

# SYNOPSIS

**branchlet** [_options_]

# DESCRIPTION

**branchlet** is an interactive terminal user interface for managing **Git worktrees**. It simplifies the workflow of creating, switching between, and removing Git worktrees through a visual interface rather than memorizing git worktree subcommands.

The TUI displays existing worktrees, their associated branches, and paths. Users can create new worktrees from branches, delete worktrees, and navigate between them with keyboard shortcuts.

# CAVEATS

Must be run inside a Git repository. Requires Git with worktree support (Git 2.5+). Deleting a worktree through branchlet also cleans up the Git worktree metadata.

# SEE ALSO

[git](/man/git)(1), [git-worktree](/man/git-worktree)(1), [lazygit](/man/lazygit)(1)
