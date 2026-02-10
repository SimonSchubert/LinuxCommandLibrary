# TAGLINE

watches directories for changes and synchronizes them in real-time

# TLDR

**Sync directories locally**

```lsyncd -rsync [/source/] [/destination/]```

**Sync to remote server**

```lsyncd -rsyncssh [/local/] [user@host] [/remote/]```

**Use configuration file**

```lsyncd [config.lua]```

**Run in foreground with logging**

```lsyncd -log all [config.lua]```

**Dry run** (show what would sync)

```lsyncd -nodaemon -log all [config.lua]```

**Specify log file**

```lsyncd -logfile [/var/log/lsyncd.log] [config.lua]```

# SYNOPSIS

**lsyncd** [_-rsync source dest_] [_-rsyncssh source host dest_] [_-log level_] [_options_] [_config.lua_]

# PARAMETERS

**-rsync** _SOURCE_ _DEST_
> Simple rsync sync mode.

**-rsyncssh** _SOURCE_ _HOST_ _DEST_
> Rsync over SSH to remote host.

**-nodaemon**
> Run in foreground, don't daemonize.

**-log** _LEVEL_
> Set log level (all, scarce, normal, error).

**-logfile** _FILE_
> Write logs to file.

**-pidfile** _FILE_
> Write PID file.

**-delay** _SECONDS_
> Delay before syncing (aggregation window).

**-insist**
> Keep trying on startup errors.

**-version**
> Show version.

**-help**
> Show help.

# DESCRIPTION

**lsyncd** (Live Syncing Daemon) watches directories for changes and synchronizes them in real-time. It uses inotify on Linux to detect file changes efficiently.

When changes occur, lsyncd waits briefly (delay) to aggregate multiple changes, then triggers rsync to synchronize. This approach handles burst writes efficiently while maintaining near-real-time sync.

Configuration files use Lua scripting for flexibility. They define sync pairs, exclude patterns, rsync options, and can implement custom sync logic.

The tool works with both local directories and remote servers via SSH. Multiple sync pairs can run simultaneously from a single configuration.

Common uses include backup systems, cluster file synchronization, and development environments where files need to stay synchronized across machines.

# CAVEATS

Initial sync can take time for large directories. Inotify watch limits may need increasing for large trees. High-frequency changes can cause delays. Symlinks and special files need careful handling.

# HISTORY

**lsyncd** was created by **Axel Kittenberger** around **2008**. It combined inotify's efficient change notification with rsync's reliable file synchronization. The project introduced Lua configuration in version 2, enabling sophisticated sync scenarios.

# SEE ALSO

[rsync](/man/rsync)(1), [inotifywait](/man/inotifywait)(1), [unison](/man/unison)(1), [syncthing](/man/syncthing)(1)
