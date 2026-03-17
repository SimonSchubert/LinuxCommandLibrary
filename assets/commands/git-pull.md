# TAGLINE

Fetch and integrate remote changes

# TLDR

**Pull from origin**

```git pull```

**Pull from specific remote**

```git pull [remote]```

**Pull specific branch**

```git pull [remote] [branch]```

**Pull with rebase**

```git pull --rebase```

**Pull all remotes**

```git pull --all```

**Pull without committing merge**

```git pull --no-commit```

**Pull with fast-forward only**

```git pull --ff-only```

# SYNOPSIS

**git** **pull** [_options_] [_remote_] [_branch_]

# PARAMETERS

**--rebase**[=_true|merges|false_]
> Rebase current branch on top of upstream after fetching instead of merging.

**--no-rebase**
> Merge upstream into current branch (overrides `pull.rebase` config).

**--ff-only**
> Only update if fast-forward is possible, fail otherwise.

**--no-ff**
> Always create a merge commit, even when fast-forward is possible.

**--no-commit**
> Perform the merge but stop before creating a commit.

**--squash**
> Squash all fetched commits into a single commit on the current branch.

**--all**
> Fetch from all remotes.

**--autostash**
> Automatically stash and reapply uncommitted changes.

**--set-upstream**
> Add upstream tracking reference for the pulled branch.

**--depth** _n_
> Limit fetch to specified number of commits from remote tip.

**-t**, **--tags**
> Fetch all tags from the remote.

**-q**, **--quiet**
> Suppress output during fetch and merge.

**-v**, **--verbose**
> Be verbose.

# DESCRIPTION

**git pull** fetches from a remote and integrates the changes with the current branch. It is equivalent to running `git fetch` followed by `git merge`, or `git rebase` when the `--rebase` option is used.

Pull strategies vary by workflow. Some teams prefer merge (preserving all history), others prefer rebase (linear history), and some use `--ff-only` to reject non-fast-forward updates and prevent unexpected merge commits. The `pull.rebase` configuration setting controls default behavior.

# CAVEATS

Pulling into a dirty working tree can cause conflicts. Use `--autostash` to automatically stash and reapply local changes. The default merge-or-rebase behavior is controlled by the `pull.rebase` configuration setting. Since Git 2.27, `git pull` warns if `pull.rebase` is not set.

# HISTORY

**git pull** has been part of Git since its initial release by Linus Torvalds in **2005**. The `--ff-only` option was added in Git 1.6.6. The `--autostash` option was added in Git 2.9.

# SEE ALSO

[git-fetch](/man/git-fetch)(1), [git-merge](/man/git-merge)(1), [git-rebase](/man/git-rebase)(1), [git-stash](/man/git-stash)(1)
