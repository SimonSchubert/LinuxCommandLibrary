# TAGLINE

Initialize new yadm dotfiles repository

# TLDR

**Initialize** a new yadm repository

```yadm init```

**Force reinitialization** of an existing repository

```yadm init -f```

**Initialize with a custom worktree** path

```yadm init -w [path/to/worktree]```

# SYNOPSIS

**yadm** **init** [**-f**] [**-w** _dir_]

# PARAMETERS

**-f**
> Force reinitialization of an existing repository.

**-w** _dir_
> Override the default work-tree ($HOME) with the specified directory.

# DESCRIPTION

**yadm init** creates a new, empty repository for tracking dotfiles. The repository is initialized at **$HOME/.local/share/yadm/repo.git** with **$HOME** as the default work-tree. This is the first step for starting dotfiles management with yadm.

If a repository already exists, the **-f** flag is required to force reinitialization.

# SEE ALSO

[yadm](/man/yadm)(1), [yadm-clone](/man/yadm-clone)(1), [yadm-config](/man/yadm-config)(1), [yadm-encrypt](/man/yadm-encrypt)(1)

