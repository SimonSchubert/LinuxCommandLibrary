# TAGLINE

Pause pueue task queue processing

# TLDR

**Pause all tasks**

```pueue pause```

**Pause specific task**

```pueue pause [task_id]```

**Pause group**

```pueue pause --group [group]```

**Wait for current to finish**

```pueue pause --wait```

# SYNOPSIS

**pueue pause** [_options_] [_task_ids_]

# PARAMETERS

_TASK_IDS_
> Tasks to pause.

**--group** _NAME_
> Pause specific group.

**--wait**
> Wait for running tasks.

**--all**
> Pause all groups.

# DESCRIPTION

**pueue pause** pauses the task queue, preventing new tasks from starting. Currently running tasks continue to completion unless individually paused. Use **--wait** to let running tasks finish before pausing takes effect, or **--group** to pause only a specific task group.

# CAVEATS

Running tasks not affected. Part of pueue.

# HISTORY

pueue pause provides **queue pausing** functionality.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-start](/man/pueue-start)(1)

