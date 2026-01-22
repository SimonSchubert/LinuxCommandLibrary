# TLDR

**Install** a service with default runlevels

```update-rc.d [mysql] defaults```

**Enable** a service

```update-rc.d [mysql] enable```

**Disable** a service

```update-rc.d [mysql] disable```

**Forcibly remove** a service

```update-rc.d -f [mysql] remove```

# SYNOPSIS

**update-rc.d** [**-f**] _name_ _action_

# PARAMETERS

**defaults**
> Add service with default start/stop runlevels

**enable**
> Enable service to start at boot

**disable**
> Disable service from starting at boot

**remove**
> Remove all symlinks for the service

**-f, --force**
> Force removal even if init script still exists

**-n**
> Dry run, show what would be done

# DESCRIPTION

**update-rc.d** installs and removes System-V style init script links. It manages the symbolic links in **/etc/rc?.d/** directories that control which services start at each runlevel.

Init scripts must be placed in **/etc/init.d/** before using this command. The tool is primarily used on Debian-based systems using traditional SysV init.

# CAVEATS

Requires root privileges. On systems using systemd, this command may be a compatibility wrapper. The init script must exist in **/etc/init.d/** before installing. Use **systemctl** on modern systemd-based systems.

# SEE ALSO

[systemctl](/man/systemctl)(1), [service](/man/service)(8), [chkconfig](/man/chkconfig)(8)
