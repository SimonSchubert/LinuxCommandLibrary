# TLDR

List **share information**

```sshare```

Output in **parsable format**

```sshare --parsable```

Output as **JSON**

```sshare --json```

Custom **output format**

```sshare -o [format_string]```

Show for **specific users**

```sshare -u [user1,user2]```

Show for **specific accounts**

```sshare -A [account1,account2]```

Show **all users**

```sshare -a```

# SYNOPSIS

**sshare** [_OPTIONS_...]

# PARAMETERS

**-A, --accounts** _accounts_
> Show data for specified accounts (comma-separated)

**-a, --all**
> Display information for all users

**-u, --users** _users_
> Show data for specified users (comma-separated)

**-U, --Users**
> Print only user information (exclude ancestors)

**-M, --clusters** _names_
> Target specific clusters

**-o, --format** _format_
> Custom field selection

**-l, --long**
> Extended output with normalized data

**-n, --noheader**
> Omit header row

**-p, --parsable**
> Pipe-delimited with trailing delimiter

**-P, --parsable2**
> Pipe-delimited without trailing delimiter

**--json**
> Output as JSON

**--yaml**
> Output as YAML

**-m, --partition**
> Show partition names

**-v, --verbose**
> Verbose output

**-V, --version**
> Print version

# OUTPUT FIELDS

**Account**: Association account
**User**: User name
**Raw Shares**: Assigned share count
**Norm Shares**: Normalized shares (0.0-1.0)
**Raw Usage**: Raw usage value
**Norm Usage**: Normalized usage
**Effectv Usage**: Effective usage considering hierarchy
**FairShare**: Fair-share factor for scheduling

# DESCRIPTION

**sshare** displays fair-share information for Slurm's priority/multifactor plugin. It shows how accounts and users are allocated shares, their actual usage, and resulting fair-share factors that influence job scheduling priority.

The data requires slurmdbd to be configured and operational. Fair-share scheduling ensures equitable resource distribution among users and projects based on their allocated shares and historical usage.

# CAVEATS

Requires slurmdbd and the multifactor priority plugin. Share values are relative within the hierarchy. Usage data updates with accounting polling intervals. Historical usage decay depends on PriorityDecayHalfLife configuration.

# HISTORY

**sshare** is part of **Slurm**, developed at **Lawrence Livermore National Laboratory** starting in **2002**. Fair-share scheduling was added to support equitable resource allocation in multi-user HPC environments. Slurm is now maintained by **SchedMD**.

# SEE ALSO

[sprio](/man/sprio)(1), [sacctmgr](/man/sacctmgr)(1), [sreport](/man/sreport)(1), [scontrol](/man/scontrol)(1)
