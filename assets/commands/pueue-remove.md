# TAGLINE

Remove tasks from the pueue queue

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

**pueue remove** deletes specific tasks from the pueue queue by their task IDs. Only queued, stashed, or finished tasks can be removed; running tasks must be killed first with **pueue kill** before removal. Use **pueue clean** to bulk-remove all finished tasks instead.

# CAVEATS

Kill running tasks first. Part of pueue.

# HISTORY

pueue remove provides **task removal** from queue.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-clean](/man/pueue-clean)(1), [pueue-kill](/man/pueue-kill)(1)

