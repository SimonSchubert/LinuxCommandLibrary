# TAGLINE

Shell-based todo.txt task management

# TLDR

**Add a new task**

```todo.sh add "[Buy groceries +shopping @errands]"```

**List all tasks**

```todo.sh list```

**List tasks matching term**

```todo.sh list "[search term]"```

**Mark task as done**

```todo.sh do [1]```

**Set priority on task**

```todo.sh pri [1] [A]```

**Append text to task**

```todo.sh append [1] "[additional text]"```

**Archive completed tasks**

```todo.sh archive```

**Delete a task**

```todo.sh del [1]```

# SYNOPSIS

**todo.sh** [_options_] _action_ [_task_number_] [_task_description_]

# ACTIONS

**add** _text_: Add new task.

**list** _term_: List tasks matching term.

**listall** _term_: List all tasks including completed.

**do** _n_: Mark task n as done.

**pri** _n_ _priority_: Set priority (A-Z) on task n.

**depri** _n_: Remove priority from task n.

**append** _n_ _text_: Append text to task n.

**prepend** _n_ _text_: Prepend text to task n.

**replace** _n_ _text_: Replace task n with new text.

**del** _n_: Delete task n.

**archive**: Move done tasks to done.txt.

**report**: Add open/done counts to report.txt.

**deduplicate**: Remove duplicate lines.

# PARAMETERS

**-f**
> Force actions without confirmation.

**-h**
> Display help.

**-p**
> Plain mode (no colors).

**-a**
> Don't auto-archive done tasks.

**-n**
> Don't preserve line numbers.

**-t**
> Don't prepend date on add.

**-v**
> Verbose mode.

**-V**
> Display version.

**-d** _file_
> Use alternate config file.

# DESCRIPTION

**todo.txt-cli** (todo.sh) is a shell script for managing tasks in a plain text file. It follows the todo.txt format, which uses simple conventions for priorities, projects (+project), contexts (@context), and dates.

Tasks are stored in todo.txt, one per line. Completed tasks are optionally archived to done.txt. The plain text format ensures portability and compatibility with any text editor, sync service, or scripting tool.

The script supports tab completion for priorities, contexts, and projects. Configuration is done through a .todo.cfg file which can customize colors, file locations, and default behaviors.

Install via package manager or Homebrew: `brew install todo-txt`

# CAVEATS

Requires Bash. Task numbers change when tasks are added or deleted. Use archive regularly to maintain consistent numbering. Plain text format means no built-in reminders or dependencies.

# HISTORY

**todo.txt** was created by Gina Trapani as a simple, portable task management system. The format and CLI tool have inspired numerous apps and implementations across platforms. The project emphasizes future-proof, human-readable task storage.

# SEE ALSO

[task](/man/task)(1), [taskwarrior](/man/taskwarrior)(1), [t](/man/t)(1), [remind](/man/remind)(1)
