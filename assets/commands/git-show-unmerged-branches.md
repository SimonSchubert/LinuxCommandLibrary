# TAGLINE

List branches not yet merged into the current branch

# TLDR

**Show all unmerged branches**

```git show-unmerged-branches```

**Show unmerged branches (equivalent native git)**

```git branch --no-merged```

# SYNOPSIS

**git** **show-unmerged-branches**

# DESCRIPTION

**git show-unmerged-branches** lists all local branches that have not been merged into the current HEAD. It is part of the **git-extras** collection and is useful for identifying work-in-progress branches and outstanding feature work.

Internally, it runs `git branch --no-merged` while filtering out the current branch and the default branch.

# CAVEATS

Requires **git-extras** to be installed. Only checks local branches, not remote tracking branches. Written by Paul Schreiber.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-show-merged-branches](/man/git-show-merged-branches)(1), [git-extras](/man/git-extras)(1), [git-log](/man/git-log)(1)
