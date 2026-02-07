# TAGLINE

cross-platform file change monitor

# TLDR

**Watch directory** for changes

```fswatch [/path/to/directory]```

**Watch and execute command** on change

```fswatch -o [/path/to/directory] | xargs -n1 -I{} [command]```

**Watch with recursive monitoring**

```fswatch -r [/path/to/directory]```

**Watch specific file types**

```fswatch --include ".*\\.txt$" --exclude ".*" [/path/to/directory]```

**Watch with one event per change**

```fswatch -1 [/path/to/directory]```

**Watch multiple paths**

```fswatch [/path/dir1] [/path/dir2]```

**Verbose output** with timestamps

```fswatch -t [/path/to/directory]```

**Watch with latency** (debounce)

```fswatch -l [2] [/path/to/directory]```

# SYNOPSIS

**fswatch** [_options_] _paths_...

# DESCRIPTION

**fswatch** is a cross-platform file change monitor that detects filesystem changes and outputs affected paths. It uses native platform APIs (inotify on Linux, FSEvents on macOS, kqueue on BSD) for efficient monitoring.

The tool outputs changed file paths to stdout, which can be piped to other commands for automated workflows like rebuilding projects, running tests, or reloading services. It supports recursive monitoring and filtering by file patterns.

fswatch is useful for development workflows, build automation, backup triggers, and any scenario where actions should be triggered by file modifications.

# PARAMETERS

**-o**, **--one-per-batch**
> Print single event per batch (for counting).

**-r**, **--recursive**
> Recurse into subdirectories.

**-t**, **--timestamp**
> Print timestamps with events.

**-l** _seconds_, **--latency=** _seconds_
> Set latency (debounce period).

**-1**, **--one-event**
> Exit after first event.

**-0**, **--print0**
> Separate paths with NUL character.

**--event** _type_
> Filter by event type.

**--include** _regex_
> Include only matching files.

**--exclude** _regex_
> Exclude matching files.

**-m** _monitor_, **--monitor=** _monitor_
> Use specific monitor backend.

**-v**, **--verbose**
> Verbose output.

**-n**, **--numeric**
> Print numeric event codes.

# CAVEATS

System limits on inotify watches may affect large directory monitoring (adjustable via /proc/sys/fs/inotify/max_user_watches). Different backends have different capabilities. Latency affects responsiveness vs. batching trade-off.

# HISTORY

**fswatch** was created by **Enrico M. Crisostomo** in **2014** to provide a unified, cross-platform file monitoring solution. It was designed to replace platform-specific tools with a single utility that uses native APIs. The project continues to be maintained and supports Linux, macOS, Windows, and BSD systems.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [entr](/man/entr)(1), [watchexec](/man/watchexec)(1), [watchman](/man/watchman)(1)
