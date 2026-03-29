# TAGLINE

Find common ancestor commits for a merge

# TLDR

**Find the best common ancestor** of two branches

```git merge-base [branch1] [branch2]```

**Find all common ancestors** (not just the best one)

```git merge-base --all [branch1] [branch2]```

**Check if a commit is an ancestor** of another (useful in scripts)

```git merge-base --is-ancestor [commit1] [commit2]```

**Find the fork point** where a topic branch diverged from upstream

```git merge-base --fork-point [upstream_ref] [branch]```

**Find octopus merge base** for multiple branches

```git merge-base --octopus [branch1] [branch2] [branch3]```

**List independent commits** that cannot be reached from each other

```git merge-base --independent [commit1] [commit2] [commit3]```

# SYNOPSIS

**git** **merge-base** [**-a** | **--all**] _commit_ _commit_...
**git** **merge-base** [**-a** | **--all**] **--octopus** _commit_...
**git** **merge-base** **--is-ancestor** _commit_ _commit_
**git** **merge-base** **--independent** _commit_...
**git** **merge-base** **--fork-point** _ref_ [_commit_]

# PARAMETERS

**-a**, **--all**
> Output all merge bases for the commits, instead of just one.

**--octopus**
> Compute the best common ancestors of all supplied commits, in preparation for an n-way merge.

**--independent**
> Instead of printing merge bases, print a minimal subset of the supplied commits with the same ancestors. Lists commits which cannot be reached from any other.

**--is-ancestor**
> Check if the first commit is an ancestor of the second. Exits with status 0 if true, status 1 if not. Errors are signaled by a non-zero status that is not 1.

**--fork-point**
> Find the point at which a branch forked from another reference. Takes into account the reflog of the reference to detect forks from earlier incarnations of the branch (useful after history rewrites).

# DESCRIPTION

**git merge-base** finds the best common ancestor(s) between two commits to use in a three-way merge. A common ancestor is "best" if it is not an ancestor of any other common ancestor. One common ancestor that is an ancestor of all best common ancestors is a "merge base".

The `--fork-point` option finds where a branch diverged from an upstream branch, taking the reflog into account to handle history rewrites (e.g., after upstream rebase). The `--is-ancestor` option checks if one commit is an ancestor of another, which is useful in scripts for determining commit relationships. The `--independent` option filters a set of commits to only those not reachable from others. For octopus merges (merging more than two branches), the `--octopus` option computes a common base for multiple commits simultaneously.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-rebase](/man/git-rebase)(1), [git-log](/man/git-log)(1), [git-branch](/man/git-branch)(1), [git-show-branch](/man/git-show-branch)(1)
