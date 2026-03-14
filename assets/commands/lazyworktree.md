# TAGLINE

Git worktree management CLI and TUI for the terminal

# TLDR

**Launch the worktree TUI**

```lazyworktree```

**Create a new worktree**

```lazyworktree create [branch_name]```

**List all worktrees**

```lazyworktree list```

**Delete a worktree**

```lazyworktree delete [branch_name]```

**Run a command in a worktree**

```lazyworktree exec [branch_name] -- [command]```

**Rename the current worktree**

```lazyworktree rename [new_name]```

# SYNOPSIS

**lazyworktree** [_command_] [_options_]

# SUBCOMMANDS

**create**
> Create a new worktree from a branch, PR/MR, or issue.

**list**
> List all worktrees.

**delete**
> Delete a worktree without launching the TUI.

**rename**
> Rename a worktree (single argument renames current directory's worktree).

**exec**
> Run a command or trigger a custom command key action in a worktree.

# DESCRIPTION

**lazyworktree** is a terminal UI for managing Git worktrees with a keyboard-first workflow. It supports creating, renaming, removing, absorbing, and pruning merged worktrees, as well as staging, committing, diffing, pushing, syncing, and cherry-picking directly from the TUI.

Features include CI/CD integration with GitHub Actions and GitLab CI (viewing check status, reading logs, restarting jobs), terminal multiplexer support for tmux and zellij sessions per worktree, OCI container execution (docker/podman), and markdown-based task notes with interactive taskboard.

# CAVEATS

Requires Git with worktree support. CI/CD features require GitHub Actions or GitLab CI configuration.

# HISTORY

**lazyworktree** was created by **chmouel** and is written in **Go** using the BubbleTea framework.

# SEE ALSO

[git-worktree](/man/git-worktree)(1), [lazygit](/man/lazygit)(1)
