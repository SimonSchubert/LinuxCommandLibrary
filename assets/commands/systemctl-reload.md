# TAGLINE

Reload service configuration without restart

# TLDR

**Reload** a service's configuration

```systemctl reload nginx```

Reload **multiple** services

```systemctl reload [unit1] [unit2]```

Reload a service for the **current user**

```systemctl reload pipewire --user```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **reload** _PATTERN_...

# PARAMETERS

**--user**
> Reload user service manager units instead of system units

**--no-block**
> Do not wait for the operation to complete

# DESCRIPTION

**systemctl reload** asks the service to reload its configuration files without stopping. This reloads the service application's own configuration (like nginx.conf or apache's httpd.conf), not the systemd unit file.

The service must support reload operations (typically via SIGHUP signal). If the service doesn't support reload, the command will fail. For services that don't support reload, use **systemctl restart** instead.

# CAVEATS

Not all services support reload; check the service documentation. This reloads the **service's** configuration, not the systemd unit file. To reload unit files, use **systemctl daemon-reload**. If reload fails, the service continues running with old configuration.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-restart](/man/systemctl-restart)(1), [systemctl-daemon-reload](/man/systemctl-daemon-reload)(1)
