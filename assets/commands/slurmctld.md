# TAGLINE

Slurm central management daemon

# TLDR

**Clear** all previous state from last checkpoint

```slurmctld -c```

**Set** the daemon's nice value

```slurmctld -n [value]```

**Write** log messages to a specified file

```slurmctld -L [path/to/output_file]```

# SYNOPSIS

**slurmctld** [_options_]

# PARAMETERS

**-c**
> Clear all previous state and start fresh

**-n _value_**
> Set nice value (typically negative for higher priority)

**-L _logfile_**
> Write log to specified file

**-f _config_**
> Read configuration from specified file

**-D**
> Run in foreground (don't daemonize)

**-v**
> Verbose logging (can be repeated)

**-h**
> Display help information

**-V**
> Display version information

# DESCRIPTION

**slurmctld** is the central management daemon for Slurm. It monitors all other Slurm daemons and resources, accepts work (jobs) from users, and allocates computing resources to those jobs.

The controller maintains the state of the entire cluster including node availability, job queues, and resource allocations. It is typically run on a dedicated management node.

# CONFIGURATION

**/etc/slurm/slurm.conf**
> Main Slurm configuration file defining cluster nodes, partitions, scheduling policies, and controller settings.

**/etc/slurm/cgroup.conf**
> Control group configuration for resource isolation and accounting.

# CAVEATS

Must be run as root or the configured SlurmUser. Requires slurm.conf configuration. For high availability, can be configured with a backup controller. Clearing state (**-c**) will lose all job history.

# SEE ALSO

[slurmd](/man/slurmd)(8), [scontrol](/man/scontrol)(1), [sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1)
