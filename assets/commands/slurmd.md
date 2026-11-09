# TAGLINE

Slurm compute node daemon

# TLDR

**Report** node rebooted when daemon restarts (for testing)

```slurmd -b```

**Run** the daemon in the foreground with verbose logging

```slurmd -D -v```

**Run** the daemon with a given nodename

```slurmd -N [nodename]```

**Write** log messages to a specified file

```slurmd -L [path/to/output_file]```

**Read** configuration from a specified file

```slurmd -f [path/to/file]```

**Discard** saved state and kill all jobs on this node

```slurmd -c```

**Print** the node's actual hardware configuration and exit

```slurmd -C```

**Fetch** configuration from a controller (configless mode)

```slurmd --conf-server [controller:6817]```

**Start** as a dynamic node

```slurmd -Z --conf "[Gres=gpu:2]"```

# SYNOPSIS

**slurmd** [_options_]

# PARAMETERS

**-b**
> Report node rebooted when daemon restarts

**-N _nodename_**
> Run with specified node name. Used to emulate a larger system with several slurmd daemons per node; requires a build with **--enable-multiple-slurmd**

**-L _logfile_**
> Write log to specified file

**-f _config_**
> Read configuration from specified file

**-c**
> Discard saved slurmd state and kill all jobs and job steps on this node

**-D**
> Run in foreground with logging copied to stderr

**-v**
> Verbose logging (repeat to increase verbosity)

**-M**
> Lock slurmd pages into memory using mlockall(2) to disable paging of the daemon

**-C**
> Print the actual hardware configuration in slurm.conf format, plus uptime, and exit

**-G**
> Print the GRES configuration for this node and exit

**-Z**
> Start as a dynamic normal node

**-F**[_feature_]
> Start as a dynamic future node, optionally matching a node definition by feature

**--conf** _parameters_
> Override or define node parameters of a dynamic node, using slurm.conf syntax

**--conf-server** _host_[:_port_]
> Comma-separated list of controllers to fetch the configuration from in configless mode

**-n** _value_
> Set the daemon's nice value

**-s**
> Change working directory to the SlurmdLogFile path, or SlurmdSpoolDir, falling back to /var/tmp

**--systemd**
> Use when started by systemd, so that slurmd can notify it of the new PID on `scontrol reconfigure`

**-h**
> Display help information

**-V**, **--version**
> Display version information

# DESCRIPTION

**slurmd** is the Slurm compute node daemon. It monitors all tasks running on the compute node, accepts new tasks from the central controller, launches tasks, and terminates running tasks upon request.

Each compute node in a Slurm cluster runs slurmd to participate in workload scheduling and execution. The daemon communicates with **slurmctld** (the central controller) for job management.

# CAVEATS

Must be run as root. Requires proper Slurm configuration (slurm.conf), unless running configless. Unless started as a dynamic node, the node must be defined in slurm.conf. Firewall must allow communication with slurmctld. Restarting without **-c** is normally sufficient after an abnormal termination, since running slurmstepd processes are picked up again.

# SEE ALSO

[slurmctld](/man/slurmctld)(8), [scontrol](/man/scontrol)(1), [sbatch](/man/sbatch)(1), [srun](/man/srun)(1), [squeue](/man/squeue)(1), [sinfo](/man/sinfo)(1)

# RESOURCES

```[Source code](https://github.com/SchedMD/slurm)```

```[Homepage](https://slurm.schedmd.com/)```

```[Documentation](https://slurm.schedmd.com/slurmd.html)```

<!-- verified: 2026-11-09 -->
