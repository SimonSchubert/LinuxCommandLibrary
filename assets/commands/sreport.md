# TLDR

Show **cluster utilization** (parsable format)

```sreport -p cluster utilization```

Show **number of jobs** run

```sreport job sizes printjobcount```

Show users with **highest CPU usage**

```sreport user topusage```

Show **account utilization** by user

```sreport cluster AccountUtilizationByUser```

Specify **time period**

```sreport cluster utilization Start=[YYYY-MM-DD] End=[YYYY-MM-DD]```

Show for **specific cluster**

```sreport -M [cluster_name] cluster utilization```

# SYNOPSIS

**sreport** [_OPTIONS_...] [_COMMAND_...]

# PARAMETERS

**-a, --all_clusters**
> Report on all clusters, not just local

**-M, --cluster** _names_
> Specify cluster(s) for reports

**-n, --noheader**
> Omit header from output

**-p, --parsable**
> Pipe-delimited output with trailing pipe

**-P, --parsable2**
> Pipe-delimited output without trailing pipe

**-t** _time_format_
> Set time format for output

**-T, --tres** _tres_names_
> Specify trackable resources to report

**--federation**
> Report for entire federation

**--local**
> Report local cluster only

**-Q, --quiet**
> Show errors only

**-v, --verbose**
> Verbose output

**-V, --version**
> Print version

# REPORT TYPES

**cluster**
> AccountUtilizationByUser, UserUtilizationByAccount, Utilization, WCKeyUtilizationByUser

**job**
> SizesByAccount, SizesByAccountAndWckey, SizesByWckey

**reservation**
> Utilization

**user**
> TopUsage

# REPORT OPTIONS

**Start** _date_
> Report period start (default: previous day 00:00)

**End** _date_
> Report period end (default: previous day 23:59)

**Accounts** _list_
> Filter by accounts

**Users** _list_
> Filter by users

# DESCRIPTION

**sreport** generates usage and utilization reports from Slurm accounting data stored in slurmdbd. It produces reports on job statistics, user usage, cluster utilization, and reservation usage based on hourly, daily, and monthly rollup tables.

Reports help administrators understand cluster usage patterns, identify top users, and track resource consumption across accounts and projects.

# CAVEATS

Requires slurmdbd to be configured and running. Report accuracy depends on proper accounting configuration. Historical data availability depends on database retention settings. Time periods use cluster local time.

# HISTORY

**sreport** is part of **Slurm**, developed at **Lawrence Livermore National Laboratory** starting in **2002**. The accounting and reporting features help HPC centers track usage for billing, capacity planning, and fair-share scheduling. Slurm is now maintained by **SchedMD**.

# SEE ALSO

[sacct](/man/sacct)(1), [sshare](/man/sshare)(1), [sacctmgr](/man/sacctmgr)(1), [slurmdbd](/man/slurmdbd)(8)
