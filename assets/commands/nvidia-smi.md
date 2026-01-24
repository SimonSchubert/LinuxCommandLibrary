# TLDR

**Show GPU status**

```nvidia-smi```

**Show detailed GPU info**

```nvidia-smi -q```

**Monitor GPU continuously**

```nvidia-smi -l [1]```

**Show only specific GPU**

```nvidia-smi -i [0]```

**Show processes using GPU**

```nvidia-smi pmon```

**Query specific attributes**

```nvidia-smi --query-gpu=name,memory.total,memory.used --format=csv```

**Set power limit** (watts)

```nvidia-smi -pl [250]```

**Set persistence mode**

```nvidia-smi -pm [1]```

**Reset GPU**

```nvidia-smi -r```

**Show driver version**

```nvidia-smi --query-gpu=driver_version --format=csv,noheader```

# SYNOPSIS

**nvidia-smi** [_options_]

# DESCRIPTION

**nvidia-smi** (NVIDIA System Management Interface) is a command-line utility for monitoring and managing NVIDIA GPU devices. It provides information about GPU utilization, memory usage, temperature, power consumption, and running processes.

The tool can display real-time statistics, query specific GPU attributes, configure power and clock settings, and manage compute processes. It's essential for GPU monitoring in machine learning, rendering, and scientific computing environments.

nvidia-smi is included with the NVIDIA driver package and works with Tesla, Quadro, and GeForce GPUs (feature availability varies).

# PARAMETERS

**-l** _sec_, **--loop=** _sec_
> Continuously update every sec seconds.

**-i** _id_
> Target specific GPU by index.

**-q**, **--query**
> Display detailed information.

**-d** _type_
> Display specific info type (MEMORY, UTILIZATION, TEMPERATURE, POWER, CLOCK).

**--query-gpu=** _attrs_
> Query specific attributes.

**--format=** _format_
> Output format (csv, noheader, nounits).

**-pm** _mode_
> Set persistence mode (0 or 1).

**-pl** _watts_
> Set power limit.

**-r**, **--gpu-reset**
> Reset GPU.

**pmon**
> Process monitoring mode.

**topo**
> Show GPU topology.

**nvlink**
> Show NVLink status.

# QUERY ATTRIBUTES

**name**: GPU name
**memory.total**: Total memory
**memory.used**: Used memory
**memory.free**: Free memory
**utilization.gpu**: GPU utilization %
**utilization.memory**: Memory utilization %
**temperature.gpu**: GPU temperature
**power.draw**: Power consumption

# CAVEATS

Requires NVIDIA proprietary drivers. Some features limited on consumer GPUs. Power management requires root. Persistence mode recommended for servers to avoid initialization delays.

# HISTORY

**nvidia-smi** has been part of the **NVIDIA driver package** since the early **2000s**. It evolved alongside NVIDIA's GPU computing platforms (CUDA), gaining features for monitoring compute workloads. The tool became essential with the rise of GPU computing for machine learning and scientific applications.

# SEE ALSO

[nvtop](/man/nvtop)(1), [gpustat](/man/gpustat)(1), [nvidia-settings](/man/nvidia-settings)(1)
