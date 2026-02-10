# TAGLINE

runs a command with modified scheduling priority

# TLDR

**Run with lower priority**

```nice [command]```

**Run with specific niceness**

```nice -n [10] [command]```

**Run with highest priority (root)**

```nice -n [-20] [command]```

**Run with lowest priority**

```nice -n [19] [command]```

**Show current niceness**

```nice```

# SYNOPSIS

**nice** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command to run.

**-n** _NICENESS_
> Adjustment value (-20 to 19).

**--help**
> Display help information.

# DESCRIPTION

**nice** runs a command with modified scheduling priority. Higher values mean lower priority.

The tool adjusts process niceness. Values range from -20 (highest) to 19 (lowest).

# CAVEATS

Negative values require root. Default adjustment is 10. Affects CPU scheduling only.

# HISTORY

nice is a classic **Unix** command for controlling process scheduling priority since early Unix.

# SEE ALSO

[renice](/man/renice)(1), [ionice](/man/ionice)(1), [chrt](/man/chrt)(1)

