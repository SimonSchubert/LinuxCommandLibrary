# TAGLINE

command-line utility for monitoring and managing NVIDIA GPU devices

# TLDR

**Show GPU status**

```nvidia-smi```

**Show detailed GPU info**

```nvidia-smi -q```

**Monitor GPU continuously**

```nvidia-smi -l [1]```

**List GPUs with their UUIDs**

```nvidia-smi -L```

**Show only a specific GPU**

```nvidia-smi -i [0]```

**Show detailed memory and temperature info**

```nvidia-smi -q -d MEMORY,TEMPERATURE```

**Monitor per-process GPU usage**

```nvidia-smi pmon```

**Monitor device stats (power, temperature, utilization) every second**

```nvidia-smi dmon```

**List compute processes using the GPU**

```nvidia-smi --query-compute-apps=pid,process_name,used_memory --format=csv```

**Log selected metrics to CSV every 5 seconds**

```nvidia-smi --query-gpu=timestamp,utilization.gpu,memory.used,temperature.gpu --format=csv -l [5] -f [gpu.csv]```

**Query specific attributes**

```nvidia-smi --query-gpu=name,memory.total,memory.used --format=csv```

**Set power limit** (watts)

```sudo nvidia-smi -i [0] -pl [250]```

**Enable persistence mode**

```sudo nvidia-smi -pm 1```

**Reset GPU**

```sudo nvidia-smi -i [0] -r```

**Show driver version**

```nvidia-smi --query-gpu=driver_version --format=csv,noheader```

# SYNOPSIS

**nvidia-smi** [_options_]

# DESCRIPTION

**nvidia-smi** (NVIDIA System Management Interface) is a command-line utility for monitoring and managing NVIDIA GPU devices. It provides information about GPU utilization, memory usage, temperature, power consumption, and running processes.

The tool can display real-time statistics, query specific GPU attributes, configure power and clock settings, and manage compute processes. It's essential for GPU monitoring in machine learning, rendering, and scientific computing environments.

nvidia-smi is included with the NVIDIA driver package and works with Tesla, Quadro, and GeForce GPUs (feature availability varies).

# PARAMETERS

**-L**, **--list-gpus**
> List each GPU (and MIG device) with its UUID.

**-q**, **--query**
> Display detailed GPU or unit information.

**-d** _type_, **--display=**_type_
> With **-q**, show only selected sections: MEMORY, UTILIZATION, ECC, TEMPERATURE, POWER, CLOCK, COMPUTE, PIDS, PERFORMANCE, SUPPORTED_CLOCKS and others (comma-separated).

**-i** _id_, **--id=**_id_
> Target a specific GPU by index, PCI bus ID or UUID.

**-l** _sec_, **--loop=**_sec_
> Repeat the query every _sec_ seconds.

**-lms** _ms_, **--loop-ms=**_ms_
> Repeat the query every _ms_ milliseconds.

**-f** _file_, **--filename=**_file_
> Write output to a file instead of stdout.

**-x**, **--xml-format**
> Produce XML output (with **-q**).

**--query-gpu=**_attrs_
> Query specific GPU attributes (see **nvidia-smi --help-query-gpu**).

**--query-compute-apps=**_attrs_
> Query running compute processes (pid, process_name, used_memory, ...).

**--format=**_format_
> Output format for **--query-***: csv, optionally with noheader and nounits.

**-pm** _mode_, **--persistence-mode=**_mode_
> Enable (1) or disable (0) persistence mode. Linux only.

**-pl** _watts_, **--power-limit=**_watts_
> Set the board power limit in watts.

**-c** _mode_, **--compute-mode=**_mode_
> Set compute mode: DEFAULT, EXCLUSIVE_PROCESS or PROHIBITED.

**-lgc** _min,max_, **--lock-gpu-clocks=**_min,max_
> Lock GPU clocks to a range in MHz; **-rgc** resets them.

**-mig** _mode_, **--multi-instance-gpu=**_mode_
> Enable (1) or disable (0) MIG mode on supported GPUs.

**-r**, **--gpu-reset**
> Reset a GPU (requires root, **-i**, and no processes using it).

**dmon**
> Scrolling per-device monitoring of power, temperature, utilization and clocks.

**pmon**
> Process monitoring mode.

**topo -m**
> Show the GPU/NIC topology matrix.

**nvlink -s**
> Show NVLink status.

**mig**
> Manage Multi-Instance GPU partitions (see **nvidia-smi-mig**).

# QUERY ATTRIBUTES

**name**: GPU name
**memory.total**: Total memory
**memory.used**: Used memory
**memory.free**: Free memory
**utilization.gpu**: GPU utilization %
**utilization.memory**: Memory utilization %
**temperature.gpu**: GPU temperature
**power.draw**: Power consumption
**power.limit**: Current power limit
**clocks.sm**: Current SM clock
**fan.speed**: Fan speed %
**driver_version**: Driver version

# CAVEATS

Requires the NVIDIA driver (proprietary or open kernel modules); not available with nouveau. Some features limited on consumer GPUs. Changing settings (power limit, persistence, clocks, reset) requires root. Run **nvidia-smi --help-query-gpu** for the full attribute list. Persistence mode recommended for servers to avoid initialization delays.

# HISTORY

**nvidia-smi** ships with the **NVIDIA driver package** and first appeared alongside NVIDIA's **Tesla** compute products in the late **2000s**. It evolved alongside NVIDIA's GPU computing platforms (CUDA), gaining features for monitoring compute workloads. The tool became essential with the rise of GPU computing for machine learning and scientific applications.

# SEE ALSO

[nvidia-smi-mig](/man/nvidia-smi-mig)(1), [nvtop](/man/nvtop)(1), [nvitop](/man/nvitop)(1), [gpustat](/man/gpustat)(1), [nvidia-settings](/man/nvidia-settings)(1)

# RESOURCES

```[Homepage](https://developer.nvidia.com/system-management-interface)```

```[Documentation](https://docs.nvidia.com/deploy/nvidia-smi/index.html)```

<!-- verified: 2026-11-07 -->
