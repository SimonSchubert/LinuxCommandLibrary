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

**synoservice** and related commands (**synoservicecfg**, **synoservicectl**) are Synology NAS utilities for managing system and package services from the command line via SSH.

These commands control DSM (DiskStation Manager) services including web server, Samba file sharing, SSH, FTP, Docker, and third-party packages. They are located in /usr/syno/sbin/ and require root privileges.

Common services include DSM, nginx, samba, ssh-shell, nfsd, ftpd, crond, and package services prefixed with pkgctl- such as pkgctl-Docker and pkgctl-WebStation.

In DSM 7 and newer, the standard **systemctl** command can also be used for service management.

# CAVEATS

Requires SSH access and root privileges (use sudo -i). Commands may differ slightly between DSM versions. Package services use the pkgctl- prefix. Some critical services should not be stopped remotely. On DSM 7+, consider using systemctl as an alternative.

# HISTORY

**synoservice** utilities are Synology-proprietary tools developed for their DiskStation Manager operating system. They provide a consistent interface for managing services across different DSM versions and hardware platforms. DSM 7 introduced better systemd integration alongside these legacy tools.

# SEE ALSO

[systemctl](/man/systemctl)(1), [service](/man/service)(8)
