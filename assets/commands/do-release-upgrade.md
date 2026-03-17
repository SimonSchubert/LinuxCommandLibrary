# TAGLINE

Upgrade the operating system to the latest release

# TLDR

**Upgrade to the latest release**

```sudo do-release-upgrade```

**Upgrade to the development release**

```sudo do-release-upgrade -d```

**Upgrade using the proposed upgrader**

```sudo do-release-upgrade -p```

**Check if an upgrade is available without performing it**

```sudo do-release-upgrade -c```

**Run upgrade in server mode with text frontend**

```sudo do-release-upgrade -m server -f DistUpgradeViewText```

**Test upgrade in a sandbox without modifying the system**

```sudo do-release-upgrade -s```

# SYNOPSIS

**do-release-upgrade** [_options_]

# PARAMETERS

**-h**, **--help**
> Show help message and exit.

**-d**, **--devel-release**
> If using the latest supported release, upgrade to the development release.

**-p**, **--proposed**
> Try upgrading using the upgrader from ubuntu-proposed.

**-c**, **--check-dist-upgrade-only**
> Check if a new release is available and exit without upgrading.

**-m** _MODE_, **--mode** _MODE_
> Run in a special upgrade mode. Supported modes are "desktop" and "server".

**-f** _FRONTEND_, **--frontend** _FRONTEND_
> Run the specified frontend (DistUpgradeViewGtk3, DistUpgradeViewText, DistUpgradeViewNonInteractive).

**-s**, **--sandbox**
> Test upgrade with a sandbox aufs overlay.

# DESCRIPTION

**do-release-upgrade** upgrades Ubuntu to a new release version. It handles the complex process of updating sources, upgrading packages, and resolving conflicts. It is the recommended command for upgrading servers and systems without a graphical environment, or when upgrading over a remote connection.

By default, upgrades are only offered to the next LTS release (for LTS users) or the next release (for non-LTS users). The **-d** flag is needed to upgrade to a development release.

# CAVEATS

Ubuntu-specific. Backup important data before upgrading. May take significant time. Third-party repositories are disabled during upgrade and may cause issues. Run from a terminal multiplexer (screen or tmux) when upgrading over SSH to avoid disconnection problems.

# HISTORY

**do-release-upgrade** is part of the **ubuntu-release-upgrader** package, the standard tool for performing Ubuntu release upgrades since at least Ubuntu 8.04 (Hardy Heron). It replaced manual sources.list editing as the recommended upgrade method.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [update-manager](/man/update-manager)(8), [screen](/man/screen)(1)
