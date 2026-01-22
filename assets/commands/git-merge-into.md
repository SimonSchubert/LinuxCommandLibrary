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

**git merge-into** merges the current branch into another branch without switching. It's the reverse of normal merge workflow, where you typically checkout the target first.

The command checks out the target, merges the source, then returns to the original branch. It saves the workflow of manually switching branches.

git merge-into simplifies merging without branch switching.

# CAVEATS

Part of git-extras package. Requires clean working directory. Conflicts may leave you on target branch.

# HISTORY

git merge-into is part of **git-extras**, providing a convenience command for the reversed merge workflow.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-checkout](/man/git-checkout)(1)
