# TAGLINE

apt-get-like functionality for third-party .deb packages

# TLDR

**Refresh** the list of available packages

```deb-get update```

List **every package deb-get knows about**, without checking install state

```deb-get list --raw```

List **only what is installed**, which is much faster

```deb-get list --installed```

**Search** the catalogue with a regular expression

```deb-get search [pattern]```

Show the details of **one or more packages**

```deb-get show [package1] [package2]```

**Install** packages from their upstream sources

```deb-get install [package1] [package2]```

**Reinstall** a package

```deb-get reinstall [package]```

**Upgrade** everything deb-get manages

```deb-get upgrade```

**Remove** a package and drop the apt repository it came from

```deb-get remove --remove-repo [package]```

Remove a package **and its configuration**

```deb-get purge [package]```

**Repair** packages whose definitions changed upstream

```deb-get fix-installed```

Show what is sitting in the **download cache**

```deb-get cache```

**Empty** the download cache

```deb-get clean```

# SYNOPSIS

**deb-get** _command_ [_package_]

# DESCRIPTION

**deb-get** provides apt-get-like functionality for .deb packages from third-party repositories or direct downloads. It simplifies installing software not available in official Debian/Ubuntu repositories.

Supports popular applications like Chrome, Discord, Slack, VS Code, and many others.

# PARAMETERS

**update**
> Update package list

**search** _pattern_
> Search for packages

**show** _package_
> Display package information

**install** _package_
> Install or upgrade package

**remove** _package_
> Remove package

**purge** _package_
> Remove package and configuration

**reinstall** _package_
> Reinstall package

**upgrade**
> Upgrade all packages

**list** [_--installed_|_--not-installed_|_--raw_]
> List available packages. Use --installed or --not-installed to filter, --raw to skip install status check.

**clean**
> Remove cached .deb files

**fix-installed**
> Fix broken packages

# CAVEATS

Works on Debian-based distributions. Packages come from third-party sources. Update regularly to get latest package information.

# SEE ALSO

[apt-get](/man/apt-get)(8), [apt](/man/apt)(8), [dpkg](/man/dpkg)(1)
