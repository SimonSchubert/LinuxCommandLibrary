# TAGLINE

File watcher for Go commands

# TLDR

**Run with auto-reload**

```gow run [.]```

**Run specific file**

```gow run [main.go]```

**Run tests with watching**

```gow test [./...]```

**Clear the terminal on every restart**

```gow -c run [.]```

**Watch additional file extensions besides .go**

```gow -e=go,mod,html run [.]```

# SYNOPSIS

**gow** [_flags_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> Any go subcommand to wrap and re-run (run, test, build, vet, ...).

**-c**
> Clear the terminal before each restart.

**-e** _ext,ext,..._
> File extensions to watch. Default: go.

**-v**
> Verbose output, printing what triggered each restart.

**--help**
> Display help information.

# DESCRIPTION

**gow** ("go watch") is invoked exactly like **go**, but additionally watches the Go source tree and reruns the given command whenever a watched file changes. It wraps go run, go test, go build, and other subcommands transparently, ignoring non-Go files by default.

It uses a recursive, event-driven watcher (no polling) so restarts are near-instant, clears leftover output between runs, and supports hotkeys such as **ctrl+r** to force a restart.

# CAVEATS

Development tool only; not intended for production process supervision. Watches recursively from the current directory by default.

# HISTORY

gow was created by **Nelo Mitranim** as a lightweight replacement for his earlier **gorun** tool, adding a better file watcher and hotkey support for Go development workflows.

# SEE ALSO

[go](/man/go)(1), [air](/man/air)(1), [goreload](/man/goreload)(1)

# RESOURCES

```[Source code](https://github.com/mitranim/gow)```

<!-- verified: 2026-07-17 -->
