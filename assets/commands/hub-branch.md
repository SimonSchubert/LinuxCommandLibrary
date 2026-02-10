# TAGLINE

same as **git branch** but extended with GitHub integration

# TLDR

**List local and remote branches**

```hub branch -a```

**Create a new branch**

```hub branch [branch-name]```

**Delete a branch**

```hub branch -d [branch-name]```

**Force delete branch**

```hub branch -D [branch-name]```

**Rename current branch**

```hub branch -m [new-name]```

# SYNOPSIS

**hub** **branch** [_options_] [_branch_]

# PARAMETERS

**-a**, **--all**
> List both local and remote branches.

**-r**, **--remotes**
> List remote branches only.

**-d**
> Delete branch (only if merged).

**-D**
> Force delete branch.

**-m**
> Rename branch.

**-v**, **--verbose**
> Show more info.

# DESCRIPTION

**hub branch** is the same as **git branch** but extended with GitHub integration. Hub is a command-line wrapper for git that provides extra features for working with GitHub. Note: hub is now deprecated in favor of the official GitHub CLI (**gh**).

# CAVEATS

Hub is deprecated. Consider using the GitHub CLI (**gh**) instead.

# SEE ALSO

[hub](/man/hub)(1), [git-branch](/man/git-branch)(1), [gh](/man/gh)(1)

