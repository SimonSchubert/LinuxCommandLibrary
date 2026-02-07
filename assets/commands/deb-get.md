# TAGLINE

apt-get-like functionality for third-party .deb packages

# TLDR

**Update** available packages list

```deb-get update```

**Search** for a package

```deb-get search [package]```

Show **information** about a package

```deb-get show [package]```

**Install** or upgrade a package

```deb-get install [package]```

**Remove** a package

```deb-get remove [package]```

**Upgrade** all installed packages

```deb-get upgrade```

**List** all available packages

```deb-get list```

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

**upgrade**
> Upgrade all packages

**list**
> List available packages

# CAVEATS

Works on Debian-based distributions. Packages come from third-party sources. Update regularly to get latest package information.

# SEE ALSO

[apt-get](/man/apt-get)(8), [apt](/man/apt)(8), [dpkg](/man/dpkg)(1)
