# TAGLINE

Manage SysV init script runlevel links

# TLDR

**Install** a service with default runlevels

```update-rc.d [mysql] defaults```

**Install** a service but leave it disabled

```update-rc.d [mysql] defaults-disabled```

**Enable** a service

```update-rc.d [mysql] enable```

**Disable** a service

```update-rc.d [mysql] disable```

**Disable** a service in a single runlevel

```update-rc.d [mysql] disable [2]```

**Forcibly remove** a service

```update-rc.d -f [mysql] remove```

# SYNOPSIS

**update-rc.d** [**-f**] _name_ **remove**

**update-rc.d** [**-f**] _name_ **defaults**

**update-rc.d** [**-f**] _name_ **defaults-disabled**

**update-rc.d** _name_ **disable**|**enable** [**S**|**2**|**3**|**4**|**5**]

# PARAMETERS

**defaults**
> Add service links using runlevel and dependency information from the script's LSB header

**defaults-disabled**
> Add service links with the service disabled

**enable** [_runlevel_]
> Rename stop links back to start links, in all start runlevels or the given one

**disable** [_runlevel_]
> Rename start links to stop links, in all start runlevels or the given one

**remove**
> Remove all symlinks for the service; the init script must already be deleted

**-f**
> Force removal of symlinks even if the init script still exists

# DESCRIPTION

**update-rc.d** installs and removes System-V style init script links. It manages the symbolic links in **/etc/rc?.d/** directories that control which services start at each runlevel.

Init scripts must be placed in **/etc/init.d/** before using this command and need an LSB comment header. If links for the service already exist, **defaults** does nothing, so administrator changes are not overwritten.

The tool is primarily used on Debian-based systems using traditional SysV init. On systems with systemd it also reloads systemd and uses **systemctl** to apply **enable** and **disable**.

# CAVEATS

Requires root privileges. The init script must exist in **/etc/init.d/** before installing. Deleting the links by hand does not disable a service, as a package upgrade reinstalls them; use **disable** instead. The legacy **start** and **stop** actions are now equivalent to **defaults**. Use **systemctl** on modern systemd-based systems.

# SEE ALSO

[systemctl](/man/systemctl)(1), [service](/man/service)(8), [invoke-rc.d](/man/invoke-rc.d)(8), [chkconfig](/man/chkconfig)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/init-system-helpers)```

<!-- verified: 2026-11-09 -->
