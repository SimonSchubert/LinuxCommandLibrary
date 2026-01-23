# TLDR

**Show all your pending and running jobs**

```bjobs```

**Show all jobs** including finished

```bjobs -a```

**Show detailed information** for a job

```bjobs -l [job_id]```

**Show jobs in a specific queue**

```bjobs -q [queue_name]```

**Show running jobs only**

```bjobs -r```

**Show pending jobs only**

```bjobs -p```

**Show jobs with wide output**

```bjobs -w```

**Show jobs for all users**

```bjobs -u all```

# SYNOPSIS

**bjobs** [_options_] [_job_id_...]

# DESCRIPTION

**bjobs** displays information about LSF (Load Sharing Facility) batch jobs. By default, it shows your pending and running jobs with their status, queue, submission host, and execution host.

Job states include PEND (waiting), RUN (executing), DONE (completed successfully), EXIT (failed), PSUSP (pending suspended), USUSP (user suspended), and SSUSP (system suspended).

bjobs is part of IBM Spectrum LSF, a workload management platform for scheduling and managing batch jobs in HPC environments and large compute clusters.

# PARAMETERS

**-a**
> Show all jobs including recently finished.

**-d**
> Show recently finished jobs.

**-l**
> Long format with detailed information.

**-p**
> Show pending jobs only.

**-r**
> Show running jobs only.

**-s**
> Show suspended jobs only.

**-w**
> Wide format, don't truncate fields.

**-W**
> Show estimated start time for pending jobs.

**-q** _queue_
> Show jobs from specific queue.

**-u** _user_
> Show jobs for specific user (or "all").

**-m** _host_
> Show jobs on specific execution host.

**-J** _name_
> Show jobs with matching job name.

**-g** _group_
> Show jobs in specific job group.

**-o** _format_
> Custom output format.

**-noheader**
> Suppress header line.

# CAVEATS

Recently finished jobs disappear from bjobs after a configurable time (typically 1 hour). Use bhist for historical job information. Job IDs may be reused after some time. Wide format may still truncate on very long fields.

# HISTORY

**bjobs** is part of **IBM Spectrum LSF**, originally developed by **Platform Computing** in the **early 1990s**. LSF (Load Sharing Facility) pioneered workload management for distributed computing. Platform Computing was acquired by IBM in **2012**. The bjobs interface has remained largely stable over decades, maintaining backward compatibility while adding new features.

# SEE ALSO

[bsub](/man/bsub)(1), [bkill](/man/bkill)(1), [bhist](/man/bhist)(1), [bqueues](/man/bqueues)(1)
