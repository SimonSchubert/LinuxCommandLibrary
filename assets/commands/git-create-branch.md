# TAGLINE

Create and optionally switch to new branch

# TLDR

**Create and switch to branch**

```git create-branch [branch_name]```

**Create and switch to branch from a specific starting point**

```git create-branch [name] [start_point]```

**Create and push to remote**

```git create-branch -r [name]```

# SYNOPSIS

**git** **create-branch** [_options_] _name_ [_commit_]

# PARAMETERS

**-r**, **--remote**
> Setup a remote tracking branch as well. Creates the branch locally, pushes it to origin, and sets up tracking.

# DESCRIPTION

**git create-branch** is a convenience command from git-extras that simplifies branch creation workflows. It creates a new branch and switches to it. With the **-r** flag, it additionally pushes the branch to origin and sets up remote tracking, combining several manual steps into one command.

Without the -r flag, the command creates a local branch and switches to it, equivalent to **git checkout -b**. You can optionally specify a starting point (commit hash or branch name); otherwise, the branch starts from HEAD.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-checkout](/man/git-checkout)(1), [git-switch](/man/git-switch)(1), [git-delete-branch](/man/git-delete-branch)(1), [git-extras](/man/git-extras)(1)

