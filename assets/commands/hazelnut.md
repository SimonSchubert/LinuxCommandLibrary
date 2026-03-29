# TAGLINE

Terminal-based automated file organizer

# TLDR

**Launch the TUI to manage rules**

```hazelnut```

**Start the background daemon to watch folders**

```hazelnutd```

**Initialize a new configuration**

```hazelnut init```

**List all configured rules**

```hazelnut list```

**Dry-run rules on a directory**

```hazelnut run --dir [~/Downloads]```

**Apply rules on a directory**

```hazelnut run --dir [~/Downloads] --apply```

**Use a custom config file**

```hazelnut --config [path/to/config.toml]```

# SYNOPSIS

**hazelnut** [_command_] [_options_]

**hazelnutd** [_options_]

# PARAMETERS

**init**
> Initialize a new configuration file.

**list**
> List all configured rules.

**run**
> Dry-run or apply rules on a directory.

**update**
> Check for updates.

**--config** _path_
> Specify a custom config file.

**--dir** _path_
> Specify a directory to process (used with run).

**--apply**
> Apply rules instead of dry-running (used with run).

# DESCRIPTION

**hazelnut** is a terminal-based automated file organizer inspired by **Hazel** for macOS. It watches folders and organizes files based on user-defined rules. The tool consists of two components: a **TUI** for creating and managing rules interactively, and a **daemon** (hazelnutd) that runs in the background applying rules continuously.

Rules are defined in human-readable **TOML** configuration files and can trigger actions like moving, copying, renaming, archiving, deleting, trashing, or running custom commands on matched files. Matching conditions include file extension, name pattern, size, and age.

# CONFIGURATION

Rules are stored in TOML config files. Each rule specifies a watch folder, file matching conditions (by extension, name pattern, size, age), and actions to perform. Multiple rules can match the same file and all matching rules execute in order.

# CAVEATS

The daemon (hazelnutd) is only available on **macOS** and **Linux**; on Windows only the TUI is available. File watching relies on OS-level filesystem notification APIs, which may have limitations on certain filesystems.

# HISTORY

**hazelnut** was created by **Ricardo Dantas** and is written in **Rust** using the **Ratatui** TUI library. It was inspired by the popular macOS automation app Hazel, bringing similar file organization capabilities to the terminal.

# SEE ALSO

[watch](/man/watch)(1), [find](/man/find)(1), [mv](/man/mv)(1)
