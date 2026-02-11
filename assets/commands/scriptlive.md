# TAGLINE

Re-execute recorded terminal sessions live

# TLDR

Execute a **typescript** in real-time

```scriptlive path/to/timing_file path/to/typescript```

Execute at **double speed**

```scriptlive path/to/timing_file path/to/typescript --divisor 2```

Execute typescript from **stdin log**

```scriptlive --log-in path/to/stdin_log path/to/typescript```

Execute with **maximum delay** between commands

```scriptlive path/to/timing_file path/to/typescript --maxdelay 2```

# SYNOPSIS

**scriptlive** [_options_] _timing_file_ _typescript_

# PARAMETERS

**--divisor** _n_
> Speed multiplier (2 = double speed)

**--log-in** _file_
> Use stdin log file for input

**--maxdelay** _seconds_
> Maximum wait between commands

# DESCRIPTION

**scriptlive** re-executes a terminal session that was previously recorded by the **script** command. Unlike **scriptreplay** which only displays recorded output passively, scriptlive actually runs the commands in a live shell, reproducing the session's actions with their real effects.

The tool uses timing data to pace command execution, matching the original session's rhythm. Speed can be adjusted with the **--divisor** option for faster or slower execution, and **--maxdelay** caps the wait between commands to skip long pauses. This is useful for automated demonstrations, reproducing test scenarios, and recreating specific terminal workflows.

# CAVEATS

Commands are actually executed, which may have side effects. Use with caution on recordings from untrusted sources.

# HISTORY

Part of **util-linux** package, extending script's recording capabilities with live execution.

# SEE ALSO

[script](/man/script)(1), [scriptreplay](/man/scriptreplay)(1)
