# TLDR

**Find file**

```slocate [filename]```

**Case insensitive**

```slocate -i [filename]```

**Update database**

```slocate -u```

**Show statistics**

```slocate -S```

**Limit results**

```slocate -n [10] [filename]```

**Regex search**

```slocate -r "[pattern]"```

# SYNOPSIS

**slocate** [_-i_] [_-r_] [_-n num_] [_options_] _pattern_

# PARAMETERS

**-i**
> Case insensitive.

**-u**
> Update database.

**-S**
> Statistics.

**-n** _NUM_
> Limit results.

**-r** _REGEX_
> Regex pattern.

**-e** _DIR_
> Exclude directory.

# DESCRIPTION

**slocate** finds files securely. It respects permissions.

Secure locate. Permission-aware searches.

Database indexed. Fast lookups.

Regular expressions. Pattern matching.

Updates automatically. Cron scheduled.

# CAVEATS

Database may be stale. Root for update. Superseded by mlocate.

# HISTORY

**slocate** is Secure Locate, a version of locate that only shows files the user has permission to access.

# SEE ALSO

[locate](/man/locate)(1), [mlocate](/man/mlocate)(1), [find](/man/find)(1), [updatedb](/man/updatedb)(1)
