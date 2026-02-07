# TAGLINE

Live reload tool for Go development

# TLDR

**Watch and reload Go app**

```goreload```

**Watch specific directory**

```goreload -d [./cmd]```

**Exclude directory**

```goreload -e [vendor]```

**Custom build command**

```goreload -b "go build -o app"```

# SYNOPSIS

**goreload** [_options_]

# PARAMETERS

**-d** _DIR_
> Directory to watch.

**-e** _DIR_
> Exclude directory.

**-b** _CMD_
> Build command.

**--help**
> Display help information.

# DESCRIPTION

**goreload** is a live reload tool for Go development. It watches source files and automatically rebuilds and restarts the application when changes are detected, eliminating manual rebuild cycles.

The tool supports configurable watch directories, exclude patterns, and custom build commands.

# CAVEATS

Development tool only. Some file events may be missed. Configure exclude patterns.

# HISTORY

goreload is one of several Go live reload tools created to improve development workflow.

# SEE ALSO

[air](/man/air)(1), [nodemon](/man/nodemon)(1)
