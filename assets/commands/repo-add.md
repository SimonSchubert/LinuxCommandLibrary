# TLDR

Create an **empty repository**

```repo-add path/to/database.db.tar.gz```

**Add packages** to the repository

```repo-add path/to/database.db.tar.gz package1.pkg.tar.zst package2.pkg.tar.zst```

Add all packages and **remove outdated** ones

```repo-add -R path/to/database.db.tar.gz *.pkg.tar.zst```

Add packages in **quiet mode**

```repo-add -q path/to/database.db.tar.gz *.pkg.tar.zst```

Add packages **without color** output

```repo-add --nocolor path/to/database.db.tar.gz *.pkg.tar.zst```

# SYNOPSIS

**repo-add** [_options_] _database_ [_packages_...]

# PARAMETERS

**-R**, **--remove**
> Remove outdated package files from the repository

**-q**, **--quiet**
> Minimize output except for warnings and errors

**--nocolor**
> Disable colored output

# DESCRIPTION

**repo-add** is a package database maintenance utility for Arch Linux. It creates and updates local pacman repositories by adding packages to the database file.

This enables installation of custom packages via pacman from local or network repositories.

# CAVEATS

The database file must have a .db.tar.gz extension. Packages must be valid pacman package files.

# HISTORY

Part of **pacman** package management tools for Arch Linux. Enables creation of custom local repositories.

# SEE ALSO

[repo-remove](/man/repo-remove)(1), [pacman](/man/pacman)(8)
