# TAGLINE

Terminal-based sequence editor for git interactive rebase

# TLDR

**Use** as git sequence editor

```git rebase -i HEAD~5```

**Configure** as default editor

```git config --global sequence.editor interactive-rebase-tool```

# SYNOPSIS

**interactive-rebase-tool** [_options_] [_todo-file_]

# PARAMETERS

**--version**
> Display version and exit

**--help**
> Display help and exit

# DESCRIPTION

**interactive-rebase-tool** is a full-featured terminal-based sequence editor for git interactive rebase. It provides a visual interface for editing rebase todo files with features like syntax highlighting, undo/redo, and visual indicators.

The tool makes it easier to manage complex rebases by providing a clear view of commits and their operations (pick, squash, fixup, reword, edit, drop, etc.).

# KEYBINDINGS

**↑/↓** or **k/j**
> Navigate commits

**p**
> Pick commit

**r**
> Reword commit

**e**
> Edit commit

**s**
> Squash commit

**f**
> Fixup commit

**d**
> Drop commit

**gg**
> Go to first line

**G**
> Go to last line

**q**
> Quit and save

**Ctrl+C**
> Abort rebase

# CAVEATS

Must be configured as Git's sequence editor. Terminal must support required escape sequences. Large rebase operations may require scrolling.

# HISTORY

**interactive-rebase-tool** was created to improve the git interactive rebase experience by providing a visual editor instead of editing todo files manually.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git](/man/git)(1), [vim](/man/vim)(1)