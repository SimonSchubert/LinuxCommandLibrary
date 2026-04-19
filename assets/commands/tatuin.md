# TAGLINE

Task aggregator TUI for multiple providers

# TLDR

**Launch the task aggregation TUI**

```tatuin```

**Use a custom configuration file**

```tatuin --config [path/to/config]```

# SYNOPSIS

**tatuin** [_options_]

# DESCRIPTION

**tatuin** aggregates tasks from multiple providers into a single terminal interface. Supported providers include **Todoist** and **Obsidian** (full create/read/update/delete), **CalDAV** (full CRUD), **GitLab TODOs** (list and status updates), and **GitHub Issues** and **iCal** (read-only). Features include task filtering, status updates, saveable UI state, keyboard shortcuts (e.g., `a` to add, `e` to edit), and custom themes.

Obsidian integration requires the "Local REST API" plugin to be installed in your Obsidian vault.

# HISTORY

**tatuin** was created by **Konnov Konstantin** (panter-dsd) and is written in **Rust**.

# SEE ALSO

[taskwarrior](/man/taskwarrior)(1), [todoist](/man/todoist)(1), [tui-journal](/man/tui-journal)(1)
