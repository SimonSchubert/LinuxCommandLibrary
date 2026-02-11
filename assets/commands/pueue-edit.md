# TAGLINE

Edit queued pueue task properties

# TLDR

**Edit task command**

```pueue edit [task_id]```

**Edit task path**

```pueue edit --path [task_id]```

**Edit task label**

```pueue edit --label [task_id]```

# SYNOPSIS

**pueue** **edit** [_options_] _task_id_

# PARAMETERS

**--command**
> Edit command (default).

**--path**
> Edit working directory.

**--label**
> Edit task label.

**--priority**
> Edit priority.

# DESCRIPTION

**pueue edit** modifies queued or stashed tasks. Opens the task property in an editor for modification. Only works on tasks that haven't started yet.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-add](/man/pueue-add)(1)

