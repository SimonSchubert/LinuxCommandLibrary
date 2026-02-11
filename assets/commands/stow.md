# TAGLINE

Symlink farm manager for dotfiles

# TLDR

**Stow a package** (create symlinks)

```stow [package]```

**Stow to specific target**

```stow -t [/target/directory] [package]```

**Unstow a package** (remove symlinks)

```stow -D [package]```

**Restow** (unstow then stow)

```stow -R [package]```

**Simulate stow** (dry run)

```stow -n [package]```

**Stow with verbose output**

```stow -v [package]```

**Stow from specific directory**

```stow -d [/path/to/stow/dir] [package]```

**Adopt existing files**

```stow --adopt [package]```

# SYNOPSIS

**stow** [_options_] _package_...

# DESCRIPTION

**stow** is a symlink farm manager that creates symbolic links from a source tree to a target directory. It's commonly used to manage dotfiles, organize software installed in /usr/local, and maintain configuration files.

Packages are directories containing files organized as they should appear in the target. Stow creates symlinks in the target directory pointing to files in the package directory, maintaining the directory structure.

For dotfiles management, stow directories typically mirror home directory structure, allowing version control of configurations while keeping them active via symlinks.

# PARAMETERS

**-d** _dir_, **--dir=** _dir_
> Stow directory (default: current).

**-t** _dir_, **--target=** _dir_
> Target directory (default: parent of stow dir).

**-S**, **--stow**
> Stow packages (default action).

**-D**, **--delete**
> Unstow packages.

**-R**, **--restow**
> Restow (unstow then stow).

**-n**, **--no**, **--simulate**
> Dry run, don't make changes.

**-v**, **--verbose**
> Increase verbosity.

**--adopt**
> Adopt existing files into package.

**--ignore=** _regex_
> Ignore files matching pattern.

**--defer=** _regex_
> Defer to existing files.

**--override=** _regex_
> Override existing files.

# CAVEATS

Doesn't handle conflicts automatically. Target directory must exist. Symlinks point to absolute paths by default. Some applications don't follow symlinks properly. Adopt mode moves files, potentially causing issues.

# HISTORY

**GNU Stow** was written by **Bob Glickstein** in **1993** to manage software compiled into separate directories. It was initially designed for /usr/local/stow organization. The tool was later adopted by the dotfiles management community for organizing configuration files under version control.

# SEE ALSO

[ln](/man/ln)(1), [dotfiles](/man/dotfiles)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1)
