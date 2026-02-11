# TAGLINE

Command-line task queue manager

# TLDR

**Add command to queue**

```pueue add [command]```

**List tasks**

```pueue status```

**Start processing queue**

```pueue start```

**Pause queue**

```pueue pause```

**Remove task**

```pueue remove [task_id]```

**Follow task output**

```pueue follow [task_id]```

# SYNOPSIS

**pueue** _command_ [_options_]

# PARAMETERS

**add** _CMD_
> Add task.

**status**
> Show queue status.

**start**
> Start queue.

**pause**
> Pause queue.

**remove** _ID_
> Remove task.

**follow** _ID_
> Follow output.

**log** _ID_
> Show task log.

**kill** _ID_
> Kill task.

# DESCRIPTION

**pueue** is a command-line task queue manager that schedules and runs shell commands sequentially or in parallel in the background. Tasks are added to a queue and executed by the **pueued** daemon, which persists across terminal sessions and system reboots.

The tool provides task lifecycle management including pausing, resuming, killing, and restarting tasks. Task output is captured and can be followed in real time with **follow** or reviewed later with **log**. Groups allow organizing tasks into separate queues with independent parallelism settings.

# CONFIGURATION

**~/.config/pueue/pueue.yml**
> Client and daemon configuration file defining default parallelism, callback commands, and daemon socket path.

# CAVEATS

Requires pueued daemon. Persistent across sessions.

# HISTORY

Pueue was created for **managing long-running** shell commands.

# SEE ALSO

[nohup](/man/nohup)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)

