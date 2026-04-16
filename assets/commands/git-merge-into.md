# TAGLINE

Merge current branch into target

# TLDR

**Merge current branch into target**

```git merge-into [target-branch]```

**Merge current branch into main**

```git merge-into main```

**Merge the specified source into the target**

```git merge-into [source-branch] [target-branch]```

# SYNOPSIS

**git merge-into** [_source-branch_] _target-branch_ [**--ff-only**]

# PARAMETERS

_SOURCE-BRANCH_
> Optional branch to merge (defaults to the current branch).

_TARGET-BRANCH_
> Branch that will receive the merge.

**--ff-only**
> Refuse the merge unless it can be resolved as a fast-forward.

**--help**
> Display help information.

# DESCRIPTION

**git merge-into** merges the current (or specified) branch into another branch without manually switching contexts. It reverses the normal merge workflow, where one would first checkout the target branch, perform the merge, then switch back.

The command checks out the target, performs the merge, then returns to the original branch automatically. This saves the repetitive workflow of switching branches for a simple merge operation.

# CAVEATS

Part of git-extras package. Requires clean working directory. Conflicts may leave you on target branch.

# HISTORY

git merge-into is part of **git-extras**, providing a convenience command for the reversed merge workflow.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-checkout](/man/git-checkout)(1)
