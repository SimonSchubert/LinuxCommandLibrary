# TAGLINE

Control runit-supervised services

# TLDR

**Check status** of a service

```sv status [servicename]```

**Start a service**

```sv up [servicename]```

**Stop a service**

```sv down [servicename]```

**Restart a service**

```sv restart [servicename]```

**Send HUP signal** to reload configuration

```sv hup [servicename]```

**Start service once** (don't restart if it stops)

```sv once [servicename]```

**Force stop** with timeout

```sv force-stop [servicename]```

**Check status** with verbose output

```sv -v status [servicename]```

# SYNOPSIS

**sv** [**-v**] [**-w** _sec_] _command_ _services_...

# PARAMETERS

**-v**
> Wait up to 7 seconds for commands to take effect and report status

**-w** _sec_
> Set timeout to sec seconds (implies -v)

# COMMANDS

**status**
> Report current status of the service and its log service

**up**
> Start the service; restart it if it stops

**down**
> Stop the service with TERM and CONT signals; do not restart

**once**
> Start the service once; do not restart if it stops

**restart**
> Restart the service (LSB-compatible, waits for completion)

**start**
> Start the service (LSB-compatible)

**stop**
> Stop the service (LSB-compatible)

**reload**
> Send HUP signal (LSB-compatible)

**hup**, **cont**, **pause**, **term**, **kill**
> Send respective signal (HUP, CONT, STOP, TERM, KILL)

**1**, **2**
> Send USR1 or USR2 signal

**alarm**, **interrupt**, **quit**
> Send ALRM, INT, or QUIT signal

**exit**
> Stop the service and do not restart; exit runsv

**check**
> Verify service is in requested state; run ./check script if present

**force-stop**, **force-restart**, **force-reload**, **force-shutdown**
> Forced versions of stop/restart/reload/shutdown

# DESCRIPTION

**sv** controls and manages services supervised by **runsv** in the runit init system. It sends commands to service directories and reports their status. Services are typically located in **/service/** or a custom service directory.

Each service is a directory containing a **run** script that runsv executes and supervises. When a service stops unexpectedly, runsv automatically restarts it. The **down** command prevents automatic restart, while **once** runs the service without restart supervision.

The **sv** command can be symlinked to **/etc/init.d/** to provide LSB init script compatibility. When invoked this way, the service name is derived from the script's basename.

Status output shows the service state (run, down, finish), PID, and uptime. The log service status is also shown if a **log/** subdirectory exists.

# CAVEATS

Exit codes vary: 0 for success, 1 for timeout, 100 for errors. When used as an init script, exit code 3 indicates the service is down, and 4 means unknown status. Commands like **down** send signals but do not wait by default; use **-v** to wait.

# HISTORY

**sv** is part of **runit**, created by **Gerrit Pape** around **2004** as a Unix init scheme with service supervision. Runit was designed as a replacement for sysvinit and is used as the default init system in **Void Linux** and available on many other distributions as an alternative to systemd.

# SEE ALSO

[runsv](/man/runsv)(8), [runsvdir](/man/runsvdir)(8), [svlogd](/man/svlogd)(8), [chpst](/man/chpst)(8), [systemctl](/man/systemctl)(1)
