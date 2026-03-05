# TAGLINE

Keyboard-driven task manager for the command line

# TLDR

**Launch the task manager**

```omm```

**Import tasks from stdin**

```echo "[task]" | omm import```

**Use a specific editor** for task details

```omm --editor [editor]```

# SYNOPSIS

**omm** [_command_] [_options_]

# DESCRIPTION

**omm** (on-my-mind) is a keyboard-driven task manager for the terminal. It is designed around the idea that you typically focus on one task at a time and priorities frequently change, so it lets you quickly reorder tasks with simple keystrokes.

The TUI includes views for active and archived tasks, task bookmarks, context and details panes, and a task entry/update interface. It supports compact and spacious display modes and customizable themes.

# CAVEATS

Tasks are stored locally. No built-in sync or collaboration features.

# HISTORY

**omm** was created by **dhth** and is written in **Go**.

# SEE ALSO

[taskwarrior](/man/taskwarrior)(1), [todo.txt](/man/todo.txt)(1)
