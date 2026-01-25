# TLDR

**Stash task**

```pueue stash [task_id]```

**Stash multiple tasks**

```pueue stash [id1] [id2] [id3]```

**Unstash (enqueue) task**

```pueue enqueue [task_id]```

**Add task directly to stash**

```pueue add --stashed [command]```

# SYNOPSIS

**pueue stash** [_task_ids_]

# PARAMETERS

**task_ids**
> Tasks to stash.

# DESCRIPTION

**pueue stash** moves tasks to a stashed state, removing them from the queue. Stashed tasks won't run until explicitly enqueued. Useful for preparing tasks to run later.

# EXAMPLES

```bash
# Stash task
pueue stash 5

# Stash multiple
pueue stash 1 2 3

# Add as stashed
pueue add --stashed "long-running-command"

# Enqueue when ready
pueue enqueue 5

# View stashed tasks
pueue status
```

# WORKFLOW

```bash
# Prepare tasks
pueue add --stashed "backup database"
pueue add --stashed "compress logs"
pueue add --stashed "upload files"

# Start when ready
pueue enqueue --all
```

# STASH VS PAUSE

```
Stash  - Remove from queue entirely
Pause  - Stop but keep in queue position
```

# CAVEATS

Stashed tasks don't maintain queue position. Use enqueue to re-add to queue.

# HISTORY

pueue stash is part of **pueue** by **Arne Beer** for managing task queue states.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-enqueue](/man/pueue-enqueue)(1), [pueue-add](/man/pueue-add)(1)
