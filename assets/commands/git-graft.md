# TAGLINE

Merge a branch and delete it immediately

# TLDR

**Graft** a branch into the current branch

```git graft [feature-branch]```

**Graft** a branch into a specific **destination** branch

```git graft [feature-branch] [dest-branch]```

# SYNOPSIS

**git graft** _src-branch_ [_dest-branch_]

# PARAMETERS

_src-branch_
> The branch to merge and then delete

_dest-branch_
> The branch to merge into (defaults to the current branch)

# DESCRIPTION

**git graft** merges a branch then immediately deletes it, combining git merge followed by git branch -d into a single operation. It is useful for incorporating completed feature branches into the main history while cleaning up branch clutter.

Part of the **git-extras** suite, the command simplifies the common merge-and-delete workflow for branches that should become part of history without keeping the branch reference.

# CAVEATS

Requires the **git-extras** package. The source branch is deleted after merge. Only use for completed work where the branch reference is no longer needed. The merge must be a clean fast-forward or merge commit; conflicts will cause failure.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-branch](/man/git-branch)(1), [git-extras](/man/git-extras)(1)
