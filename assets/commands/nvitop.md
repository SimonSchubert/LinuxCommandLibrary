# TAGLINE

Interactive NVIDIA GPU process viewer and monitor

# TLDR

**Launch the GPU monitor**

```nvitop```

**Run in monitor mode**

```nvitop -m```

# SYNOPSIS

**nvitop** [_options_]

# PARAMETERS

**-m**, **--monitor**
> Run in continuous monitor mode (like htop).

**-o**, **--only** _VISIBLE_
> Show only GPU processes owned by the current user.

# DESCRIPTION

**nvitop** is an interactive NVIDIA GPU process viewer and resource monitor. It displays real-time GPU utilization, memory usage, temperature, and process information in a TUI. Unlike nvidia-smi, nvitop queries device status using NVML Python bindings directly and provides interactive features like tree-view, environment variable viewing, and process filtering.

It also ships with **nvisel**, a CUDA device selection tool for deep learning researchers.

# CAVEATS

Only works with NVIDIA GPUs. Requires NVIDIA drivers with NVML support.

# HISTORY

**nvitop** was created by **XuehaiPan** and is written in **Python**. It works on both Linux and Windows.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1), [htop](/man/htop)(1)
