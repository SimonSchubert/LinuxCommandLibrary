# TAGLINE

Supervise a single runit service process

# TLDR

**Supervise a service**

```runsv [/etc/service/myservice]```

**Check service status**

```sv status [myservice]```

**Send signal**

```sv signal [myservice]```

# SYNOPSIS

**runsv** _servicedir_

# DESCRIPTION

**runsv** supervises a single service. It runs and monitors the service defined in the directory.

The run script is executed and monitored. If it exits, runsv restarts it.

Optional finish script runs after service exits. Cleanup operations go here.

Optional log directory runs a logging service. Captures stdout/stderr.

Control interface via supervise directory. The sv command communicates here.

# SERVICE DIRECTORY

**run** - Executable service script (required)
**finish** - Cleanup script (optional)
**log/run** - Logger service (optional)
**supervise/** - Created by runsv for control

# CONTROL COMMANDS

Written to _service_/supervise/control (typically via **sv**):

**u** - Up; start service and restart if it stops
**d** - Down; send TERM+CONT and don't restart
**o** - Once; start but don't restart on exit
**p** - Pause (SIGSTOP)
**c** - Continue (SIGCONT)
**h** - Hangup (SIGHUP)
**a** - Alarm (SIGALRM)
**i** - Interrupt (SIGINT)
**q** - Quit (SIGQUIT)
**1** - SIGUSR1
**2** - SIGUSR2
**t** - Terminate (SIGTERM)
**k** - Kill (SIGKILL)
**x** - Exit runsv and close log pipes

# CAVEATS

Usually run by **runsvdir**, not directly. Service directory must have correct permissions and an executable **run** script. A **down** file in the service directory prevents automatic startup. Exits with status 111 on startup errors or if another runsv is already supervising the same directory.

# HISTORY

**runsv** is part of **runit** by **Gerrit Pape**. It provides the core supervision functionality for individual services.

# SEE ALSO

[runit](/man/runit)(8), [sv](/man/sv)(8), [runsvdir](/man/runsvdir)(8), [svlogd](/man/svlogd)(8), [chpst](/man/chpst)(8)
