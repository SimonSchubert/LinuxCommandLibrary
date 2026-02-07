# TAGLINE

calculate actual CPU frequency using hardware counters

# TLDR

Start calculating for **all CPUs** with 1 second interval

```sudo cpufreq-aperf```

Calculate for **specific CPU**

```sudo cpufreq-aperf -c [1]```

Set **refresh interval** to 3 seconds

```sudo cpufreq-aperf -i [3]```

Calculate **only once**

```sudo cpufreq-aperf -o```

# SYNOPSIS

**cpufreq-aperf** [_options_]

# DESCRIPTION

**cpufreq-aperf** calculates the average CPU frequency over a time period using APERF/MPERF MSR registers. This provides actual operating frequency rather than the requested frequency.

Useful for verifying CPU frequency scaling and turbo boost behavior.

# PARAMETERS

**-c, --cpu** _cpu_
> Specific CPU to monitor

**-i, --interval** _seconds_
> Refresh interval in seconds

**-o, --once**
> Calculate once and exit

# CAVEATS

Requires root privileges. Only works on CPUs that support APERF/MPERF counters (Intel and AMD processors). Part of cpufrequtils.

# SEE ALSO

[cpufreq-info](/man/cpufreq-info)(1), [cpufreq-set](/man/cpufreq-set)(1), [cpupower](/man/cpupower)(1)
