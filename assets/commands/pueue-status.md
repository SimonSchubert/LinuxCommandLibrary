# TAGLINE

Display pueue task queue state

# TLDR

**Show queue status**

```pueue status```

**Show specific group**

```pueue status -g [group]```

**Show in JSON format**

```pueue status --json```

# SYNOPSIS

**pueue** **status** [_options_]

# PARAMETERS

**-g**, **--group** _name_
> Show specific group.

**--json**
> Output as JSON.

# DESCRIPTION

**pueue status** displays the current state of all tasks. Shows queued, running, completed, and failed tasks. Displays task IDs, commands, status, and execution times.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-log](/man/pueue-log)(1)

