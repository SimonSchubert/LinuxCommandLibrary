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

**scrontab** manages Slurm crontab files for scheduling recurring jobs on HPC clusters. It provides crontab-like syntax for submitting periodic Slurm jobs.

Jobs defined in scrontab are submitted to the Slurm scheduler at specified intervals.

# CAVEATS

Requires Slurm's cron functionality to be enabled. Job syntax combines cron scheduling with Slurm sbatch options.

# HISTORY

Part of **Slurm** workload manager, providing periodic job scheduling for HPC environments.

# SEE ALSO

[sbatch](/man/sbatch)(1), [crontab](/man/crontab)(1), [scontrol](/man/scontrol)(1)
