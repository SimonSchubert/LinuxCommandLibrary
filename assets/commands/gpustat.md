# TAGLINE

Concise NVIDIA GPU status monitor

# TLDR

**Show GPU status**

```gpustat```

**Show with process info**

```gpustat -p```

**Continuous monitoring**

```gpustat -i [1]```

**Show full command names**

```gpustat -cp```

**JSON output**

```gpustat --json```

**Show process usernames**

```gpustat -u```

# SYNOPSIS

**gpustat** [_options_]

# PARAMETERS

**-p**, **--show-pid**
> Show process PIDs.

**-u**, **--show-user**
> Show process usernames.

**-c**, **--show-cmd**
> Show process commands.

**-f**, **--show-full-cmd**
> Show full command line and CPU stats of the running process.

**-F**, **--show-fan-speed**
> Show GPU fan speed.

**-P**, **--show-power**
> Show GPU power usage/draw and limit.

**-e**, **--show-codec**
> Show encoder/decoder utilization.

**-i**, **--interval**, **--watch** _seconds_
> Run in watch mode, refreshing every _seconds_.

**--json**
> Output in JSON format.

**--no-color**
> Disable color output.

**--no-header**
> Hide header.

**--no-processes**
> Omit running-process information (memory, user, etc.).

**-a**, **--show-all**
> Show all information.

**--id** _id_
> Show specific GPU only.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**gpustat** displays GPU status in a concise format, similar to nvidia-smi but more readable. It shows GPU utilization, memory usage, temperature, and running processes at a glance.

The tool is designed for quick monitoring of NVIDIA GPUs during machine learning training or other GPU-intensive tasks.

# CAVEATS

Requires NVIDIA GPU and drivers. Uses nvidia-smi internally. Not suitable for non-NVIDIA GPUs. Process info needs appropriate permissions.

# HISTORY

**gpustat** was created by **Jongwook Choi** as a simple GPU monitoring tool for machine learning practitioners. It provides a cleaner alternative to nvidia-smi's verbose output, focusing on essential metrics.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1), [htop](/man/htop)(1), [watch](/man/watch)(1)

# RESOURCES

```[Source code](https://github.com/wookayin/gpustat)```

<!-- verified: 2026-07-17 -->
