# TAGLINE

Prepend timestamps to command output

# TLDR

**Prepend elapsed time** to each line of output

```[command] | gnomon```

**Show total elapsed time** since the command started

```[command] | gnomon --type=elapsed-total```

**Show absolute timestamps** for each line

```[command] | gnomon --type=absolute```

**Highlight lines** taking longer than 1.5 seconds

```[command] | gnomon --high=1.5```

**Set both high and medium** thresholds for color coding

```[command] | gnomon --high=3.0 --medium=1.0```

**Ignore lines** shorter than a threshold

```[command] | gnomon --ignore-blank --high=0.5```

# SYNOPSIS

**gnomon** [_options_]

# PARAMETERS

**--type** _TYPE_
> Timestamp type: **elapsed-line** (default), **elapsed-total**, or **absolute**.

**--ignore-blank**
> Do not prepend timestamps to blank lines.

**--real-time** _THRESHOLD_
> Set a threshold in seconds after which gnomon prints output in real time rather than buffering.

**--high** _SECONDS_
> Threshold in seconds for high (red) time coloring. Default: **1.0**.

**--medium** _SECONDS_
> Threshold in seconds for medium (yellow) time coloring. Default: **0.5**.

**--help**
> Display help information.

# DESCRIPTION

**gnomon** is a command-line utility that prepends timestamp information to the output of another command, piped through stdin. By default, it shows how long each line of output took to appear, making it useful for identifying slow steps in build processes, test suites, or log output.

The tool color-codes output based on configurable time thresholds: lines exceeding the **--high** threshold are shown in red, those exceeding **--medium** in yellow, and the rest in the default color.

# CAVEATS

Requires **Node.js** and is installed via npm (`npm install -g gnomon`). Adds minor latency to output. Best suited for diagnosing slow processes rather than precise benchmarking.

# SEE ALSO

[ts](/man/ts)(1), [time](/man/time)(1), [pv](/man/pv)(1)
