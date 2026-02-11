# TAGLINE

Schedule recurring Slurm cluster jobs

# TLDR

**Install** a crontab from file

```scrontab path/to/file```

**Edit** current user's crontab

```scrontab -e```

Edit **specific user's** crontab

```scrontab --user=user_id -e```

**Remove** current crontab

```scrontab -r```

**Print** current crontab

```scrontab -l```

# SYNOPSIS

**scrontab** [_options_] [_file_]

# PARAMETERS

**-e**
> Edit crontab

**--user** _id_
> Operate on specific user's crontab

**-r**
> Remove crontab

**-l**
> List crontab contents

# DESCRIPTION

**scrontab** manages Slurm crontab files for scheduling recurring jobs on HPC clusters. It provides a familiar crontab-like interface where job entries combine standard cron time specifications with Slurm **sbatch** directives, allowing periodic job submission through the cluster's workload manager.

Jobs defined in scrontab are automatically submitted to the Slurm scheduler at specified intervals. The tool supports the same editing, listing, and removal operations as traditional **crontab**, making it straightforward for users already familiar with cron scheduling to set up recurring cluster jobs for tasks like periodic data processing, backups, or monitoring.

# CAVEATS

Requires Slurm's cron functionality to be enabled. Job syntax combines cron scheduling with Slurm sbatch options.

# HISTORY

Part of **Slurm** workload manager, providing periodic job scheduling for HPC environments.

# SEE ALSO

[sbatch](/man/sbatch)(1), [crontab](/man/crontab)(1), [scontrol](/man/scontrol)(1)
