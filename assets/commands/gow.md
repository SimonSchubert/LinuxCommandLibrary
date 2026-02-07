# TAGLINE

File watcher for Go commands

# TLDR

**Run with auto-reload**

```gow run [.]```

**Run specific file**

```gow run [main.go]```

**Run tests with watching**

```gow test [./...]```

**Build with watching**

```gow build```

# SYNOPSIS

**gow** _command_ [_args_]

# PARAMETERS

_COMMAND_
> Go command to run (run, test, build).

_ARGS_
> Arguments to pass.

**--help**
> Display help information.

# DESCRIPTION

**gow** is a file watcher that wraps Go commands and re-runs them when source files change. It supports go run, test, build, and other commands, watching .go files and triggering re-execution on changes.

The tool provides a minimal approach to automatic rebuilding during Go development without complex configuration.

# CAVEATS

Simple wrapper approach. May miss some file events. Use with development only.

# HISTORY

gow was created as a minimal wrapper for watching Go file changes and re-running commands.

# SEE ALSO

[go](/man/go)(1), [air](/man/air)(1), [goreload](/man/goreload)(1)
