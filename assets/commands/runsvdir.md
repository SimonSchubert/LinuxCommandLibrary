# TAGLINE

Start and monitor runit service directory

# TLDR

**Start supervising services** in a directory

```runsvdir [/etc/service]```

**Run each service in a new session** and separate process group

```runsvdir -P [/etc/service]```

**Start with a log command** for error output

```runsvdir [/etc/service] "log: ........................................."```

# SYNOPSIS

**runsvdir** [**-P**] _dir_ [_log_]

# PARAMETERS

**-P**
> Use setsid to run each runsv process in a new session and separate process group.

_dir_
> Service directory to monitor. Each subdirectory (or symlink to a directory) is started as a supervised service via runsv.

_log_
> Optional log command. If specified (must be at least seven characters), runsvdir pipes its error output through this command, similar to daemontools' readproctitle.

# DESCRIPTION

**runsvdir** starts and monitors a collection of **runsv**(8) processes. It scans _dir_ at least every five seconds. When a new subdirectory or symlink to a directory appears, runsvdir starts a new runsv process for it. When a subdirectory is removed, the corresponding runsv process is sent a TERM signal.

Subdirectories whose names start with a dot are ignored. The maximum number of services is 1000.

Sending runsvdir a TERM signal causes it to exit with status 0. Sending a HUP signal causes it to send TERM to all running runsv processes and then exit with status 111.

# SERVICE MANAGEMENT

- Create symlink in dir: service starts automatically on next scan
- Remove symlink: service stops via TERM signal
- Use the **sv** command to control individual services

# CAVEATS

Usually started by runit init at system boot. The filesystem should not be unmounted while runsvdir is running. Permissions on service directories must be correct for runsv to start.

# HISTORY

**runsvdir** is the service directory supervisor in **runit**, created by Gerrit Pape. It watches for service directories and manages runsv processes for each.

# SEE ALSO

[runit](/man/runit)(8), [runsv](/man/runsv)(8), [sv](/man/sv)(8), [runsvchdir](/man/runsvchdir)(8), [chpst](/man/chpst)(8), [svlogd](/man/svlogd)(8)
