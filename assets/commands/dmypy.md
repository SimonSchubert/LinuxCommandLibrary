# TAGLINE

mypy daemon for fast incremental type checking

# TLDR

**Start mypy daemon**

```dmypy start```

**Run type check** via daemon

```dmypy run [file.py]```

**Check entire project**

```dmypy run -- --strict [.]```

**Stop the daemon**

```dmypy stop```

**Check daemon status**

```dmypy status```

**Restart the daemon**

```dmypy restart```

**Kill daemon forcefully**

```dmypy kill```

# SYNOPSIS

**dmypy** _command_ [_options_] [_files_...]

# PARAMETERS

_COMMAND_
> Operation: start, stop, run, status, restart, kill.

**start**
> Start the mypy daemon.

**stop**
> Stop the daemon gracefully.

**run** [_FILES_]
> Type check files via daemon.

**status**
> Show daemon status.

**restart**
> Restart the daemon.

**kill**
> Forcefully terminate daemon.

**--status-file** _FILE_
> Custom status file location.

**--help**
> Display help information.

# DESCRIPTION

**dmypy** is the daemon interface for mypy, Python's static type checker. It keeps mypy running as a background process, dramatically reducing type checking time by maintaining cached state between runs.

The daemon pre-computes and caches type information, making incremental checks nearly instantaneous. This is particularly valuable for large codebases where full mypy runs would be slow.

dmypy integrates with editors and CI systems that need fast, repeated type checks. It handles the daemon lifecycle and forwards type checking requests to the running mypy instance.

# CAVEATS

Daemon must be restarted after configuration changes. Memory usage increases with project size. May need restart if mypy version changes. Not suitable for parallel type checking.

# HISTORY

dmypy was introduced as part of **mypy**, originally created by **Jukka Lehtosalo** at Dropbox. The daemon mode was added to address performance concerns with large codebases requiring frequent type checks during development.

# SEE ALSO

[mypy](/man/mypy)(1), [python](/man/python)(1), [pyright](/man/pyright)(1)
