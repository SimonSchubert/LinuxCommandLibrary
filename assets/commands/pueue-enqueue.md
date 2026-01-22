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

**pueue enqueue** adds stashed tasks to queue. Activates paused tasks.

The tool moves tasks from stash. Queues for execution.

pueue enqueue activates tasks.

# CAVEATS

Task must be stashed first. Part of pueue.

# HISTORY

pueue enqueue provides **stash to queue** task movement.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-stash](/man/pueue-stash)(1)

