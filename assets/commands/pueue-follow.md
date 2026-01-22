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

**pueue follow** streams task output in real-time. Live output view.

The tool shows running task output. Similar to tail -f.

pueue follow shows live output.

# CAVEATS

Only for running tasks. Part of pueue.

# HISTORY

pueue follow provides **real-time task** output streaming.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-log](/man/pueue-log)(1)

