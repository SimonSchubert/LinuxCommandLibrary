# TAGLINE

modify CPU frequency scaling settings

# TLDR

Set CPU frequency **governor**

```sudo cpufreq-set -c [1] -g [userspace]```

Set **minimum** CPU frequency

```sudo cpufreq-set -c [1] -d [min_frequency]```

Set **maximum** CPU frequency

```sudo cpufreq-set -c [1] -u [max_frequency]```

Set **specific frequency**

```sudo cpufreq-set -c [1] -f [frequency]```

# SYNOPSIS

**cpufreq-set** [_options_]

# DESCRIPTION

**cpufreq-set** modifies CPU frequency settings including governor, minimum/maximum frequencies, and fixed frequency. Frequency values should be within the range shown by cpufreq-info -l.

Part of the cpufrequtils package for CPU frequency scaling management.

# PARAMETERS

**-c, --cpu** _cpu_
> Specify CPU number

**-g, --governor** _governor_
> Set frequency governor (ondemand, powersave, performance, userspace)

**-d, --min** _freq_
> Set minimum frequency

**-u, --max** _freq_
> Set maximum frequency

**-f, --freq** _freq_
> Set specific frequency (requires userspace governor)

# CAVEATS

Requires root privileges. Setting a fixed frequency requires the userspace governor. Available governors depend on kernel configuration. Settings may not persist across reboots.

# SEE ALSO

[cpufreq-info](/man/cpufreq-info)(1), [cpupower](/man/cpupower)(1)
