# TAGLINE

Automated Slackware package management tool

# TLDR

**Update the package list** from mirrors

```slackpkg update```

**Search for a package**

```slackpkg search [package_name]```

**Find which package contains a file**

```slackpkg file-search [filename]```

**Install a package**

```slackpkg install [package_name]```

**Upgrade a package**

```slackpkg upgrade [package_name]```

**Upgrade all installed packages**

```slackpkg upgrade-all```

**Upgrade all packages without prompts**

```slackpkg -batch=on -default_answer=y upgrade-all```

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

**download** _package_
> Download packages to /var/cache/packages without installing them

**check-updates**
> Check whether ChangeLog.txt has changed; useful from cron

**show-changelog**
> Display the Slackware ChangeLog.txt

**blacklist**
> Show blacklisted packages; edit /etc/slackpkg/blacklist to change them

**new-config**
> Find .new configuration files and ask what to do with them

**generate-template** _name_
> Create a template from the installed official packages

**install-template** _name_
> Install all packages in a template from /etc/slackpkg/templates

**remove-template** _name_
> Remove all packages in a template

**help**
> Show actions with a short description

# DESCRIPTION

**slackpkg** is an automated tool for managing Slackware packages over the network. It downloads, installs, upgrades, and removes packages from official Slackware mirrors.

Before use, configure a mirror in **/etc/slackpkg/mirrors** by uncommenting one entry. Run **slackpkg update** to download the package list. The blacklist feature in /etc/slackpkg/blacklist prevents specific packages from being modified.

slackpkg provides both menu-based and command-line interfaces. Set DIALOG=off in /etc/slackpkg/slackpkg.conf for console-only operation. Most settings can also be passed before the action as **-variable=value**, for example **-dialog=off**.

# CONFIGURATION

**/etc/slackpkg/mirrors**
> Mirror list file; uncomment exactly one mirror URL to use as the package source.

**/etc/slackpkg/blacklist**
> List of packages to exclude from install, upgrade, and removal operations.

**/etc/slackpkg/slackpkg.conf**
> Main configuration file for dialog mode, proxy settings, and download options.

# CAVEATS

Only one mirror can be active at a time. slackpkg manages only official Slackware packages; use **slackpkg+** for third-party repositories. The **clean-system** command removes all unofficial packages, so blacklist anything to keep first. Run **install-new** before **upgrade-all** when moving to a new release or following -current.

# HISTORY

slackpkg was created to provide network-based package management for Slackware Linux, which traditionally relied on manual package management using installpkg, upgradepkg, and removepkg.

# SEE ALSO

[sbopkg](/man/sbopkg)(8), [installpkg](/man/installpkg)(8), [upgradepkg](/man/upgradepkg)(8), [removepkg](/man/removepkg)(8)

# RESOURCES

```[Source code](https://mirrors.slackware.com/slackware/slackware64-current/source/ap/slackpkg/)```

```[Homepage](https://slackpkg.org/)```

```[Documentation](https://slackpkg.org/documentation.html)```

<!-- verified: 2026-11-08 -->
