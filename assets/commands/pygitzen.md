# TAGLINE

Python-native terminal-based Git client inspired by LazyGit

# TLDR

**Launch the Git TUI in the current repository**

```pygitzen```

Open a **specific repository**

```pygitzen [path/to/repo]```

# SYNOPSIS

**pygitzen** [_options_] [_path_]

# PARAMETERS

_path_
> Path to a Git repository. Default: the current directory.

**--no-cython**
> Force Python-only mode, disabling the Cython extension.

**-h**, **--help**
> Show help.

# DESCRIPTION

**pygitzen** is a terminal-based Git client with a multi-panel interface displaying status, staged changes, unstaged changes, branches, commits, patches, stash, and a command log. It supports branch-aware commit filtering, push status indicators, and customizable keybindings via TOML configuration files. Navigation uses vim-style keys, **Tab** cycles panels, **r** refreshes and **q** quits.

It uses the dulwich library, so core operations do not need the **git** command.

# CONFIGURATION

**~/.config/pygitzen/keybindings.toml**
> Custom keybindings.

# CAVEATS

Must be run on a Git repository.

# HISTORY

**pygitzen** was created by **SunnyTamang** and is written in **Python**.

# SEE ALSO

[lazygit](/man/lazygit)(1), [git](/man/git)(1), [gitui](/man/gitui)(1)

# RESOURCES

```[Source code](https://github.com/SunnyTamang/pygitzen)```

<!-- verified: 2026-11-09 -->
