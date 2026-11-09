# TAGLINE

Display historical information about LSF batch jobs

# TLDR

**Show history** of your own pending, running and suspended jobs

```bhist```

**Show history** of a specific job

```bhist [job_id]```

**Show history** of finished and unfinished jobs for all users

```bhist -a -u all```

**Show detailed history**

```bhist -l [job_id]```

**Show history** for jobs in a specific queue

```bhist -q [queue_name]```

**Show job events** chronologically for a specific time range

```bhist -t -T [2026/12/01/08:00,2026/12/01/18:00]```

**Show finished** jobs

```bhist -d```

**Show exited** jobs

```bhist -e```

**Search all** event log files for a job

```bhist -n 0 -l [job_id]```

# SYNOPSIS

**bhist** [_options_] [_job_id_...]

# DESCRIPTION

**bhist** displays historical information about LSF (Load Sharing Facility) jobs. It shows job history including submission time, start time, completion time, exit status, and resource usage from job event logs.

The command queries the LSF job event log files (lsb.events) to reconstruct job history. By default, it shows your own pending, running and suspended jobs from the past week, grouped by job.

bhist is part of IBM Spectrum LSF, a workload management platform used in HPC (High Performance Computing) environments for scheduling and managing batch jobs across compute clusters.

# PARAMETERS

**-a**
> Show both finished and unfinished jobs. Overrides **-d**, **-p**, **-s** and **-r**.

**-d**
> Show finished jobs.

**-e**
> Show exited jobs.

**-p**
> Show pending jobs.

**-r**
> Show running jobs.

**-s**
> Show suspended jobs.

**-l**
> Long format with detailed information.

**-b**
> Brief format.

**-w**
> Wide format.

**-UF**
> Unformatted job details, easier to parse in scripts.

**-q** _queue_
> Show jobs from specific queue.

**-u** _user_|_all_
> Show jobs for specific user, or for all users.

**-G** _user_group_
> Show jobs for a user group.

**-m** _host_
> Show jobs dispatched to specific host.

**-J** _name_
> Show jobs with matching name.

**-Jd** _description_
> Show jobs with matching job description.

**-P** _project_
> Show jobs in a specific project.

**-app** _profile_
> Show jobs submitted to an application profile.

**-t**
> Show job events chronologically (past week by default).

**-T** _start,end_
> Time interval for **-t**. Times use the format yyyy/mm/dd/HH:MM.

**-C** _start,end_
> Show jobs that completed or exited in the interval.

**-D** _start,end_
> Show jobs dispatched in the interval (use with **-a**).

**-S** _start,end_
> Show jobs submitted in the interval (use with **-a**).

**-n** _number_
> Number of event log files to search, starting from the current one. **0** selects all log files, up to 100.

**-f** _logfile_
> Search the specified event log file.

**-N** _host|model|factor_
> Normalize CPU time to a host, host model or CPU factor.

**-h**, **-V**
> Print usage or the release version.

# CAVEATS

Requires access to LSF job event logs. Historical data availability depends on log retention policy. Very old jobs may not be available if logs have been archived or purged. Time-based searches may be slow on large clusters with extensive history.

# HISTORY

**bhist** is part of **IBM Spectrum LSF** (formerly Platform LSF), originally developed by **Platform Computing** in the **early 1990s**. LSF became one of the leading workload management systems for HPC clusters. Platform Computing was acquired by IBM in **2012**, and the product was rebranded to IBM Spectrum LSF. It remains widely used in academic research, financial services, and life sciences.

# SEE ALSO

[bjobs](/man/bjobs)(1), [bsub](/man/bsub)(1), [bkill](/man/bkill)(1)

# RESOURCES

```[Homepage](https://www.ibm.com/products/spectrum-lsf)```

<!-- verified: 2026-11-09 -->
