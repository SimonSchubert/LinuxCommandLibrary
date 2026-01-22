# TLDR

**List** installed packages

```synopkg list --name```

List packages **depending on** another

```synopkg list --depend-on [package]```

**Start** or **stop** a package

```sudo synopkg [start|stop] [package]```

Show package **status**

```synopkg status [package]```

**Uninstall** a package

```sudo synopkg uninstall [package]```

Check for **updates**

```synopkg checkupdate [package]```

**Upgrade** all packages

```sudo synopkg upgradeall```

**Install** from SPK file

```sudo synopkg install [path/to/package.spk]```

# SYNOPSIS

**synopkg** _command_ [_OPTIONS_]

# COMMANDS

**list** [**--name**] [**--depend-on** _pkg_]
> List installed packages

**install** _file.spk_
> Install package from SPK file

**uninstall** _package_
> Remove installed package

**start** _package_
> Start a package service

**stop** _package_
> Stop a package service

**status** _package_
> Show package running status

**is_onoff** _package_
> Check if package is enabled

**checkupdate** _package_
> Check for package updates

**upgradeall**
> Upgrade all packages to latest versions

**log** _package_
> View package logs

# PARAMETERS

**--name**
> Show only package names

**--depend-on** _package_
> List packages depending on specified package

# DESCRIPTION

**synopkg** is the package management utility for Synology DiskStation Manager (DSM), the operating system for Synology NAS devices. It provides command-line control over package installation, updates, and service management.

The tool wraps each package's start/stop scripts located at `/var/packages/<package>/scripts/start-stop-status`. It automatically handles dependency resolution when installing packages and integrates with DSM's Package Center.

# CAVEATS

Requires root privileges for install/uninstall/start/stop operations. SSH access must be enabled on the Synology NAS. Only accepts SPK package format. Installation has the same constraints as the web UI Package Center.

# HISTORY

**synopkg** is developed by **Synology Inc.** as part of their DiskStation Manager operating system. DSM provides a Linux-based platform for Synology NAS devices, first introduced in the mid-**2000s**. The command-line tools complement the web-based administration interface.

# SEE ALSO

[synoupgrade](/man/synoupgrade)(8), [synoservice](/man/synoservice)(8)
