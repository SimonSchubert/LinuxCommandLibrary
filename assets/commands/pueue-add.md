# TAGLINE

Add commands to the pueue task queue

# TLDR

**Add command to queue**

```pueue add [command]```

**Add with immediate start**

```pueue add -i [command]```

**Add to specific group**

```pueue add -g [group] [command]```

**Add with delay**

```pueue add --delay "10min" [command]```

**Add paused task**

```pueue add --stashed [command]```

# SYNOPSIS

**pueue** **add** [_options_] _command_

# PARAMETERS

**-i**, **--immediate**
> Start immediately.

**-g**, **--group** _name_
> Add to group.

**--delay** _duration_
> Delay before starting.

**--stashed**
> Add as stashed (paused).

**-l**, **--label** _label_
> Task label.

**-a**, **--after** _ids_
> Start after other tasks.

**-p**, **--priority** _n_
> Task priority.

# DESCRIPTION

**pueue add** adds a new command to the task queue. Commands are queued and executed in order. Supports task grouping, dependencies, priorities, and delayed execution.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-status](/man/pueue-status)(1)

