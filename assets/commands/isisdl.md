# TLDR

**Download all courses**

```isisdl```

**Download specific course**

```isisdl -c [course_id]```

**List available courses**

```isisdl -l```

**Download with sync**

```isisdl -s```

**Set download directory**

```isisdl -d [/path/to/dir]```

# SYNOPSIS

**isisdl** [_options_]

# PARAMETERS

**-c** _ID_
> Specific course ID.

**-l**, **--list**
> List available courses.

**-d** _PATH_
> Download directory.

**-s**, **--sync**
> Sync mode (skip existing).

**--config**
> Show configuration.

**--help**
> Display help information.

# DESCRIPTION

**isisdl** downloads course materials from TU Berlin's ISIS/Moodle platform. It authenticates and bulk downloads files.

The tool organizes downloads by course structure. It supports syncing to avoid re-downloading existing files.

isisdl downloads ISIS course files.

# CAVEATS

TU Berlin specific. Requires ISIS account. Respects rate limits.

# HISTORY

isisdl was created to help **TU Berlin** students download course materials from the ISIS learning management system.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [youtube-dl](/man/youtube-dl)(1)
