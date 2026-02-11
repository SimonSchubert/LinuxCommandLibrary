# TAGLINE

Move stashed tasks into the pueue queue

# TLDR

**Enqueue stashed task**

```pueue enqueue [task_id]```

**Enqueue multiple tasks**

```pueue enqueue [id1] [id2] [id3]```

**Enqueue with delay**

```pueue enqueue --delay "[30min]" [task_id]```

# SYNOPSIS

**pueue enqueue** [_options_] _task_ids_

# PARAMETERS

_TASK_IDS_
> Task IDs to enqueue.

**--delay** _DURATION_
> Delay before execution.

# DESCRIPTION

**pueue enqueue** moves stashed tasks into the active queue for execution. Tasks that were added with **--stashed** or moved to stash with **pueue stash** can be activated with this command. An optional **--delay** defers execution by a specified duration.

# CAVEATS

Task must be stashed first. Part of pueue.

# HISTORY

pueue enqueue provides **stash to queue** task movement.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-stash](/man/pueue-stash)(1)

