# TLDR

Show CPU frequency **info for all CPUs**

```cpufreq-info```

Show info for **specific CPU**

```cpufreq-info -c 0```

Show **hardware limits** (min/max frequency)

```cpufreq-info -l```

Show current **policy** in table format

```cpufreq-info -o```

Show available **governors**

```cpufreq-info -g```

Show **current frequency** (human-readable)

```cpufreq-info -f -m```

Show frequency from **hardware** (root only)

```sudo cpufreq-info -w -m```

Show **driver** in use

```cpufreq-info -d```

# SYNOPSIS

**cpufreq-info** [_options_]

# DESCRIPTION

**cpufreq-info** is a utility that prints CPU frequency scaling information from the kernel. It shows current frequencies, available governors, hardware limits, and other cpufreq-related data.

# PARAMETERS

**-c, --cpu CPU**
> Target a specific processor number

**-f, --freq**
> Display current CPU frequency as reported by kernel

**-w, --hwfreq**
> Read current frequency directly from hardware (root only)

**-l, --hwlimits**
> Show minimum and maximum hardware frequency limits

**-d, --driver**
> Show the active cpufreq kernel driver

**-p, --policy**
> Display the current frequency scaling policy

**-g, --governors**
> List available frequency governors

**-a, --related-cpus**
> Show CPUs sharing the same hardware frequency

**-s, --stats**
> Display frequency scaling statistics

**-y, --latency**
> Show maximum latency for frequency transitions

**-o, --proc**
> Display settings in /proc/cpufreq format

**-m, --human**
> Format output in human-readable form (for -f, -w, -s, -y)

# CAVEATS

Multiple output-specific options cannot be combined in a single invocation. The -w option requires root privileges to read frequency directly from hardware. The -o option is incompatible with -c.

# HISTORY

**cpufreq-info** is part of the **cpufrequtils** package, providing user-space utilities for Linux CPU frequency scaling.

# SEE ALSO

[cpufreq-set](/man/cpufreq-set)(1), [cpupower](/man/cpupower)(1), [auto-cpufreq](/man/auto-cpufreq)(1)
