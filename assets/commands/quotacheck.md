# TAGLINE

Scan filesystems and build quota files

# TLDR

Check quotas on **all** filesystems

```sudo quotacheck --all```

**Force** check (may damage quota files)

```sudo quotacheck --force [mountpoint]```

Check in **debug** mode

```sudo quotacheck --debug [mountpoint]```

Check with **verbose** output

```sudo quotacheck --verbose [mountpoint]```

Check **user** quotas

```sudo quotacheck --user [user] [mountpoint]```

Check **group** quotas

```sudo quotacheck --group [group] [mountpoint]```

# SYNOPSIS

**quotacheck** [**-a**] [**-f**] [**-v**] [**-u** _user_] [**-g** _group_] [_mountpoint_]

# PARAMETERS

**-a, --all**
> Check all mounted non-NFS filesystems

**-f, --force**
> Force check even with quotas enabled

**-v, --verbose**
> Display progress information

**-d, --debug**
> Enable debug mode

**-u, --user _user_**
> Check user quotas only

**-g, --group _group_**
> Check group quotas only

**-c**
> Create quota files if missing

# DESCRIPTION

**quotacheck** scans filesystems for disk usage and creates or verifies quota files. It examines each file to determine how much space each user and group consumes.

Running quotacheck with quotas enabled can corrupt quota files, so quotas should typically be turned off first. The tool creates aquota.user and aquota.group files.

# CAVEATS

Best run with quotas turned off. Force flag can cause data loss. May take long time on large filesystems. Requires root privileges.

# HISTORY

**quotacheck** is part of the Linux disk quota system, derived from BSD Unix quotas. It's essential for initializing and maintaining disk quota enforcement.

# SEE ALSO

[quota](/man/quota)(1), [quotaon](/man/quotaon)(8), [edquota](/man/edquota)(8), [repquota](/man/repquota)(8)
