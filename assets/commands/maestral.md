# TAGLINE

lightweight Dropbox client for Linux and macOS

# TLDR

**Link to Dropbox account**

```maestral link```

**Start syncing**

```maestral start```

**Stop syncing**

```maestral stop```

**Show sync status**

```maestral status```

**Pause syncing**

```maestral pause```

**Resume syncing**

```maestral resume```

**List sync activity**

```maestral activity```

**Exclude folder from sync**

```maestral excluded add [/path/to/folder]```

# SYNOPSIS

**maestral** [_start_] [_stop_] [_status_] [_link_] [_excluded_] [_options_] [_command_]

# PARAMETERS

**start**
> Start the sync daemon.

**stop**
> Stop the sync daemon.

**restart**
> Restart the sync daemon.

**status**
> Show current sync status.

**pause**
> Pause syncing.

**resume**
> Resume syncing.

**link**
> Link to Dropbox account.

**unlink**
> Unlink Dropbox account.

**activity**
> Show recent sync activity.

**excluded add** _PATH_
> Exclude folder from sync.

**excluded remove** _PATH_
> Include previously excluded folder.

**excluded list**
> List excluded folders.

**ls** _PATH_
> List folder contents.

**notify** _LEVEL_
> Set notification level.

**autostart**
> Configure automatic startup.

**config**
> Show configuration.

# DESCRIPTION

**maestral** is a lightweight Dropbox client for Linux and macOS. It provides file synchronization without the heavy resource usage of the official client.

The daemon runs in the background, monitoring local changes and syncing with Dropbox. Selective sync excludes unwanted folders to save disk space.

Unlike the official client, Maestral is open-source and uses fewer system resources. It supports the core sync functionality without extras like camera uploads or screenshots.

Multiple Dropbox accounts can be configured using different configuration names. Each runs as a separate daemon with its own sync folder.

The status command shows sync progress, conflicts, and errors. Activity shows recent file changes. Notifications alert on sync events.

# CAVEATS

No GUI by default - CLI only (optional GUI available). Some Dropbox features not supported. Requires Python. Initial sync of large accounts takes time.

# HISTORY

**Maestral** was created by **Sam Schott** around **2018** as a lightweight alternative to the official Dropbox client for Linux. The name comes from the Mistral wind. It gained popularity among Linux users wanting Dropbox sync without Electron or heavy dependencies.

# SEE ALSO

[rclone](/man/rclone)(1), [syncthing](/man/syncthing)(1), [dropbox](/man/dropbox)(1)
