# TAGLINE

TUI for browsing lobste.rs in the terminal

# TLDR

**Launch the lobste.rs browser**

```lobtui```

# SYNOPSIS

**lobtui** [_options_]

# DESCRIPTION

**lobtui** is a terminal user interface for browsing the lobste.rs website. It fetches the site feed and displays article titles in a scrollable list with topic tags.

Navigation uses vim-like keybindings: **n** for next page, **p** for previous, **r** to reload, **gg** to jump to top, **G** to jump to bottom, and **o** to open articles in a browser.

# CAVEATS

Requires an internet connection to fetch the lobste.rs feed. Opening articles launches an external browser.

# HISTORY

**lobtui** was created by **pythops** and is written in **Rust**.

# SEE ALSO

[hackernews-tui](/man/hackernews-tui)(1)
