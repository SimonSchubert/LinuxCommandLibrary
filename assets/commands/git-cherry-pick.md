# TAGLINE

Apply changes from existing commits

# TLDR

**Apply a commit to the current branch**

```git cherry-pick [commit]```

**Cherry-pick multiple commits**

```git cherry-pick [commit1] [commit2]```

**Cherry-pick an exclusive range (excludes start, includes end)**

```git cherry-pick [start]..[end]```

**Cherry-pick an inclusive range (includes both start and end)**

```git cherry-pick [start]^..[end]```

**Apply changes without committing**

```git cherry-pick -n [commit]```

**Continue after resolving conflicts**

```git cherry-pick --continue```

**Abort and return to pre-cherry-pick state**

```git cherry-pick --abort```

**Append a "cherry picked from" note to the commit message**

```git cherry-pick -x [commit]```

# SYNOPSIS

**git** **cherry-pick** [_options_] _commit_...

**git** **cherry-pick** (**--continue** | **--skip** | **--abort** | **--quit**)

# PARAMETERS

**-e**, **--edit**
> Edit the commit message before committing.

**-n**, **--no-commit**
> Apply changes to the working tree and index without creating a commit.

**-x**
> Append a line saying "(cherry picked from commit ...)" to the original commit message. Useful for tracking backports on public branches.

**-s**, **--signoff**
> Add a `Signed-off-by` trailer to the commit message.

**-m** _parent-number_, **--mainline** _parent-number_
> Specify the parent number (starting from 1) to use as the mainline when cherry-picking a merge commit.

**--ff**
> If HEAD is the same as the parent of the commit being cherry-picked, fast-forward HEAD instead of creating a new commit.

**--continue**
> Continue the operation after resolving conflicts.

**--skip**
> Skip the current commit and continue with the rest of the sequence.

**--abort**
> Cancel the operation and return to the pre-cherry-pick state.

**--quit**
> Forget the current operation without restoring HEAD, leaving the working tree as-is.

# DESCRIPTION

**git cherry-pick** applies the changes introduced by existing commits onto the current branch, creating new commits with the same diff but different ancestry. This allows selective integration of specific changes without merging entire branches.

The command is essential for backporting bug fixes to maintenance branches, incorporating specific features from development branches, and recovering commits from abandoned branches. Each cherry-picked commit gets a new SHA-1 hash reflecting its new parent.

When specifying a range with `..`, the start commit is excluded. To include both endpoints use `start^..end`. Cherry-picking can encounter conflicts when changes don't apply cleanly to the target branch's context. The operation can be paused to allow manual resolution before continuing with `--continue`.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-revert](/man/git-revert)(1), [git-cherry](/man/git-cherry)(1)

