# TAGLINE

VS Code-style search and replace TUI for the terminal

# TLDR

**Launch search and replace in the current directory**

```serpl```

**Search in a specific project directory**

```serpl --project-root [/path/to/project]```

# SYNOPSIS

**serpl** [_options_]

# PARAMETERS

**--project-root** _PATH_
> Specify directory for search operations.

# DESCRIPTION

**serpl** is a TUI that lets you search and replace text across an entire project folder, mimicking VS Code's search-and-replace experience. It uses ripgrep for fast searching and optionally ast-grep for syntax-aware matching. It supports multiple search modes (simple, match case, regex, AST Grep) and replace modes (simple, preserve case) with an interactive preview of changes before committing them.

# CAVEATS

Requires **ripgrep** to be installed. The optional AST Grep feature requires building with the **ast_grep** feature flag.

# HISTORY

**serpl** was created by **Yassine Bridi** (yassinebridi) and is written in **Rust**.

# SEE ALSO

[scooter](/man/scooter)(1), [ripgrep](/man/ripgrep)(1), [sed](/man/sed)(1)
