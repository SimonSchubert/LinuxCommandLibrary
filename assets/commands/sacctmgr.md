# TAGLINE

Manage Slurm accounts, users, and clusters

# TLDR

**Show** current configuration

```sacctmgr show configuration```

**Add** a cluster to the Slurm database

```sacctmgr add cluster [cluster_name]```

**Add** an account to the Slurm database

```sacctmgr add account [account_name] cluster=[cluster_name]```

**Add** a user to an account

```sacctmgr add user [username] account=[account_name] cluster=[cluster_name]```

**Show** details with custom format columns

```sacctmgr show account format=Account%20,Description%30```

**Show** QOS definitions

```sacctmgr show qos```

**Dump** cluster association data to a file

```sacctmgr dump [cluster_name] file=[output.cfg]```

**Modify** a user's QOS

```sacctmgr modify user where name=[username] set qos=[qos_name]```

# SYNOPSIS

**sacctmgr** [_options_] [_command_]

# PARAMETERS

**show** / **list**
> Display information about accounts, clusters, users, associations, QOS, etc.

**add** / **create**
> Add new accounts, clusters, users, or QOS to the database.

**modify**
> Modify existing entries.

**delete** / **remove**
> Remove entries from the database.

**dump**
> Export cluster association data to a file.

**load**
> Import cluster association data from a file.

**archive dump** / **archive load**
> Archive or restore database records to/from flat files.

**ping**
> Test connection to the slurmdbd daemon.

**reconfigure**
> Reconfigure the SlurmDBD daemon.

**-i**, **--immediate**
> Commit changes without asking for confirmation.

**-n**, **--noheader**
> Omit header from output.

**-p**, **--parsable**
> Pipe-delimited output with trailing pipe.

**-P**, **--parsable2**
> Pipe-delimited output without trailing pipe.

**-Q**, **--quiet**
> Suppress non-error messages.

**-r**, **--readonly**
> Prevent any modifications (interactive mode).

**-s**, **--associations**
> Display user associations when showing users.

**-v**, **--verbose**
> Enable detailed output.

**--json**
> Output in JSON format.

**--yaml**
> Output in YAML format.

# DESCRIPTION

**sacctmgr** is the Slurm Account Manager tool for viewing and managing accounts, clusters, and users in the Slurm accounting database. It is essential for configuring multi-user HPC cluster environments.

The tool manages the hierarchical structure of accounts, which controls resource allocation, job prioritization, and usage limits in Slurm-managed clusters. Account information is recorded based on associations, which combine user, cluster, partition, and account parameters.

Entity types that can be managed include: accounts, users, clusters, associations, QOS (Quality of Service), resources, reservations, coordinators, federations, and TRES (trackable resources).

# CAVEATS

Requires Slurm database (slurmdbd) to be configured and running. Administrative privileges typically required for modifications. Changes may affect running job scheduling. Coordinators can only modify entities within their delegated accounts.

# SEE ALSO

[sacct](/man/sacct)(1), [scontrol](/man/scontrol)(1), [squeue](/man/squeue)(1), [sbatch](/man/sbatch)(1), [sinfo](/man/sinfo)(1), [srun](/man/srun)(1)
