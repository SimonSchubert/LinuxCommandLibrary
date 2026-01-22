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

**pueue** is a command-line task manager. Queue and manage shell commands.

The tool runs tasks sequentially or in parallel. Background process manager.

pueue queues tasks.

# CAVEATS

Requires pueued daemon. Persistent across sessions.

# HISTORY

Pueue was created for **managing long-running** shell commands.

# SEE ALSO

[nohup](/man/nohup)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)

