# TAGLINE

dynamic load balancing library and tools for HPC parallel applications

# TLDR

**List CPU affinity of all DLB processes**

```dlb_taskset --list```

**Remove CPU ownership** from any DLB process

```dlb_taskset --remove [4-7]```

**Show DLB variables and their current values**

```dlb --help```

**Print process affinity**

```dlb --affinity```

**Set CPU affinity for a DLB process**

```dlb_taskset --set [0-3] --pid [pid]```

**Borrow CPUs for a new application**

```dlb_taskset --borrow --set [0-7] -- [application]```

**Display help information**

```dlb_taskset --help```

# SYNOPSIS

**dlb_taskset** **--list** [**--pid** _pid_]

**dlb_taskset** **--set** _cpu_list_ **--pid** _pid_

**dlb_taskset** **--set** _cpu_list_ [**--borrow**] _application_

**dlb_taskset** **--remove** _cpu_list_ [**--pid** _pid_]

**dlb** {**--affinity** | **--gpu-affinity** [**--uuid**] | **--test-init** | **--help** | **--version**}

# PARAMETERS

**-l**, **--list**
> List all DLB processes and their CPU masks.

**-s**, **--set** _CPU_LIST_
> Set CPU affinity. Accepts decimal lists and ranges (0,5-7), binary masks (0b11100001) or hexadecimal masks (0xE1).

**-c**, **--cpus** _CPU_LIST_
> Same as **--set**.

**-r**, **--remove** _CPU_LIST_
> Remove CPU ownership from any DLB process according to the list.

**-p**, **--pid** _PID_
> Operate only on the given process.

**-b**, **--borrow**
> Borrow CPUs instead of stealing; CPUs are returned when the application ends.

**-f**, **--free-to-slurm**
> Make Slurm free CPUs.

**--color**[=_WHEN_]
> Colorize output (no disables it).

**-h**, **--help**
> Display help information.

**dlb -a**, **--affinity**
> Print process affinity.

**dlb -g**, **--gpu-affinity**
> Print process and GPU affinity.

**dlb -i**, **--test-init**
> Test DLB initialization.

**dlb -h**, **--help**
> Print DLB variables and current values. Use twice (**-hh**) for extended info.

# DESCRIPTION

**DLB** (Dynamic Load Balancing) is a library that dynamically redistributes computational resources among processes within the same shared memory node. It improves load balance of the outer level of parallelism (e.g., MPI) by adjusting resources at the inner level (e.g., OpenMP).

DLB provides three main components: **LeWI** (Lend When Idle) redistributes unused CPUs between processes, **DROM** (Dynamic Resource Ownership Manager) manages CPU affinity, and **TALP** (Tracking Application Live Performance) gathers performance data.

The **dlb_taskset** command-line tool manages CPU affinity of DLB-enabled processes and can launch new applications with specific CPU assignments. The **dlb** utility displays DLB options and version information and checks process affinity.

# CAVEATS

Requires DLB-enabled applications linked against the DLB library. Best suited for iterative HPC applications with varying workloads. Processes must run on the same shared memory node.

# HISTORY

DLB was developed at the **Barcelona Supercomputing Center (BSC)** for high-performance computing applications. It is distributed under the **LGPL-3.0** license.

# SEE ALSO

[mpirun](/man/mpirun)(1), [srun](/man/srun)(1), [taskset](/man/taskset)(1)

# RESOURCES

```[Source code](https://github.com/bsc-pm/dlb)```

```[Homepage](https://pm.bsc.es/dlb)```

```[Documentation](https://dlb-docs.readthedocs.io/en/stable/)```

<!-- verified: 2026-11-09 -->
