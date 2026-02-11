# TAGLINE

Broadcast files to Slurm job allocation nodes

# TLDR

**Send** a file to all allocated nodes

```sbcast path/to/file path/to/destination```

Send with **shared libraries** auto-detection

```sbcast --send-libs=yes path/to/executable path/to/destination```

# SYNOPSIS

**sbcast** [_options_] _source_ _destination_

# PARAMETERS

**--send-libs** _yes|no_
> Autodetect and transmit shared library dependencies

# DESCRIPTION

**sbcast** sends files to all nodes allocated to a Slurm job. It efficiently distributes files across compute nodes using the Slurm infrastructure.

This command should only be used from within a Slurm batch job, not from the login node directly.

# CAVEATS

Must be run within a Slurm job context. File distribution time depends on file size and number of nodes.

# HISTORY

Part of **Slurm** workload manager, providing efficient file distribution for HPC workflows.

# SEE ALSO

[sbatch](/man/sbatch)(1), [srun](/man/srun)(1), [salloc](/man/salloc)(1)
