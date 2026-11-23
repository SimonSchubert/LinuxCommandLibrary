# TAGLINE

TUI utility for running multiple commands in parallel with switchable terminals

# TLDR

**Launch procmux** using procmux.yaml (or procmux.yml, procmux-config.yaml) from the current directory

```procmux```

**Launch with a specific config file**

```procmux --config [path/to/procmux.yaml]```

**Launch with a config and an override file**

```procmux --config [path/to/procmux.yaml] --config-override [path/to/override.yaml]```

**Stop a named process via signal**

```procmux signal-stop --name '[process-name]' --config [path/to/procmux.yaml]```

**Start a named process via signal**

```procmux signal-start --name '[process-name]' --config [path/to/procmux.yaml]```

**Restart all running processes** via signal

```procmux signal-restart-running --config [path/to/procmux.yaml]```

# SYNOPSIS

**procmux** [**start**] [**--config** _file_] [**--config-override** _file_]

**procmux** _signal-command_ [**--name** _name_] [**--config** _file_]

# PARAMETERS

**--config** _FILE_
> Path to the procmux YAML configuration file. Without it, procmux looks for procmux-config.yml, procmux-config.yaml, procmux.yml or procmux.yaml in the current directory.

**--config-override** _FILE_
> Path to a YAML file that overrides values in the main config.

**start**
> Launch the TUI (the default when no subcommand is given).

**signal-start** **--name** _NAME_
> Start a named process in a running procmux instance.

**signal-stop** **--name** _NAME_
> Stop a named process.

**signal-restart** **--name** _NAME_
> Restart a named process.

**signal-stop-running**
> Stop all currently running processes.

**signal-restart-running**
> Restart all currently running processes.

# DESCRIPTION

**procmux** is a TUI utility for running multiple commands in parallel in easily switchable terminal panes. It is designed to help newcomers to a project browse and run necessary commands while reducing the need to manually manage multiple terminal sessions for long-running processes. Configuration is defined in YAML files.

Each entry under **procs** defines a **shell** string or **cmd** list plus optional **autostart**, **description**, **env**, **cwd**, **categories** and **meta_tags**. Processes can be fuzzy-filtered with **/**, started with **s** and stopped with **x**; keybindings, layout and colors are configurable.

When **signal_server.enable** is set in the configuration, procmux starts an HTTP server (default localhost:9792) that allows processes to be controlled remotely via the signal subcommands or plain HTTP requests. The signal subcommands read the host and port from the same config file.

# CAVEATS

The project is no longer actively developed: it has been superseded by **proctmux**, a Go rewrite by the same author that ships as a single binary and uses the native terminal instead of an embedded terminal emulator.

Processes that rely on interpolation (configured prompt inputs) cannot be started or restarted through the signal subcommands because the required input values are only available inside the interactive TUI.

# HISTORY

**procmux** was created by **napisani** and is written in **Python** on top of prompt_toolkit. It was heavily influenced by **mprocs**.

# SEE ALSO

[tmux](/man/tmux)(1), [mprocs](/man/mprocs)(1), [process-compose](/man/process-compose)(1), [screen](/man/screen)(1)

# RESOURCES

```[Source code](https://github.com/napisani/procmux)```

<!-- verified: 2026-11-23 -->
