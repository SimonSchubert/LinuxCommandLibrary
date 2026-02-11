# TAGLINE

Automated Slackware package management tool

# TLDR

**Update the package list** from mirrors

```slackpkg update```

**Search for a package**

```slackpkg search [package_name]```

**Install a package**

```slackpkg install [package_name]```

**Upgrade a package**

```slackpkg upgrade [package_name]```

**Upgrade all installed packages**

```slackpkg upgrade-all```

**Remove a package**

```slackpkg remove [package_name]```

**Install new packages** added since installation

```slackpkg install-new```

**Clean system** of non-official packages

```slackpkg clean-system```

# SYNOPSIS

**slackpkg** [_OPTIONS_] _action_ [_PACKAGE|PATTERN|FILE_]

# PARAMETERS

**update**
> Download and update the package list from mirrors

**update gpg**
> Update GPG key for package verification

**install** _package_
> Install specified package(s)

**upgrade** _package_
> Upgrade specified package(s)

**upgrade-all**
> Upgrade all installed packages to newest versions

**remove** _package_
> Remove specified package(s)

**reinstall** _package_
> Reinstall specified package(s)

**search** _pattern_
> Search for packages matching pattern

**file-search** _file_
> Search for packages containing specified file

**info** _package_
> Display information about a package

**install-new**
> Install new packages added to Slackware since installation

**clean-system**
> Remove packages not in official Slackware distribution

**blacklist** _package_
> Add package to blacklist

**new-config**
> Find and merge new configuration files

# DESCRIPTION

**slackpkg** is an automated tool for managing Slackware packages over the network. It downloads, installs, upgrades, and removes packages from official Slackware mirrors.

Before use, configure a mirror in **/etc/slackpkg/mirrors** by uncommenting one entry. Run **slackpkg update** to download the package list. The blacklist feature in /etc/slackpkg/blacklist prevents specific packages from being modified.

slackpkg provides both menu-based and command-line interfaces. Set DIALOG=off in /etc/slackpkg/slackpkg.conf for console-only operation.

# CONFIGURATION

**/etc/slackpkg/mirrors**
> Mirror list file; uncomment exactly one mirror URL to use as the package source.

**/etc/slackpkg/blacklist**
> List of packages to exclude from install, upgrade, and removal operations.

**/etc/slackpkg/slackpkg.conf**
> Main configuration file for dialog mode, proxy settings, and download options.

# CAVEATS

Only one mirror can be active at a time. slackpkg manages only official Slackware packages; use **slackpkg+** for third-party repositories. The **clean-system** command removes all unofficial packages, so use with caution.

# HISTORY

slackpkg was created to provide network-based package management for Slackware Linux, which traditionally relied on manual package management using installpkg, upgradepkg, and removepkg.

# SEE ALSO

[sbopkg](/man/sbopkg)(8), [installpkg](/man/installpkg)(8), [upgradepkg](/man/upgradepkg)(8), [removepkg](/man/removepkg)(8)
