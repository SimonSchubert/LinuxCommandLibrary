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

**Show GPU UUIDs**

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

**-i** _seconds_
> Refresh interval.

**--json**
> Output in JSON format.

**--no-color**
> Disable color output.

**--no-header**
> Hide header.

**-a**, **--show-all**
> Show all information.

**--id** _id_
> Show specific GPU only.

# DESCRIPTION

**gpustat** displays GPU status in a concise format, similar to nvidia-smi but more readable. It shows GPU utilization, memory usage, temperature, and running processes at a glance.

The tool is designed for quick monitoring of NVIDIA GPUs during machine learning training or other GPU-intensive tasks.

# CAVEATS

Requires NVIDIA GPU and drivers. Uses nvidia-smi internally. Not suitable for non-NVIDIA GPUs. Process info needs appropriate permissions.

# HISTORY

**gpustat** was created by **Jongwook Choi** as a simple GPU monitoring tool for machine learning practitioners. It provides a cleaner alternative to nvidia-smi's verbose output, focusing on essential metrics.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1), [htop](/man/htop)(1), [watch](/man/watch)(1)
