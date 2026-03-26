# TAGLINE

VS Code-style search and replace TUI for the terminal

# TLDR

**Launch search and replace in the current directory**

```serpl```

**Search and replace in a specific project directory**

```serpl --project-root [/path/to/project]```

**Show version and config file location**

```serpl --version```

# SYNOPSIS

**serpl** [_--project-root PATH_]

# PARAMETERS

**--project-root** _PATH_
> Specify the project root directory for search operations. Defaults to the current directory.

**--version**
> Display version information and configuration file path.

# DESCRIPTION

**serpl** is a TUI that lets you search and replace text across an entire project folder, mimicking VS Code's search-and-replace experience. It uses **ripgrep** for fast searching and optionally **ast-grep** for syntax-aware matching. It supports multiple search modes (simple, match case, whole word, regex, AST Grep) and replace modes (simple, preserve case) with an interactive preview of changes before committing them. Key bindings are configurable via a **config.json** file.

# CAVEATS

Requires **ripgrep** to be installed. The optional AST Grep mode requires installing with the **ast_grep** feature flag (`cargo install serpl --features ast_grep`).

# HISTORY

**serpl** was created by **Yassine Bridi** (yassinebridi) and is written in **Rust**.

# SEE ALSO

[scooter](/man/scooter)(1), [sed](/man/sed)(1), [rg](/man/rg)(1), [ast-grep](/man/ast-grep)(1)
