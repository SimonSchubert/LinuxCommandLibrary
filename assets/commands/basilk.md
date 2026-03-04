# TAGLINE

Terminal kanban board for task management

# TLDR

**Launch** the kanban board

```basilk```

**Show the version** number

```basilk --version```

# SYNOPSIS

**basilk** [**--version**]

# PARAMETERS

**--version**
> Display the version number and exit

# DESCRIPTION

**basilk** is a terminal user interface (TUI) application for managing tasks with minimal kanban logic. It organizes work into projects, each containing tasks that move through three status columns: **Up Next**, **On Going**, and **Done**. Tasks can also be assigned a priority level from 1 (highest) to 3 (lowest), or 0 for no priority. When a task is marked as Done, its priority is automatically reset.

Written in Rust using the ratatui library, basilk provides vim-style navigation throughout. In the projects view, use **j**/**k** or arrow keys to navigate, **n** to create a project, **r** to rename, **d** to delete, and **Enter** to open a project. In the tasks view, **n** creates a task, **r** renames, **d** deletes, **Enter** changes the task status, and **p** changes priority. Press **Esc** or **h** to return to the projects view, and **q** to quit.

Projects display a color-coded completion indicator based on the ratio of done tasks: dark gray at 0%, magenta up to 50%, yellow up to 99%, and green at 100%. All data is stored in a versioned JSON file with automatic schema migration between versions.

# CONFIGURATION

Configuration is stored as a TOML file named **config.toml** in the application data directory. If the file does not exist, it is created automatically with default values.

**[ui]**
> **show_help** = true -- Toggle the help text displayed in the interface

Data is stored in platform-specific directories: **~/.config/basilk** on Linux, **~/Library/Application Support/basilk** on macOS, and **AppData\Roaming\basilk** on Windows.

# CAVEATS

The project is in beta and may contain bugs. The CLI accepts only the **--version** flag; all other interaction happens within the TUI. There is no import or export functionality beyond the internal JSON storage.

# HISTORY

**basilk** was created by **GabAlpha** as an open-source Rust project, dual-licensed under MIT and Apache 2.0. Version 0.2.1 was released in March 2025. It is available via cargo, Homebrew, AUR, and x-cmd.

# SEE ALSO

[taskwarrior](/man/taskwarrior)(1), [todo.sh](/man/todo.sh)(1), [jira](/man/jira)(1), [task](/man/task)(1)
