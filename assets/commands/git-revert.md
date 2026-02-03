# TLDR

**Revert a commit**

```git revert [commit]```

**Revert multiple commits**

```git revert [commit1] [commit2]```

**Revert without committing**

```git revert -n [commit]```

**Revert merge commit**

```git revert -m [1] [merge_commit]```

**Continue after conflict**

```git revert --continue```

**Abort revert**

```git revert --abort```

# SYNOPSIS

**git** **revert** [_options_] _commit_...

# PARAMETERS

**-n**, **--no-commit**
> Don't auto-commit.

**-e**, **--edit**
> Edit commit message.

**--no-edit**
> Use default message.

**-m** _parent_
> Mainline parent for merge.

**--continue**
> Continue after conflict.

**--abort**
> Cancel revert.

**--skip**
> Skip current commit.

# DESCRIPTION

**git revert** creates new commits that undo the changes of specified commits. Unlike reset, it preserves history by adding new commits.

# SEE ALSO

[git-reset](/man/git-reset)(1), [git-cherry-pick](/man/git-cherry-pick)(1)

