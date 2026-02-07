# TAGLINE

Initialize a repo and commit all existing files

# TLDR

**Create new repo with files**

```git setup```

**Setup with initial commit**

```git setup [directory]```

# SYNOPSIS

**git setup** [_directory_]

# PARAMETERS

_DIRECTORY_
> Directory to set up (default: current).

**--help**
> Display help information.

# DESCRIPTION

**git setup** initializes a new repository and makes an initial commit with all existing files. Part of git-extras, it combines `git init`, `git add`, and `git commit` into a single command.

This is useful for quickly turning an existing directory of files into a Git repository with a clean starting snapshot.

# CAVEATS

Part of git-extras package. Commits all files immediately. Consider .gitignore first.

# HISTORY

git setup is part of **git-extras**, combining common initialization steps for new repositories.

# SEE ALSO

[git-init](/man/git-init)(1), [git-add](/man/git-add)(1), [git-commit](/man/git-commit)(1)
