# TAGLINE

git-based dotfile synchronizer written in Bash

# TLDR

**Create** a new castle (dotfiles repository)

```homeshick generate [castle_name]```

**Track** a file in your castle

```homeshick track [castle_name] [path/to/file]```

**Go** to a castle directory

```homeshick cd [castle_name]```

**Clone** a castle from GitHub

```homeshick clone [github_username]/[repository_name]```

**Symlink** all files from a castle

```homeshick link [castle_name]```

**List** installed castles

```homeshick list```

**Update** all castles from their remotes

```homeshick pull```

# SYNOPSIS

**homeshick** [_options_] _command_ [_arguments_]

# PARAMETERS

**generate** _CASTLE_ [_CASTLE_...]
> Create a new castle (dotfiles repository)

**track** _CASTLE_ _FILE_ [_FILE_...]
> Move a file/folder into a castle and replace it with a symlink

**cd** _CASTLE_
> Change directory to a castle's repository, for running git commands directly

**clone** _URL_...
> Clone a castle from a Git repository (supports GitHub "user/repo" shorthand)

**link**, **symlink** [_CASTLE_...]
> Symlink all files in the given castles' (or all castles') home folders into $HOME

**pull** [_CASTLE_...]
> Run git pull for the given castles (or all castles) and their submodules

**check**, **updates** [_CASTLE_...]
> Check whether castles are behind, ahead, or up to date with their remote

**refresh**
> Check remotes for updates, skipping castles checked within the last week

**list**, **ls**
> List all installed castles

**-q**, **--quiet**
> Suppress status output except when input is required

**-s**, **--skip**
> Skip conflicting files in $HOME instead of overwriting them

**-f**, **--force**
> Overwrite conflicting files in $HOME automatically

**-b**, **--batch**
> Run non-interactively, accepting default answers

**-v**, **--verbose**
> Print additional diagnostic output

# DESCRIPTION

**homeshick** is a Git-based dotfile synchronizer written in Bash. It uses "castles" (Git repositories) to manage dotfiles, creating symlinks from the repository to your home directory.

Each castle is a Git repository stored in **~/.homesick/repos/**. Files tracked in a castle (with **track**) are moved into the repository and replaced with symlinks pointing back to the repository copy. This allows version control and easy synchronization across machines. Multiple castles can be installed side by side, letting you combine shared dotfile collections (e.g. an oh-my-zsh castle) with your own.

# CAVEATS

Requires Bash 3+ and Git 1.5+. Symlinks may not work correctly on some filesystems or in containers. Conflicts can arise when multiple castles contain the same file; use **-f/--force** or **-s/--skip** to resolve them non-interactively.

# HISTORY

homeshick was created by **Anders Ingemann**, with the repository dating to **2012**, as a pure Bash alternative to homesick (a Ruby gem). The name combines "home" (dotfiles) with "shell" (Bash implementation).

# INSTALL

```zypper: sudo zypper install homeshick```

```brew: brew install homeshick```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[chezmoi](/man/chezmoi)(1), [stow](/man/stow)(8), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/andsens/homeshick)```

```[Documentation](https://github.com/andsens/homeshick/wiki)```

<!-- verified: 2026-07-19 -->

