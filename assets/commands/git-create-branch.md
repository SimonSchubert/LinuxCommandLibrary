# TAGLINE

Create and optionally switch to new branch

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

**git create-branch** is a convenience command from git-extras that simplifies branch creation workflows. It creates a new branch, optionally switches to it, and can immediately push it to the remote repository in a single operation.

Without the -r flag, the command creates a local branch and switches to it, equivalent to git checkout -b. With the -r flag, it creates the branch, pushes it to origin, and sets up tracking, combining several manual steps into one command.

You can optionally specify a starting commit hash or branch name; otherwise, the branch starts from HEAD. This streamlines common workflows like starting feature branches or creating release branches that need immediate remote visibility.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-checkout](/man/git-checkout)(1), [git-extras](/man/git-extras)(1)

