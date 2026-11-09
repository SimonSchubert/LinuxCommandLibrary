# TAGLINE

Control KDE Baloo file indexing

# TLDR

Show indexer **status**

```balooctl status```

**Enable** file indexer

```balooctl enable```

**Disable** file indexer

```balooctl disable```

**Purge** index database

```balooctl purge```

**Suspend** indexing

```balooctl suspend```

Show **disk** space used

```balooctl indexSize```

**Check** for unindexed files

```balooctl check```

Show a file's status as **JSON**

```balooctl status -f json [path/to/file]```

Use the **KDE Frameworks 6** binary

```balooctl6 status```

# SYNOPSIS

**balooctl** [_OPTIONS_] _COMMAND_

**balooctl6** [_OPTIONS_] _COMMAND_

# DESCRIPTION

**balooctl** is the control utility for Baloo, the file indexing and search framework used in KDE Plasma. It manages the file indexer daemon that powers fast desktop file search, allowing users to enable, disable, suspend, and monitor the indexing process. On KDE Frameworks 6 the binary is named **balooctl6**.

The tool is useful for troubleshooting search issues, reclaiming disk space used by the index, and checking which files have been indexed.

# PARAMETERS

**status** [_file..._]
> Display current indexer status, or the status of the given files

**enable**
> Enable the file indexer

**disable**
> Disable the file indexer

**purge**
> Delete the index database

**suspend**
> Temporarily suspend indexing

**resume**
> Resume suspended indexing

**indexSize**
> Show disk space used by index

**check**
> Find and index unindexed files

**index** _file..._
> Manually index specific files

**clear** _file..._
> Remove specific files from the index

**config**
> Modify Baloo configuration

**monitor**
> Monitor indexer activity

**failed**
> List files that could not be indexed

**-f**, **--format** _format_
> Output format for **status** with file arguments: multiline (default), json, or simple

**-h**, **--help**
> Display help

**-v**, **--version**
> Display version

# CONFIGURATION

**~/.config/baloofilerc**
> Controls which directories to index, file types to exclude, and indexing behavior.

# CAVEATS

Purging the index requires re-indexing all files which can take time. The indexer respects KDE settings for which directories to index. High CPU usage during indexing is normal.

# HISTORY

**balooctl** is part of **Baloo**, the file indexing and search framework for KDE Plasma desktop.

# SEE ALSO

[locate](/man/locate)(1)

# RESOURCES

```[Source code](https://invent.kde.org/frameworks/baloo)```

```[Documentation](https://community.kde.org/Baloo)```

<!-- verified: 2026-11-09 -->
