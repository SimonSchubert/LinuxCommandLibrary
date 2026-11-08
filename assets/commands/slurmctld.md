# TAGLINE

Slurm central management daemon

# TLDR

**Discard** all previous state from the last checkpoint (kills all jobs)

```slurmctld -c```

**Set** the daemon's nice value

```slurmctld -n [value]```

**Write** log messages to a specified file

```slurmctld -L [path/to/output_file]```

Run in the **foreground** with verbose logging

```slurmctld -D -vvv```

# SYNOPSIS

**slurmctld** [_options_]

# PARAMETERS

**-c**
> Discard state from the last checkpoint; kills all running and queued jobs and resets node states

**-i**
> Ignore errors found while reading state files on startup

**-r**
> Recover partial state from the last checkpoint (default)

**-R**
> Recover full state from the last checkpoint, including partition state and power save settings

**-s**
> Change working directory to the SlurmctldLogFile path or StateSaveLocation

**--systemd**
> Use when starting the daemon with systemd

**-n _value_**
> Set nice value (typically negative for higher priority)

**-L _logfile_**
> Write log to specified file

**-f _config_**
> Read configuration from specified file

**-D**
> Run in foreground (don't daemonize)

**-v**
> Verbose logging (can be repeated up to 6 times)

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

**SLURM_CONF**
> Environment variable giving the location of the Slurm configuration file; overridden by **-f**.

# CAVEATS

Must be run as root or the configured SlurmUser. Requires slurm.conf configuration. For high availability, can be configured with a backup controller. Clearing state (**-c**) kills all running and queued jobs, so it is rarely appropriate in production.

# SEE ALSO

[slurmd](/man/slurmd)(8), [scontrol](/man/scontrol)(1), [sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1)

# RESOURCES

```[Source code](https://github.com/SchedMD/slurm)```

```[Homepage](https://slurm.schedmd.com/)```

```[Documentation](https://slurm.schedmd.com/slurmctld.html)```

<!-- verified: 2026-11-08 -->
