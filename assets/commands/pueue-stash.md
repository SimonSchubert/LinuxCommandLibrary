# TAGLINE

Move pueue tasks to stashed state

# TLDR

**Stash a queued task**

```pueue stash [task_id]```

**Stash multiple tasks**

```pueue stash [id1] [id2] [id3]```

**Stash all tasks in a group**

```pueue stash --group [group_name]```

**Unstash (enqueue) a stashed task**

```pueue enqueue [task_id]```

**Add a new task directly to stash**

```pueue add --stashed "[command]"```

# SYNOPSIS

**pueue stash** [_options_] [_task_ids_...]

# PARAMETERS

_task_ids_
> One or more task IDs to stash.

**--group** _name_
> Stash all tasks in the specified group.

**--all**
> Stash all queued tasks.

# DESCRIPTION

**pueue stash** moves queued tasks to a stashed state, preventing them from being automatically started. Stashed tasks remain in pueue but won't run until explicitly enqueued with **pueue enqueue**. This is useful for preparing tasks to run later or temporarily holding tasks without losing them.

# STASH VS PAUSE

```
Stash  - Remove from queue entirely, won't auto-start
Pause  - Stop execution but keep in queue position
```

# CAVEATS

Stashed tasks do not maintain their original queue position when re-enqueued. Only queued (not running) tasks can be stashed.

# HISTORY

pueue stash is part of **pueue** by **Arne Beer** for managing task queue states.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-enqueue](/man/pueue-enqueue)(1), [pueue-add](/man/pueue-add)(1), [pueue-status](/man/pueue-status)(1)
