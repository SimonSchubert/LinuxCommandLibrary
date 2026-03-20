# TAGLINE

Schedule recurring Slurm cluster jobs

# TLDR

**Install** a crontab from file

```scrontab path/to/file```

**Edit** current user's crontab

```scrontab -e```

Edit **specific user's** crontab (requires root or SlurmUser)

```scrontab -u username -e```

**Remove** current crontab

```scrontab -r```

**Print** current crontab

```scrontab -l```

# SYNOPSIS

**scrontab** [**-u** _user_] _file_
**scrontab** [**-u** _user_] [**-e** | **-l** | **-r**]

# PARAMETERS

**-e**
> Edit crontab; creates a default template if none exists

**-l**
> Print current crontab to stdout

**-r**
> Remove crontab; running jobs continue but will not recur

**-u** _user_
> Operate on specified user's crontab (listing requires Operator/Admin; editing/removal requires root or SlurmUser)

# DESCRIPTION

**scrontab** manages Slurm crontab files for scheduling recurring batch jobs on HPC clusters. It uses standard cron time specifications (minute, hour, day of month, month, day of week) combined with Slurm **sbatch** directives via **#SCRON** comment lines.

Lines starting with **#SCRON** define sbatch options for the single following crontab entry; options reset between entries. Unlike traditional **crontab**, user environment variables are not inherited. Jobs are automatically submitted to the Slurm scheduler at specified intervals.

# CAVEATS

Requires Slurm's cron functionality to be enabled by the cluster administrator. User environment variables are ignored unlike traditional crontab.

# HISTORY

Part of **Slurm** workload manager, providing periodic job scheduling for HPC environments.

# SEE ALSO

[sbatch](/man/sbatch)(1), [crontab](/man/crontab)(1), [scontrol](/man/scontrol)(1), [squeue](/man/squeue)(1)
