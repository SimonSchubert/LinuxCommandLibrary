# TAGLINE

Terminal UI to browse Hacker News

# TLDR

**Launch hackernews-tui** to browse front page stories

```hackernews-tui```

**Browse a specific page** of stories

```hackernews-tui --page [page_type]```

# SYNOPSIS

**hackernews-tui** [_options_]

# DESCRIPTION

**hackernews-tui** is a fast and customizable terminal application for browsing Hacker News. It provides a full TUI with **vim-like key bindings** for navigating stories, comments, and discussions. The application includes a built-in reader view for viewing articles directly in the terminal without a web browser.

It uses the **HN Algolia API** and **HN Official API** to fetch data, supporting front page stories, newest stories, Ask HN, Show HN, and job listings. Stories can be opened in an external browser, and comments are displayed in a threaded view.

# KEY BINDINGS

**j/k** — Move down/up
**Enter** — Open story/comment
**o** — Open link in browser
**b** — Go back
**/** — Search
**q** — Quit

# CONFIGURATION

Configuration is stored in **$XDG_CONFIG_HOME/hackernews-tui/config.toml**. Options include custom key bindings, color themes, and the external browser command.

# CAVEATS

Requires an internet connection to fetch stories. The reader view may not render all web pages perfectly. Rate limiting by the HN API may affect heavy usage.

# HISTORY

**hackernews-tui** was created by **aome510** and is written in **Rust** using the **Cursive** TUI library. It was first released in **2021** to provide a native terminal experience for Hacker News readers.

# SEE ALSO

[circumflex](/man/circumflex)(1), [curl](/man/curl)(1)
