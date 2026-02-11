# TAGLINE

Report CPU frequency, power, and idle statistics

# TLDR

**Display** statistics every 5 seconds

```sudo turbostat```

**Display** statistics every specified amount of seconds

```sudo turbostat -i [n_seconds]```

**Display** statistics without header information

```sudo turbostat --quiet```

**Display** useful CPU information every second for specific CPUs

```sudo turbostat --quiet -i 1 --cpu 0-[CPU_count] --show "PkgWatt","Busy%","Core","CoreTmp"```

# SYNOPSIS

**turbostat** [_options_] [_command_...]

# PARAMETERS

**-i, --interval _seconds_**
> Sampling interval (default: 5 seconds)

**--quiet**
> Don't print system configuration header

**--cpu _list_**
> Specify which CPUs to monitor

**--show _columns_**
> Select columns to display

**--hide _columns_**
> Hide specified columns

**--out _file_**
> Write output to file

**--debug**
> Enable debug output

# DESCRIPTION

**turbostat** reports processor topology, frequency, temperature, power consumption, and idle statistics for Intel and AMD processors. It reads hardware performance counters and model-specific registers.

The tool is valuable for understanding CPU behavior under load, identifying thermal throttling, and analyzing power consumption. It shows per-core and per-package statistics.

# CAVEATS

Requires root privileges and access to MSR (Model Specific Registers). Works best on Intel processors; AMD support varies. Some features require specific CPU models. Part of the Linux kernel tools.

# SEE ALSO

[cpupower](/man/cpupower)(1), [lscpu](/man/lscpu)(1), [sensors](/man/sensors)(1), [powertop](/man/powertop)(8)
