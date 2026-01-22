# TLDR

Run a command **as a daemon**

```daemonize [command] [arguments]```

Write PID to **specified file**

```daemonize -p [path/to/pidfile] [command] [arguments]```

Use a **lock file** for single instance

```daemonize -l [path/to/lockfile] [command] [arguments]```

Run as a **specific user**

```sudo daemonize -u [user] [command] [arguments]```

# SYNOPSIS

**daemonize** [_options_] _command_ [_arguments_]

# DESCRIPTION

**daemonize** runs a command as a Unix daemon. It handles the standard daemonization process: forking twice, creating a new session, changing to root directory, and closing standard file descriptors.

Useful for programs that don't daemonize themselves but need to run as background services.

# PARAMETERS

**-p** _pidfile_
> Write daemon PID to file

**-l** _lockfile_
> Use lock file for single instance

**-u** _user_
> Run as specified user

**-c** _directory_
> Change to directory before running

**-o** _file_
> Redirect stdout to file

**-e** _file_
> Redirect stderr to file

# CAVEATS

The command must be specified with an absolute path. For modern systems, systemd services are often preferred. Lock files prevent multiple instances but require cleanup on crashes.

# SEE ALSO

[daemon](/man/daemon)(1), [nohup](/man/nohup)(1), [start-stop-daemon](/man/start-stop-daemon)(8)
