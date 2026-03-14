# TAGLINE

TUI utility for running multiple commands in parallel with switchable terminals

# TLDR

**Launch procmux with default config**

```procmux```

**Launch with a specific config file**

```procmux --config [path/to/procmux.yaml]```

**Launch with a config and an override file**

```procmux --config [path/to/procmux.yaml] --config-override [path/to/override.yaml]```

**Stop a named process via signal**

```procmux signal-stop --name '[process-name]' --config [path/to/procmux.yaml]```

**Start a named process via signal**

```procmux signal-start --name '[process-name]' --config [path/to/procmux.yaml]```

**List all configured processes**

```procmux signal-list --config [path/to/procmux.yaml]```

# SYNOPSIS

**procmux** [_options_]
**procmux** _signal-command_ **--name** _name_ **--config** _file_

# PARAMETERS

**--config** _FILE_
> Path to the procmux YAML configuration file.

**--config-override** _FILE_
> Path to a YAML file that overrides values in the main config.

**signal-start** **--name** _NAME_ **--config** _FILE_
> Start a named process.

**signal-stop** **--name** _NAME_ **--config** _FILE_
> Stop a named process.

**signal-restart** **--name** _NAME_ **--config** _FILE_
> Restart a named process.

**signal-stop-running** **--config** _FILE_
> Stop all currently running processes.

**signal-restart-running** **--config** _FILE_
> Restart all currently running processes.

**signal-list** **--config** _FILE_
> List all configured processes.

# DESCRIPTION

**procmux** is a TUI utility for running multiple commands in parallel in easily switchable terminal panes. It is designed to help newcomers to a project browse and run necessary commands while reducing the need to manually manage multiple terminal sessions for long-running processes. Configuration is defined in YAML files.

When the signal server is enabled in the configuration, procmux starts an HTTP server that allows processes to be controlled remotely via the signal subcommands. The app supports process filtering, autostart options, descriptions, and meta tags.

# HISTORY

**procmux** was created by **napisani** and is written in **Python**.

# SEE ALSO

[tmux](/man/tmux)(1), [mprocs](/man/mprocs)(1), [process-compose](/man/process-compose)(1), [screen](/man/screen)(1)
