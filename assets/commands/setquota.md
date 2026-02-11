# TAGLINE

Set disk quotas from the command line

# TLDR

**Set quota for a user** with soft and hard limits

```sudo setquota -u [username] [block-soft] [block-hard] [inode-soft] [inode-hard] [/path/to/filesystem]```

**Set quota for a group**

```sudo setquota -g [groupname] [block-soft] [block-hard] [inode-soft] [inode-hard] [/path/to/filesystem]```

**Copy quota settings** from one user to another

```sudo setquota -u -p [prototype_user] [target_user] [/path/to/filesystem]```

**Set quota on all filesystems** with quotas enabled

```sudo setquota -a -u [username] [block-soft] [block-hard] [inode-soft] [inode-hard]```

**Set grace times** for users

```sudo setquota -t -u [block-grace] [inode-grace] [/path/to/filesystem]```

**Set quotas from batch input**

```echo "[username] [block-soft] [block-hard] [inode-soft] [inode-hard]" | sudo setquota -b [/path/to/filesystem]```

# SYNOPSIS

**setquota** [**-u**|**-g**|**-P**] [_options_] _name_ _block-softlimit_ _block-hardlimit_ _inode-softlimit_ _inode-hardlimit_ _filesystem_

**setquota** [**-u**|**-g**|**-P**] **-p** _protoname_ _name_ _filesystem_

**setquota** **-t** [**-u**|**-g**|**-P**] _block-grace_ _inode-grace_ _filesystem_

**setquota** **-T** [**-u**|**-g**|**-P**] _name_ _block-time_ _inode-time_ _filesystem_

# PARAMETERS

**-u**, **--user**
> Set user quotas for the named user. This is the default.

**-g**, **--group**
> Set group quotas for the named group.

**-P**, **--project**
> Set project quotas for the named project.

**-p**, **--prototype** _protoname_
> Copy quota settings from a prototype user, group, or project.

**-b**, **--batch**
> Read quota information from standard input. Format: name block-softlimit block-hardlimit inode-softlimit inode-hardlimit.

**-t**, **--edit-period**
> Set grace times (in seconds) for users, groups, or projects.

**-T**, **--edit-times**
> Alter time remaining for individual users when soft limit is enforced.

**-a**, **--all**
> Apply to all filesystems with quotas listed in /etc/mtab.

**-F**, **--format** _quotaformat_
> Specify quota format: **vfsold**, **vfsv0**, **vfsv1**, **rpc**, or **xfs**.

**-r**, **--remote**
> Edit remote quota using rpc.rquotad.

# DESCRIPTION

**setquota** is a command-line quota editor that sets disk quotas for users, groups, or projects on a filesystem. Unlike the interactive **edquota** command, setquota allows quota configuration in a single command, making it suitable for scripts and automation.

Quotas can limit both disk space usage (blocks) and number of files (inodes). Each limit has a soft limit (can be exceeded temporarily) and a hard limit (absolute maximum). When a soft limit is exceeded, the grace period begins, after which the soft limit becomes a hard limit.

Block limits are typically specified in kilobytes, though this may vary by quota format. If a numeric value is given instead of a username, it is treated as a UID/GID/project ID.

# CAVEATS

Requires root privileges. The filesystem must have quota support enabled and quota files initialized with **quotacheck**. Changes take effect immediately without requiring a remount. Not all quota formats support all features.

# HISTORY

**setquota** is part of the Linux Diskquota Tools project. Disk quotas have been part of Unix systems since the 1980s, originally introduced in BSD Unix. The Linux quota system evolved from these early implementations, with the modern tools supporting multiple quota formats including XFS native quotas and NFS remote quotas.

# SEE ALSO

[quota](/man/quota)(1), [edquota](/man/edquota)(8), [repquota](/man/repquota)(8), [quotacheck](/man/quotacheck)(8), [quotaon](/man/quotaon)(8)
