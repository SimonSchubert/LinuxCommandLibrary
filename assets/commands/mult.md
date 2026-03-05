# TAGLINE

Run a command multiple times and compare outputs

# TLDR

**Run a command 5 times**

```mult -n 5 "[command]"```

**Run with delay between executions**

```mult -n 5 -d 1s "[command]"```

**Stop on first failure**

```mult -n 10 --fail-fast "[command]"```

# SYNOPSIS

**mult** [_options_] _command_

# PARAMETERS

**-n** _COUNT_
> Number of times to run the command.

**-d**, **--delay** _DURATION_
> Delay between executions.

**--fail-fast**
> Stop execution on the first failure.

# DESCRIPTION

**mult** is a TUI tool that executes a shell command multiple times and displays each run's output for comparison. It is useful for identifying inconsistent server behavior, examining unreliable test outcomes, and conducting quick performance assessments.

The TUI provides side-by-side output comparison of each run.

# CAVEATS

Commands with side effects will execute those effects on every run. Use with caution for destructive commands.

# HISTORY

**mult** was created by **dhth** and is written in **Go**.

# SEE ALSO

[watch](/man/watch)(1), [repeat](/man/repeat)(1)
