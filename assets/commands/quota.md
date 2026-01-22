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

**quota** displays disk usage and limits. User and group quotas.

The tool shows quota status. Reports disk usage limits.

quota shows disk limits.

# CAVEATS

Requires quota system enabled. Filesystem support needed.

# HISTORY

quota is part of **Unix quota** system for disk usage limits.

# SEE ALSO

[edquota](/man/edquota)(8), [repquota](/man/repquota)(8), [quotacheck](/man/quotacheck)(8)

