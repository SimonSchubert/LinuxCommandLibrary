# TAGLINE

Interactive Git-backed todo list for the terminal

# TLDR

**Launch the interactive TUI**

```yatto```

**Add a task**

```yatto add "[Fix login bug]" --project [myapp] --priority high```

**List open tasks**

```yatto list --status open```

# SYNOPSIS

**yatto** [_command_] [_options_]

# DESCRIPTION

**yatto** is a terminal task manager that stores each task as a JSON file and manages the task directory as a Git or Jujutsu repository. Every change is versioned, enabling sync and collaboration via shared repositories. Supports due dates, priorities, statuses, and markdown descriptions.

# HISTORY

**yatto** was created by **handlebargh** and is written in **Go**.

# SEE ALSO

[taskwarrior](/man/taskwarrior)(1), [todoman](/man/todoman)(1)
