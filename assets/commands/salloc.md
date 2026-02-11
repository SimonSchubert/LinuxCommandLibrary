# TAGLINE

Allocate Slurm cluster resources interactively

# TLDR

Start an **interactive shell** on a cluster node

```salloc```

**Execute command** on a cluster node

```salloc ls --all```

Allocate nodes with **constraints**

```salloc -C "(amd|intel)&gpu"```

# SYNOPSIS

**salloc** [_options_] [_command_]

# PARAMETERS

**-C**, **--constraint** _expr_
> Node feature constraints

# DESCRIPTION

**salloc** allocates resources from a Slurm cluster and starts an interactive shell or executes a specified command. It waits for resources to become available before starting.

Constraints can specify required node features like CPU type, GPU availability, or memory configuration.

# CAVEATS

Resources are held until the shell exits or command completes. Allocation time depends on cluster load and requested resources.

# HISTORY

Part of **Slurm** workload manager, providing interactive resource allocation for HPC clusters.

# SEE ALSO

[srun](/man/srun)(1), [sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1)
