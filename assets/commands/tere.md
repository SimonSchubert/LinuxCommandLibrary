# TAGLINE

Terminal file explorer for fast directory navigation

# TLDR

**Navigate to a directory interactively**

```cd "$(tere)"```

**Use filter mode for search**

```tere --filter-search```

**Auto-enter directories after a timeout**

```tere --autocd-timeout 500```

# SYNOPSIS

**tere** [_options_]

# DESCRIPTION

**tere** provides a TUI for quickly navigating to a directory, then prints the selected path on exit. It is not a file manager -- it only browses folders. Navigation uses arrow keys, Enter, and type-to-search, designed for minimal keystrokes.

# HISTORY

**tere** was created by **Marton Gunyho** (mgunyho) and is written in **Rust**.

# SEE ALSO

[broot](/man/broot)(1), [zoxide](/man/zoxide)(1), [ranger](/man/ranger)(1)
