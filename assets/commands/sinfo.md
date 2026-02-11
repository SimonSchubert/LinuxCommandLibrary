# TAGLINE

Display Slurm cluster partition and node status

# TLDR

**Show** a quick summary overview of the cluster

```sinfo -s```

**View** the detailed status of all partitions

```sinfo```

**View** the detailed status of a specific partition

```sinfo -p [partition_name]```

**View** information about idle nodes

```sinfo -t idle```

**Summarise** dead nodes

```sinfo -d```

**List** dead nodes and their reasons

```sinfo -R```

# SYNOPSIS

**sinfo** [_options_]

# PARAMETERS

**-s, --summarize**
> Display summary of partitions

**-p, --partition _name_**
> Show specific partition

**-t, --states _states_**
> Filter by node state (idle, allocated, down, etc.)

**-d, --dead**
> Show only non-responding nodes

**-R, --list-reasons**
> List reasons nodes are down or drained

**-l, --long**
> Long output format with more details

**-N, --Node**
> Display node-centric output

**-o, --format _format_**
> Customize output format

# DESCRIPTION

**sinfo** reports the state of partitions and nodes managed by Slurm. It shows information about available computing resources including node counts, partition limits, and current states.

Common node states include: **idle** (available), **allocated** (in use), **down** (unavailable), **drain** (draining), and **mix** (some CPUs allocated).

# CAVEATS

Information reflects the current Slurm scheduler state, which may have brief delays from actual node status. Complex clusters may require filtering to view relevant information.

# SEE ALSO

[squeue](/man/squeue)(1), [sbatch](/man/sbatch)(1), [scontrol](/man/scontrol)(1), [srun](/man/srun)(1)
