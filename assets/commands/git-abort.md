# TAGLINE

Abort current git operation like rebase, merge, or cherry-pick

# TLDR

**Abort current operation**

```git abort```

# SYNOPSIS

**git** **abort**

# DESCRIPTION

**git abort** is a convenience command from the git-extras suite that aborts any in-progress git operation. It automatically detects whether you are in the middle of a rebase, merge, cherry-pick, revert, or am operation and runs the appropriate abort command.

This eliminates the need to remember specific abort commands for different operations. Instead of typing **git rebase --abort**, **git merge --abort**, or **git cherry-pick --abort**, you can simply run **git abort** to restore your repository to the state before the operation began.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-merge](/man/git-merge)(1), [git-extras](/man/git-extras)(1)
