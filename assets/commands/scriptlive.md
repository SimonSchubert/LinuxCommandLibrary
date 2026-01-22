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

**scriptlive** executes a terminal session recorded by the script command. Unlike scriptreplay which only displays output, scriptlive actually re-executes the commands.

This is useful for demonstrations and recreating terminal sessions.

# CAVEATS

Commands are actually executed, which may have side effects. Use with caution on recordings from untrusted sources.

# HISTORY

Part of **util-linux** package, extending script's recording capabilities with live execution.

# SEE ALSO

[script](/man/script)(1), [scriptreplay](/man/scriptreplay)(1)
