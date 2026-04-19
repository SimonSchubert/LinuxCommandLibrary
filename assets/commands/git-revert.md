# TAGLINE

Create commits that undo previous changes

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
> Apply revert to working tree and index without creating a commit.

**-e**, **--edit**
> Edit the commit message before committing (default when run interactively).

**--no-edit**
> Use the default generated commit message.

**-m** _parent-number_, **--mainline** _parent-number_
> Specify the mainline parent (1-based) when reverting a merge commit.

**-s**, **--signoff**
> Add a `Signed-off-by` trailer to the commit message.

**-S**[_keyid_], **--gpg-sign**[=_keyid_]
> GPG-sign the revert commit.

**--cleanup=**_mode_
> Control how the commit message is cleaned up (see git-commit).

**--strategy=**_strategy_
> Use the specified merge strategy.

**-X** _option_, **--strategy-option=**_option_
> Pass an option through to the merge strategy.

**--continue**
> Continue the revert operation after resolving conflicts.

**--skip**
> Skip the current commit and continue with the remaining ones.

**--abort**
> Cancel the in-progress revert and restore the pre-sequence state.

**--quit**
> Forget about the current operation; leave index and working tree as-is.

# DESCRIPTION

**git revert** creates new commits that undo the changes introduced by specified commits. Unlike `git reset`, it preserves history by adding inverse commits rather than removing existing ones.

This makes it safe for shared branches where rewriting history would cause problems. Use `-m` to specify the mainline parent when reverting merge commits.

# SEE ALSO

[git-reset](/man/git-reset)(1), [git-cherry-pick](/man/git-cherry-pick)(1)
