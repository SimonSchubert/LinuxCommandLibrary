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

**git switch** switches branches. Introduced in Git 2.23 to provide a clearer way to switch branches, separating this from git checkout's file restoration functionality.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-branch](/man/git-branch)(1)

