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

**Run a non-interactive upgrade**

```sudo do-release-upgrade -f DistUpgradeViewNonInteractive```

**Keep third-party repositories enabled** during the upgrade

```sudo do-release-upgrade --allow-third-party```

# SYNOPSIS

**do-release-upgrade** [_options_]

# PARAMETERS

**-h**, **--help**
> Show help message and exit.

**-V**, **--version**
> Show version and exit.

**-d**, **--devel-release**
> If using the latest supported release, upgrade to the development release.

**-p**, **--proposed**
> Try upgrading using the upgrader from the -proposed pocket.

**-c**, **--check-dist-upgrade-only**
> Check only if a new release is available and report the result via the exit code.

**-f** _FRONTEND_, **--frontend** _FRONTEND_
> Run the specified frontend (default: DistUpgradeViewText).

**--allow-third-party**
> Try the upgrade with third-party mirrors and repositories enabled instead of commenting them out.

**-q**, **--quiet**
> Reduce output.

**--data-dir** _DIR_
> Directory that contains the data files.

**-m** _MODE_, **--mode** _MODE_
> Upgrade mode, "desktop" or "server". Ubuntu 24.04 and earlier only.

**-e** _ENV_, **--env** _ENV_
> Comma-separated list of environment variables (VAR1=VALUE1,VAR2=VALUE2) to set during the upgrade. Ubuntu 24.04 and earlier only.

# DESCRIPTION

**do-release-upgrade** upgrades Ubuntu to a new release version. It handles the complex process of updating sources, upgrading packages, and resolving conflicts. It is the preferred command for upgrading servers and systems without a graphical environment, or when upgrading over a remote connection.

Which releases are offered is controlled by the **Prompt** setting in **/etc/update-manager/release-upgrades**: **lts** offers only LTS releases, **normal** offers every release, and **never** disables upgrades. The **-d** flag is needed to upgrade to a development release.

# CAVEATS

Ubuntu-specific. Backup important data before upgrading. May take significant time. Third-party repositories are disabled during upgrade unless **--allow-third-party** is used, and may cause issues. Run from a terminal multiplexer (screen or tmux) when upgrading over SSH to avoid disconnection problems. **-d** and **-p** are mutually exclusive. The former **-s**/**--sandbox** option no longer exists.

# HISTORY

**do-release-upgrade** is part of the **ubuntu-release-upgrader-core** package, split out of **update-manager**. It replaced manual sources.list editing as the recommended upgrade method.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [update-manager](/man/update-manager)(8), [screen](/man/screen)(1)

# RESOURCES

```[Source code](https://git.launchpad.net/ubuntu-release-upgrader)```

```[Documentation](https://manpages.ubuntu.com/manpages/noble/man8/do-release-upgrade.8.html)```

<!-- verified: 2026-11-09 -->
