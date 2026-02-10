# TAGLINE

terminal user interface for git commands that simplifies common git workflows

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

**lazygit** is a terminal user interface (TUI) for Git that replaces sequences of typed commands with visual, keyboard-driven panels. Its split-pane layout presents Status, Files, Branches, Commits, and Stash side by side, letting you stage individual files or hunks with a single keypress, review diffs inline, and commit without leaving the interface.

Beyond everyday staging and committing, lazygit makes Git's more advanced operations approachable. Interactive rebasing is handled through a visual commit list where entries can be reordered, squashed, or edited in place. Cherry-picking is a matter of tagging commits and pasting them onto another branch. Merge conflict resolution displays conflicting sections with one-key choices for each side. Branch management, remote operations (push, pull, fetch), and stash manipulation are all accessible from their respective panels with contextual menus that surface the available actions. A customizable configuration file allows user-defined keybindings and custom command shortcuts.

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
