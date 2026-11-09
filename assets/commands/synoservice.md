# TAGLINE

Synology NAS service management

# TLDR

**List all services**

```synoservicecfg --list```

**Check service status**

```synoservice --status [servicename]```

**Start a service**

```synoservicecfg --start [servicename]```

**Stop a service**

```synoservicecfg --stop [servicename]```

**Force stop a service**

```synoservicecfg --hard-stop [servicename]```

**Restart a service**

```synoservice --restart [servicename]```

**Restart a package service**

```synoservicectl --restart [pkgctl-WebStation]```

# SYNOPSIS

**synoservice** {--status|--restart} [_service_]

**synoservicecfg** {--start|--stop|--hard-start|--hard-stop|--list} [_service_]

**synoservicectl** {--start|--stop|--restart|--status} [_service_]

# PARAMETERS

**--status**
> Display status of specified service.

**--start**
> Start the specified service.

**--stop**
> Stop the specified service.

**--restart**
> Restart the specified service.

**--hard-start**
> Force start the service.

**--hard-stop**
> Force stop the service.

**--list**
> List all available services.

# DESCRIPTION

**synoservice** and related commands (**synoservicecfg**, **synoservicectl**) are Synology NAS utilities reported to manage system and package services from the command line via SSH. Synology does not publish a reference for them, so the commands and flags on this page come from community usage and may differ between DSM versions.

Package services are commonly referred to with a pkgctl- prefix, such as pkgctl-WebStation.

# CAVEATS

Not documented by Synology; run the tool without arguments on your own system to see what it accepts. Requires SSH access and root privileges (use sudo -i). Community reports indicate these tools do not work reliably on DSM 7, where **synosystemctl** is used instead. Some critical services should not be stopped remotely.

# HISTORY

These utilities are Synology-proprietary tools for the DiskStation Manager operating system.

# SEE ALSO

[systemctl](/man/systemctl)(1), [service](/man/service)(8)

# RESOURCES

```[Homepage](https://www.synology.com/en-global/dsm)```

<!-- verified: 2026-11-09 -->
