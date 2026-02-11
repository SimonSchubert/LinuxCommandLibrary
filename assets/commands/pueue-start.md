# TAGLINE

Resume paused pueue tasks or groups

# TLDR

**Start paused task**

```pueue start [task_id]```

**Start all tasks**

```pueue start --all```

**Start group**

```pueue start --group [group_name]```

**Start daemon**

```pueue start-daemon```

# SYNOPSIS

**pueue start** [_options_] [_task_ids_]

# PARAMETERS

**--all**, **-a**
> Start all tasks.

**--group**, **-g** _name_
> Start specific group.

# DESCRIPTION

**pueue start** resumes paused tasks or groups in the pueue task queue. Tasks that were paused with pueue pause can be resumed to continue execution.

# EXAMPLES

```bash
# Start specific task
pueue start 5

# Start all tasks
pueue start --all

# Start tasks in group
pueue start --group encoding

# Start multiple tasks
pueue start 1 2 3

# Start daemon if not running
pueued

# Check status
pueue status
```

# WORKFLOW

```bash
# Add task (starts if not paused)
pueue add command

# Pause for editing
pueue pause 1

# Resume when ready
pueue start 1
```

# CAVEATS

Tasks must be in paused state. Use pueue status to check states. Daemon must be running.

# HISTORY

pueue start is part of **pueue** by **Arne Beer**, a command-line task manager for Linux.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-pause](/man/pueue-pause)(1), [pueue-add](/man/pueue-add)(1)
