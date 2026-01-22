# TLDR

**Disable** one or more CPUs

```chcpu -d [1,3]```

**Enable** one or more CPU ranges

```chcpu -e [1-3,5-7]```

# SYNOPSIS

**chcpu** [_options_]

# DESCRIPTION

**chcpu** enables and disables individual CPUs on a running system. This is useful for power management, testing, or isolating CPUs for specific workloads.

CPUs are specified by their logical IDs, which can be found in /proc/cpuinfo or using lscpu.

# PARAMETERS

**-d, --disable** _cpus_
> Disable specified CPUs

**-e, --enable** _cpus_
> Enable specified CPUs

**-c, --configure** _cpus_
> Configure CPUs (make available for enabling)

**-g, --deconfigure** _cpus_
> Deconfigure CPUs

**-r, --rescan**
> Rescan for CPUs

# CAVEATS

Cannot disable CPU 0 on most systems. Disabling CPUs migrates processes to remaining CPUs. Requires root privileges. Not all hardware supports CPU hotplug.

# SEE ALSO

[lscpu](/man/lscpu)(1), [taskset](/man/taskset)(1), [numactl](/man/numactl)(8)
