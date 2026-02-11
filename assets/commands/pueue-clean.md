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
> Only successful tasks.

**--group** _NAME_
> Clean specific group.

# DESCRIPTION

**pueue clean** removes finished tasks (both successful and failed) from the pueue task queue, keeping the status display uncluttered. Use **--successful-only** to retain failed tasks for investigation while clearing completed ones.

# CAVEATS

Only removes finished tasks. Part of pueue.

# HISTORY

pueue clean provides **queue cleanup** functionality.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-remove](/man/pueue-remove)(1)

