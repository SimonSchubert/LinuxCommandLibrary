# TLDR

Run in **foreground** mode with logging to stdout

```slurmdbd -D```

Set the daemon's **nice value**

```slurmdbd -n [value]```

Change working directory to **LogFile path**

```slurmdbd -s```

Run with **verbose** output

```slurmdbd -v```

Display **version**

```slurmdbd -V```

Display **help**

```slurmdbd -h```

# SYNOPSIS

**slurmdbd** [_OPTIONS_...]

# PARAMETERS

**-D**
> Run daemon in foreground with logging to stdout

**-h**
> Display help and brief summary of options

**-n** _value_
> Set daemon nice value (typically negative)

**-s**
> Change working directory to LogFile path or /var/tmp

**-u**
> Display database version and conversion status, then exit

**-v**
> Verbose operation (up to 6 levels with multiple v's)

**-V**
> Print version information and exit

# DESCRIPTION

**slurmdbd** (Slurm Database Daemon) provides a secure enterprise-wide database interface for Slurm workload manager. It is essential for archiving accounting records, tracking job history, usage statistics, and user/account associations across a cluster.

The daemon handles database connections, manages accounting data storage, and provides fair-share scheduling information to slurmctld. It typically runs on a dedicated host with access to the accounting database (MySQL/MariaDB).

# SIGNALS

**SIGTERM, SIGINT, SIGQUIT**
> Graceful shutdown with rollup completion

**SIGHUP**
> Reload configuration files

**SIGUSR2**
> Reread log level and reopen log file (useful for logrotate)

# CAVEATS

Requires proper configuration in **slurmdbd.conf** before starting. Database must be accessible and properly configured. Should run on a host separate from compute nodes for reliability. Uses significant memory for large clusters with extensive job history.

# HISTORY

**slurmdbd** is part of **Slurm** (Simple Linux Utility for Resource Management), developed at **Lawrence Livermore National Laboratory** starting in **2002**. The database daemon was added to support enterprise-level accounting and fair-share scheduling. Slurm is now maintained by **SchedMD** and is used on many of the world's largest supercomputers.

# SEE ALSO

[slurmctld](/man/slurmctld)(8), [slurmd](/man/slurmd)(8), [sacct](/man/sacct)(1), [sacctmgr](/man/sacctmgr)(1)
