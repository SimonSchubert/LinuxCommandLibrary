# TAGLINE

Monitor AMD Radeon GPU utilization in real time

# TLDR

Show **GPU utilization**

```radeontop```

Enable **colored** output

```radeontop -c```

Select specific **GPU** by bus number

```radeontop -b [bus_number]```

Set **sample rate** (samples per second)

```radeontop -t [10]```

**Dump** output to a file

```radeontop -d [output.txt]```

# SYNOPSIS

**radeontop** [_options_]

# PARAMETERS

**-c**, **--color**
> Enable colorized output.

**-b**, **--bus** _bus_
> Select GPU by PCI bus number. For lspci output `01:00.0`, the bus value is `1`.

**-t**, **--ticks** _ticks_
> Number of samples per second. Default is 120. Higher values increase accuracy and overhead.

**-d**, **--dump** _file_
> Dump data to a file instead of displaying it. Use `-` for stdout.

**-i**, **--dump-interval** _seconds_
> Wait N seconds between data output lines when dumping.

**-l**, **--limit** _limit_
> Quit after dumping this many lines. Only valid in dump mode.

**-p**, **--path** _device_
> Open a specific DRM device node (e.g. `/dev/dri/card0`).

**-m**, **--mem**
> Force use of `/dev/mem` path if autodetection fails. Useful with the proprietary driver.

**-v**, **--version**
> Display program version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**radeontop** displays real-time utilization statistics for AMD Radeon GPUs. It shows usage percentages for various GPU components including graphics pipe, shaders, texture units, and video decode/encode engines.

The tool reads from kernel debugfs interfaces and presents the data in a top-like format, useful for monitoring GPU workload during gaming or compute tasks.

# CAVEATS

May require root privileges on some systems. Only works with AMD Radeon GPUs using radeon or amdgpu drivers. Older GPUs may not support all metrics.

# HISTORY

**radeontop** was created by **Chris Blaas** to provide GPU monitoring for AMD graphics cards on Linux, similar to nvidia-smi for NVIDIA cards.

# SEE ALSO

[amdgpu_top](/man/amdgpu_top)(1), [nvidia-smi](/man/nvidia-smi)(1), [glxinfo](/man/glxinfo)(1), [lspci](/man/lspci)(8)
