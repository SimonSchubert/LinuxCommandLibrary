# TAGLINE

modify CPU frequency scaling settings

# TLDR

**Set the frequency governor** for a specific CPU

```sudo cpufreq-set -c [1] -g [performance]```

**Set the minimum frequency** allowed

```sudo cpufreq-set -c [1] -d [800MHz]```

**Set the maximum frequency** allowed

```sudo cpufreq-set -c [1] -u [2.4GHz]```

**Pin to a specific frequency** (requires userspace governor)

```sudo cpufreq-set -c [1] -f [2000MHz]```

**Apply settings to all CPUs sharing the policy**

```sudo cpufreq-set -r -g [powersave]```

# SYNOPSIS

**cpufreq-set** [_options_]

# PARAMETERS

**-c**, **--cpu** _cpu_
> CPU number to operate on. Defaults to CPU 0 when omitted.

**-d**, **--min** _freq_
> Set the minimum frequency the governor may select.

**-u**, **--max** _freq_
> Set the maximum frequency the governor may select.

**-g**, **--governor** _governor_
> Select the scaling governor (e.g. `performance`, `powersave`, `ondemand`, `conservative`, `schedutil`, `userspace`).

**-f**, **--freq** _freq_
> Pin the CPU to a specific frequency. Requires the `userspace` governor and cannot be combined with `-d`, `-u`, or `-g`.

**-r**, **--related**
> Also apply the change to every CPU hardware-related to the selected one.

**-h**, **--help**
> Show help.

# DESCRIPTION

**cpufreq-set** modifies the Linux kernel cpufreq policy for a CPU, adjusting the scaling governor, minimum and maximum frequencies, or pinning a fixed frequency. It is part of the **cpufrequtils** package.

Frequency values accept the suffixes `Hz`, `kHz` (default if no unit given), `MHz`, `GHz`, and `THz` appended directly to the number (for example `2400MHz` or `2.4GHz`). Valid values for the current CPU can be discovered with `cpufreq-info -l`.

# CAVEATS

Requires root privileges (or write access to `/sys/devices/system/cpu/cpu*/cpufreq/`). Pinning a fixed frequency only works when the `userspace` governor is active and loaded. Available governors depend on kernel configuration. Settings are not persisted across reboots; use a systemd unit or the `cpufrequtils` service to restore them at boot. On modern kernels using the `intel_pstate` driver, only the `performance` and `powersave` governors may be available.

# HISTORY

**cpufreq-set** ships with **cpufrequtils**, originally written by **Dominik Brodowski**. The newer **cpupower** suite (from the kernel tree) largely supersedes cpufrequtils on recent distributions.

# SEE ALSO

[cpufreq-info](/man/cpufreq-info)(1), [cpupower](/man/cpupower)(1)
