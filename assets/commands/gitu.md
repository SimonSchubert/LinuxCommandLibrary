# TAGLINE

TUI Git client inspired by Magit

# TLDR

**Launch** gitu in current repository

```gitu```

**Open** specific file

```gitu [filename]```

**Start** in specific directory

```gitu [directory]```

# SYNOPSIS

**gitu** [_options_] [_path_]

# PARAMETERS

**-c, --config** _FILE_
> Configuration file path

**--log-level** _LEVEL_
> Set logging level

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gitu** is a terminal user interface for Git inspired by Magit (Emacs). It provides a keyboard-driven interface for common Git operations with visual staging, committing, branching, and rebasing.

The tool shows the repository status with sections for staged/unstaged changes, branches, and recent commits, making it easy to perform complex Git operations without memorizing commands.

# KEYBINDINGS

**s**
> Stage file/hunk

**u**
> Unstage file/hunk

**c**
> Commit

**b**
> Branch menu

**r**
> Rebase menu

**l**
> Log view

**d**
> Diff view

**p**
> Push

**P**
> Pull

**q**
> Quit

**?**
> Help

# CAVEATS

Requires Git repository. Some advanced Git features may not be supported. Large repositories may have performance issues.

# HISTORY

**gitu** was inspired by Magit and created to bring similar functionality to a standalone terminal application.

# SEE ALSO

[git](/man/git)(1), [lazygit](https://github.com/jesseduffield/lazygit), [magit](https://magit.vc/)