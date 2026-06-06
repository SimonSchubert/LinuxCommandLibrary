# TAGLINE

Symlink-based dotfile manager

# TLDR

**Symlink all dotfiles into place**

```tuckr add \*```

**Symlink specific groups**

```tuckr add [neovim] [zsh]```

**Symlink everything except some groups**

```tuckr add \* -e [neovim]```

**Set up groups and run their hooks**

```tuckr set [group]```

**Remove deployed dotfiles**

```tuckr rm [group]```

**Show symlinking status**

```tuckr status```

**Copy existing files into a group**

```tuckr push [group] [file]```

# SYNOPSIS

**tuckr** _command_ [_group_...] [_options_]

# PARAMETERS

**add** (alias **a**)
> Deploy dotfiles for the given groups by creating symlinks.

**rm**
> Remove the deployed dotfiles from the system.

**set**
> Set up groups and run their hooks.

**unset**
> Remove groups and run their cleanup hooks.

**status** (alias **s**)
> Show the symlinking status of dotfiles.

**push**
> Copy existing files into a group.

**pop**
> Remove groups from the dotfiles directory.

**encrypt** (alias **e**)
> Encrypt files and store them under Secrets.

**decrypt** (alias **d**)
> Decrypt files.

**groupis**
> Report which group a file belongs to.

**init**
> Initialize the dotfile directory.

**-e** _GROUP_
> Exclude the given group when used with add.

# DESCRIPTION

**tuckr** is a dotfile manager that organizes configuration files into logical groups and deploys them as symlinks. Each group represents a set of related dotfiles (such as vim, zsh, or git), allowing selective deployment of configurations across different machines.

The add command creates symlinks from the dotfile repository to their expected locations in the home directory. Groups can be linked individually or all at once with the `\*` wildcard, and the status command shows which groups are currently linked. The rm command cleanly unlinks deployed symlinks, while set additionally runs per-group setup hooks.

The tool uses a simple directory structure with Configs, Hooks, and Secrets directories, where each subdirectory under Configs represents a group that mirrors the home directory layout within it. Inspired by GNU Stow, it adds hooks and encrypted secrets without requiring symlink-aware tooling.

# CAVEATS

Rust implementation. Specific directory structure. Symlink-based.

# HISTORY

**Tuckr** was created as a simple dotfile manager using symlinks with group-based organization.

# SEE ALSO

[stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1)
