# TAGLINE

Display Slurm job accounting information

# TLDR

Display **recent jobs** with default fields

```sacct```

Display **brief** job information

```sacct -b```

Display **allocations** for a specific job

```sacct -j job_id -X```

Display **custom fields** for a job

```sacct -j job_id -o Elapsed,JobName,ReqCPUS,ReqMem```

Display jobs from **one week ago**

```sacct -S $(date -d "1 week ago" +'%F')```

**Expand field width** for long values

```sacct -o JobID,JobName%100```

# SYNOPSIS

**sacct** [_options_]

# PARAMETERS

**-b**, **--brief**
> Display brief job information

**-j**, **--jobs** _id_
> Show specific job

**-X**, **--allocations**
> Show only allocations

**-o**, **--format** _fields_
> Custom output format

**-S**, **--starttime** _date_
> Filter by start time

# DESCRIPTION

**sacct** displays accounting data from the Slurm workload manager. It shows job history including resource usage, state, and exit codes for completed and running jobs.

Output format is highly customizable with many available fields for detailed job analysis.

# CAVEATS

Requires Slurm accounting to be configured. Historical data retention depends on Slurm configuration.

# HISTORY

Part of **Slurm** workload manager, the leading HPC cluster resource management system.

# SEE ALSO

[squeue](/man/squeue)(1), [sinfo](/man/sinfo)(1), [scontrol](/man/scontrol)(1)
