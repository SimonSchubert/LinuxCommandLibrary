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

**pueue pause** pauses task execution. Stops queue processing.

The tool halts task startup. Running tasks continue.

pueue pause stops queue.

# CAVEATS

Running tasks not affected. Part of pueue.

# HISTORY

pueue pause provides **queue pausing** functionality.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-start](/man/pueue-start)(1)

