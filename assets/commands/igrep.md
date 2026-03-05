# TAGLINE

Interactive grep with TUI for browsing results

# TLDR

**Search for a pattern** in the current directory

```igrep "[pattern]"```

**Search in a specific directory**

```igrep "[pattern]" [path/to/directory]```

**Search case-insensitively**

```igrep -i "[pattern]"```

**Search hidden files**

```igrep --hidden "[pattern]"```

**Filter by file type**

```igrep -t [rust] "[pattern]"```

**Open results in a specific editor**

```igrep --editor [nvim] "[pattern]"```

# SYNOPSIS

**igrep** [**-i**] [**--hidden**] [**-t** _type_] [**--editor** _editor_] _pattern_ [_path_]

# DESCRIPTION

**igrep** (Interactive Grep) runs **ripgrep** in the background and provides a TUI to interactively browse search results. When you select a match, it opens the file at the matching line in your text editor of choice (Vim by default). Supported editors include Vim, Neovim, nano, VS Code, Emacs, Helix, Sublime Text, Micro, and various JetBrains IDEs.

The interface allows filtering, sorting, and navigating through results with keyboard shortcuts, making it efficient for exploring large codebases.

# CAVEATS

Requires ripgrep (rg) as a dependency for the search backend. Editor integration depends on the editor supporting line-number arguments.

# HISTORY

**igrep** was created by **konradsz** and is written in **Rust**. It was designed to bridge the gap between grep's search capabilities and editor integration, providing a visual selection layer.

# SEE ALSO

[grep](/man/grep)(1), [rg](/man/rg)(1), [fzf](/man/fzf)(1)
