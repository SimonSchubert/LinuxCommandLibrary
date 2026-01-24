# TLDR

**Watch and run command**

```reflex [command]```

**Watch specific pattern**

```reflex -r '\.go$' [go build]```

**Watch directory**

```reflex -d [src/] [command]```

**Multiple patterns**

```reflex -r '\.go$' -r '\.html$' [command]```

**Start without initial run**

```reflex -s [command]```

**Decoration mode**

```reflex -d [.] -- [sh -c "echo changed"]```

**Exclude pattern**

```reflex -r '\.go$' -R 'vendor/' [command]```

# SYNOPSIS

**reflex** [_-r regex_] [_-d dir_] [_-R exclude_] [_options_] _command_

# PARAMETERS

**-r** _REGEX_
> Include pattern.

**-R** _REGEX_
> Exclude pattern.

**-d** _DIR_
> Watch directory.

**-s**
> Start service (no initial run).

**-g** _GLOB_
> Glob pattern.

**-c** _CONFIG_
> Config file.

**--all**
> Match all files.

**--decoration** _MODE_
> Output decoration.

# DESCRIPTION

**reflex** watches files and runs commands on changes. It's a flexible file watcher for development.

Regex patterns filter which files trigger. Multiple patterns combine for complex matching.

Service mode runs a long-running process. The process restarts on changes.

Exclusions ignore vendor directories or build output. Prevents unnecessary rebuilds.

Configuration files define complex watch rules. Multiple watchers in one file.

# CAVEATS

Polling fallback on some filesystems. Rapid changes may batch. Initial run may not be wanted.

# HISTORY

**Reflex** was created as a simple, flexible file watcher. It focuses on development workflow automation with minimal configuration.

# SEE ALSO

[entr](/man/entr)(1), [watchman](/man/watchman)(1), [fswatch](/man/fswatch)(1), [inotifywait](/man/inotifywait)(1)
