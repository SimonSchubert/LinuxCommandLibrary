# TAGLINE

TUI for the Jujutsu version control system

# TLDR

**Launch the TUI** in the current repository

```lazyjj```

**Open a specific repository**

```lazyjj -p [path/to/repo]```

# SYNOPSIS

**lazyjj** [_options_]

# DESCRIPTION

**lazyjj** is a TUI for the Jujutsu (jj) version control system. It presents repository history, working files, and bookmarks interactively through three main panels: Log, Files, and Bookmarks.

The interface supports creating, editing, squashing, abandoning, fetching, pushing, describing, and bookmarking changes. The Log tab shows the revset list alongside a panel for viewing color-word and git diffs. It works as a front-end that invokes the **jj** CLI and renders repository state.

# CAVEATS

Requires **jj** version 0.33.0 or higher for compatibility with the template language features used for output parsing.

# HISTORY

**lazyjj** was created by **Cretezy** and is written in **Rust** using the ratatui library.

# SEE ALSO

[jj](/man/jj)(1), [lazygit](/man/lazygit)(1)
