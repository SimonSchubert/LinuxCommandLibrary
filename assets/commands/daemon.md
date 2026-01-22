# TLDR

Run a command **as a daemon**

```daemon --name="[name]" [command]```

Run with **automatic restart** on crash

```daemon --name="[name]" -r [command]```

Restart with **limited attempts** and delay

```daemon --name="[name]" -r --attempts=2 --delay=10 [command]```

Run daemon with **error logging**

```daemon --name="[name]" --errlog=[path/to/file.log] [command]```

**Stop** a daemon

```daemon --name="[name]" --stop```

**List** all daemons

```daemon --list```

# SYNOPSIS

**daemon** [_options_] [_--_] _command_ [_args_]

# DESCRIPTION

**daemon** turns other processes into proper Unix daemons. It handles the standard daemonization tasks: forking, creating a new session, changing directory, closing file descriptors, and optionally respawning on exit.

Useful for running scripts or programs as background services without modifying the program itself.

# PARAMETERS

**--name** _name_
> Daemon name for identification

**-r, --respawn**
> Restart if the command exits

**--attempts** _n_
> Maximum restart attempts

**--delay** _seconds_
> Delay between restart attempts

**--errlog** _file_
> Log stderr to file

**--output** _file_
> Log stdout to file

**--stop**
> Stop the named daemon

**--list**
> List running daemons

# CAVEATS

Different from systemd services. For production services, consider using systemd units instead. PID file management should be coordinated to avoid conflicts.

# SEE ALSO

[daemonize](/man/daemonize)(1), [nohup](/man/nohup)(1), [systemctl](/man/systemctl)(1)
