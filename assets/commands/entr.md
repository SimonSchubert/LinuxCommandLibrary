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
> Clear screen before running.

**-r**
> Restart persistent process.

**-p**
> Postpone first execution.

**-s**
> Execute with shell.

**-d**
> Track directories for new files.

**-z**
> Exit on process completion.

/_
> Placeholder for changed file.

# DESCRIPTION

**entr** runs commands when files change. It watches files listed on stdin and executes the specified command whenever any change is detected.

The tool is ideal for development workflows: rerunning tests, rebuilding projects, or restarting servers on source changes. The -r flag handles processes that need restart rather than re-execution.

entr uses efficient kernel file notification mechanisms (kqueue, inotify) rather than polling.

# CAVEATS

File list is fixed at startup (use -d for new files). stdin must list files. Some editors may not trigger events properly. Maximum file count limited by system.

# HISTORY

entr was created by **Eric Radman** as a simple, Unix-philosophy tool for file watching. It focuses on doing one thing well: running commands when files change.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [watchexec](/man/watchexec)(1), [fswatch](/man/fswatch)(1)
