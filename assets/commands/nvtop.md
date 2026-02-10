# TAGLINE

ncurses-based GPU process monitor, similar to htop but for GPUs

# TLDR

**Monitor all GPUs**

```nvtop```

**Monitor specific GPU**

```nvtop -i [0]```

**Monitor multiple GPUs**

```nvtop -i [0,1,2]```

**Delay between updates**

```nvtop -d [2]```

**No color output**

```nvtop -C```

# SYNOPSIS

**nvtop** [_options_]

# DESCRIPTION

**nvtop** is an ncurses-based GPU process monitor, similar to htop but for GPUs. It displays real-time GPU utilization, memory usage, temperature, and running processes.

The tool supports NVIDIA, AMD, and Intel GPUs, providing a unified interface for monitoring GPU resources.

# PARAMETERS

**-i** _ids_
> GPU IDs to monitor.

**-d** _seconds_
> Delay between updates.

**-s** _sort_
> Sort by (pid, type, rate, mem, etc.).

**-C**
> No color.

**-p**
> Show only processes.

**-f** _file_
> Log to file.

**--no-header**
> Hide header.

# KEYBOARD SHORTCUTS

**F1/q**: Quit
**F2**: Setup
**F3**: Search
**F4**: Filter
**F6**: Sort
**F9**: Kill process

# CAVEATS

NVIDIA needs driver 410+. AMD needs ROCm. Intel needs i915 driver. Feature support varies by GPU vendor.

# HISTORY

**nvtop** was created by **Maxime Schmitt** to provide an htop-like experience for GPU monitoring. It started with NVIDIA support and later added AMD and Intel GPU support.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [gpustat](/man/gpustat)(1), [htop](/man/htop)(1), [radeontop](/man/radeontop)(1)
