# TAGLINE

Initialize a repo and commit all existing files

# TLDR

**Create a new repo** in the current directory with an initial commit

```git setup```

**Setup a repo** in a specific **directory**

```git setup [path/to/directory]```

# SYNOPSIS

**git setup** [_directory_]

# PARAMETERS

_DIRECTORY_
> Directory to set up (default: current directory).

# DESCRIPTION

**git setup** initializes a new Git repository and makes an initial commit with all existing files. Part of the **git-extras** package, it combines `git init`, `git add .`, and `git commit -m "Initial commit"` into a single command.

This is useful for quickly turning an existing directory of files into a Git repository with a clean starting snapshot.

# CAVEATS

Part of the **git-extras** package and must be installed separately. Commits all files immediately, so ensure a **.gitignore** file is in place first to avoid tracking unwanted files.

# HISTORY

git setup is part of **git-extras**, a collection of useful Git utilities created by **TJ Holowaychuk**. It combines common initialization steps for new repositories.

# SEE ALSO

[git-init](/man/git-init)(1), [git-add](/man/git-add)(1), [git-commit](/man/git-commit)(1), [git-extras](/man/git-extras)(1), [git-ignore](/man/git-ignore)(1)
