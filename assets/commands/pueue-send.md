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

**pueue send** sends input to running task. Stdin simulation.

The tool provides interactive input. For tasks requiring user input.

pueue send writes to stdin.

# CAVEATS

Task must be running. Part of pueue.

# HISTORY

pueue send provides **stdin input** to running tasks.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-follow](/man/pueue-follow)(1)

