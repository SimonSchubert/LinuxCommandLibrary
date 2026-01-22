# TLDR

**Merge single file**

```git merge-one-file [base] [ours] [theirs] [path] [mode]```

# SYNOPSIS

**git merge-one-file** _base_ _ours_ _theirs_ _path_ _mode_

# PARAMETERS

_BASE_
> Base version blob SHA.

_OURS_
> Our version blob SHA.

_THEIRS_
> Their version blob SHA.

_PATH_
> File path.

_MODE_
> File mode.

**--help**
> Display help information.

# DESCRIPTION

**git merge-one-file** is a helper script for single-file merging. It's called by git merge-index to handle individual file conflicts using the standard three-way merge.

The command receives blob SHA-1s for base, ours, and theirs versions, performing the merge. It's part of git's internal merge machinery.

git merge-one-file provides single-file merge for scripts.

# CAVEATS

Plumbing command. Called by git merge internals. Not typically used directly.

# HISTORY

git merge-one-file is part of **Git's** merge infrastructure, implementing per-file merge as a component of the overall merge process.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-merge-file](/man/git-merge-file)(1)
