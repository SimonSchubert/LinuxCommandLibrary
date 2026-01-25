# TLDR

**Show all jobs**

```qstat```

**Show user's jobs**

```qstat -u [username]```

**Show full job details**

```qstat -f [job_id]```

**Show queue status**

```qstat -Q```

**Show running jobs**

```qstat -r```

# SYNOPSIS

**qstat** [_options_] [_job_ids_...]

# PARAMETERS

**-f**
> Full job information.

**-u** _user_
> Jobs for specific user.

**-Q**
> Queue status.

**-q**
> Queue summary.

**-r**
> Running jobs only.

**-n**
> Show nodes.

**-a**
> All jobs.

# DESCRIPTION

**qstat** displays the status of batch jobs in PBS/Torque, SGE, or similar job scheduling systems. It shows job state, queue, resources, and timing information.

# EXAMPLES

```bash
# All jobs
qstat

# My jobs
qstat -u $USER

# Job details
qstat -f 12345

# Queue status
qstat -Q

# Jobs with nodes
qstat -n

# All jobs, all users
qstat -a
```

# OUTPUT FORMAT

```
Job ID    Name       User     Time  S  Queue
--------- ---------- -------- ----- -  -----
12345.srv myjob      user01   02:30 R  batch
12346.srv analysis   user01   --    Q  batch
```

# JOB STATES

```
Q - Queued
R - Running
H - Held
E - Exiting
C - Completed
```

# CAVEATS

Syntax varies between PBS, SGE, SLURM. Use squeue for SLURM systems.

# HISTORY

qstat is part of **PBS** (Portable Batch System), developed at NASA for HPC job scheduling.

# SEE ALSO

[qsub](/man/qsub)(1), [qdel](/man/qdel)(1), [squeue](/man/squeue)(1), [bjobs](/man/bjobs)(1)
