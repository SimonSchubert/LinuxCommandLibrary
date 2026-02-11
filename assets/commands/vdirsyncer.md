# TAGLINE

Synchronize calendars and contacts

# TLDR

**Discover collections from servers**

```vdirsyncer discover```

**Synchronize all configured pairs**

```vdirsyncer sync```

**Synchronize specific pair**

```vdirsyncer sync [pair_name]```

**Repair item storage**

```vdirsyncer repair [storage_name]```

**Show version**

```vdirsyncer --version```

# SYNOPSIS

**vdirsyncer** [_options_] _command_ [_arguments_]

# COMMANDS

**discover**: Find collections on remote servers.

**sync**: Synchronize configured pairs.

**repair**: Fix storage inconsistencies.

**metasync**: Sync metadata like colors.

# PARAMETERS

**--verbosity** _level_
> Set output verbosity (DEBUG, INFO, WARNING, etc.).

**--config** _file_
> Use alternative config file.

**--version**
> Display version.

**--help**
> Display help.

# DESCRIPTION

**vdirsyncer** synchronizes calendars (CalDAV) and contacts (CardDAV) between servers and local storage. It downloads remote data to local directories where tools like khal and khard can access and modify them.

The tool supports bidirectional sync, meaning local changes sync back to servers. It can also synchronize between two servers directly. Configuration defines storage pairs specifying source and destination.

First run requires discover to detect available collections (calendars/addressbooks), then sync downloads the data. Subsequent syncs transfer only changes in both directions.

# CONFIGURATION

Config file: ~/.config/vdirsyncer/config

Defines storages (local or remote) and pairs connecting them. Supports CalDAV, CardDAV, and local filesystem storage types.

# CAVEATS

Initial discover is required before sync. Google CardDAV has known issues with data integrity. Always backup before first sync. Conflicts may need manual resolution.

# HISTORY

**vdirsyncer** was created as part of the pimutils project to provide command-line personal information management. It fills the role for calendars and contacts that OfflineIMAP fills for email, enabling offline access and local tooling for CalDAV/CardDAV data.

# SEE ALSO

[khal](/man/khal)(1), [khard](/man/khard)(1), [calcurse](/man/calcurse)(1)
