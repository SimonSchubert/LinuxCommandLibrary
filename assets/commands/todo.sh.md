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

**todo.sh** manages todo.txt files. It's Gina Trapani's system.

Plain text format. Human readable.

Priority support. (A), (B), (C).

Project and context tags. @context +project.

Shell script. Portable and simple.

# CAVEATS

Bash required. todo.txt format. Configuration file needed.

# HISTORY

**todo.sh** was created by **Gina Trapani** as part of the todo.txt format for simple, plain-text task management.

# SEE ALSO

[task](/man/task)(1), [todoman](/man/todoman)(1), [taskwarrior](/man/taskwarrior)(1)
