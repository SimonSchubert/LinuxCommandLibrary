# TAGLINE

Display Slurm controller diagnostic information

# TLDR

**Show scheduling diagnostic information** (default mode)

```sdiag```

**Show diagnostics sorted by RPC total run time**

```sdiag -t```

**Show diagnostics sorted by RPC average run time**

```sdiag -T```

**Reset performance counters** (requires operator/admin privileges)

```sdiag -r```

**Output diagnostics as JSON**

```sdiag --json```

# SYNOPSIS

**sdiag** [_options_]

# PARAMETERS

**-a**, **--all**
> Get and report information. This is the default mode of operation.

**-h**, **--help**
> Print description of options and exit.

**-i**, **--sort-by-id**
> Sort RPC data by message type ID and user ID.

**-r**, **--reset**
> Reset scheduler and RPC counters to 0. Only supported for Slurm operators and administrators.

**-t**, **--sort-by-time**
> Sort RPC data by total run time.

**-T**, **--sort-by-time2**
> Sort RPC data by average run time.

**--json**
> Output information as JSON.

**--yaml**
> Output information as YAML.

**-V**, **--version**
> Print version number and exit.

**--usage**
> Print list of options and exit.

# DESCRIPTION

**sdiag** displays diagnostic information about slurmctld, the Slurm controller daemon. It shows performance metrics, scheduling statistics, RPC counters, and resource usage data.

This is useful for monitoring cluster health, troubleshooting scheduling performance, and identifying bottlenecks in the Slurm controller.

# CAVEATS

Requires appropriate permissions to access Slurm controller data. The reset option requires operator or administrator privileges and affects all users' view of counters.

# HISTORY

Part of **Slurm** workload manager, providing diagnostic tools for cluster administrators.

# SEE ALSO

[scontrol](/man/scontrol)(1), [sinfo](/man/sinfo)(1), [squeue](/man/squeue)(1), [sacct](/man/sacct)(1)
