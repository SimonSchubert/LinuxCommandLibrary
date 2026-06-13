# TAGLINE

Monitor memory and processor usage on NVIDIA Jetson devices

# TLDR

**Repeatedly print system statistics**

```sudo tegrastats```

**Set a custom sampling interval in milliseconds**

```sudo tegrastats --interval [1000]```

**Write the output to a logfile**

```sudo tegrastats --logfile [filename]```

**Run tegrastats in the background and log to a file**

```sudo tegrastats --start --logfile [filename]```

**Stop a tegrastats process running in the background**

```sudo tegrastats --stop```

**Print verbose messages, including read-failure warnings**

```sudo tegrastats --verbose```

# SYNOPSIS

**tegrastats** [**--interval** _millisec_] [**--logfile** _filename_] [**--start**] [**--stop**] [**--verbose**]

# DESCRIPTION

**tegrastats** reports memory and processor usage for NVIDIA Jetson-based devices running Linux for Tegra (L4T). It prints a single status line at a fixed interval, summarizing RAM and swap usage, per-core CPU load and frequency, memory-controller and GPU (GR3D) utilization, on-die temperatures, and, on boards with the required power sensors, instantaneous and average power draw per rail.

It is the standard lightweight tool for watching a Jetson under load, since the desktop **nvidia-smi** utility does not support Tegra integrated GPUs. The output is a compact, machine-parsable line, which makes tegrastats convenient for logging long-running benchmarks to a file for later analysis.

tegrastats ships as part of the L4T BSP and is installed at **/usr/bin/tegrastats** by JetPack. Running it without **sudo** produces incomplete output, because reading some of the hardware counters requires root privileges.

# PARAMETERS

**--interval** _millisec_

> Sample and print statistics every _millisec_ milliseconds. The default is 1000 (one second).

**--logfile** _filename_

> Write output to _filename_ instead of standard output.

**--start**

> Run tegrastats as a background process. Combine with **--logfile** to keep logging while the terminal is free for other work.

**--stop**

> Terminate any tegrastats process currently running in the background.

**--verbose**

> Print additional diagnostic messages, such as warnings when a sensor read fails.

**--help**

> Print a usage summary and exit.

# OUTPUT FIELDS

**RAM** _used_/_total_MB

> Main memory used and total, followed by the largest free block (**lfb**) available.

**SWAP** _used_/_total_MB

> Swap used and total, with the amount cached.

**CPU** [_load_%@_freq_,...]

> Per-core utilization percentage and clock frequency; an offline core is shown as **off**.

**EMC_FREQ** _x_%@_freq_

> External memory controller (DRAM) utilization and frequency.

**GR3D_FREQ** _x_%@_freq_

> GPU 3D engine utilization and frequency.

**CPU@_x_C, GPU@_x_C, ...**

> Temperatures reported by the on-die thermal zones, in degrees Celsius.

**VDD_IN _x_/_y_, ...**

> Power rails in milliwatts shown as instantaneous/average, on boards equipped with INA power monitors.

# CAVEATS

Run with **sudo**; without root some counters cannot be read and the line is incomplete. Power readings are only available on boards that include the corresponding INA sensors, and the exact set of fields varies by Jetson module (Nano, TX2, Xavier, Orin) and L4T release. tegrastats is specific to Tegra SoCs and is not available on desktop NVIDIA GPUs.

# HISTORY

**tegrastats** is part of NVIDIA's **Linux for Tegra (L4T)** board support package, distributed with the **JetPack** SDK for the Jetson product line. It has long been the recommended built-in way to monitor Jetson system load, and the popular third-party **jtop** (jetson-stats) tool parses and builds on its output.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1), [htop](/man/htop)(1), [free](/man/free)(1)

# RESOURCES

```[Homepage](https://developer.nvidia.com/embedded/jetson-linux)```

```[Documentation](https://docs.nvidia.com/jetson/archives/r35.4.1/DeveloperGuide/text/AT/JetsonLinuxDevelopmentTools/TegrastatsUtility.html)```

<!-- verified: 2026-06-13 -->
