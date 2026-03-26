# TAGLINE

Terminal file explorer for fast directory navigation

# TLDR

**Navigate to a directory interactively**

```cd "$(tere)"```

**Use filter mode to show only matching items**

```cd "$(tere --filter-search)"```

**Auto-enter directories after a timeout (milliseconds)**

```cd "$(tere --autocd-timeout 500)"```

**Enable mouse navigation**

```cd "$(tere --mouse=on)"```

**Sort by modification date and use case-insensitive search**

```cd "$(tere --sort modified --ignore-case)"```

# SYNOPSIS

**tere** [_options_]

# PARAMETERS

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Print version.

**-f**, **--filter-search**
> Show only items matching current search query.

**-F**, **--no-filter-search**
> Show all items while searching (default).

**-S**, **--smart-case**
> Case insensitive for lowercase, sensitive with uppercase (default).

**-i**, **--ignore-case**
> Always ignore case in searches.

**-s**, **--case-sensitive**
> Always enforce case sensitivity.

**-g**, **--gap-search**
> Allow fuzzy matches with gaps from start of name (default).

**-G**, **--gap-search-anywhere**
> Allow fuzzy matches with gaps anywhere in names.

**-n**, **--normal-search**
> Match consecutive characters from start of name.

**-N**, **--normal-search-anywhere**
> Match consecutive characters anywhere in name.

**--files** _MODE_
> File display mode: ignore (default), hide, or match.

**--sort** _ORDER_
> Sort order: name (default), created, or modified.

**--autocd-timeout** _MS_
> Auto-enter directory after MS milliseconds when single match. Use "off" to disable.

**--mouse=on|off**
> Enable or disable mouse navigation (default: off).

**--history-file** _PATH_
> Path to JSON history file.

**--map** _KEY:ACTION_
> Custom keyboard shortcut mapping.

# DESCRIPTION

**tere** provides a TUI for quickly navigating to a directory, then prints the selected path on exit. It is not a file manager -- it only browses folders. Navigation uses arrow keys, Enter, and type-to-search, designed for minimal keystrokes.

# HISTORY

**tere** was created by **Marton Gunyho** (mgunyho) and is written in **Rust**.

# SEE ALSO

[broot](/man/broot)(1), [zoxide](/man/zoxide)(1), [ranger](/man/ranger)(1), [fzf](/man/fzf)(1), [nnn](/man/nnn)(1)
