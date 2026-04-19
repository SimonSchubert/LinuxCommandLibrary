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

**-n**, **--adjustment=**_N_
> Add integer _N_ to the niceness (default **10**). Negative values raise priority.

**--help**
> Display help information.

**--version**
> Output version information.

# DESCRIPTION

**nice** runs a command with a modified CPU scheduling niceness. Higher niceness means the process is "nicer" and receives less CPU time (lower priority).

Niceness ranges from **-20** (highest priority) to **19** (lowest priority). With no command, nice prints the current niceness of the shell to standard output. When given a command with no **-n**, nice applies the default adjustment of **+10**.

# CAVEATS

Negative values require root. Default adjustment is 10. Affects CPU scheduling only.

# HISTORY

nice is a classic **Unix** command for controlling process scheduling priority since early Unix.

# SEE ALSO

[renice](/man/renice)(1), [ionice](/man/ionice)(1), [chrt](/man/chrt)(1)

