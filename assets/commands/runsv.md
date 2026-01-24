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

# CONTROL SIGNALS

**u** - Up (start)
**d** - Down (stop)
**o** - Once
**p** - Pause
**c** - Continue
**h** - Hangup
**t** - Terminate
**k** - Kill

# CAVEATS

Usually run by runsvdir, not directly. Service directory must have correct permissions. Run script must be executable.

# HISTORY

**runsv** is part of **runit** by **Gerrit Pape**. It provides the core supervision functionality for individual services.

# SEE ALSO

[runit](/man/runit)(8), [sv](/man/sv)(8), [runsvdir](/man/runsvdir)(8), [svlogd](/man/svlogd)(8)
