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

**supervisorctl** controls supervisor daemon. It manages long-running processes.

Status shows running processes. PID, uptime, and state displayed.

Start and stop control individual processes. Groups can be managed together.

Reread detects config changes. Update applies them without full restart.

Tail shows process output. Useful for debugging.

Interactive mode provides shell. Tab completion available.

# CAVEATS

Requires supervisord running. Socket permissions may be needed. Config changes need update.

# HISTORY

**Supervisor** was created by **Chris McDonough** for process management. It's widely used for running application servers and background workers.

# SEE ALSO

[supervisord](/man/supervisord)(8), [systemctl](/man/systemctl)(1)
