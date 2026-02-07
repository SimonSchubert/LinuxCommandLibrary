# TAGLINE

Completely remove a submodule from repository

# TLDR

**Delete a submodule**

```git delete-submodule [path/to/submodule]```

# SYNOPSIS

**git** **delete-submodule** _path_

# DESCRIPTION

**git delete-submodule** completely removes a submodule from a repository, automating the multi-step process that Git requires for proper submodule deletion. Part of git-extras, it handles all necessary cleanup operations in a single command.

Removing a submodule manually involves deinitializing it, editing .gitmodules, removing entries from .git/config, deleting .git/modules/[name], and removing the working directory. Missing any step leaves residual configuration causing future issues. This command ensures complete removal by orchestrating all required operations.

# SEE ALSO

[git-submodule](/man/git-submodule)(1), [git-extras](/man/git-extras)(1)
