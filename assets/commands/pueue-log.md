# TAGLINE

Display pueue task output logs

# TLDR

**Show task log**

```pueue log [task_id]```

**Show all task logs**

```pueue log```

**Show last N lines**

```pueue log --lines [100] [task_id]```

**Full output**

```pueue log --full [task_id]```

# SYNOPSIS

**pueue log** [_options_] [_task_ids_]

# PARAMETERS

_TASK_IDS_
> Tasks to show logs for.

**--lines** _N_
> Number of lines.

**--full**
> Show full output.

# DESCRIPTION

**pueue log** displays the captured stdout and stderr output of pueue tasks, both running and finished. By default it shows the last few lines; use **--full** to see complete output or **--lines** to control the number of lines displayed.

# CAVEATS

Output stored on disk. Part of pueue.

# HISTORY

pueue log provides **task output** viewing functionality.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-follow](/man/pueue-follow)(1)

