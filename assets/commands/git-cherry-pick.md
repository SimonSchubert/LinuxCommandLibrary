# TLDR

**Apply commit to current branch**

```git cherry-pick [commit]```

**Cherry-pick multiple commits**

```git cherry-pick [commit1] [commit2]```

**Cherry-pick range**

```git cherry-pick [start]..[end]```

**Cherry-pick without commit**

```git cherry-pick -n [commit]```

**Continue after conflict**

```git cherry-pick --continue```

**Abort cherry-pick**

```git cherry-pick --abort```

**Cherry-pick with edit**

```git cherry-pick -e [commit]```

# SYNOPSIS

**git** **cherry-pick** [_options_] _commit_...

# PARAMETERS

**-n**, **--no-commit**
> Apply without committing.

**-e**, **--edit**
> Edit commit message.

**-x**
> Append "cherry picked from" note.

**-m** _parent_
> Mainline parent for merge commits.

**--continue**
> Continue after resolving conflicts.

**--abort**
> Cancel operation.

**--skip**
> Skip current commit.

# DESCRIPTION

**git cherry-pick** applies changes from existing commits to the current branch. Each commit is applied as a new commit with the same changes but different hash.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-revert](/man/git-revert)(1)

