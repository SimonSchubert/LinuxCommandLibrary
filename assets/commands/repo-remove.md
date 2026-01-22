# TLDR

**Remove** a package from a local repository

```repo-remove path/to/database.db.tar.gz package```

# SYNOPSIS

**repo-remove** _database_ _package_

# DESCRIPTION

**repo-remove** removes packages from a local pacman repository database. It updates the database file to no longer include the specified package.

This is the counterpart to repo-add for maintaining local Arch Linux repositories.

# CAVEATS

Only removes the database entry; does not delete the actual package file. Manual cleanup of package files may be required.

# HISTORY

Part of **pacman** package management tools for Arch Linux. Complements repo-add for repository maintenance.

# SEE ALSO

[repo-add](/man/repo-add)(1), [pacman](/man/pacman)(8)
