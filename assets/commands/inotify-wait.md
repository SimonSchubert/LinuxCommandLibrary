# TAGLINE

waits for filesystem events using Linux's inotify interface

# TLDR

**Watch file for changes**

```inotifywait [file]```

**Monitor directory recursively**

```inotifywait -r [directory]```

**Watch for specific events**

```inotifywait -e [modify,create,delete] [path]```

**Monitor continuously**

```inotifywait -m [path]```

**Output in CSV format**

```inotifywait -m --csv [path]```

**Watch with timeout**

```inotifywait -t [30] [path]```

# SYNOPSIS

**inotifywait** [_options_] _path_...

# PARAMETERS

**-m**, **--monitor**
> Monitor continuously (don't exit after first event).

**-r**, **--recursive**
> Watch directories recursively.

**-e** _EVENT_
> Events to watch (access, modify, create, delete, move).

**-t** _SECONDS_
> Timeout in seconds.

**--csv**
> Output in CSV format.

**--format** _FMT_
> Custom output format.

**-q**, **--quiet**
> Suppress non-essential output.

**--help**
> Display help information.

# DESCRIPTION

**inotifywait** waits for filesystem events using Linux's inotify interface. It exits when specified events occur on watched paths.

The tool enables event-driven scripts that react to file changes. It supports monitoring files, directories, and recursive watching.

# CAVEATS

Linux-only (inotify). Watch limits may need adjustment. Not for NFS/remote filesystems.

# HISTORY

inotifywait is part of **inotify-tools**, created to provide command-line access to Linux's inotify file monitoring API.

# SEE ALSO

[inotifywatch](/man/inotifywatch)(1), [fswatch](/man/fswatch)(1), [entr](/man/entr)(1), [watch](/man/watch)(1)
