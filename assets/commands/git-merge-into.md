# TAGLINE

Merge current branch into target

# TLDR

**Merge current into target**

```git merge-into [target-branch]```

**Merge current into main**

```git merge-into main```

# SYNOPSIS

**git merge-into** _target-branch_

# PARAMETERS

_TARGET-BRANCH_
> Branch to merge into.

**--help**
> Display help information.

# DESCRIPTION

**git merge-into** merges the current branch into another branch without manually switching. It reverses the normal merge workflow where you would first checkout the target branch, perform the merge, then switch back.

The command checks out the target, performs the merge, then returns to the original branch automatically. This saves the repetitive workflow of switching branches for a simple merge operation.

# CAVEATS

Part of git-extras package. Requires clean working directory. Conflicts may leave you on target branch.

# HISTORY

git merge-into is part of **git-extras**, providing a convenience command for the reversed merge workflow.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-checkout](/man/git-checkout)(1)
