# TLDR

**Create and switch to branch**

```git create-branch [branch_name]```

**Create from specific commit**

```git create-branch [name] [commit]```

**Create without switching**

```git create-branch -r [name]```

# SYNOPSIS

**git** **create-branch** [_options_] _name_ [_commit_]

# PARAMETERS

**-r**, **--remote**
> Create and push to remote.

# DESCRIPTION

**git create-branch** creates a new branch and optionally switches to it. Part of git-extras. Can also push the branch to remote immediately.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-checkout](/man/git-checkout)(1), [git-extras](/man/git-extras)(1)

