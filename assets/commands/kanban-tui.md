# TAGLINE

Terminal-based Kanban board task manager

# TLDR

**Launch the Kanban board**

```kanban-tui```

**Open a specific board file**

```kanban-tui [path/to/kanban.md]```

# SYNOPSIS

**kanban-tui** [_options_] [_file_]

# DESCRIPTION

**kanban-tui** is a terminal-based Kanban board for managing tasks and projects. It provides a TUI with columns for different task states (To Do, In Progress, Done) and supports creating, editing, moving, and deleting cards with Vim-like key bindings.

The tool uses a file-based structure for data storage, supports nested and linked boards (cards that link to other kanban files), and meta-boards that aggregate multiple project boards into a single master view.

# CAVEATS

File format is specific to the tool. Multiple simultaneous editors on the same file may cause conflicts.

# HISTORY

**kanban-tui** was created by **sokinpui** and is written in **Go**. Several alternative Kanban TUI implementations exist in the ecosystem, including Python-based variants using the Textual framework.

# SEE ALSO

[taskell](/man/taskell)(1), [taskwarrior](/man/taskwarrior)(1)
