# TAGLINE

CPU power management and tuning tools

# TLDR

**List** all CPUs

```sudo cpupower -c all info```

Set **power-saving governor** for all CPUs

```sudo cpupower -c all frequency-set --governor powersave```

Show **available governors** for CPU 0

```sudo cpupower -c 0 frequency-info -g | grep "analyzing\|governors"```

Get CPU 4's **hardware frequency**

```sudo cpupower -c 4 frequency-info -w -m```

# SYNOPSIS

**cpupower** [_-c cpus_] _subcommand_ [_options_]

# DESCRIPTION

**cpupower** is a collection of tools for CPU power management and tuning. It replaces the older cpufrequtils package and provides unified access to frequency scaling, idle states, and power features.

Subcommands include frequency-info, frequency-set, idle-info, idle-set, and monitor.

# PARAMETERS

**-c, --cpu** _cpus_
> Specify CPU(s) to operate on (e.g., 0, 1-3, all)

**frequency-info**
> Show current frequency settings

**frequency-set**
> Modify frequency settings

**idle-info**
> Show idle state information

**monitor**
> Monitor CPU frequency and idle states

**--governor** _gov_
> Set frequency governor

**-m, --human**
> Human-readable output

# CAVEATS

Requires root privileges for setting values. Available governors and features depend on hardware and kernel configuration. Replaces cpufreq-info and cpufreq-set.

# SEE ALSO

[cpufreq-info](/man/cpufreq-info)(1), [cpufreq-set](/man/cpufreq-set)(1), [turbostat](/man/turbostat)(8)
