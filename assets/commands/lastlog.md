# TLDR

Display most recent **login of all users**

```lastlog```

Display lastlog for a **specific user**

```lastlog --user [username]```

Display records **older than** N days

```lastlog --before [7]```

Display records **more recent than** N days

```lastlog --time [3]```

# SYNOPSIS

**lastlog** [_options_]

# PARAMETERS

**-u**, **--user** _USER_
> Show lastlog record for specified user

**-b**, **--before** _DAYS_
> Show records older than DAYS

**-t**, **--time** _DAYS_
> Show records more recent than DAYS

**-C**, **--clear**
> Clear lastlog record for user (with -u)

**-S**, **--set**
> Set lastlog record for user (with -u)

# DESCRIPTION

**lastlog** reports the most recent login of all users or a specified user by reading /var/log/lastlog. Unlike last, it shows only one record per user representing their most recent login.

The lastlog file is a sparse file indexed by UID, so it can appear large but doesn't consume much disk space. Users who have never logged in show "Never logged in".

# CAVEATS

The lastlog file is indexed by UID; very high UIDs can make the file appear large. Some systems may not maintain lastlog. System accounts typically show as never logged in.

# HISTORY

lastlog has been part of Unix-like systems for decades, providing a quick way to audit which users have logged in recently and identify dormant accounts.

# SEE ALSO

[last](/man/last)(1), [lastb](/man/lastb)(1), [faillog](/man/faillog)(8)
