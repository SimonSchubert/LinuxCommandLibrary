# TLDR

**Report** node rebooted when daemon restarts (for testing)

```slurmd -b```

**Run** the daemon with a given nodename

```slurmd -N [nodename]```

**Write** log messages to a specified file

```slurmd -L [path/to/output_file]```

**Read** configuration from a specified file

```slurmd -f [path/to/file]```

# SYNOPSIS

**slurmd** [_options_]

# PARAMETERS

**-b**
> Report node rebooted when daemon restarts

**-N _nodename_**
> Run with specified node name

**-L _logfile_**
> Write log to specified file

**-f _config_**
> Read configuration from specified file

**-c**
> Clear previous node state

**-D**
> Run in foreground (don't daemonize)

**-v**
> Verbose logging

**-h**
> Display help information

**-V**
> Display version information

# DESCRIPTION

**slurmd** is the Slurm compute node daemon. It monitors all tasks running on the compute node, accepts new tasks from the central controller, launches tasks, and terminates running tasks upon request.

Each compute node in a Slurm cluster runs slurmd to participate in workload scheduling and execution. The daemon communicates with **slurmctld** (the central controller) for job management.

# CAVEATS

Must be run as root. Requires proper Slurm configuration (slurm.conf). The node must be registered with the Slurm controller. Firewall must allow communication with slurmctld.

# SEE ALSO

[slurmctld](/man/slurmctld)(8), [scontrol](/man/scontrol)(1), [sbatch](/man/sbatch)(1), [sinfo](/man/sinfo)(1)
