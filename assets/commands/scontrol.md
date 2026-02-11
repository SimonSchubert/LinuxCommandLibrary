# TAGLINE

View and modify Slurm configuration and state

# TLDR

**Show** information for a job

```scontrol show job [job_id]```

**Suspend** a comma-separated list of running jobs

```scontrol suspend [job_id1,job_id2,...]```

**Resume** a comma-separated list of suspended jobs

```scontrol resume [job_id1,job_id2,...]```

**Hold** a comma-separated list of queued jobs

```scontrol hold [job_id1,job_id2,...]```

**Release** a comma-separated list of held jobs

```scontrol release [job_id1,job_id2,...]```

# SYNOPSIS

**scontrol** [_options_] [_command_] [_arguments_]

# PARAMETERS

**show job _job_id_**
> Display detailed information about a job

**suspend _job_id_**
> Suspend a running job

**resume _job_id_**
> Resume a suspended job

**hold _job_id_**
> Prevent a pending job from starting

**release _job_id_**
> Release a held job for scheduling

**requeue _job_id_**
> Return a running job to the queue

**update**
> Modify job, node, or partition properties

**-d, --details**
> Show detailed information

# DESCRIPTION

**scontrol** is the Slurm control tool for viewing and modifying jobs, partitions, nodes, and configuration. It is the primary administrative interface for managing a Slurm cluster's workload.

Common uses include checking job status, suspending/resuming jobs, holding jobs in the queue, and modifying job parameters.

# CAVEATS

Some operations require administrative privileges. Suspending jobs may cause issues with time-sensitive applications. Changes to running jobs may affect other scheduled jobs.

# SEE ALSO

[sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1), [scancel](/man/scancel)(1), [sacctmgr](/man/sacctmgr)(1)
