# TAGLINE

Switch between branches

# TLDR

**Switch to branch**

```git switch [branch]```

**Create and switch**

```git switch -c [new_branch]```

**Switch to previous branch**

```git switch -```

**Create from specific commit**

```git switch -c [branch] [commit]```

**Detach HEAD**

```git switch --detach [commit]```

**Force switch**

```git switch -f [branch]```

**Create orphan branch**

```git switch --orphan [branch]```

# SYNOPSIS

**git** **switch** [_options_] _branch_

# PARAMETERS

**-c**, **--create** _branch_
> Create new branch.

**-C**
> Create or reset branch.

**-d**, **--detach**
> Detach HEAD.

**--orphan** _branch_
> Create orphan branch.

**-f**, **--force**
> Force switch.

**--guess**
> Guess remote branch.

**--no-guess**
> Don't guess remote.

**-t**, **--track**
> Set up tracking.

# DESCRIPTION

**git switch** changes the current branch. Introduced in Git 2.23 to provide a focused command for branch switching, separating this concern from `git checkout` which also handles file restoration.

Use `-c` to create a new branch and switch to it in one step, or `--detach` to move to a specific commit without being on any branch.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-branch](/man/git-branch)(1)
