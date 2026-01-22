# TLDR

**List** services with runlevel

```chkconfig --list```

Show a **specific service's** runlevel

```chkconfig --list [ntpd]```

**Enable** service at boot

```chkconfig [sshd] on```

Enable service for **specific runlevels**

```chkconfig --level [2345] [sshd] on```

**Disable** service at boot

```chkconfig [ntpd] off```

Disable service for **specific runlevel**

```chkconfig --level [3] [ntpd] off```

# SYNOPSIS

**chkconfig** [_options_] [_name_] [_on|off|reset_]

# DESCRIPTION

**chkconfig** manages service runlevels on Red Hat-based Linux systems using SysVinit. It updates the symbolic links in /etc/rc.d/ directories that control which services start at each runlevel.

This tool is primarily used on CentOS 6 and older RHEL systems. Modern systems using systemd should use systemctl instead.

# PARAMETERS

**--list** [_name_]
> List all services or a specific service's runlevels

**--level** _levels_
> Specify which runlevels to affect (e.g., 2345)

**--add** _name_
> Add a new service for management

**--del** _name_
> Remove a service from management

# CAVEATS

Legacy tool for SysVinit systems. On systemd-based systems (CentOS 7+, RHEL 7+), use systemctl instead. Runlevels 0-6 have specific meanings: 0=halt, 1=single-user, 2-5=multi-user, 6=reboot.

# HISTORY

**chkconfig** was developed by Red Hat for managing SysVinit services. With the adoption of systemd, its functionality has been largely replaced by systemctl, though it remains available for compatibility.

# SEE ALSO

[systemctl](/man/systemctl)(1), [service](/man/service)(8), [update-rc.d](/man/update-rc.d)(8)
