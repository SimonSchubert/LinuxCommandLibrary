# TAGLINE

Display pueue task queue state

# TLDR

**Show queue status**

```pueue status```

**Show specific group**

```pueue status -g [group]```

**Show in JSON format**

```pueue status --json```

**Show full task details**

```pueue status --full```

# SYNOPSIS

**pueue** **status** [_options_]

# PARAMETERS

**-g**, **--group** _name_
> Show specific group.

**--json**
> Output as JSON.

**--full**
> Display full task information with expanded output.

# DESCRIPTION

**pueue status** displays the current state of all tasks in the queue. Shows queued, running, completed, and failed tasks with their task IDs, commands, status, and execution times.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-add](/man/pueue-add)(1), [pueue-log](/man/pueue-log)(1), [pueue-clean](/man/pueue-clean)(1), [pueue-follow](/man/pueue-follow)(1)

