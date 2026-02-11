# TAGLINE

Slurm job scheduling priority viewer

# TLDR

View priority factors for **all pending jobs**

```sprio```

View priority for **specific jobs**

```sprio -j [job_id1,job_id2]```

Show **extended** information

```sprio -l```

View jobs for **specific users**

```sprio -u [user1,user2]```

Print **priority weights**

```sprio -w```

Show **normalized** priority factors

```sprio -n```

# SYNOPSIS

**sprio** [_OPTIONS_...]

# PARAMETERS

**-j, --jobs** _job_ids_
> Show priority for specific job IDs (comma-separated)

**-u, --user** _users_
> Filter by user names or IDs (comma-separated)

**-p, --partition** _partitions_
> Restrict to specific partitions

**-l, --long**
> Display extended output information

**-n, --norm**
> Show normalized priority factors (0.0-1.0)

**-w, --weights**
> Display configured priority weight values

**-o, --format** _format_
> Customize output format

**-S, --sort** _fields_
> Sort results by specified fields

**-h, --noheader**
> Suppress column headers

**-M, --clusters** _names_
> Target specific clusters

**--federation**
> Display jobs from all federated clusters

**--local**
> Show only local cluster jobs

**-v, --verbose**
> Verbose output

**-V, --version**
> Display version

# DESCRIPTION

**sprio** displays the components that determine job scheduling priority when Slurm's multi-factor priority plugin is active. It shows how factors like age, fairshare, job size, partition, and QOS contribute to each job's overall priority score.

By default, it displays information for all pending jobs. The tool helps administrators and users understand why certain jobs are scheduled before others and troubleshoot scheduling issues.

# FORMAT SPECIFIERS

**%i**: Job ID
**%Y**: Priority
**%A**: Age factor
**%F**: Fairshare factor
**%J**: Job size factor
**%P**: Partition factor
**%Q**: QOS factor
**%u**: User name

# CAVEATS

Only works when the multi-factor priority plugin is configured in Slurm. Read-only utility; cannot modify priorities. Priority values are relative and depend on cluster configuration. Some factors may be zero if not configured.

# HISTORY

**sprio** is part of **Slurm** (Simple Linux Utility for Resource Management), developed at **Lawrence Livermore National Laboratory** starting in **2002**. The multi-factor priority plugin was added to provide fair and configurable job scheduling in HPC environments. Slurm is now maintained by **SchedMD**.

# SEE ALSO

[squeue](/man/squeue)(1), [scontrol](/man/scontrol)(1), [sacct](/man/sacct)(1), [sprio](/man/sprio)(1)
