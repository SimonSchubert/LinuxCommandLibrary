# TAGLINE

File watching service for large codebases

# TLDR

**Watch a directory**

```watchman watch [/path/to/dir]```

**List watched directories**

```watchman watch-list```

**Stop watching a directory**

```watchman watch-del [/path/to/dir]```

**Get watch status**

```watchman watch-project [/path/to/project]```

**Find files matching pattern**

```watchman find [/path/to/dir] -p ["*.js"]```

**Trigger command on file changes**

```watchman -- trigger [/path/to/dir] [triggername] ["*.js"] -- [command]```

**Shutdown watchman**

```watchman shutdown-server```

**Check version**

```watchman version```

# SYNOPSIS

**watchman** _command_ [_options_] [_arguments_]

# PARAMETERS

**watch** _PATH_
> Start watching directory.

**watch-del** _PATH_
> Stop watching directory.

**watch-list**
> List all watches.

**watch-project** _PATH_
> Watch project root.

**find** _ROOT_ [_ARGS_]
> Find files matching criteria.

**query** _ROOT_ _EXPR_
> Query files with expression.

**since** _ROOT_ _CLOCK_
> Find files changed since clock.

**trigger** _ROOT_ _NAME_ _PATTERN_ **--** _CMD_
> Set up triggered command.

**trigger-del** _ROOT_ _NAME_
> Remove trigger.

**trigger-list** _ROOT_
> List triggers.

**log-level** _LEVEL_
> Set logging level.

**get-config** _ROOT_
> Get watch configuration.

**shutdown-server**
> Stop watchman daemon.

**version**
> Show version and capabilities.

# DESCRIPTION

**watchman** is a file watching service that monitors directories and triggers actions when files change. It was designed for large codebases requiring efficient file change detection.

The daemon maintains inotify/FSEvents watches and records file changes. Clients query for changes efficiently - even with millions of files, queries return in milliseconds.

Triggers execute commands when matching files change. This enables automated testing, building, or syncing. Triggers can filter by file pattern and use templated commands.

The query system uses a JSON expression language for complex file matching. Queries can filter by name, type, size, modification time, and more. Results include file metadata.

Clock values track change history. Subscribing to changes since a clock enables incremental processing - only handling new changes rather than full scans.

Watchman integrates with build tools (Buck, Bazel), IDEs, and testing frameworks. It provides the file watching layer that other tools build upon.

# CAVEATS

Daemon must be running for watches. System limits on watched files may need increasing. Not all filesystems support efficient watching. Configuration persists across restarts. Memory usage grows with file count.

# HISTORY

**watchman** was developed at **Facebook** (Meta) and released in **2012**. It was designed to handle Facebook's massive codebase where inotify alone wasn't sufficient. The project became a foundation for various developer tools needing efficient file change detection.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [entr](/man/entr)(1), [fswatch](/man/fswatch)(1)
