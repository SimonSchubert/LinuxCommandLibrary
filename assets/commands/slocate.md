# TAGLINE

Security-aware file location database

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

**slocate** (Secure Locate) is a permission-aware version of the **locate** command that searches a pre-built database of file paths. Unlike standard locate, slocate only returns files that the searching user has permission to access, preventing information disclosure about file structures in restricted directories.

The tool maintains a database indexed by file path, providing near-instant search results compared to real-time filesystem traversal with **find**. The database is typically updated periodically via cron, and supports both glob-style patterns and regular expressions for flexible matching.

slocate has been largely superseded by **mlocate**, which uses a more efficient database format and is the default on most modern Linux distributions. Both provide the same security-aware behavior of filtering results based on the caller's file permissions.

# CAVEATS

Database may be stale. Root for update. Superseded by mlocate.

# HISTORY

**slocate** is Secure Locate, a version of locate that only shows files the user has permission to access.

# SEE ALSO

[locate](/man/locate)(1), [mlocate](/man/mlocate)(1), [find](/man/find)(1), [updatedb](/man/updatedb)(1)
