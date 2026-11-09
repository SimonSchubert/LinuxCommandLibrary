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

**Show status as JSON**

```lnko status --json```

**Remove orphaned symlinks**

```lnko clean```

**Remove orphaned symlinks without prompting**

```lnko clean --remove-orphans```

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
> Show what would be done without making changes (link, unlink, clean).

**-v**, **--verbose**
> Output detailed debugging information.

**-b**, **--backup**
> Auto-resolve conflicts by backing up existing files to _target_/.lnko-backup/ (link).

**-s**, **--skip**
> Auto-resolve conflicts by skipping conflicting files (link).

**-f**, **--force**
> Auto-resolve conflicts by force-overwriting (link).

**--ignore** _glob_
> Exclude files matching a glob (repeatable, link). Globs containing / are path-scoped, others match the basename.

**--no-folding**
> Prevent directory folding into symlinks (link).

**--json**
> Output machine-readable JSON (status).

**--remove-orphans**
> Remove orphan symlinks without prompting (clean).

**--keep-orphans**
> Keep orphan symlinks without prompting (clean).

**--config** _file_
> Use a specific config file instead of .lnkorc in the source directory (also settable via LNKO_CONFIG).

**-h**, **--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**lnko** is a simple stow-like dotfile linker that creates relative symlinks from a source directory containing packages to a target directory. Each package is a directory whose contents mirror the target structure.

It supports tree folding, ignore patterns, dry-run mode, and multiple conflict resolution strategies. When conflicts are detected, lnko provides an interactive prompt with backup, skip, overwrite, and diff options unless an auto-resolve flag is given. Compatible with existing GNU Stow symlinks.

An optional **.lnkorc** file in the source directory, written as a Lua table, sets defaults for dir, target, ignore, no_folding and packages. Command-line flags take precedence.

# CAVEATS

The LuaRocks install requires Lua and LuaFileSystem; the standalone binary has no dependencies. The .lnkorc file is executable Lua, so only use configs you trust.

# HISTORY

**lnko** is written in **Lua** and maintained under the **Owloops** GitHub organization. The repository was previously published as luanvil/lnko.

# SEE ALSO

[stow](/man/stow)(8), [ln](/man/ln)(1)

# RESOURCES

```[Source code](https://github.com/Owloops/lnko)```

<!-- verified: 2026-11-09 -->
