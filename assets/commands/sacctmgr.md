# TAGLINE

Manage Slurm accounts, users, and clusters

# TLDR

**Show** current configuration

```sacctmgr show configuration```

**Add** a cluster to the Slurm database

```sacctmgr add cluster [cluster_name]```

**Add** an account to the Slurm database

```sacctmgr add account [account_name] cluster=[cluster_name]```

**Show** details of users/associations/clusters/accounts with custom format

```sacctmgr show [user|association|cluster|account] format="Account%10" format="GrpTRES%30"```

# SYNOPSIS

**sacctmgr** [_options_] [_command_]

# PARAMETERS

**show**
> Display information about accounts, clusters, users, associations

**add**
> Add new accounts, clusters, or users to the database

**modify**
> Modify existing entries

**delete**
> Remove entries from the database

**format=**
> Customize output columns and widths

**cluster=**
> Specify which cluster an account belongs to

**-i, --immediate**
> Make changes immediately without confirmation

# DESCRIPTION

**sacctmgr** is the Slurm Account Manager tool for viewing and managing accounts, clusters, and users in the Slurm accounting database. It is essential for configuring multi-user HPC cluster environments.

The tool manages the hierarchical structure of accounts, which controls resource allocation, job prioritization, and usage limits in Slurm-managed clusters.

# CAVEATS

Requires Slurm database (slurmdbd) to be configured and running. Administrative privileges typically required for modifications. Changes may affect running job scheduling.

# SEE ALSO

[scontrol](/man/scontrol)(1), [squeue](/man/squeue)(1), [sbatch](/man/sbatch)(1), [sinfo](/man/sinfo)(1)
