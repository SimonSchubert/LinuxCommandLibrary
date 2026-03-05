# TAGLINE

Interactive TUI for managing Homebrew packages

# TLDR

**Launch the Homebrew TUI browser**

```taproom```

**Start with only installed packages shown**

```taproom --filters installed```

**Sort by name and hide the help bar**

```taproom --sort-column name --hide-help```

# SYNOPSIS

**taproom** [_options_]

# DESCRIPTION

**taproom** is a terminal user interface for Homebrew that lets you browse, search, install, remove, and view dependencies of formulae and casks. It displays packages in searchable tables with real-time filtering, status indicators, and recursive dependency visualization.

# CAVEATS

Requires Homebrew to be installed.

# HISTORY

**taproom** was created by **Johnny Huang** (hzqtc) and is written in **Go**.

# SEE ALSO

[brew](/man/brew)(1), [stew](/man/stew)(1), [nix](/man/nix)(1)
