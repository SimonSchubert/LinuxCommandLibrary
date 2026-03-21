# TAGLINE

Edit queued pueue task properties

# TLDR

**Edit a task's command** in your default editor

```pueue edit [task_id]```

**Edit a task's working directory**

```pueue edit --path [task_id]```

**Edit a task's label**

```pueue edit --label [task_id]```

**Edit a task's priority**

```pueue edit --priority [task_id]```

**Edit multiple tasks at once**

```pueue edit [task_id1] [task_id2]```

# SYNOPSIS

**pueue** **edit** [_options_] _task_id_...

# DESCRIPTION

**pueue edit** modifies queued or stashed tasks. Opens the task property in your default editor (set via EDITOR or VISUAL environment variable) for modification. Only works on tasks that have not started running yet.

Multiple task IDs can be provided to edit several tasks in sequence.

# PARAMETERS

**--command**
> Edit the task's command. This is the default if no flag is specified.

**--path**
> Edit the task's working directory.

**--label**
> Edit the task's label.

**--priority**
> Edit the task's priority value.

# CAVEATS

Only queued or stashed tasks can be edited. Running, paused, or finished tasks cannot be modified. The editor used is determined by the EDITOR or VISUAL environment variable.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-add](/man/pueue-add)(1), [pueue-stash](/man/pueue-stash)(1), [pueue-status](/man/pueue-status)(1), [pueue-restart](/man/pueue-restart)(1)
