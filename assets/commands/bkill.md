# TAGLINE

Kill LSF batch jobs

# TLDR

**Kill a specific job**

```bkill [job_id]```

**Kill all your jobs**

```bkill 0```

Kill your most recent job with a **name**

```bkill -J [job_name]```

**Kill jobs in a specific queue**

```bkill -q [queue_name] 0```

**Remove a job** from LSF immediately (force)

```bkill -r [job_id]```

**Send a specific signal** to a job

```bkill -s [TERM] [job_id]```

Kill **all jobs** matching a name pattern

```bkill -J "[pattern*]" 0```

**Kill job array elements**

```bkill "[job_id][1-10]"```

# SYNOPSIS

**bkill** [_options_] [_job_id_ | **0**]...

# DESCRIPTION

**bkill** terminates LSF (Load Sharing Facility) batch jobs. It sends a signal to running jobs or removes pending jobs from the queue. Using job ID 0 targets all of your own jobs.

For running jobs, bkill sends SIGINT and SIGTERM so the job can clean up, then SIGKILL if it does not terminate. The interval is set by **JOB_TERMINATE_INTERVAL** in lsb.params. The -r option sends the same signals but removes the job from LSF immediately, without waiting for it to terminate.

bkill is part of IBM Spectrum LSF workload management system used in HPC environments.

# PARAMETERS

**-r**
> Force removal: remove the job from LSF immediately, mark it EXIT, and release monitored resources. Cannot be combined with **-s**.

**-s** _signal_
> Send a specific signal by name without the SIG prefix (such as KILL) or by number instead of the default sequence.

**-J** _name_
> Kill jobs matching name or name pattern. Without a job ID or **0**, only the most recent matching job is killed.

**-q** _queue_
> Kill jobs in specific queue.

**-m** _host_
> Kill jobs on specific host or host group.

**-g** _group_
> Kill jobs in specific job group.

**-u** _user_
> Kill jobs for specific user or user group (admin only).

**-app** _profile_
> Kill jobs using specific application profile.

**-sla** _class_
> Kill jobs belonging to a specific service class.

**-b**
> Kill large numbers of jobs as soon as possible; pending local jobs are removed immediately and not logged to lsb.acct.

**-d**
> Kill jobs, then mark them DONE after they exit. Applies only to RUN, USUSP or SSUSP jobs.

**-stat** _run_|_pend_|_susp_
> Kill large numbers of jobs in the given status as soon as possible.

**-C** _reason_
> Attach a reason for the kill (up to 4095 characters).

**-l**
> Display the signal names supported by bkill on this platform.

**-h**
> Display usage information.

**-V**
> Display LSF version information.

**0**
> Target all of your jobs (combine with filters to scope by queue, host, etc.).

# CAVEATS

Only root and LSF administrators can kill other users' jobs. Removing a job with -r may leave orphan processes on execution hosts. Without a job ID or 0, filter options such as -J and -q affect only the most recently submitted qualifying job. Killing a job array master kills all elements. Pending jobs are removed immediately without signal sequence. Some jobs may not respond to signals and require force kill.

# HISTORY

**bkill** is part of **IBM Spectrum LSF**, originally developed by **Platform Computing** in the **early 1990s**. The command follows Unix conventions with signal handling while integrating with the LSF scheduler. Platform Computing was acquired by IBM in **2012**, continuing development of the LSF suite for enterprise HPC workload management.

# SEE ALSO

[bjobs](/man/bjobs)(1), [bsub](/man/bsub)(1), [bhist](/man/bhist)(1)

# RESOURCES

```[Homepage](https://www.ibm.com/products/spectrum-lsf)```

<!-- verified: 2026-11-09 -->
