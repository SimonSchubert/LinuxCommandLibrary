# TAGLINE

turn processes into Unix daemons

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

**-n**, **--name**=_name_
> Guarantee a single named instance; also enables --running, --restart, --stop and --signal

**-r**, **--respawn**
> Respawn the client when it terminates

**-A**, **--attempts**=_#_
> Respawn # times on error before delaying (default 5)

**-L**, **--delay**=_seconds_
> Delay between respawn attempt bursts

**-M**, **--limit**=_#_
> Maximum number of respawn attempt bursts (0 = no limit)

**-l**, **--errlog**=_spec_
> Send daemon's error output to syslog or a file

**-o**, **--output**=_spec_
> Send the client's stdout and stderr to syslog or a file

**-E**, **--stderr**=_spec_
> Send only the client's stderr to syslog or a file

**-u**, **--user**=_user[:group]_
> Run the client as the given user (root only)

**-f**, **--foreground**
> Run the client in the foreground (do not daemonize)

**--running**
> Check whether a named daemon is running

**--restart**
> Restart a named daemon's client

**--stop**
> Terminate a named daemon process

**--list**
> Print a list of named daemons

# CAVEATS

Different from systemd services. For production services, consider using systemd units instead. Named daemons store pidfiles in /var/run (root) or /tmp (normal users) by default; use --pidfiles to override the location.

# CONFIGURATION

**/etc/daemon.conf**, **/etc/daemon.conf.d/***
> System-wide default options, applied unless --noconfig is supplied.

**~/.daemonrc**, **~/.daemonrc.d/***
> Per-user default options, read after the system configuration.

# SEE ALSO

[daemonize](/man/daemonize)(1), [nohup](/man/nohup)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/raforg/daemon)```

```[Homepage](https://libslack.org/daemon)```

<!-- verified: 2026-07-11 -->
