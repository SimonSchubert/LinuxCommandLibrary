# TAGLINE

Power usage monitor for Apple Silicon

# TLDR

**Launch the power monitor TUI**

```sudo pumas```

**Stream metrics as JSON**

```sudo pumas --json```

# SYNOPSIS

**pumas** [_options_]

# PARAMETERS

**--json**
> Stream metrics to stdout as JSON instead of running the TUI.

# DESCRIPTION

**pumas** is an nvtop-inspired command-line tool for monitoring power usage and performance metrics on Apple Silicon Macs. It runs in two modes: a TUI mode displaying global metrics for utilization and power consumption, and a JSON mode for piping metrics to tools like jq or building Prometheus exporters. It uses the macOS powermetrics utility and the sysinfo crate.

# CAVEATS

Requires **sudo** because the underlying powermetrics utility needs root access. Apple Silicon Macs only.

# HISTORY

**pumas** was created by **graelo** and is written in **Rust**.

# SEE ALSO

[htop](/man/htop)(1), [macmon](/man/macmon)(1), [nvtop](/man/nvtop)(1)
