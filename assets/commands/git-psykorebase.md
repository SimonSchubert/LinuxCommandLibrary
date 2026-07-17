# TAGLINE

Rebase a branch onto another using a single merge commit

# TLDR

**Rebase current branch onto another** using a merge commit

```git psykorebase [primary_branch]```

**Rebase a specific branch onto another**

```git psykorebase [primary_branch] [secondary_branch]```

**Force a merge commit** even if fast-forward is possible

```git psykorebase [primary_branch] --no-ff```

**Continue after resolving conflicts**

```git psykorebase --continue```

# SYNOPSIS

**git** **psykorebase** _primary-branch_ [_secondary-branch_] [_--no-ff_]

**git** **psykorebase** **--continue**

# PARAMETERS

_PRIMARY-BRANCH_
> Branch to rebase onto.

_SECONDARY-BRANCH_
> Branch being rebased; defaults to the current branch.

**--no-ff**
> Force a merge commit instead of a fast-forward.

**-c**, **--continue**
> Resume after manually resolving a conflict.

# DESCRIPTION

**git psykorebase** rebases a branch onto another by checking out the primary branch, branching from it, and merging the secondary branch in with a single generated merge commit, rather than replaying every individual commit like `git rebase` does. This git-extras command avoids re-resolving the same conflict once per commit, at the cost of collapsing the rebase into one merge point.

If the merge conflicts, it leaves a temporary `<secondary>-rebased-on-top-of-<primary>` branch checked out and tells you to resolve the conflict and commit, then run `git psykorebase --continue` to finish renaming the branches into place.

# CAVEATS

Part of git-extras. Because it uses one merge instead of replaying commits, individual commit-level history from the secondary branch relative to the primary is not preserved the way an interactive rebase would.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-merge](/man/git-merge)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-psykorebase)```

<!-- verified: 2026-07-17 -->
