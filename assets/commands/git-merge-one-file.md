# TAGLINE

Internal single-file merge helper

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

**git merge-one-file** is a helper script for single-file merging, called by `git merge-index` to handle individual file conflicts using the standard three-way merge algorithm. It receives blob SHA-1 hashes for the base, ours, and theirs versions and performs the merge.

This command is part of Git's internal merge machinery and is not typically invoked directly by users. It exists to support custom merge workflows and to provide a reference implementation for per-file merge programs.

# CAVEATS

Plumbing command. Called by git merge internals. Not typically used directly.

# HISTORY

git merge-one-file is part of **Git's** merge infrastructure, implementing per-file merge as a component of the overall merge process.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-merge-file](/man/git-merge-file)(1)
