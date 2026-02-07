# TAGLINE

Show commits missing between branches

# TLDR

**Show commits missing from branch**

```git missing [branch]```

**Compare two branches**

```git missing [branch1] [branch2]```

# SYNOPSIS

**git** **missing** [_branch1_] [_branch2_]

# DESCRIPTION

**git missing** shows commits that exist in one branch but not the other. This git-extras command performs a symmetric comparison, revealing what changes are unique to each branch.

The command is particularly useful before merging, as it clearly shows what commits will be introduced from each side. It essentially performs `git log branch1..branch2` and `git log branch2..branch1` to provide a bidirectional view of branch divergence.

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1)
