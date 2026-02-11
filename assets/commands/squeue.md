# TAGLINE

View Slurm job queue status

# TLDR

**View** the job queue

```squeue```

**View** jobs queued by a specific user

```squeue -u [username]```

**View** the queue and refresh every 5 seconds

```squeue -i 5```

**View** the queue with expected start times

```squeue --start```

# SYNOPSIS

**squeue** [_options_]

# PARAMETERS

**-u, --user _username_**
> Show only jobs owned by specified user

**-i, --iterate _seconds_**
> Refresh display at specified interval

**--start**
> Show expected start time for pending jobs

**-j, --jobs _job_list_**
> Show specific job IDs

**-p, --partition _name_**
> Show jobs in specific partition

**-t, --states _states_**
> Filter by job state (pending, running, etc.)

**-l, --long**
> Long output format

**-o, --format _format_**
> Customize output format

**-S, --sort _field_**
> Sort output by field

# DESCRIPTION

**squeue** displays information about jobs in the Slurm scheduling queue. It shows job ID, partition, name, user, state, time, nodes, and node list for jobs awaiting or running on the cluster.

Common job states include: **PD** (pending), **R** (running), **CG** (completing), **CD** (completed), **F** (failed), and **CA** (cancelled).

# CAVEATS

Shows only jobs visible to the querying user based on Slurm's access controls. Very large job queues may benefit from filtering options. The **--start** estimated times are approximations.

# SEE ALSO

[sbatch](/man/sbatch)(1), [sinfo](/man/sinfo)(1), [scancel](/man/scancel)(1), [scontrol](/man/scontrol)(1)
