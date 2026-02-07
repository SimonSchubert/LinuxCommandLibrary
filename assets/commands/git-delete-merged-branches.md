# TAGLINE

Remove all branches merged into current branch

# TLDR

**Delete merged branches**

```git delete-merged-branches```

# SYNOPSIS

**git** **delete-merged-branches**

# DESCRIPTION

**git delete-merged-branches** deletes all branches that have been merged into the current branch, automating post-merge cleanup. Part of the git-extras toolkit, it identifies branches whose changes are fully incorporated into the current branch and removes them in batch.

The command uses Git's merge-base calculation to determine which branches are safe to delete, ensuring that only branches with no unique commits are removed. It is commonly run after release cycles or as part of repository maintenance routines to prevent branch sprawl.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-extras](/man/git-extras)(1)
