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

# SYNOPSIS

**homeshick** _command_ [_arguments_]

# PARAMETERS

**generate** _NAME_
> Create a new castle (dotfiles repository)

**track** _CASTLE_ _FILE_
> Add a file to a castle and replace with symlink

**cd** _CASTLE_
> Change directory to a castle

**clone** _URL_
> Clone a castle from a Git repository

**link** _CASTLE_
> Create symlinks from castle to home directory

**pull** _CASTLE_
> Pull updates for a castle

**check**
> Check if any castles have updates

# DESCRIPTION

**homeshick** is a Git-based dotfile synchronizer written in Bash. It uses "castles" (Git repositories) to manage dotfiles, creating symlinks from the repository to your home directory.

Each castle is a Git repository stored in ~/.homesick/repos/. Files tracked in a castle are moved into the repository and replaced with symlinks pointing back to the repository copy. This allows version control and easy synchronization across machines.

# CAVEATS

Requires Bash and Git. Symlinks may not work correctly on some filesystems or in containers. Conflicts can arise when multiple castles contain the same file.

# HISTORY

homeshick was created by Anders Ingemann as a pure Bash alternative to homesick (a Ruby gem). The name combines "home" (dotfiles) with "shell" (Bash implementation).

# SEE ALSO

[chezmoi](/man/chezmoi)(1), [stow](/man/stow)(8), [git](/man/git)(1)
