# TLDR

Show **all performance counters**

```sdiag -a```

**Reset** performance counters

```sdiag -r```

Output as **JSON** or YAML

```sdiag -a --json```

Specify **cluster**

```sdiag -a -M cluster_name```

# SYNOPSIS

**sdiag** [_options_]

# PARAMETERS

**-a**, **--all**
> Show all performance counters

**-r**, **--reset**
> Reset performance counters

**--json**, **--yaml**
> Output format

**-M**, **--cluster** _name_
> Target specific cluster

# DESCRIPTION

**sdiag** displays diagnostic information about slurmctld, the Slurm controller daemon. It shows performance metrics, scheduling statistics, and resource usage counters.

This is useful for monitoring cluster health and troubleshooting scheduling performance.

# CAVEATS

Requires appropriate permissions to access Slurm controller data. Reset option affects all users' view of counters.

# HISTORY

Part of **Slurm** workload manager, providing diagnostic tools for cluster administrators.

# SEE ALSO

[scontrol](/man/scontrol)(1), [sinfo](/man/sinfo)(1), [squeue](/man/squeue)(1)
