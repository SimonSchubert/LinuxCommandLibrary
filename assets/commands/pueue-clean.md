# TAGLINE

Remove finished tasks from pueue queue

# TLDR

**Clean finished tasks**

```pueue clean```

**Clean successful tasks only**

```pueue clean --successful-only```

**Clean specific group**

```pueue clean --group [group]```

# SYNOPSIS

**pueue clean** [_options_]

# PARAMETERS

**--successful-only**
> Only remove successfully finished tasks, keeping failed tasks for investigation.

**--group** _NAME_
> Only clean tasks of a specific group.

# DESCRIPTION

**pueue clean** removes finished tasks (both successful and failed) from the pueue task queue, keeping the status display uncluttered. Use **--successful-only** to retain failed tasks for investigation while clearing completed ones.

# CAVEATS

Only removes finished tasks (both successful and failed by default). Running and queued tasks are never affected. Part of pueue.

# HISTORY

**pueue** is written by **Arne Beer** (Nukesor) in **Rust**. The **clean** subcommand provides queue cleanup functionality to keep the task list uncluttered.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-remove](/man/pueue-remove)(1), [pueue-status](/man/pueue-status)(1), [pueue-log](/man/pueue-log)(1)

