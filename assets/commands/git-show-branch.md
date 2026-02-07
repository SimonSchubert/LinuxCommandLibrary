# TAGLINE

Show branches and their commits with relationship indicators

# TLDR

**Show branch relationships**

```git show-branch```

**Show specific branches**

```git show-branch [branch1] [branch2]```

**Show all branches**

```git show-branch --all```

**Show with more context**

```git show-branch --more=[10]```

**Show with color**

```git show-branch --color```

# SYNOPSIS

**git** **show-branch** [_options_] [_refs_...]

# PARAMETERS

**-a**, **--all**
> Show all refs.

**-r**, **--remotes**
> Show remote branches.

**--more** _n_
> Show more commits.

**--list**
> List mode.

**--topo-order**
> Topological order.

**--date-order**
> Date order.

**--color**
> Color output.

# DESCRIPTION

**git show-branch** displays branches and their commits with visual indicators showing which commits belong to which branches. It provides a compact overview of branch divergence and shared history.

This is useful for understanding how branches relate to each other, especially when multiple branches share common ancestors.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-log](/man/git-log)(1)
