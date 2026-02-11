# TAGLINE

Run commands on file system changes

# TLDR

**Run a command** when files change

```watchexec [command]```

**Watch specific directories**

```watchexec -w [src] -w [tests] [command]```

**Filter by file extensions**

```watchexec -e rs,toml [cargo build]```

**Restart a server** on file changes

```watchexec -r [./server]```

**Clear screen** before each run

```watchexec -c [command]```

**Ignore specific paths**

```watchexec -i [node_modules] -i [*.log] [command]```

**Debounce with custom delay** (milliseconds)

```watchexec -d [500] [command]```

**Wait for first change** before running

```watchexec --postpone [command]```

# SYNOPSIS

**watchexec** [_options_] [_--_] _command_ [_args ..._]

# PARAMETERS

**-w**, **--watch** _path_
> Paths to watch (can be specified multiple times).

**-e**, **--exts** _extensions_
> Filter by file extensions (comma-separated).

**-f**, **--filter** _pattern_
> Gitignore-style patterns for files to include.

**-i**, **--ignore** _pattern_
> Gitignore-style patterns for files to exclude.

**-r**, **--restart**
> Restart the command if it's still running when changes occur.

**-s**, **--signal** _signal_
> Send signal to stop command (e.g., SIGHUP, SIGKILL).

**-c**, **--clear**
> Clear the screen before each command run.

**-d**, **--debounce** _ms_
> Minimum milliseconds between command runs (default: 50).

**-W**, **--watch-when-idle**
> Ignore changes while command is running.

**--postpone**
> Wait for first change before running command.

**--no-vcs-ignore**
> Don't use .gitignore files.

**--no-default-ignore**
> Don't use built-in ignore patterns.

**--poll** _interval_
> Use polling instead of native file system events.

**-v**, **--verbose**
> Print debugging information.

**-V**, **--version**
> Print version information.

**-h**, **--help**
> Print help message.

# DESCRIPTION

**watchexec** monitors filesystem paths and executes commands when changes are detected. It uses native file system notification APIs for efficient watching and supports gitignore-style filtering.

The tool is commonly used for development workflows like auto-recompiling code, restarting servers, running tests, or regenerating documentation. It respects **.gitignore** and **.ignore** files by default.

watchexec is written in Rust and provides consistent behavior across Linux, macOS, and Windows.

# CAVEATS

File system event reliability varies between operating systems and file systems. Network mounts and WSL may have issues with native events; use **--poll** as a fallback. The debounce delay may need tuning for projects with many rapid file changes.

# HISTORY

watchexec was created by **Félix Saparelli** (passcod) and first released in **2017**. It was developed as a modern, cross-platform alternative to tools like inotifywait and fswatch. Written in Rust, it leverages the notify crate for efficient file system monitoring. The project has become popular in development workflows, particularly for Rust, Node.js, and other compiled or hot-reloading environments.

# SEE ALSO

[entr](/man/entr)(1), [inotifywait](/man/inotifywait)(1), [fswatch](/man/fswatch)(1), [nodemon](/man/nodemon)(1)
