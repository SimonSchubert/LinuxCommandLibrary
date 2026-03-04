# TAGLINE

Git-powered terminal todo manager

# TLDR

**Add** a new task

```dstask add [task description]```

**List** all tasks

```dstask```

**Mark** a task as done

```dstask done [task_id]```

**View** tasks by context/project

```dstask context [context_name]```

# SYNOPSIS

**dstask** [_command_] [_arguments_]

# PARAMETERS

**-c, --context** _CONTEXT_
> Set context filter

**-p, --project** _PROJECT_
> Set project filter

**-P, --priority** _PRIORITY_
> Set priority: low, medium, high, critical

**-t, --tag** _TAG_
> Add tag to task

**-n, --note** _NOTE_
> Add note to task

**--due** _DATE_
> Set due date (YYYY-MM-DD)

**-v, --verbose**
> Enable verbose output

**-h, --help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**dstask** is a task manager that stores todos in a Git repository, allowing for version control, synchronization across devices, and offline access. It follows the Getting Things Done (GTD) methodology with support for contexts, projects, and priorities.

Tasks are stored as simple text files in a Git repository, making them portable and avoiding vendor lock-in. The tool provides a clean command-line interface for managing tasks without unnecessary complexity.

# COMMANDS

**add** _TASK_
> Add a new task

**edit** _ID_
> Edit an existing task

**done** _ID_
> Mark task as completed

**rm** _ID_
> Remove a task

**list**
> List tasks (default command)

**next**
> Show next actionable task

**context** _CONTEXT_
> Switch to context

**project** _PROJECT_
> Switch to project view

**sync**
> Sync with remote Git repository

**undo**
> Undo last action

# CAVEATS

Requires Git to be initialized and configured. Remote sync requires valid Git remote. Task IDs are internal references, not stable across operations. Complex recurring tasks not natively supported.

# HISTORY

**dstask** was created by Cody Chan as a task manager that embraces plain-text storage and Git for synchronization. It was inspired by todo.txt but adds Git integration and a more modern interface.

# SEE ALSO

[git](/man/git)(1), [todo.txt](/man/todo.txt)(1), [task](/man/task)(1), [org-mode](/man/org-mode)(1)