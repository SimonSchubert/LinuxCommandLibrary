# TAGLINE

Show commits missing between branches

# TLDR

**Show commits in current branch missing from another branch and vice versa**

```git missing [branch]```

**Compare two specific branches**

```git missing [branch1] [branch2]```

# SYNOPSIS

**git** **missing** [_branch1_] [_branch2_]

# DESCRIPTION

**git missing** shows commits that exist in one branch but not the other. This git-extras command performs a symmetric comparison, revealing what changes are unique to each branch.

If only one branch is specified, it is compared against the current branch. If no branches are specified, the current branch is compared against the default branch (usually master or main).

The command is particularly useful before merging, as it clearly shows what commits will be introduced from each side. It essentially performs `git log --left-right --oneline branch1...branch2` to provide a bidirectional view of branch divergence.

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1), [git-cherry](/man/git-cherry)(1), [git-branch](/man/git-branch)(1)
