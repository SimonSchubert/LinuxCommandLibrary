# TAGLINE

TUI for reviewing diffs with inline annotations

# TLDR

**Review uncommitted changes** in the current repository

```revdiff```

**Review changes** against a specific branch

```revdiff [main]```

**Review only staged** changes

```revdiff --staged```

**Review the last commit**

```revdiff HEAD~1```

**Browse all** git-tracked files in the project

```revdiff --all-files```

**Review changes** between two refs

```revdiff [main] [feature]```

**Include only** files matching a path prefix

```revdiff --include [src/api/]```

**Review content** piped from stdin

```echo "[text]" | revdiff --stdin```

# SYNOPSIS

**revdiff** [_options_] [_base_] [_against_]

# PARAMETERS

**--staged**
> Show staged changes only

**-A, --all-files**
> Browse all git-tracked files, not just changed ones

**--stdin**
> Review content from stdin as a scratch buffer

**--stdin-name** _name_
> Synthetic filename for stdin content (default: scratch-buffer)

**-I, --include** _prefix_
> Include only files matching path prefix

**-X, --exclude** _prefix_
> Exclude files matching path prefix

**-F, --only** _path_
> Show only specific files by path

**-o, --output** _file_
> Write annotations to file instead of stdout

**--tree-width** _n_
> File tree panel width in units 1-10 (default: 2)

**--tab-width** _n_
> Spaces per tab character (default: 4)

**--wrap**
> Enable line wrapping in diff view

**--collapsed**
> Start with diffs collapsed

**--line-numbers**
> Show line numbers in gutter

**--blame**
> Show blame gutter on startup

**--word-diff**
> Highlight intra-line word changes

**--cross-file-hunks**
> Allow navigation across file boundaries

**--no-colors**
> Disable all colors and syntax highlighting

**--no-status-bar**
> Hide the status bar

**--no-confirm-discard**
> Skip confirmation when discarding annotations

**--chroma-style** _theme_
> Syntax highlighting theme (default: catppuccin-macchiato)

**--theme** _name_
> Load color theme from config directory

**--config** _path_
> Path to config file (default: ~/.config/revdiff/config)

**--keys** _path_
> Path to keybindings file

**-V, --version**
> Show version information

# DESCRIPTION

**revdiff** is a terminal user interface for reviewing diffs, files, and documents with inline annotations. It provides a two-pane layout with a file tree on the left and a colorized diff viewport on the right, supporting navigation, annotation, and syntax highlighting.

Annotations can be placed on any line in the diff — added, removed, or context lines — as well as file-level notes. On quit, annotations are output as structured text to stdout (or a file with **-o**), making it straightforward to pipe results into AI agents, scripts, or other tools.

revdiff auto-detects the version control system and works with both **Git** and **Mercurial** repositories. It supports diffs, blame, and untracked file listing across both backends. When a diff contains exactly one file, the tree pane is automatically hidden.

# CONFIGURATION

Configuration is stored in **~/.config/revdiff/config** using INI format. Keybindings are configured in **~/.config/revdiff/keybindings**. Environment variables and CLI flags override config values. Review history is auto-saved to **~/.config/revdiff/history/**.

# CAVEATS

Requires **git** or **hg** for generating diffs unless using **--only** or **--stdin** mode. Terminal overlay functionality for AI agent integration depends on terminal multiplexer support (tmux, Zellij, kitty, wezterm). Discarding annotations with **Q** does not save review history.

# HISTORY

revdiff was created by **Umputun** and written in **Go**. It was developed as a TUI code review tool designed to integrate with AI coding agents like Claude Code, Codex, and OpenCode, outputting structured annotations that agents can process programmatically.

# SEE ALSO

[diff](/man/diff)(1), [git](/man/git)(1), [tig](/man/tig)(1), [delta](/man/delta)(1)
