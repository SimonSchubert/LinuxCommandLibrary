# TAGLINE

Sudoless performance monitoring for Apple Silicon processors

# TLDR

**Launch the system monitor**

```macmon```

**Output metrics as JSON**

```macmon pipe```

**Set update interval** in milliseconds

```macmon -i [ms]```

# SYNOPSIS

**macmon** [_command_] [_options_]

# PARAMETERS

**-i**, **--interval** _MS_
> Update interval in milliseconds (default: 1000).

**pipe**
> Output metrics in JSON format for piping to other tools.

**debug**
> Print debug information.

# DESCRIPTION

**macmon** is a sudoless performance monitoring tool for Apple Silicon processors. It displays real-time CPU, GPU, and Apple Neural Engine (ANE) power usage, CPU utilization per cluster, RAM/Swap usage, temperature, and historical charts with average and max values.

It uses an undocumented Apple API (the same used by powermetrics) to access system metrics without requiring sudo. The tool includes 6 switchable color themes.

# CAVEATS

Only works on Apple Silicon Macs (M1 and later). Uses undocumented APIs that may change between macOS versions.

# HISTORY

**macmon** was created by **vladkens** and is written in **Rust**.

# SEE ALSO

[htop](/man/htop)(1), [btop](/man/btop)(1)
