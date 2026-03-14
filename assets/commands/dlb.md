# TAGLINE

dynamic load balancing library and tools for HPC parallel applications

# TLDR

**List CPU affinity of all DLB processes**

```dlb_taskset --list```

**Set CPU affinity for a DLB process**

```dlb_taskset --set [0-3] --pid [pid]```

**Borrow CPUs for a new application**

```dlb_taskset --borrow --set [0-7] -- [application]```

**Display help information**

```dlb_taskset --help```

# SYNOPSIS

**dlb_taskset** [_options_] [**--**] [_command_]

# PARAMETERS

**--list**
> List CPU affinity of all DLB processes.

**--set** _MASK_
> Set CPU affinity mask for a process.

**--pid** _PID_
> Specify process ID to operate on.

**--borrow**
> Borrow CPUs instead of stealing; CPUs are returned when the application ends.

**--color** _WHEN_
> Colorize output (yes, auto, no).

**--help**
> Display help information.

# DESCRIPTION

**DLB** (Dynamic Load Balancing) is a library that dynamically redistributes computational resources among processes within the same shared memory node. It improves load balance of the outer level of parallelism (e.g., MPI) by adjusting resources at the inner level (e.g., OpenMP).

DLB provides three main components: **LeWI** (Lend When Idle) redistributes unused CPUs between processes, **DROM** (Dynamic Resource Ownership Manager) manages CPU affinity, and **TALP** (Tracking Application Live Performance) gathers performance data.

The **dlb_taskset** command-line tool manages CPU affinity of DLB-enabled processes and can launch new applications with specific CPU assignments.

# CAVEATS

Requires DLB-enabled applications linked against the DLB library. Best suited for iterative HPC applications with varying workloads. Processes must run on the same shared memory node.

# HISTORY

DLB was developed at the **Barcelona Supercomputing Center (BSC)** for high-performance computing applications. It is distributed under the **LGPL-3.0** license.

# SEE ALSO

[mpirun](/man/mpirun)(1), [srun](/man/srun)(1)
