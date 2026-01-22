# TLDR

Display status of a **running job**

```sstat -j [job_id]```

Show **specific fields** in parsable format

```sstat -p -j [job_id] -o JobID,AveCPU,AveVMSize```

List **available fields**

```sstat -e```

Show **all job steps**

```sstat -a -j [job_id]```

Show **PIDs** for each step

```sstat -i -j [job_id]```

# SYNOPSIS

**sstat** [_OPTIONS_...]

# PARAMETERS

**-j, --jobs** _job[.step]_
> Job ID or job.step to query (required)

**-o, --format, --fields** _fields_
> Comma-separated list of fields to display

**-e, --helpformat**
> List available format fields

**-a, --allsteps**
> Show all steps for specified job

**-i, --pidformat**
> Display PIDs for each job step

**-n, --noheader**
> Omit header from output

**-p, --parsable**
> Pipe-delimited with trailing pipe

**-P, --parsable2**
> Pipe-delimited without trailing pipe

**--noconvert**
> Keep original units (don't convert)

**-v, --verbose**
> Verbose output

**-V, --version**
> Print version

# COMMON FIELDS

**JobID**: Job identifier
**AveCPU**: Average CPU time
**AveRSS**: Average resident set size
**AveVMSize**: Average virtual memory
**MaxRSS**: Maximum RSS
**MaxVMSize**: Maximum VM size
**NTasks**: Number of tasks
**MinCPU**: Minimum CPU time

# DESCRIPTION

**sstat** displays real-time status information for running Slurm jobs including CPU usage, memory consumption, and I/O statistics. It queries the jobacct_gather plugin for metrics on currently executing jobs and their steps.

Root users can view all running jobs; regular users can only see their own jobs. The command is useful for monitoring resource usage during job execution and diagnosing performance issues.

# CAVEATS

Only works on running jobs; use **sacct** for completed jobs. Requires the jobacct_gather plugin. Available metrics depend on the specific plugin (linux, cgroup). Non-root users have limited visibility.

# HISTORY

**sstat** is part of **Slurm**, developed at **Lawrence Livermore National Laboratory** starting in **2002**. Job accounting features help users and administrators monitor resource consumption in real-time. Slurm is now maintained by **SchedMD**.

# SEE ALSO

[sacct](/man/sacct)(1), [squeue](/man/squeue)(1), [scontrol](/man/scontrol)(1), [srun](/man/srun)(1)
