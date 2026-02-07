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

# SYNOPSIS

**balooctl** [_OPTIONS_] _COMMAND_

# DESCRIPTION

**balooctl** is the control utility for Baloo, the file indexing and search framework used in KDE Plasma. It manages the file indexer daemon that powers fast desktop file search, allowing users to enable, disable, suspend, and monitor the indexing process.

The tool is useful for troubleshooting search issues, reclaiming disk space used by the index, and checking which files have been indexed.

# PARAMETERS

**status**
> Display current indexer status

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

**monitor**
> Monitor indexer activity

# CONFIGURATION

**~/.config/baloofilerc**
> Controls which directories to index, file types to exclude, and indexing behavior.

# CAVEATS

Purging the index requires re-indexing all files which can take time. The indexer respects KDE settings for which directories to index. High CPU usage during indexing is normal.

# HISTORY

**balooctl** is part of **Baloo**, the file indexing and search framework for KDE Plasma desktop.

# SEE ALSO

[kfind](/man/kfind)(1), [locate](/man/locate)(1)
