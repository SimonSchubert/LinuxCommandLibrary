# TAGLINE

Swap queue positions of two pueue tasks

# TLDR

**Switch task positions in queue**

```pueue switch [task_id1] [task_id2]```

# SYNOPSIS

**pueue** **switch** _task_id_1_ _task_id_2_

# DESCRIPTION

**pueue switch** swaps the queue positions of two tasks. Both tasks must be in queued or stashed state (not running or completed). Useful for reordering task execution priority without removing and re-adding tasks.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-status](/man/pueue-status)(1), [pueue-enqueue](/man/pueue-enqueue)(1), [pueue-stash](/man/pueue-stash)(1)

