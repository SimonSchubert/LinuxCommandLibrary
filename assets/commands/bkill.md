# TAGLINE

Kill LSF batch jobs

# TLDR

**Kill a specific job**

```bkill [job_id]```

**Kill all your jobs**

```bkill 0```

**Kill a job by name**

```bkill -J [job_name]```

**Kill jobs in a specific queue**

```bkill -q [queue_name] 0```

**Force kill a job** (no cleanup)

```bkill -r [job_id]```

**Send a specific signal** to a job

```bkill -s [SIGTERM] [job_id]```

**Kill jobs matching a pattern**

```bkill -J "[pattern*]" 0```

**Kill job array elements**

```bkill "[job_id][1-10]"```

# SYNOPSIS

**bkill** [_options_] [_job_id_ | **0**]...

# DESCRIPTION

**bkill** terminates LSF (Load Sharing Facility) batch jobs. It sends a signal to running jobs or removes pending jobs from the queue. Using job ID 0 targets all of your own jobs.

For running jobs, bkill first sends SIGINT, waits for a grace period, then sends SIGTERM, and finally SIGKILL if the job doesn't terminate. The -r option skips this sequence and forces immediate removal.

bkill is part of IBM Spectrum LSF workload management system used in HPC environments.

# PARAMETERS

**-r**
> Force removal without graceful termination.

**-s** _signal_
> Send specific signal instead of default sequence.

**-J** _name_
> Kill jobs matching name pattern.

**-q** _queue_
> Kill jobs in specific queue.

**-m** _host_
> Kill jobs on specific host.

**-g** _group_
> Kill jobs in specific job group.

**-u** _user_
> Kill jobs for specific user (admin only).

**-app** _profile_
> Kill jobs using specific application profile.

**-b**
> Kill only jobs in pending state.

**0**
> Target all of your jobs.

# CAVEATS

Only administrators can kill other users' jobs. Force kill (-r) may leave orphan processes on execution hosts. Killing a job array master kills all elements. Pending jobs are removed immediately without signal sequence. Some jobs may not respond to signals and require force kill.

# HISTORY

**bkill** is part of **IBM Spectrum LSF**, originally developed by **Platform Computing** in the **early 1990s**. The command follows Unix conventions with signal handling while integrating with the LSF scheduler. Platform Computing was acquired by IBM in **2012**, continuing development of the LSF suite for enterprise HPC workload management.

# SEE ALSO

[bjobs](/man/bjobs)(1), [bsub](/man/bsub)(1), [bstop](/man/bstop)(1), [bresume](/man/bresume)(1)
