# TAGLINE

TUI client for the Bluesky social network

# TLDR

**Launch the Bluesky TUI client**

```tuisky```

**Specify a config file**

```tuisky -c [path/to/config.toml]```

**Set maximum number of columns**

```tuisky -n [3]```

**Show version**

```tuisky -V```

# SYNOPSIS

**tuisky** [_options_]

# PARAMETERS

**-c**, **--config** _CONFIG_
> Path to configuration file.

**-n**, **--num-columns** _NUM_
> Maximum number of columns to display (auto-determined by terminal width if not set).

**-h**, **--help**
> Print help.

**-V**, **--version**
> Print version.

# DESCRIPTION

**tuisky** is a terminal user interface client for Bluesky. It features multiple columns, multiple session management, pinned feed selection, auto-refresh, post creation with text and image embedding, notifications and chat, and configurable settings with auto-save and restore.

# HISTORY

**tuisky** was created by **sugyan** and is written in **Rust** using the ratatui TUI framework.

# SEE ALSO

[toot](/man/toot)(1), [servitor](/man/servitor)(1)
