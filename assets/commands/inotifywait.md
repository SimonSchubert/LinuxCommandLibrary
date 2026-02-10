# TAGLINE

uses Linux's inotify API to efficiently watch files and directories for changes

# TLDR

**Watch** a specific file for events, exiting after the first one

```inotifywait [path/to/file]```

**Continuously watch** a file for events

```inotifywait -m [path/to/file]```

Watch a directory **recursively** for events

```inotifywait -m -r [path/to/directory]```

Watch a directory **excluding** files matching regex

```inotifywait -m -r --exclude "[regex]" [path/to/directory]```

Watch with a **timeout** of 30 seconds

```inotifywait -m -t 30 [path/to/file]```

Watch only for **specific events** (modify)

```inotifywait -e modify [path/to/file]```

Watch **quietly** (no status messages)

```inotifywait -q [path/to/file]```

Run a **command** when a file is accessed

```inotifywait -e access [path/to/file] && [command]```

# SYNOPSIS

**inotifywait** [_options_] _file_...

# PARAMETERS

**-m**, **--monitor**
> Keep running, don't exit after first event

**-r**, **--recursive**
> Watch directories recursively

**-e**, **--event** _EVENT_
> Watch for specific events (access, modify, create, delete, etc.)

**-t**, **--timeout** _SECONDS_
> Exit after timeout with no events

**-q**, **--quiet**
> Suppress informational messages

**--exclude** _PATTERN_
> Exclude files matching regex pattern

**--format** _FMT_
> Custom output format

**-c**, **--csv**
> Output in CSV format

# DESCRIPTION

**inotifywait** uses Linux's inotify API to efficiently watch files and directories for changes. It blocks until a filesystem event occurs, making it ideal for triggering actions on file changes.

Available events include:
- **access** - File read
- **modify** - File written
- **create** - File/directory created
- **delete** - File/directory deleted
- **move** - File moved
- **attrib** - Metadata changed
- **close_write** - File closed after writing

This is commonly used in scripts to rebuild projects, sync files, or trigger deployments when source files change.

# CAVEATS

Linux-only (uses inotify kernel subsystem). There are limits on the number of watches (configurable via /proc/sys/fs/inotify/max_user_watches). Recursive watching creates a watch per directory. Not suitable for very large directory trees.

# HISTORY

inotifywait is part of inotify-tools, created to provide user-space access to Linux's inotify API, which was introduced in kernel 2.6.13 (**2005**). It replaced the older dnotify mechanism.

# SEE ALSO

[inotifywatch](/man/inotifywatch)(1), [entr](/man/entr)(1), [fswatch](/man/fswatch)(1), [fatrace](/man/fatrace)(1)
