# TAGLINE

Cross-platform Unix init scheme with service supervision

# TLDR

**Start runit init**

```runit```

**Run as stage 2**

```runsvdir -P [/etc/service]```

**Check service status**

```sv status [service_name]```

**Start service**

```sv start [service_name]```

**Stop service**

```sv stop [service_name]```

**Restart service**

```sv restart [service_name]```

# SYNOPSIS

**runit** [_options_]

**sv** _command_ _service_

# COMMANDS

**sv start** _SERVICE_
> Start service.

**sv stop** _SERVICE_
> Stop service.

**sv restart** _SERVICE_
> Restart service.

**sv status** _SERVICE_
> Check status.

**sv reload** _SERVICE_
> Send SIGHUP.

**sv once** _SERVICE_
> Run once, no restart.

# DESCRIPTION

**runit** is a Unix init scheme with service supervision. It's an alternative to systemd and SysV init.

Three stages handle system boot. Stage 1 initializes, stage 2 runs services, stage 3 shuts down.

Service directories contain run scripts. A simple executable script defines the service.

Supervision restarts crashed services. Automatic recovery maintains system availability.

Logging integrates with svlogd. Per-service log rotation and management.

# SERVICE STRUCTURE

- `/etc/service/name/run` - Service script
- `/etc/service/name/log/run` - Logger script
- `/etc/service/name/supervise/` - Status directory

# CONFIGURATION

**/etc/service/**
> Default service directory where symlinks to service definitions are placed. Each subdirectory represents a supervised service.

**/etc/sv/**
> Service definition directory containing run scripts and optional log/run scripts for each service.

**/etc/runit/1**
> Stage 1 script executed during system initialization before services start.

**/etc/runit/2**
> Stage 2 script that starts the service supervisor (typically runsvdir).

**/etc/runit/3**
> Stage 3 script executed during system shutdown for cleanup tasks.

# CAVEATS

Different from systemd syntax. Learning curve for run script creation. Less widespread than systemd.

# HISTORY

**runit** was created by **Gerrit Pape** around **2004** as a lightweight init system. It's used by Void Linux as the default init and available on many distributions.

# SEE ALSO

[sv](/man/sv)(1), [runsv](/man/runsv)(1), [runsvdir](/man/runsvdir)(1), [svlogd](/man/svlogd)(8)
