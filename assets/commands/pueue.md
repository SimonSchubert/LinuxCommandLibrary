# TAGLINE

Command-line task queue manager

# TLDR

**Add a command to the queue**

```pueue add -- [command]```

**Add a task to a specific group**

```pueue add -g [group_name] -- [command]```

**List all tasks and their status**

```pueue status```

**Start processing the queue** or resume a specific task

```pueue start [task_id]```

**Pause the queue** or a specific task

```pueue pause [task_id]```

**Follow task output** in real time

```pueue follow [task_id]```

**Show the output log** of a task

```pueue log [task_id]```

**Remove a finished task** from the list

```pueue remove [task_id]```

**Kill a running task**

```pueue kill [task_id]```

**Restart a failed or finished task**

```pueue restart [task_id]```

# SYNOPSIS

**pueue** _command_ [_options_]

# PARAMETERS

**add** [_options_] **--** _CMD_
> Add a task to the queue. Use **-g** _group_ to assign to a group, **-d** to start in paused state, **-a** _ID_ to add a dependency on another task, **-l** _label_ to assign a label.

**status** [_-j_]
> Show queue status. Use **-j** for JSON output.

**start** [_ID_]
> Resume a specific paused task, or start the entire default group if no ID given.

**pause** [_ID_]
> Pause a specific task, or the entire default group if no ID given.

**remove** _ID_
> Remove a task from the list (only finished or queued tasks).

**follow** _ID_
> Stream task output in real time.

**log** [_ID_]
> Show captured output of finished tasks.

**kill** [_ID_]
> Kill a running task or all tasks in a group.

**restart** _ID_
> Restart a finished or failed task.

**clean**
> Remove all finished tasks from the list.

**reset**
> Kill all tasks and remove everything.

**group** [_add_|_remove_] _name_
> Manage task groups. Groups allow independent parallel queues.

**parallel** _N_ [_-g group_]
> Set the number of tasks that run in parallel (default: 1).

# DESCRIPTION

**pueue** is a command-line task queue manager that schedules and runs shell commands sequentially or in parallel in the background. Tasks are added to a queue and executed by the **pueued** daemon, which persists across terminal sessions and system reboots.

The tool provides task lifecycle management including pausing, resuming, killing, and restarting tasks. Task output is captured and can be followed in real time with **follow** or reviewed later with **log**. Groups allow organizing tasks into separate queues with independent parallelism settings.

# CONFIGURATION

**~/.config/pueue/pueue.yml**
> Client and daemon configuration file defining default parallelism, callback commands, and daemon socket path.

# CAVEATS

Requires the **pueued** daemon to be running. Start it with **pueued -d** (daemonized). Task state persists across terminal sessions and daemon restarts.

# HISTORY

Pueue (German for "queue") was created by **Arne Beer** for managing long-running shell commands in the background. Written in Rust.

# SEE ALSO

[nohup](/man/nohup)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1), [at](/man/at)(1), [batch](/man/batch)(1), [task](/man/task)(1)

