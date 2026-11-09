# TAGLINE

Ubuntu graphical software update manager

# TLDR

**Launch the Software Updater** GUI

```update-manager```

**Check for a new distribution release**

```update-manager -c```

**Upgrade to the development release** (from the latest supported release)

```update-manager -d```

**Launch with no focus** (for notifications)

```update-manager --no-focus-on-map```

**Upgrade using the proposed release upgrader**

```update-manager -p```

**Start without checking for updates**

```update-manager --no-update```

# SYNOPSIS

**update-manager** [**-c**|**--check-dist-upgrades**] [**-d**|**--devel-release**] [**-p**|**--proposed**] [**--no-focus-on-map**] [**--no-update**] [**--install-all**]

# PARAMETERS

**-c**, **--check-dist-upgrades**
> Check if a new distribution release is available for upgrade.

**-d**, **--devel-release**
> If using the latest supported release, upgrade to the development release.

**-p**, **--proposed**
> Upgrade using the latest proposed version of the release upgrader.

**--no-focus-on-map**
> Do not focus the window when it appears. Useful for background notifications.

**--no-update**
> Do not check for updates when starting.

**--install-all**
> Install all updates when starting.

**--data-dir** _DIR_
> Directory that contains the data files.

**--debug**
> Show debug messages.

**-V**, **--version**
> Show version.

**-h**, **--help**
> Show help message.

# DESCRIPTION

**update-manager** is Ubuntu's graphical frontend for the apt package management system. Known as "Software Updater" in the application menu, it provides a user-friendly interface for checking and installing system updates.

The tool checks for available package updates, displays them with descriptions and sizes, and allows users to selectively install updates. It also detects when new Ubuntu releases are available and offers to perform distribution upgrades.

update-manager handles security updates, regular package updates, and major version upgrades. It integrates with Ubuntu's notification system to alert users when updates are available. For servers or command-line environments, the equivalent functionality is provided by **apt** or **apt-get**.

# CAVEATS

Requires a graphical environment (X11 or Wayland). For headless servers, use apt-get or apt instead. Distribution upgrades should be performed with adequate preparation and backups. Some updates may require a system restart to take effect.

# HISTORY

**update-manager** was started in October **2004** by Michiel Sikkes and first uploaded to Ubuntu for the Hoary release in November **2004** by Michael Vogt. The tool has evolved to include distribution upgrade capabilities and integration with Ubuntu's Long Term Support (LTS) release cycle.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [do-release-upgrade](/man/do-release-upgrade)(8), [unattended-upgrades](/man/unattended-upgrades)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/update-manager)```

```[Homepage](https://launchpad.net/update-manager)```

<!-- verified: 2026-11-09 -->
