# TAGLINE

Display historical information about LSF batch jobs

# TLDR

**Show history** of your own jobs

```bhist```

**Show history** of a specific job

```bhist [job_id]```

**Show history** for all users

```bhist -a```

**Show detailed history**

```bhist -l [job_id]```

**Show history** for jobs in a specific queue

```bhist -q [queue_name]```

**Show history** for a specific time range

```bhist -t -b [12/01/08:00] -e [12/01/18:00]```

**Show jobs with specific status**

```bhist -d```

# SYNOPSIS

**bhist** [_options_] [_job_id_...]

# DESCRIPTION

**bhist** displays historical information about LSF (Load Sharing Facility) jobs. It shows job history including submission time, start time, completion time, exit status, and resource usage from job event logs.

The command queries the LSF job event log files (lsb.events) to reconstruct job history. By default, it shows only your own jobs, but administrators can view all jobs.

bhist is part of IBM Spectrum LSF, a workload management platform used in HPC (High Performance Computing) environments for scheduling and managing batch jobs across compute clusters.

# PARAMETERS

**-a**
> Show all users' job history.

**-d**
> Show jobs that have finished (DONE/EXIT).

**-l**
> Long format with detailed information.

**-p**
> Show pending jobs history.

**-r**
> Show running jobs history.

**-q** _queue_
> Show jobs from specific queue.

**-u** _user_
> Show jobs for specific user.

**-m** _host_
> Show jobs on specific host.

**-t**
> Show time-based job history.

**-b** _time_
> Begin time for history search.

**-e** _time_
> End time for history search.

**-n** _num_
> Limit to most recent num jobs.

**-J** _name_
> Show jobs with matching name.

# CAVEATS

Requires access to LSF job event logs. Historical data availability depends on log retention policy. Very old jobs may not be available if logs have been archived or purged. Time-based searches may be slow on large clusters with extensive history.

# HISTORY

**bhist** is part of **IBM Spectrum LSF** (formerly Platform LSF), originally developed by **Platform Computing** in the **early 1990s**. LSF became one of the leading workload management systems for HPC clusters. Platform Computing was acquired by IBM in **2012**, and the product was rebranded to IBM Spectrum LSF. It remains widely used in academic research, financial services, and life sciences.

# SEE ALSO

[bjobs](/man/bjobs)(1), [bsub](/man/bsub)(1), [bkill](/man/bkill)(1), [bacct](/man/bacct)(1)
