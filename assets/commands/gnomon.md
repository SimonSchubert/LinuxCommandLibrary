# TAGLINE

prepend timestamps to command output

# TLDR

**Prepend timestamps**

```[command] | gnomon```

**Show elapsed time**

```[command] | gnomon -t elapsed```

**Show absolute time**

```[command] | gnomon -t absolute```

**Custom format**

```[command] | gnomon -f "[%H:%M:%S]"```

# SYNOPSIS

**gnomon** [_options_]

# PARAMETERS

**-t** _TYPE_, **--type** _TYPE_
> Time type (elapsed, absolute).

**-f** _FORMAT_, **--format** _FORMAT_
> Custom time format.

**-h**, **--high** _SECONDS_
> Threshold for high time.

**-m**, **--medium** _SECONDS_
> Threshold for medium time.

**--help**
> Display help information.

# DESCRIPTION

**gnomon** prepends timestamp information to command output. It shows how long each line took to appear, useful for identifying slow operations in build processes or logs.

The tool color-codes output based on time thresholds, highlighting slow lines in red or yellow. It helps diagnose performance issues in command pipelines.

# CAVEATS

Node.js tool. Adds some latency. Best for diagnosing slow processes.

# HISTORY

gnomon was created to help developers identify slow steps in build processes and command output.

# SEE ALSO

[time](/man/time)(1), [ts](/man/ts)(1)
