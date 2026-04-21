# TAGLINE

Join development histories together

# TLDR

**Merge branch into current**

```git merge [branch-name]```

**Merge with commit message**

```git merge [branch] -m "[message]"```

**Merge without fast-forward (preserve topology)**

```git merge --no-ff [branch]```

**Only allow fast-forward, otherwise fail**

```git merge --ff-only [branch]```

**Squash merge (single staged changeset, no merge commit)**

```git merge --squash [branch]```

**Favor our or their side on conflicts**

```git merge -X ours [branch]```

**Abort or continue an in-progress merge**

```git merge --abort``` / ```git merge --continue```

# SYNOPSIS

**git merge** [_options_] [_commit_...]

**git merge** (--continue | --abort | --quit)

# PARAMETERS

_COMMIT_
> Branch or commit to merge into current branch.

**--no-ff**
> Always create a merge commit, even when fast-forward is possible.

**--ff-only**
> Refuse to merge unless the current HEAD can be fast-forwarded.

**--squash**
> Produce working tree/index as if a real merge happened, but do not make a commit.

**--no-commit**
> Perform the merge but stop before creating a commit (allows inspection).

**-m** _MESSAGE_
> Set the commit message for the merge commit.

**-e**, **--edit**
> Invoke the editor to refine the auto-generated commit message.

**--abort**
> Abort the current conflict resolution and reconstruct the pre-merge state.

**--continue**
> Continue the merge after conflicts have been resolved.

**--quit**
> Forget about the current merge in progress without restoring the pre-merge state.

**-s** _STRATEGY_, **--strategy=**_STRATEGY_
> Select merge strategy: `ort` (default), `resolve`, `octopus`, `ours`, or `subtree`.

**-X** _OPTION_, **--strategy-option=**_OPTION_
> Pass a strategy-specific option (e.g., `ours`, `theirs`, `ignore-all-space`, `find-renames`).

**--autostash**
> Automatically stash and restore local changes around the merge.

**--allow-unrelated-histories**
> Merge histories that do not share a common ancestor.

**--verify-signatures**
> Require a valid GPG signature on the side branch tip.

**-S**[_KEYID_], **--gpg-sign**[=_KEYID_]
> GPG-sign the resulting merge commit.

**--log**[=_N_]
> Include one-line descriptions of the merged commits in the merge commit message.

**--help**
> Display help information.

# DESCRIPTION

**git merge** incorporates changes from the named commits (typically branch tips) into the current branch. It is also invoked internally by **git pull** to integrate fetched changes.

A fast-forward merge simply advances the current branch pointer to the merged commit without creating a new commit; `--no-ff` forces a merge commit to preserve branch topology, while `--ff-only` refuses the merge unless it is a fast-forward. Squash merges (`--squash`) collapse all incoming changes into a single staged changeset without recording a merge commit.

When textual conflicts occur, conflict markers are written into affected files; resolve them, `git add` the files, then run `git merge --continue` (or `git commit`). The default strategy is **ort** ("Ostensibly Recursive's Twin"), which replaced the older **recursive** strategy in Git 2.33 and handles three-way merges with rename detection.

# CAVEATS

Conflicts require manual resolution before the merge can complete. Fast-forward merges discard branch topology unless `--no-ff` is used. Using `-X ours`/`-X theirs` silently discards one side's changes on conflict. The `--strategy=ours` option is very different from `-X ours` and keeps only the current branch's tree.

# HISTORY

**git merge** has been a core **Git** command since its earliest releases. The default strategy was renamed from **recursive** to **ort** in Git 2.33 (August 2021) for correctness and performance improvements. `--autostash` was added in Git 2.27, and `--quit` in Git 2.11.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-cherry-pick](/man/git-cherry-pick)(1), [git-mergetool](/man/git-mergetool)(1), [git-pull](/man/git-pull)(1), [git-branch](/man/git-branch)(1)
