# TAGLINE

Simple stow-like dotfile linker

# TLDR

**Link a package** to the home directory

```lnko stow [package_name]```

**Unlink a package**

```lnko unstow [package_name]```

**Dry run** to preview changes

```lnko stow -n [package_name]```

# SYNOPSIS

**lnko** _command_ [_options_] [_package_]

# PARAMETERS

**-n**, **--dry-run**
> Preview changes without creating symlinks.

**-b**
> Auto-resolve conflicts by backing up existing files.

**-s**
> Auto-resolve conflicts by skipping conflicting files.

**-f**
> Auto-resolve conflicts by force-overwriting.

# DESCRIPTION

**lnko** is a simple stow-like dotfile linker that creates relative symlinks from a source directory containing packages to a target directory. Each package is a directory whose contents mirror the target structure.

It supports tree folding, ignore patterns, dry-run mode, and multiple conflict resolution strategies. Useful for managing dotfiles and configuration files across systems.

# CAVEATS

Requires Lua and LuaFileSystem to be installed.

# HISTORY

**lnko** was created by **luanvil** and is written in **Lua**.

# SEE ALSO

[stow](/man/stow)(8), [ln](/man/ln)(1)
