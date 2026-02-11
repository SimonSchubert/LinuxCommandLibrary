# TAGLINE

Display disk usage and quota limits

# TLDR

**Show user quota**

```quota```

**Show specific user's quota**

```quota -u [username]```

**Show group quota**

```quota -g [groupname]```

**Verbose output**

```quota -v```

**Show all filesystems**

```quota -A```

# SYNOPSIS

**quota** [_options_] [_user_]

# PARAMETERS

_USER_
> User to check.

**-u**
> User quota.

**-g**
> Group quota.

**-v**
> Verbose output.

**-s**
> Human-readable sizes.

**-A**
> All filesystems.

# DESCRIPTION

**quota** displays current disk usage and limits for users or groups on filesystems where quotas are enabled. It reads the kernel's quota subsystem to report how much space and how many inodes a user or group has consumed, alongside the configured soft and hard limits.

When soft limits are exceeded, the tool shows the remaining grace period before enforcement takes effect. Running without arguments displays the calling user's quotas across all mounted filesystems, while the **-u** and **-g** flags query specific users or groups. The **-v** flag reports on all quota-enabled filesystems, including those where no space is currently consumed.

# CAVEATS

Requires quota system enabled. Filesystem support needed.

# HISTORY

quota is part of **Unix quota** system for disk usage limits.

# SEE ALSO

[edquota](/man/edquota)(8), [repquota](/man/repquota)(8), [quotacheck](/man/quotacheck)(8)

