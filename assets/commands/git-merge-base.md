# TLDR

**Find common ancestor**

```git merge-base [branch1] [branch2]```

**Find fork point**

```git merge-base --fork-point [branch]```

**Check if commit is ancestor**

```git merge-base --is-ancestor [commit1] [commit2]```

**Find octopus merge base**

```git merge-base --octopus [branch1] [branch2] [branch3]```

# SYNOPSIS

**git** **merge-base** [_options_] _commit_...

# PARAMETERS

**--fork-point**
> Find fork point.

**--is-ancestor**
> Check ancestry.

**--octopus**
> Find octopus merge base.

**-a**, **--all**
> Output all merge bases.

# DESCRIPTION

**git merge-base** finds the best common ancestor(s) for a merge. The result is the most recent commit that is reachable from all specified commits.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-rebase](/man/git-rebase)(1)

