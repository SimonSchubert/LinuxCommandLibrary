# TLDR

**Remove task**

```pueue remove [task_id]```

**Remove multiple tasks**

```pueue remove [id1] [id2]```

**Force remove running task**

```pueue kill [task_id] && pueue remove [task_id]```

# SYNOPSIS

**pueue remove** [_options_] _task_ids_

# PARAMETERS

_TASK_IDS_
> Tasks to remove.

# DESCRIPTION

**pueue remove** removes tasks from queue. Deletes finished or queued tasks.

The tool clears specific tasks. Cannot remove running tasks.

pueue remove deletes tasks.

# CAVEATS

Kill running tasks first. Part of pueue.

# HISTORY

pueue remove provides **task removal** from queue.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-clean](/man/pueue-clean)(1), [pueue-kill](/man/pueue-kill)(1)

