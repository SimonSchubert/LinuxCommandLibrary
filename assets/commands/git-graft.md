# TAGLINE

Merge branch and delete immediately

# TLDR

**Graft branch into history**

```git graft [branch]```

**Graft onto specific commit**

```git graft [branch] [base-commit]```

# SYNOPSIS

**git graft** _branch_ [_base_]

# PARAMETERS

_BRANCH_
> Branch to graft.

_BASE_
> Base commit (default: branch point).

**--help**
> Display help information.

# DESCRIPTION

**git graft** merges a branch then immediately deletes it, combining git merge followed by git branch -d into a single operation. It is useful for incorporating completed feature branches into the main history while cleaning up branch clutter.

Part of the git-extras suite, the command simplifies the common merge-and-delete workflow for branches that should become part of history without keeping the branch reference.

# CAVEATS

Part of git-extras package. Branch deleted after merge. Use for completed work only.

# HISTORY

git graft is part of **git-extras**, providing a convenience wrapper for the common merge-then-delete pattern.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-branch](/man/git-branch)(1)
