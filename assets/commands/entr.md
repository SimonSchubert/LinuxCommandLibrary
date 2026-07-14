# TAGLINE

run commands when files change

# TLDR

**Run command when** file changes

```ls [*.py] | entr [python test.py]```

**Clear screen before** running

```ls [*.md] | entr -c [make html]```

**Restart command** on change

```ls [main.go] | entr -r [go run main.go]```

**Run once and exit**

```ls [config.yml] | entr -p [./deploy.sh]```

**Use tracked file** in command

```ls [*.js] | entr -s '[eslint /_]'```

# SYNOPSIS

**entr** [_options_] _command_ [_args_...]

# PARAMETERS

_COMMAND_
> Command to run when files change.

**-c**
> Clear the screen before running the command. Repeat as **-cc** to also clear the scrollback.

**-r**
> Reload a persistent child process, sending it SIGTERM before restarting it.

**-p**
> Postpone the first execution until a file actually changes.

**-s**
> Run the command through $SHELL and use its exit status.

**-d**
> Track directories: exit if a new file is added to a watched directory, so a wrapper loop can restart entr with the new file list.

**-a**
> Respond to all events instead of coalescing rapid changes into one.

**-n**
> Non-interactive: do not read from the terminal, so no space-to-rerun or q-to-quit.

**-z**
> One-shot mode: exit after the command completes.

/_
> Placeholder that expands to the file that changed.

# DESCRIPTION

**entr** runs commands when files change. It watches files listed on stdin and executes the specified command whenever any change is detected.

The tool is ideal for development workflows: rerunning tests, rebuilding projects, or restarting servers on source changes. The -r flag handles processes that need restart rather than re-execution.

entr uses efficient kernel file notification mechanisms (kqueue, inotify) rather than polling.

# CAVEATS

The file list is read from stdin once at startup and never grows: **-d** makes entr exit when a new file appears in a watched directory, and the usual pattern is to wrap it in a shell loop such as `while sleep 0.1; do ls *.c | entr -d make; done`. Editors that save by writing a new file and renaming it over the old one replace the inode entr is watching, which is why **-d** or a rerun is often needed. The number of files is bounded by the system limit on open file descriptors.

# HISTORY

entr was created by **Eric Radman** as a simple, Unix-philosophy tool for file watching. It focuses on doing one thing well: running commands when files change.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [watchexec](/man/watchexec)(1), [fswatch](/man/fswatch)(1)

# RESOURCES

```[Source code](https://github.com/eradman/entr)```

```[Homepage](https://eradman.com/entrproject/)```

<!-- verified: 2026-07-14 -->
