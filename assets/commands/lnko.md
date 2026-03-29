# TAGLINE

Simple stow-like dotfile linker

# TLDR

**Link packages to the home directory**

```lnko link [package1] [package2]```

**Link packages from a specific source to a target directory**

```lnko link -d [~/dotfiles] -t [~] [package_name]```

**Unlink a package**

```lnko unlink [package_name]```

**Preview changes without creating symlinks**

```lnko link -n [package_name]```

**Show status of all packages**

```lnko status```

**Remove orphaned symlinks**

```lnko clean```

**Force-overwrite conflicting files**

```lnko link -f [package_name]```

# SYNOPSIS

**lnko** _command_ [_options_] [_package_ ...]

# PARAMETERS

**link**
> Create relative symlinks from source packages to the target directory.

**unlink**
> Remove symlinks for specified packages.

**status**
> Display the current state of all packages and their symlinks.

**clean**
> Remove orphaned symlinks pointing to non-existent targets.

**-d**, **--dir** _dir_
> Specify source directory containing packages (default: current directory).

**-t**, **--target** _dir_
> Specify target directory for symlinks (default: $HOME).

**-n**, **--dry-run**
> Preview changes without creating symlinks.

**-v**, **--verbose**
> Output detailed debugging information.

**-b**, **--backup**
> Auto-resolve conflicts by backing up existing files to .lnko-backup/.

**-s**, **--skip**
> Auto-resolve conflicts by skipping conflicting files.

**-f**, **--force**
> Auto-resolve conflicts by force-overwriting.

**--ignore** _pattern_
> Exclude files matching pattern (repeatable).

**--no-folding**
> Prevent directory folding into symlinks.

# DESCRIPTION

**lnko** is a simple stow-like dotfile linker that creates relative symlinks from a source directory containing packages to a target directory. Each package is a directory whose contents mirror the target structure.

It supports tree folding, ignore patterns, dry-run mode, and multiple conflict resolution strategies. When conflicts are detected, lnko provides an interactive prompt with backup, skip, overwrite, and diff options unless an auto-resolve flag is given. Compatible with existing GNU Stow symlinks.

# CAVEATS

Requires Lua and LuaFileSystem to be installed.

# HISTORY

**lnko** was created by **luanvil** and is written in **Lua**.

# SEE ALSO

[stow](/man/stow)(8), [ln](/man/ln)(1)
