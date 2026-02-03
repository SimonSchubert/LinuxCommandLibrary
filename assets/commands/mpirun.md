# TLDR

**Run MPI program**

```mpirun -np [4] [program]```

**Run on multiple hosts**

```mpirun -np [8] --hostfile [hosts.txt] [program]```

**Run with specific slots per host**

```mpirun -np [4] --map-by node [program]```

# SYNOPSIS

**mpirun** [_options_] _program_ [_args_...]

# PARAMETERS

**-np** _n_
> Number of processes.

**--hostfile** _file_
> File with host list.

**--host** _hosts_
> Comma-separated hosts.

**--map-by** _policy_
> Process mapping (node, slot, core).

**--bind-to** _policy_
> Process binding.

**-x** _var_
> Export environment variable.

# DESCRIPTION

**mpirun** launches MPI parallel programs. Starts multiple processes across nodes for distributed computing. Part of OpenMPI or MPICH implementations.

# SEE ALSO

[mpiexec](/man/mpiexec)(1), [mpicc](/man/mpicc)(1)

