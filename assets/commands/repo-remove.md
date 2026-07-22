# TAGLINE

Remove packages from Arch Linux repository

# TLDR

**Remove** a package from a local repository

```repo-remove [path/to/database.db.tar.gz] [package_name]```

**Remove** quietly (suppress output)

```repo-remove -q [path/to/database.db.tar.gz] [package_name]```

**Remove** and sign the database file with GnuPG

```repo-remove -s [path/to/database.db.tar.gz] [package_name]```

# SYNOPSIS

**repo-remove** [_options_] _database_ _package_ [_package_ ...]

# PARAMETERS

**-q**, **--quiet**
> Suppress output messages.

**-s**, **--sign**
> Sign the database file using GnuPG after the update.

**-k** _KEY_, **--key** _KEY_
> Use the specified key to sign the database.

**-v**, **--verify**
> Verify the database signature before reading.

# DESCRIPTION

**repo-remove** removes packages from a local pacman repository database. It updates the database file to no longer include the specified package entries.

This is the counterpart to repo-add for maintaining local Arch Linux repositories. Multiple package names may be supplied in a single invocation.

# CAVEATS

Only removes the database entry; does not delete the actual package file from disk. Manual cleanup of package files may be required.

# HISTORY

Part of **pacman** package management tools for Arch Linux. Complements repo-add for repository maintenance.

# INSTALL

```apt: sudo apt install pacman-package-manager```

```dnf: sudo dnf install pacman```

```pacman: sudo pacman -S pacman```

```apk: sudo apk add pacman```

```nix: nix profile install nixpkgs#pacman```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[repo-add](/man/repo-add)(1), [pacman](/man/pacman)(8)
