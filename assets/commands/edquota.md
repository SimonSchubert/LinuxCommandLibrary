# TAGLINE

disk quota editor

# TLDR

Edit quota of **current user**

```edquota -u $(whoami)```

Edit quota of **specific user**

```sudo edquota -u [username]```

Edit quota for **group**

```sudo edquota -g [group]```

Restrict to **specific filesystem**

```sudo edquota -f [filesystem]```

Edit default **grace period**

```sudo edquota -t```

**Duplicate** quota to other users

```sudo edquota -p [reference_user] [destination_user1] [destination_user2]```

# SYNOPSIS

**edquota** [_options_] _name_...

# DESCRIPTION

**edquota** edits disk quotas for users or groups. It opens an editor showing current limits and usage, allowing modification of soft and hard limits.

Quota information is stored in quota.user and quota.group files at the filesystem root.

# PARAMETERS

**-u, --user**
> Edit user quota (default)

**-g, --group**
> Edit group quota

**-f, --file-system** _fs_
> Restrict to specific filesystem

**-t, --edit-period**
> Edit grace period

**-p, --prototype** _user_
> Copy quota from prototype user

# CONFIGURATION

**quota.user** (at filesystem root)
> Stores user quota limits and usage.

**quota.group** (at filesystem root)
> Stores group quota limits and usage.

**/etc/fstab**
> Must have usrquota and/or grpquota mount options to enable quotas.

# CAVEATS

Requires quota system enabled on filesystem. Root privileges needed to edit others' quotas. Uses $EDITOR or $VISUAL for editing.

# SEE ALSO

[quota](/man/quota)(1), [repquota](/man/repquota)(8), [quotaon](/man/quotaon)(8)
