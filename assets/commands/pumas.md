# TAGLINE

Power usage monitor for Apple Silicon

# TLDR

**Launch the power monitor TUI**

```sudo pumas run```

Update **every 500 ms**

```sudo pumas run -i 500```

**Stream metrics as JSON**

```sudo pumas run --json```

**Extract a metric** with jq

```sudo pumas run --json | jq '.metrics.e_clusters[0].cpus[2].active_ratio'```

Generate **shell completions**

```pumas generate-completion [bash|zsh|fish|elvish|powershell]```

# SYNOPSIS

**pumas** **run** [_options_]

**pumas** **generate-completion** _shell_

# PARAMETERS

**-i**, **--sample-rate** _MS_
> Update rate in milliseconds, minimum 100. Default: 1000.

**--history-size** _N_
> Number of recent samples to keep for each metric. Default: 128.

**--accent-color** _COLOR_
> ANSI color code for labels. Default: 2.

**--gauge-fg-color**, **--gauge-bg-color** _COLOR_
> ANSI color codes for gauges. Defaults: 2 and 7.

**--history-fg-color**, **--history-bg-color** _COLOR_
> ANSI color codes for history graphs. Defaults: 4 and 7.

**--json**
> Print metrics to stdout as newline-delimited JSON instead of running the UI.

**-h**, **--help**
> Print help.

**-V**, **--version**
> Print the version.

# DESCRIPTION

**pumas** is an nvtop-inspired command-line tool for monitoring power usage and performance metrics on Apple Silicon Macs. It runs in two modes: a TUI mode with tabs for overview, CPU, GPU, memory and SoC information, and a JSON mode for piping metrics to tools like jq or building Prometheus exporters. It uses the macOS powermetrics utility and the sysinfo crate.

In the TUI, the arrow keys switch tabs. **Esc**, **q**, **x** or **Ctrl-C** quit.

# CAVEATS

Requires **sudo** because the underlying powermetrics utility needs root access. Apple Silicon Macs only. A subcommand is required: running **pumas** alone does not start the monitor.

# HISTORY

**pumas** was created by **graelo** and is written in **Rust**.

# SEE ALSO

[htop](/man/htop)(1), [macmon](/man/macmon)(1), [nvtop](/man/nvtop)(1)

# RESOURCES

```[Source code](https://github.com/graelo/pumas)```

<!-- verified: 2026-11-09 -->
