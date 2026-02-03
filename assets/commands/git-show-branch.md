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

**git show-branch** shows branches and their commits with visual indication of which commits belong to which branches.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-log](/man/git-log)(1)

