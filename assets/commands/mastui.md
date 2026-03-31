# TAGLINE

Modern Mastodon TUI client for the terminal

# TLDR

**Launch the Mastodon client**

```mastui```

**Log in to a Mastodon instance**

```mastui login```

**Select a theme**

```mastui theme```

# SYNOPSIS

**mastui** [_options_]

# PARAMETERS

**login**
> Authenticate with a Mastodon instance.

**theme**
> Select a UI theme.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**mastui** is a fast, modern TUI client for Mastodon built with Python and Textual. It displays multi-column timelines (Home, Notifications, Federated) with persistent caching for smooth scrolling.

Features include in-terminal image viewing (ANSI/Sixel/TGP), multiple light and dark themes, configurable per-timeline refresh intervals, a full-screen post composer with content warnings and language selection, and poll creation and management.

# CAVEATS

Requires a Mastodon account and API access token. Image display capabilities depend on terminal emulator support.

# HISTORY

**mastui** was created by **kimusan** and is written in **Python** using the Textual framework.

# SEE ALSO

[toot](/man/toot)(1)
