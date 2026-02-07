# TAGLINE

Monitor AMD GPU utilization in real time

# TLDR

**Start the TUI** to monitor AMD GPU usage

```amdgpu_top```

**Launch the graphical interface** mode

```amdgpu_top --gui```

**Launch simple TUI mode** similar to nvidia-smi

```amdgpu_top --smi```

**Dump AMDGPU info** (specifications, VRAM, PCI, VBIOS)

```amdgpu_top -d```

**Output JSON formatted data** for scripting

```amdgpu_top -d --json```

**Display GPU processes** and memory usage per process

```amdgpu_top -p```

**Select a specific GPU** by instance number

```amdgpu_top -i [0]```

**Dump GPU metrics** for all AMD GPUs

```amdgpu_top --gpu-metrics```

# SYNOPSIS

**amdgpu_top** [_options_]

# PARAMETERS

**-d**, **--dump**
> Dump AMDGPU info including specifications, VRAM, PCI, ResizableBAR, VBIOS, and video caps.

**--list**
> Display a list of available AMDGPU devices.

**-J**, **--json**
> Output JSON formatted data. Can be combined with the -d option.

**--gui**
> Launch graphical interface mode.

**--smi**
> Launch simple TUI mode similar to nvidia-smi or rocm-smi.

**-p**, **--process**
> Dump all GPU processes and memory usage per process.

**-i** _INDEX_
> Select GPU instance by index number.

**--pci** _PATH_
> Specify PCI path in domain:bus:dev.func format.

**--apu**, **--select-apu**
> Select APU instance.

**--single**, **--single-gpu**
> Display only the selected APU/GPU.

**--no-pc**
> Disable reading performance counters (GRBM, GRBM2). Useful to avoid deactivating power saving features.

**-gm**, **--gpu-metrics**
> Dump gpu_metrics for all AMD GPUs.

**--pp-table**
> Dump power/performance table from sysfs and VBIOS for all AMD GPUs.

**--drm-info**
> Dump DRM information.

**-s** _MS_
> Set refresh interval in milliseconds for JSON mode (default: 1000ms).

**-n** _COUNT_
> Set maximum iteration count for JSON mode (0 = infinite).

**-u**, **--update-process-index** _SEC_
> Update interval in seconds for fdinfo (default: 5s).

**--dark**, **--dark-mode**
> Enable dark mode for TUI/GUI.

**--light**, **--light-mode**
> Enable light mode for TUI/GUI.

**--gl**, **--opengl**
> Use OpenGL API for GUI backend.

**--vk**, **--vulkan**
> Use Vulkan API for GUI backend.

**-V**, **--version**
> Print version information.

**-h**, **--help**
> Print help information.

# DESCRIPTION

**amdgpu_top** is an AMD GPU monitoring tool that displays real-time utilization data similar to htop but specifically for AMD graphics hardware. It gathers information from performance counters (GRBM, GRBM2), sensors, fdinfo, and the AMDGPU driver to provide comprehensive GPU metrics.

The tool offers three display modes: a full-featured TUI (default), a simplified SMI-style TUI, and a graphical interface. It monitors GPU activity, VRAM usage, temperature, power consumption, fan speed, and per-process GPU utilization.

# TUI KEYBINDINGS

**g** - Toggle GRBM performance counter
**r** - Toggle GRBM2 performance counter
**v** - Toggle VRAM/GTT usage display
**f** - Toggle fdinfo display
**n** - Toggle sensors display
**m** - Toggle GPU metrics display
**h** - Change update interval (high=100ms, low=1000ms)
**P** - Sort fdinfo by PID
**M** - Sort fdinfo by VRAM usage
**G** - Sort fdinfo by GFX usage
**R** - Reverse sort order
**q** - Quit application

# CAVEATS

Reading performance counters (GRBM, GRBM2) may prevent the GPU from entering power-saving states on some APUs. Use **--no-pc** to disable performance counter reading if this is a concern. Requires the AMDGPU kernel driver and appropriate permissions to access GPU sysfs entries.

# HISTORY

**amdgpu_top** was created by Umio-Yasuno as a modern alternative to radeontop, written in **Rust**. It provides features that radeontop lacks, such as temperature monitoring, GPU metrics, and a graphical interface. The project is actively maintained and available on GitHub.

# SEE ALSO

[radeontop](/man/radeontop)(1), [nvtop](/man/nvtop)(1), [nvidia-smi](/man/nvidia-smi)(1), [intel_gpu_top](/man/intel_gpu_top)(1), [htop](/man/htop)(1)
