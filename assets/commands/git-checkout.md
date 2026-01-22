# TLDR

**Switch to branch**

```git checkout [branch-name]```

**Create and switch to branch**

```git checkout -b [new-branch]```

**Restore a file**

```git checkout -- [file.txt]```

**Checkout specific commit**

```git checkout [commit-hash]```

**Checkout from remote**

```git checkout -t origin/[branch]```

# SYNOPSIS

**git checkout** [_options_] _branch_|_commit_|_file_

# PARAMETERS

_BRANCH_
> Branch to switch to.

**-b** _BRANCH_
> Create and switch to new branch.

**-t**, **--track**
> Set up tracking for remote branch.

**--** _FILE_
> Restore file from index.

**-f**, **--force**
> Force switch, discard changes.

**--orphan** _BRANCH_
> Create orphan branch.

**--help**
> Display help information.

# DESCRIPTION

**git checkout** switches branches or restores files. It updates the working tree to match the specified branch, commit, or file version from history.

The command serves multiple purposes: branch switching, branch creation, file restoration, and detached HEAD operations. Modern git prefers git switch for branches and git restore for files.

git checkout remains widely used for its versatility.

# CAVEATS

Uncommitted changes may be lost with -f. Detached HEAD requires care. Consider git switch/restore for clarity.

# HISTORY

git checkout is an original **Git** command that combines several operations. **Git 2.23** introduced git switch and git restore as clearer alternatives.

# SEE ALSO

[git-switch](/man/git-switch)(1), [git-restore](/man/git-restore)(1), [git-branch](/man/git-branch)(1)
