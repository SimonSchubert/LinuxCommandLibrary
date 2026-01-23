# TLDR

**Open lazygit** in current repository

```lazygit```

**Open in specific repository**

```lazygit -p [/path/to/repo]```

**Open with specific work tree**

```lazygit -w [/path/to/worktree]```

**Open log file** after session

```lazygit -d```

**Print default config**

```lazygit -c```

**Check version**

```lazygit -v```

# SYNOPSIS

**lazygit** [_options_]

# DESCRIPTION

**lazygit** is a terminal user interface (TUI) for git commands that simplifies common git workflows. It provides visual panels for staging changes, viewing diffs, managing branches, commits, and stashes.

The interface is divided into panels: Status, Files, Branches, Commits, and Stash. Users navigate with keyboard shortcuts, staging files with space, committing with c, and pushing with P. All operations show real-time git command output.

lazygit handles complex operations like interactive rebasing, cherry-picking, and conflict resolution through intuitive interfaces, making git's powerful features more accessible.

# PARAMETERS

**-p** _path_, **--path** _path_
> Repository path to open.

**-f** _path_, **--filter** _path_
> Filter files by path in status panel.

**-g** _path_, **--git-dir** _path_
> Custom git directory.

**-w** _path_, **--work-tree** _path_
> Custom work tree.

**-c**, **--config**
> Print default config.

**-d**, **--debug**
> Run with debug logging.

**-v**, **--version**
> Print version.

# KEYBOARD SHORTCUTS

**Space**: Stage/unstage file or hunk
**c**: Commit staged changes
**P**: Push to remote
**p**: Pull from remote
**b**: Create branch
**m**: Merge branch
**r**: Rebase
**s**: Stash changes
**Tab**: Switch panels
**?**: Show all keybindings
**q**: Quit

# CAVEATS

Requires git to be installed. Some operations modify git history and should be used carefully. Configuration file location varies by OS (~/.config/lazygit/config.yml on Linux).

# HISTORY

**lazygit** was created by **Jesse Duffield** in **2018** to provide an easier way to interact with git from the terminal. Written in Go, it gained popularity quickly among developers who preferred terminal workflows but found raw git commands cumbersome. The project continues active development with features like worktree support and custom commands.

# SEE ALSO

[git](/man/git)(1), [tig](/man/tig)(1), [gitk](/man/gitk)(1), [gitui](/man/gitui)(1)
