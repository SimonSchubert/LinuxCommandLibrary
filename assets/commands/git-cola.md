# TAGLINE

Graphical Git client GUI

# TLDR

**Launch Git Cola**

```git cola```

**Open with specific repository**

```git cola [path/to/repo]```

**Open in amend mode**

```git cola --amend```

**Open specific dialog**

```git cola stash```

# SYNOPSIS

**git** **cola** [_options_] [_path_]

# PARAMETERS

**--amend**
> Start in amend mode.

**--version**
> Show version.

**--prompt**
> Prompt for repository.

# DESCRIPTION

**git cola** is a feature-rich graphical Git client built with Python and Qt. It provides a user-friendly visual interface for common Git operations including staging hunks, committing changes, viewing diffs, managing branches, and browsing repository history.

The tool features a file browser, diff viewer with syntax highlighting, commit message editor with spell checking, and interactive staging that allows selecting specific lines or hunks to stage. Git Cola also includes specialized dialogs for stashing, branching, merging, and other advanced operations.

Unlike simpler Git GUIs, Git Cola is designed for power users who want visual tools without sacrificing control. It complements command-line workflows and runs on Linux, macOS, and Windows. The interface is highly customizable with configurable key bindings, themes, and layout options.

# CONFIGURATION

**~/.config/git-cola/**
> User settings including window layout, theme preferences, and key bindings.

# SEE ALSO

[git-dag](/man/git-dag)(1), [gitk](/man/gitk)(1)

