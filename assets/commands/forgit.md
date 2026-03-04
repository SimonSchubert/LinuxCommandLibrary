# TAGLINE

Interactive git commands with fzf

# TLDR

**Interactive** git log viewer

```forgit log```

**Interactive** git diff viewer

```forgit diff```

**Interactive** git add

```forgit add```

**Interactive** git stash viewer

```forgit stash```

# SYNOPSIS

**forgit** [_command_] [_options_]

# PARAMETERS

**log**
> Interactive git log browser

**diff**
> Interactive diff viewer

**add**
> Interactive staging selector

**reset**
> Interactive unstage selector

**stash**
> Interactive stash viewer

**ignore**
> Interactive .gitignore generator

**clean**
> Interactive clean selector

**rebase**
> Interactive rebase commit selector

**cherry-pick**
> Interactive cherry-pick commit selector

**checkout**> Interactive branch/checkout selector

**branch**> Interactive branch manager

**-h, --help**> Display help and exit

**--version**> Display version and exit

# DESCRIPTION

**forgit** wraps common git commands with interactive fzf interfaces. It provides fuzzy-finding capabilities for git operations like viewing logs, diffs, staging files, and managing branches.

The tool requires fzf to be installed and enhances git workflows by making it easy to search and select from large sets of commits, branches, or files.

# COMMANDS

Each command wraps the git equivalent with an interactive fzf interface:

```
forgit log      → git log with fuzzy search
forgit diff     → git diff with file selection
forgit add      → git add with file picker
forgit stash    → git stash with list picker
forgit checkout → git checkout with branch picker
```

# CAVEATS

Requires fzf to be installed. Terminal must support interactive TUIs. Large repositories may be slow to load. Some commands may not support all git flags.

# HISTORY

**forgit** was created to combine the power of fzf with common git operations, making it easier to navigate large git repositories interactively.

# SEE ALSO

[fzf](https://github.com/junegunn/fzf), [git](https://git-scm.com/), [lazygit](https://github.com/jesseduffield/lazygit)
