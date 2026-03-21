# TAGLINE

Resume paused pueue tasks or groups

# TLDR

**Start paused task**

```pueue start [task_id]```

**Start all tasks**

```pueue start --all```

**Start group**

```pueue start --group [group_name]```

**Start multiple specific tasks**

```pueue start [task_id_1] [task_id_2] [task_id_3]```

# SYNOPSIS

**pueue start** [_options_] [_task_ids_]

# PARAMETERS

**--all**, **-a**
> Start all tasks.

**--group**, **-g** _name_
> Start specific group.

# DESCRIPTION

**pueue start** resumes paused tasks or groups in the pueue task queue. Tasks that were paused with pueue pause can be resumed to continue execution.

# CAVEATS

Tasks must be in a paused or queued state. Use **pueue status** to check task states before starting. The pueue daemon must be running.

# HISTORY

**pueue start** is part of **pueue** by **Arne Beer**, a command-line task manager for sequential and parallel execution.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-pause](/man/pueue-pause)(1), [pueue-add](/man/pueue-add)(1), [pueue-status](/man/pueue-status)(1)
