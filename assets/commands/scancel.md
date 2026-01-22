# TLDR

**Cancel** a job by ID

```scancel job_id```

Cancel all jobs from a **user**

```scancel user_name```

# SYNOPSIS

**scancel** [_options_] [_job_id_|_user_]

# DESCRIPTION

**scancel** cancels pending or running jobs in a Slurm cluster. Jobs can be cancelled by ID or all jobs from a specific user can be cancelled at once.

Cancelled jobs are terminated immediately and resources are released back to the cluster.

# CAVEATS

Cancelling running jobs may result in incomplete work. Users can only cancel their own jobs unless they have administrator privileges.

# HISTORY

Part of **Slurm** workload manager, providing job control for HPC clusters.

# SEE ALSO

[squeue](/man/squeue)(1), [sbatch](/man/sbatch)(1), [scontrol](/man/scontrol)(1)
