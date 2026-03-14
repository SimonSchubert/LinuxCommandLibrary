# TAGLINE

Build filename database for locate searches

# TLDR

**Refresh** database

```sudo updatedb```

**Verbose** mode

```sudo updatedb -v```

# SYNOPSIS

**updatedb** [_OPTIONS_]

# PARAMETERS

**-v, --verbose**
> Display filenames as they are found

**--prunepaths** _PATHS_
> Exclude specified paths from database

**--prunefs** _TYPES_
> Exclude specified filesystem types

**-o, --output** _FILE_
> Write to specified database file

**-U, --database-root** _PATH_
> Store only results from the subtree rooted at PATH

**-e, --add-prunepaths** _PATHS_
> Add entries to PRUNEPATHS

**-n, --add-prunenames** _NAMES_
> Add entries to PRUNENAMES

**-l, --require-visibility** _FLAG_
> Control visibility checking (0 or 1)

**--prune-bind-mounts** _FLAG_
> Override bind mount pruning (yes or no)

# DESCRIPTION

**updatedb** creates or updates the database used by the locate command. It scans the filesystem and builds an index of all filenames for fast searching.

The command is usually run daily by cron to keep the database current. Manual execution is needed to index newly created files before the next scheduled update.

# CONFIGURATION

**/etc/updatedb.conf**
> Controls which paths, filesystem types, and file patterns are included or excluded from the database.

# CAVEATS

Requires root privileges for full filesystem access. Initial scan can take several minutes on large filesystems. Network filesystems are typically excluded by default.

# SEE ALSO

[locate](/man/locate)(1), [mlocate](/man/mlocate)(1), [plocate](/man/plocate)(1)
