# TLDR

**Delete job**

```qdel [job_id]```

**Delete multiple jobs**

```qdel [job_id1] [job_id2] [job_id3]```

**Delete all user's jobs**

```qdel -u [username]```

**Force delete**

```qdel -f [job_id]```

**Delete job array**

```qdel [job_id][]```

# SYNOPSIS

**qdel** [_options_] _job_ids_...

# PARAMETERS

**-f**, **--force**
> Force deletion.

**-u** _user_
> Delete all jobs for user.

**-W** _time_
> Delay deletion.

**-p**
> Purge job (remove all traces).

# DESCRIPTION

**qdel** deletes jobs from the batch job queue. It's part of PBS/Torque, SGE, or similar job scheduling systems used on HPC clusters.

# EXAMPLES

```bash
# Delete single job
qdel 12345

# Delete multiple jobs
qdel 12345 12346 12347

# Delete range
qdel 12345-12350

# Force kill
qdel -f 12345

# Delete all my jobs
qdel -u $(whoami)

# Delete array job
qdel 12345[]

# Delete specific array task
qdel 12345[5]
```

# JOB STATES

Jobs can be deleted in these states:
- Queued (Q)
- Running (R)
- Held (H)

# CAVEATS

Syntax varies between PBS, SGE, SLURM. Running jobs may take time to terminate. Admin may restrict deletion.

# HISTORY

qdel is part of the **PBS** (Portable Batch System) originally developed at NASA Ames Research Center.

# SEE ALSO

[qsub](/man/qsub)(1), [qstat](/man/qstat)(1), [qhold](/man/qhold)(1), [scancel](/man/scancel)(1)
