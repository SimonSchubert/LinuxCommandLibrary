# TAGLINE

Report filesystem disk quota usage

# TLDR

**Report** stats for all quotas in use

```sudo repquota -a```

**Report** quota stats for all users, even those not using any quota

```sudo repquota -v [filesystem]```

**Report** on quotas for users only

```repquota -u [filesystem]```

**Report** on quotas for groups only

```sudo repquota -g [filesystem]```

**Report** on used quota and limits in human-readable format

```sudo repquota -s [filesystem]```

**Report** on all quotas for users and groups in human-readable format

```sudo repquota -augs```

# SYNOPSIS

**repquota** [_options_] [_filesystem_...]

# PARAMETERS

**-a, --all**
> Report on all filesystems with quotas enabled

**-u, --user**
> Report on user quotas (default)

**-g, --group**
> Report on group quotas

**-v, --verbose**
> Include users/groups with no storage used

**-s, --human-readable**
> Display sizes in human-readable format (KB, MB, GB)

**-p, --raw-grace**
> Report grace times in seconds since epoch

**-n, --no-names**
> Show numeric UIDs/GIDs instead of names

**-c, --batch-translation**
> Cache name lookups for better performance

# DESCRIPTION

**repquota** displays a summary of disk quotas for specified filesystems. It shows the current usage, soft limits, hard limits, and grace period status for users and/or groups.

The output includes columns for used space, soft/hard limits, used files (inodes), and whether the user is over quota. The grace period indicates how long a user can exceed the soft limit.

# CAVEATS

Requires filesystem quota support and quota utilities to be installed. Must typically be run as root to view all users' quotas. Quotas must be enabled on the filesystem for meaningful output.

# SEE ALSO

[quota](/man/quota)(1), [quotacheck](/man/quotacheck)(8), [quotaon](/man/quotaon)(8), [edquota](/man/edquota)(8), [setquota](/man/setquota)(8)
