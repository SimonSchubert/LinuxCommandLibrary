# TAGLINE

dynamic load balancing for parallel applications

# TLDR

**Run DLB load balancing**

```dlb [command]```

**Show DLB status**

```dlb status```

**Configure load balancing** parameters

```dlb configure --mode [dynamic]```

**Display help information**

```dlb --help```

# SYNOPSIS

**dlb** [_options_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> DLB operation to perform.

**status**
> Show current status.

**configure**
> Set configuration options.

**--mode** _MODE_
> Load balancing mode.

**--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**dlb** (Dynamic Load Balancing) is a library and runtime for load balancing in parallel applications. It enables dynamic redistribution of computational work across processes or threads to improve efficiency.

DLB addresses load imbalance in HPC applications where work distribution varies over time. By allowing processes to share computational resources dynamically, it improves parallel efficiency without requiring application redesign.

The library integrates with MPI applications and supports various programming models. The dlb command provides runtime control and monitoring of DLB-enabled applications.

# CAVEATS

Requires DLB-enabled applications. Effectiveness depends on application characteristics. Some overhead for load monitoring. Best suited for iterative applications with varying workloads.

# HISTORY

DLB was developed at the **Barcelona Supercomputing Center (BSC)** for high-performance computing applications. It provides dynamic load balancing capabilities for parallel applications running on supercomputers and clusters.

# SEE ALSO

[mpirun](/man/mpirun)(1), [srun](/man/srun)(1)
