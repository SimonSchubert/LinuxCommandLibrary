# TAGLINE

Send signals to running pueue tasks

# TLDR

**Kill specific task**

```pueue kill [task_id]```

**Kill all running tasks**

```pueue kill --all```

**Kill tasks in group**

```pueue kill --group [group_name]```

**Send specific signal**

```pueue kill --signal [SIGTERM] [task_id]```

# SYNOPSIS

**pueue kill** [_options_] [_task_ids_]

# PARAMETERS

**--all**, **-a**
> Kill all tasks.

**--group**, **-g** _name_
> Target specific group.

**--signal**, **-s** _signal_
> Signal to send.

**--children**, **-c**
> Kill children processes.

# DESCRIPTION

**pueue kill** sends signals to running tasks in the pueue task queue. By default, it sends SIGKILL to terminate tasks immediately.

# EXAMPLES

```bash
# Kill task by ID
pueue kill 5

# Kill all running tasks
pueue kill --all

# Kill group
pueue kill --group compilation

# Send SIGTERM instead
pueue kill --signal SIGTERM 3

# Kill with children
pueue kill --children 7

# Multiple tasks
pueue kill 1 2 3
```

# SIGNALS

```
SIGTERM (15) - Graceful termination
SIGKILL (9)  - Force kill (default)
SIGINT (2)   - Interrupt
SIGSTOP (19) - Stop process
```

# CAVEATS

SIGKILL cannot be caught. Use SIGTERM for graceful shutdown. Part of pueue task manager.

# HISTORY

pueue kill is part of **pueue**, a command-line task manager by **Arne Beer** for managing long-running tasks.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-start](/man/pueue-start)(1), [pueue-pause](/man/pueue-pause)(1), [kill](/man/kill)(1)
