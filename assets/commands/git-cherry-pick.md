# TAGLINE

Apply changes from existing commits

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

**git cherry-pick** applies the changes introduced by existing commits onto the current branch, creating new commits with the same diff but different ancestry. This allows selective integration of specific changes without merging entire branches.

The command is essential for backporting bug fixes to maintenance branches, incorporating specific features from development branches, and recovering commits from abandoned branches. Each cherry-picked commit gets a new SHA-1 hash reflecting its new parent.

Cherry-picking can encounter conflicts when changes don't apply cleanly to the target branch's context. The operation can be paused, and conflicts resolved manually before continuing. The -x option appends a "cherry picked from commit" note to track the original source, useful for auditing backports.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-revert](/man/git-revert)(1)

