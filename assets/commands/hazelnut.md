# TAGLINE

Terminal-based automated file organizer

# TLDR

**Launch the TUI** to manage rules

```hazelnut```

**Start the background daemon** to watch folders

```hazelnutd```

**Initialize a new configuration**

```hazelnut init```

# SYNOPSIS

**hazelnut** [_command_] [_options_]

**hazelnutd** [_options_]

# DESCRIPTION

**hazelnut** is a terminal-based automated file organizer inspired by **Hazel** for macOS. It watches folders and organizes files based on user-defined rules. The tool consists of two components: a **TUI** for creating and managing rules interactively, and a **daemon** (hazelnutd) that runs in the background applying rules continuously.

Rules are defined in human-readable **TOML** configuration files and can trigger actions like moving, renaming, archiving, or running custom commands on matched files. The TUI provides real-time monitoring of file organization activity.

# CONFIGURATION

Rules are stored in TOML config files. Each rule specifies a watch folder, file matching conditions (by extension, name pattern, size, age), and actions to perform.

# CAVEATS

The daemon (hazelnutd) is only available on **macOS** and **Linux**; on Windows only the TUI is available. File watching relies on OS-level filesystem notification APIs, which may have limitations on certain filesystems.

# HISTORY

**hazelnut** was created by **Ricardo Dantas** and is written in **Rust** using the **Ratatui** TUI library. It was inspired by the popular macOS automation app Hazel, bringing similar file organization capabilities to the terminal.

# SEE ALSO

[watch](/man/watch)(1), [find](/man/find)(1), [mv](/man/mv)(1)
