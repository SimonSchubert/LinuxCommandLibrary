# TLDR

**Restart** a unit

```systemctl restart [unit]```

Restart **multiple** units

```systemctl restart [unit1] [unit2]```

Restart a **user** unit

```systemctl restart [unit] --user```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **restart** _PATTERN_...

# PARAMETERS

**--user**
> Restart user service manager units instead of system units

**--no-block**
> Do not wait for the operation to complete

**--job-mode=**_MODE_
> Specify how to deal with already queued jobs

# DESCRIPTION

**systemctl restart** stops and then starts systemd units. This is useful when a service needs to be fully restarted to pick up configuration changes or recover from an error state.

Unlike **systemctl reload**, restart fully stops the service process and starts a new one. This causes a brief interruption but ensures a clean restart. Can be used on stopped units, but **systemctl start** is safer to avoid accidentally restarting running services.

# CAVEATS

Requires root privileges for system units. Causes service interruption during restart. For configuration reloads without interruption, use **systemctl reload** if the service supports it.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-start](/man/systemctl-start)(1), [systemctl-reload](/man/systemctl-reload)(1)
