# TAGLINE

Control Supervisor managed processes

# TLDR

**Show status**

```supervisorctl status```

**Start process**

```supervisorctl start [process_name]```

**Stop process**

```supervisorctl stop [process_name]```

**Restart process**

```supervisorctl restart [process_name]```

**Reload configuration**

```supervisorctl reread && supervisorctl update```

**Start all processes**

```supervisorctl start all```

**Tail process log**

```supervisorctl tail -f [process_name]```

**Interactive shell**

```supervisorctl```

# SYNOPSIS

**supervisorctl** [_options_] _command_ [_args_]

# PARAMETERS

**status**
> Show process status.

**start** _NAME_
> Start process.

**stop** _NAME_
> Stop process.

**restart** _NAME_
> Restart process.

**reread**
> Reload config files.

**update**
> Apply config changes.

**tail** _NAME_
> Show process output.

**-c** _FILE_
> Config file.

# DESCRIPTION

**supervisorctl** is the command-line client for controlling processes managed by the supervisord daemon. It provides commands to start, stop, restart, and monitor long-running processes, as well as view their status and log output.

The status command displays all managed processes with their state (RUNNING, STOPPED, FATAL), PID, and uptime. Individual processes or process groups can be controlled independently. The reread command detects configuration file changes, and update applies those changes without restarting unaffected processes.

The tool can operate in single-command mode or as an interactive shell with tab completion. The tail command streams process stdout/stderr output in real time, useful for debugging application issues. Configuration changes typically follow a reread-then-update workflow to safely apply modifications.

# CAVEATS

Requires supervisord running. Socket permissions may be needed. Config changes need update.

# HISTORY

**Supervisor** was created by **Chris McDonough** for process management. It's widely used for running application servers and background workers.

# SEE ALSO

[supervisord](/man/supervisord)(8), [systemctl](/man/systemctl)(1)
