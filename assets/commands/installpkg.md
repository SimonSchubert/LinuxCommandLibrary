# TLDR

**Install** a Slackware package

```sudo installpkg [path/to/package.tgz]```

**Simulate** installation and report to stdout

```installpkg -warn [path/to/package.tgz]```

**Create** a package from current directory

```installpkg -m [package_name.tgz]```

**Install** contents of current directory as named package

```sudo installpkg -r [package_name.tgz]```

# SYNOPSIS

**installpkg** [_options_] _package_

# PARAMETERS

**-warn**
> Generate installation report without actually installing

**-m** _NAME_
> Make a package from the current directory

**-r** _NAME_
> Install current directory contents as a package

**-menu**
> Interactive package browser

**-priority** _ORDER_
> Set search order for packages

# DESCRIPTION

**installpkg** installs Slackware packages, which are compressed tar archives containing files and installation scripts. It extracts package contents to the filesystem and runs any included doinst.sh installation script.

Package metadata is stored in /var/log/packages, allowing tracking of installed files for later removal or upgrade. The tool handles the .tgz, .txz, .tbz, and .tlz package formats.

# CAVEATS

Slackware-specific package tool. Does not handle dependencies automatically. Overwrites existing files without warning unless using -warn option.

# HISTORY

installpkg has been part of Slackware Linux since its early releases in **1993**. Slackware's package management is intentionally simple, preferring manual dependency handling to give users full control.

# SEE ALSO

[removepkg](/man/removepkg)(8), [upgradepkg](/man/upgradepkg)(8), [pkgtool](/man/pkgtool)(8)
