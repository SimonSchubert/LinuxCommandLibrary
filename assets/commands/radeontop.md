# TLDR

Show **GPU utilization**

```radeontop```

Enable **colored** output

```radeontop -c```

Select specific **GPU** by bus

```radeontop -b [bus_number]```

Set **refresh rate**

```radeontop -t [10]```

# SYNOPSIS

**radeontop** [**-c**|**--color**] [**-b** _bus_] [**-t** _ticks_]

# PARAMETERS

**-c, --color**
> Enable colored output

**-b, --bus _number_**
> Select GPU by PCI bus number

**-t, --ticks _samples_**
> Samples per second (higher = more overhead)

**-d, --dump _file_**
> Dump data to file

**-l, --limit _samples_**
> Limit to n samples then exit

# DESCRIPTION

**radeontop** displays real-time utilization statistics for AMD Radeon GPUs. It shows usage percentages for various GPU components including graphics pipe, shaders, texture units, and video decode/encode engines.

The tool reads from kernel debugfs interfaces and presents the data in a top-like format, useful for monitoring GPU workload during gaming or compute tasks.

# CAVEATS

May require root privileges on some systems. Only works with AMD Radeon GPUs using radeon or amdgpu drivers. Older GPUs may not support all metrics.

# HISTORY

**radeontop** was created by **Chris Blaas** to provide GPU monitoring for AMD graphics cards on Linux, similar to nvidia-smi for NVIDIA cards.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [glxinfo](/man/glxinfo)(1), [lspci](/man/lspci)(8)
