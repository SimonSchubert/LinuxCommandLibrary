# TAGLINE

Cancel Slurm jobs by ID or filter

# TLDR

**Cancel** a job by ID

```scancel [job_id]```

Cancel all jobs from a **user**

```scancel -u [username]```

Cancel all **pending** jobs

```scancel -t PENDING```

Cancel jobs by **name**

```scancel --name [job_name]```

Cancel a specific **array task**

```scancel [job_id]_[task_id]```

**Signal** a job instead of cancelling

```scancel -s [SIGTERM] [job_id]```

# SYNOPSIS

**scancel** [_options_] [_job_id_...]

# PARAMETERS

**-u**, **--user** _username_
> Cancel all jobs owned by user

**-t**, **--state** _state_
> Cancel jobs in specified state (PENDING, RUNNING, SUSPENDED)

**-n**, **--name** _name_
> Cancel jobs with specified name

**-p**, **--partition** _name_
> Cancel jobs in specified partition

**-s**, **--signal** _signal_
> Send signal instead of SIGKILL

**-A**, **--account** _account_
> Cancel jobs under specified account

**-q**, **--qos** _qos_
> Cancel jobs with specified QOS

**-i**, **--interactive**
> Confirm each cancellation

**-v**, **--verbose**
> Verbose output

# DESCRIPTION

**scancel** cancels pending or running jobs in a Slurm cluster. Jobs can be cancelled by numeric ID, filtered by user, partition, state, or job name. Multiple job IDs can be specified on the command line.

For job arrays, individual tasks can be cancelled using the `job_id_task_id` notation. Cancelled jobs are terminated and resources are released back to the cluster.

# CAVEATS

Users can only cancel their own jobs unless they have administrator privileges. Cancelling running jobs may result in incomplete work. The default signal is SIGKILL; use **-s** to send a gentler signal first.

# HISTORY

Part of **Slurm** workload manager, providing job control for HPC clusters.

# SEE ALSO

[squeue](/man/squeue)(1), [sbatch](/man/sbatch)(1), [scontrol](/man/scontrol)(1)
