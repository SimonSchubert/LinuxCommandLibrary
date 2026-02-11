# TAGLINE

Plain-text todo.txt task manager

# TLDR

**Add task**

```todo.sh add "[task text]"```

**List all tasks**

```todo.sh list```

**List by priority**

```todo.sh listpri [A]```

**Mark done**

```todo.sh do [item-number]```

**Add priority**

```todo.sh pri [item-number] [A]```

**Archive completed**

```todo.sh archive```

# SYNOPSIS

**todo.sh** _command_ [_options_] [_args_]

# PARAMETERS

**add**
> Add task.

**list**, **ls**
> List tasks.

**listpri**, **lsp**
> List by priority.

**do**
> Complete task.

**pri**
> Set priority.

**archive**
> Archive done.

# DESCRIPTION

**todo.sh** is a shell script for managing tasks in the todo.txt plain text format created by Gina Trapani. Tasks are stored one per line with support for priorities (A-Z), project tags (+project), and context tags (@context), making the file both human-readable and easily parseable.

The tool provides commands for adding, completing, prioritizing, and archiving tasks. Completed items can be moved to a done.txt archive to keep the active list clean. The plain text format ensures portability and compatibility with any text editor or sync service.

# CAVEATS

Bash required. todo.txt format. Configuration file needed.

# HISTORY

**todo.sh** was created by **Gina Trapani** as part of the todo.txt format for simple, plain-text task management.

# SEE ALSO

[task](/man/task)(1), [todoman](/man/todoman)(1), [taskwarrior](/man/taskwarrior)(1)
