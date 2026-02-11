# TAGLINE

Stream pueue task output in real-time

# TLDR

**Follow task output**

```pueue follow [task_id]```

**Follow latest task**

```pueue follow```

**Follow with lines**

```pueue follow --lines [50] [task_id]```

# SYNOPSIS

**pueue follow** [_options_] [_task_id_]

# PARAMETERS

_TASK_ID_
> Task to follow.

**--lines** _N_
> Initial lines to show.

# DESCRIPTION

**pueue follow** streams the stdout and stderr output of a running task in real-time, similar to **tail -f**. Without a task ID, it follows the most recently started task. The **--lines** option controls how many lines of existing output to display initially.

# CAVEATS

Only for running tasks. Part of pueue.

# HISTORY

pueue follow provides **real-time task** output streaming.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-log](/man/pueue-log)(1)

