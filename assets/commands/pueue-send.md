# TAGLINE

Send stdin input to running pueue tasks

# TLDR

**Send input to task**

```pueue send [task_id] "[input]"```

**Send newline**

```pueue send [task_id] ""```

**Send special character**

```pueue send [task_id] "\n"```

# SYNOPSIS

**pueue send** _task_id_ _input_

# PARAMETERS

_TASK_ID_
> Task to send input to.

_INPUT_
> Text to send.

# DESCRIPTION

**pueue send** writes text to the stdin of a running task, enabling interaction with commands that prompt for user input. This is useful for tasks that require confirmation or data entry while running in the background pueue queue.

# CAVEATS

Task must be running. Part of pueue.

# HISTORY

pueue send provides **stdin input** to running tasks.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-follow](/man/pueue-follow)(1)

