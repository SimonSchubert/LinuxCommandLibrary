# TAGLINE

Symlink-based dotfile manager

# TLDR

**Deploy dotfiles**

```tuckr deploy```

**Deploy specific group**

```tuckr deploy [group]```

**Add file to group**

```tuckr add [group] [file]```

**Remove symlinks**

```tuckr remove```

**Check status**

```tuckr status```

# SYNOPSIS

**tuckr** _command_ [_group_] [_file_]

# PARAMETERS

**deploy**
> Create symlinks.

**remove**
> Remove symlinks.

**add**
> Add file to group.

**status**
> Show status.

**init**
> Initialize repo.

# DESCRIPTION

**tuckr** is a dotfile manager that organizes configuration files into logical groups and deploys them as symlinks. Each group represents a set of related dotfiles (such as vim, zsh, or git), allowing selective deployment of configurations across different machines.

The deploy command creates symlinks from the dotfile repository to their expected locations in the home directory. Groups can be deployed individually or all at once, and the status command shows which groups are currently linked. The remove command cleanly unlinks deployed symlinks.

The tool uses a simple directory structure where each subdirectory represents a group, mirroring the home directory layout within it.

# CAVEATS

Rust implementation. Specific directory structure. Symlink-based.

# HISTORY

**Tuckr** was created as a simple dotfile manager using symlinks with group-based organization.

# SEE ALSO

[stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1)
