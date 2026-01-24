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

**tuckr** manages dotfiles. It uses symlinks.

Group-based organization. Logical grouping.

Selective deployment. Choose what to link.

Status tracking. See what's linked.

Simple design. Easy to use.

# CAVEATS

Rust implementation. Specific directory structure. Symlink-based.

# HISTORY

**Tuckr** was created as a simple dotfile manager using symlinks with group-based organization.

# SEE ALSO

[stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1)
