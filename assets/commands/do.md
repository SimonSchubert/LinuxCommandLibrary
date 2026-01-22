# TLDR

**Execute command** repeatedly

```do [command] [args]```

**Execute with count**

```do -n [5] [command]```

**Execute with interval**

```do -i [2] [command]```

**Execute until success**

```do -s [command]```

# SYNOPSIS

**do** [_options_] _command_ [_args_...]

# PARAMETERS

_COMMAND_
> Command to execute.

_ARGS_
> Arguments to pass to command.

**-n** _COUNT_
> Number of iterations.

**-i** _SECONDS_
> Interval between executions.

**-s**
> Stop on success (zero exit).

**-f**
> Stop on failure (non-zero exit).

**--help**
> Display help information.

# DESCRIPTION

**do** is a simple utility for repeatedly executing commands. It provides options for controlling iteration count, timing, and termination conditions based on command exit status.

The tool is useful for polling operations, retrying failed commands, and automated testing scenarios. It offers a simpler interface than while loops for common repetition patterns.

Various implementations of 'do' exist with different feature sets. Behavior may vary depending on which version is installed.

# CAVEATS

Name may conflict with shell builtins or other utilities. Different implementations have different options. May need escaping for shell-interpreted arguments.

# HISTORY

Multiple utilities named 'do' exist across different systems and package repositories. The concept of command repetition is fundamental to shell scripting, with various tools providing convenient interfaces.

# SEE ALSO

[watch](/man/watch)(1), [while](/man/while)(1), [repeat](/man/repeat)(1)
