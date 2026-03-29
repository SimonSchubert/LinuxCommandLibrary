# TAGLINE

enable and disable individual CPUs

# TLDR

**Disable** one or more CPUs

```chcpu -d [1,3]```

**Enable** one or more CPU ranges

```chcpu -e [1-3,5-7]```

**Configure** CPUs (request from hypervisor)

```chcpu -c [0,1,2]```

**Deconfigure** CPUs (return to hypervisor)

```chcpu -g [3,4]```

**Rescan** for new CPUs

```chcpu -r```

**Set CPU dispatching mode** (polarization)

```chcpu -p [horizontal]```

# SYNOPSIS

**chcpu** [_options_]

# DESCRIPTION

**chcpu** can enable or disable CPUs, scan for new CPUs, change the CPU dispatching mode of the underlying hypervisor, and request CPUs from the hypervisor (configure) or return CPUs to the hypervisor (deconfigure).

CPUs are specified by their logical IDs using a comma-separated cpu-list that can contain individual addresses or ranges (e.g., `0,5,7,9-11`).

# PARAMETERS

**-c**, **--configure** _cpu-list_
> Configure the specified CPUs. The hypervisor takes a CPU from the CPU pool and assigns it to the virtual hardware on which your kernel runs.

**-d**, **--disable** _cpu-list_
> Disable the specified CPUs. The kernel sets them offline.

**-e**, **--enable** _cpu-list_
> Enable the specified CPUs. The kernel sets them online. A CPU must be configured before it can be enabled.

**-g**, **--deconfigure** _cpu-list_
> Deconfigure the specified CPUs. The hypervisor removes the CPU from the virtual hardware and returns it to the CPU pool.

**-p**, **--dispatch** _mode_
> Set the CPU dispatching mode (polarization). Supported modes are `horizontal` (workload spread across all CPUs) and `vertical` (workload concentrated on few CPUs). Only effective if the hardware architecture and hypervisor support CPU polarization.

**-r**, **--rescan**
> Trigger a rescan of CPUs. After a rescan, the Linux kernel recognizes new CPUs.

**-h**, **--help**
> Display help text and exit.

**-V**, **--version**
> Print version information and exit.

# CAVEATS

Cannot disable CPU 0 on most systems. Disabling CPUs migrates processes to remaining CPUs. Requires root privileges. Not all hardware supports CPU hotplug. The `--dispatch` and `--configure`/`--deconfigure` options require hypervisor support.

# SEE ALSO

[lscpu](/man/lscpu)(1), [taskset](/man/taskset)(1), [numactl](/man/numactl)(8), [nproc](/man/nproc)(1)
