# TAGLINE

Live reload tool for Go development

# TLDR

**Watch and reload the app in the current directory**

```goreload```

**Watch and build a specific entry point**

```goreload [main.go]```

**Watch a specific path**

```goreload -t [./cmd/server]```

**Exclude a directory from watching**

```goreload -x [vendor]```

**Reload on any file change, not just .go files**

```goreload --all```

**Pass extra arguments to go build**

```goreload --buildArgs "[-ldflags=-s -w]"```

# SYNOPSIS

**goreload** [_options_] [_path_]

# PARAMETERS

**-t**, **--path** _DIR_
> Directory to watch for changes (default: current directory).

**-d**, **--build** _DIR_
> Path to build files from (default: same as **--path**).

**-b**, **--bin** _NAME_
> Name of the generated binary (default: .goreload).

**-x**, **--excludeDir** _DIR_
> Relative directory to exclude from monitoring (repeatable).

**--all**
> Reload on any file change, not just **.go** files.

**--buildArgs** _ARGS_
> Extra arguments passed through to **go build**.

**--logPrefix** _PREFIX_
> Custom prefix for log output.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Print version and exit.

# DESCRIPTION

**goreload** is a live reload tool for Go development, forked from **codegangsta/gin**. It watches source files and automatically rebuilds and restarts the application when changes are detected, eliminating manual rebuild cycles.

The tool supports configurable watch directories, exclude patterns, and custom build commands.

# CAVEATS

Development tool only. Some file events may be missed. Configure exclude patterns.

# HISTORY

goreload was forked from **codegangsta/gin**, trimming unused features, and has itself been re-forked by several maintainers (e.g. acoshift, oxycoder) as one of many Go live-reload utilities.

# SEE ALSO

[air](/man/air)(1), [nodemon](/man/nodemon)(1)

# RESOURCES

```[Source code](https://github.com/acoshift/goreload)```

<!-- verified: 2026-07-17 -->
